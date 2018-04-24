import io.grpc.Attributes;
import io.grpc.CallCredentials;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.handler.ssl.SslContext;
import lnrpc.LightningGrpc;
import lnrpc.LightningGrpc.LightningBlockingStub;
import lnrpc.Rpc.GetInfoRequest;
import lnrpc.Rpc.GetInfoResponse;
import org.apache.commons.codec.binary.Hex;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Executor;

public class Main {
    static class MacaroonCallCredential implements CallCredentials {
        private final String macaroon;

        MacaroonCallCredential(String macaroon) {
            this.macaroon = macaroon;
        }

        public void thisUsesUnstableApi() {}

        public void applyRequestMetadata(
                MethodDescriptor < ? , ? > methodDescriptor,
                Attributes attributes,
                Executor executor,
                final MetadataApplier metadataApplier
        ) {
            String authority = attributes.get(ATTR_AUTHORITY);
            System.out.println(authority);
            executor.execute(new Runnable() {
                public void run() {
                    try {
                        Metadata headers = new Metadata();
                        Metadata.Key < String > macaroonKey = Metadata.Key.of("macaroon", Metadata.ASCII_STRING_MARSHALLER);
                        headers.put(macaroonKey, macaroon);
                        metadataApplier.apply(headers);
                    } catch (Throwable e) {
                        metadataApplier.fail(Status.UNAUTHENTICATED.withCause(e));
                    }
                }
            });
        }
    }

    private static final String CERT_PATH = "/home/ubuntu/.lnd/tls.cert";
//    private static final String CERT_PATH = "/Users/UserName/IU/K/tls.cert";
    private static final String MACAROON_PATH = "/home/ubuntu/.lnd/admin.macroon";
//    private static final String MACAROON_PATH = "/Users/UserName/IU/K/admin.macroon";
    private static final String HOST = "localhost";
    private static final int PORT = 10009;

    public static void main(String...args) throws IOException {
        SslContext sslContext = GrpcSslContexts.forClient().trustManager(new File(CERT_PATH)).build();
        NettyChannelBuilder channelBuilder = NettyChannelBuilder.forAddress(HOST, PORT);
        ManagedChannel channel = channelBuilder.sslContext(sslContext).build();

        File tlsCert = new File(CERT_PATH);
        System.out.println("Cert File exists: " + tlsCert.exists());
        System.out.println("Cert File: " + tlsCert.getPath());

        File macroonFile = new File(MACAROON_PATH);
        System.out.println("Macroon File exists: " + macroonFile.exists());
        System.out.println("Macroon File: " + macroonFile.getPath());

        String macaroon =
                Hex.encodeHexString(
                        Files.readAllBytes(Paths.get(macroonFile.getPath()))
                );

        LightningBlockingStub stub = LightningGrpc
                .newBlockingStub(channel)
                .withCallCredentials(new MacaroonCallCredential(macaroon));


        GetInfoResponse response = stub.getInfo(GetInfoRequest.getDefaultInstance());
        System.out.println(response.getIdentityPubkey());
    }
}