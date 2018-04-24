package lnrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The WalletUnlocker service is used to set up a wallet password for
 * lnd at first startup, and unlock a previously set up wallet.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.8.0)",
    comments = "Source: lnrpc/rpc.proto")
public final class WalletUnlockerGrpc {

  private WalletUnlockerGrpc() {}

  public static final String SERVICE_NAME = "lnrpc.WalletUnlocker";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGenSeedMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lnrpc.Rpc.GenSeedRequest,
      lnrpc.Rpc.GenSeedResponse> METHOD_GEN_SEED = getGenSeedMethod();

  private static volatile io.grpc.MethodDescriptor<lnrpc.Rpc.GenSeedRequest,
      lnrpc.Rpc.GenSeedResponse> getGenSeedMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lnrpc.Rpc.GenSeedRequest,
      lnrpc.Rpc.GenSeedResponse> getGenSeedMethod() {
    io.grpc.MethodDescriptor<lnrpc.Rpc.GenSeedRequest, lnrpc.Rpc.GenSeedResponse> getGenSeedMethod;
    if ((getGenSeedMethod = WalletUnlockerGrpc.getGenSeedMethod) == null) {
      synchronized (WalletUnlockerGrpc.class) {
        if ((getGenSeedMethod = WalletUnlockerGrpc.getGenSeedMethod) == null) {
          WalletUnlockerGrpc.getGenSeedMethod = getGenSeedMethod = 
              io.grpc.MethodDescriptor.<lnrpc.Rpc.GenSeedRequest, lnrpc.Rpc.GenSeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.WalletUnlocker", "GenSeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lnrpc.Rpc.GenSeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lnrpc.Rpc.GenSeedResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletUnlockerMethodDescriptorSupplier("GenSeed"))
                  .build();
          }
        }
     }
     return getGenSeedMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getInitWalletMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lnrpc.Rpc.InitWalletRequest,
      lnrpc.Rpc.InitWalletResponse> METHOD_INIT_WALLET = getInitWalletMethod();

  private static volatile io.grpc.MethodDescriptor<lnrpc.Rpc.InitWalletRequest,
      lnrpc.Rpc.InitWalletResponse> getInitWalletMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lnrpc.Rpc.InitWalletRequest,
      lnrpc.Rpc.InitWalletResponse> getInitWalletMethod() {
    io.grpc.MethodDescriptor<lnrpc.Rpc.InitWalletRequest, lnrpc.Rpc.InitWalletResponse> getInitWalletMethod;
    if ((getInitWalletMethod = WalletUnlockerGrpc.getInitWalletMethod) == null) {
      synchronized (WalletUnlockerGrpc.class) {
        if ((getInitWalletMethod = WalletUnlockerGrpc.getInitWalletMethod) == null) {
          WalletUnlockerGrpc.getInitWalletMethod = getInitWalletMethod = 
              io.grpc.MethodDescriptor.<lnrpc.Rpc.InitWalletRequest, lnrpc.Rpc.InitWalletResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.WalletUnlocker", "InitWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lnrpc.Rpc.InitWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lnrpc.Rpc.InitWalletResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletUnlockerMethodDescriptorSupplier("InitWallet"))
                  .build();
          }
        }
     }
     return getInitWalletMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUnlockWalletMethod()} instead. 
  public static final io.grpc.MethodDescriptor<lnrpc.Rpc.UnlockWalletRequest,
      lnrpc.Rpc.UnlockWalletResponse> METHOD_UNLOCK_WALLET = getUnlockWalletMethod();

  private static volatile io.grpc.MethodDescriptor<lnrpc.Rpc.UnlockWalletRequest,
      lnrpc.Rpc.UnlockWalletResponse> getUnlockWalletMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<lnrpc.Rpc.UnlockWalletRequest,
      lnrpc.Rpc.UnlockWalletResponse> getUnlockWalletMethod() {
    io.grpc.MethodDescriptor<lnrpc.Rpc.UnlockWalletRequest, lnrpc.Rpc.UnlockWalletResponse> getUnlockWalletMethod;
    if ((getUnlockWalletMethod = WalletUnlockerGrpc.getUnlockWalletMethod) == null) {
      synchronized (WalletUnlockerGrpc.class) {
        if ((getUnlockWalletMethod = WalletUnlockerGrpc.getUnlockWalletMethod) == null) {
          WalletUnlockerGrpc.getUnlockWalletMethod = getUnlockWalletMethod = 
              io.grpc.MethodDescriptor.<lnrpc.Rpc.UnlockWalletRequest, lnrpc.Rpc.UnlockWalletResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lnrpc.WalletUnlocker", "UnlockWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lnrpc.Rpc.UnlockWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lnrpc.Rpc.UnlockWalletResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletUnlockerMethodDescriptorSupplier("UnlockWallet"))
                  .build();
          }
        }
     }
     return getUnlockWalletMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletUnlockerStub newStub(io.grpc.Channel channel) {
    return new WalletUnlockerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletUnlockerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WalletUnlockerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletUnlockerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WalletUnlockerFutureStub(channel);
  }

  /**
   * <pre>
   * The WalletUnlocker service is used to set up a wallet password for
   * lnd at first startup, and unlock a previously set up wallet.
   * </pre>
   */
  public static abstract class WalletUnlockerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     *GenSeed is the first method that should be used to instantiate a new lnd
     *instance. This method allows a caller to generate a new aezeed cipher seed
     *given an optional passphrase. If provided, the passphrase will be necessary
     *to decrypt the cipherseed to expose the internal wallet seed.
     *Once the cipherseed is obtained and verified by the user, the InitWallet
     *method should be used to commit the newly generated seed, and create the
     *wallet.
     * </pre>
     */
    public void genSeed(lnrpc.Rpc.GenSeedRequest request,
        io.grpc.stub.StreamObserver<lnrpc.Rpc.GenSeedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenSeedMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *InitWallet is used when lnd is starting up for the first time to fully
     *initialize the daemon and its internal wallet. At the very least a wallet
     *password must be provided. This will be used to encrypt sensitive material
     *on disk.
     *In the case of a recovery scenario, the user can also specify their aezeed
     *mnemonic and passphrase. If set, then the daemon will use this prior state
     *to initialize its internal wallet.
     *Alternatively, this can be used along with the GenSeed RPC to obtain a
     *seed, then present it to the user. Once it has been verified by the user,
     *the seed can be fed into this RPC in order to commit the new wallet.
     * </pre>
     */
    public void initWallet(lnrpc.Rpc.InitWalletRequest request,
        io.grpc.stub.StreamObserver<lnrpc.Rpc.InitWalletResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitWalletMethod(), responseObserver);
    }

    /**
     * <pre>
     ** lncli: `unlock`
     *UnlockWallet is used at startup of lnd to provide a password to unlock
     *the wallet database.
     * </pre>
     */
    public void unlockWallet(lnrpc.Rpc.UnlockWalletRequest request,
        io.grpc.stub.StreamObserver<lnrpc.Rpc.UnlockWalletResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlockWalletMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenSeedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lnrpc.Rpc.GenSeedRequest,
                lnrpc.Rpc.GenSeedResponse>(
                  this, METHODID_GEN_SEED)))
          .addMethod(
            getInitWalletMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lnrpc.Rpc.InitWalletRequest,
                lnrpc.Rpc.InitWalletResponse>(
                  this, METHODID_INIT_WALLET)))
          .addMethod(
            getUnlockWalletMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lnrpc.Rpc.UnlockWalletRequest,
                lnrpc.Rpc.UnlockWalletResponse>(
                  this, METHODID_UNLOCK_WALLET)))
          .build();
    }
  }

  /**
   * <pre>
   * The WalletUnlocker service is used to set up a wallet password for
   * lnd at first startup, and unlock a previously set up wallet.
   * </pre>
   */
  public static final class WalletUnlockerStub extends io.grpc.stub.AbstractStub<WalletUnlockerStub> {
    private WalletUnlockerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletUnlockerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletUnlockerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletUnlockerStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *GenSeed is the first method that should be used to instantiate a new lnd
     *instance. This method allows a caller to generate a new aezeed cipher seed
     *given an optional passphrase. If provided, the passphrase will be necessary
     *to decrypt the cipherseed to expose the internal wallet seed.
     *Once the cipherseed is obtained and verified by the user, the InitWallet
     *method should be used to commit the newly generated seed, and create the
     *wallet.
     * </pre>
     */
    public void genSeed(lnrpc.Rpc.GenSeedRequest request,
        io.grpc.stub.StreamObserver<lnrpc.Rpc.GenSeedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenSeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *InitWallet is used when lnd is starting up for the first time to fully
     *initialize the daemon and its internal wallet. At the very least a wallet
     *password must be provided. This will be used to encrypt sensitive material
     *on disk.
     *In the case of a recovery scenario, the user can also specify their aezeed
     *mnemonic and passphrase. If set, then the daemon will use this prior state
     *to initialize its internal wallet.
     *Alternatively, this can be used along with the GenSeed RPC to obtain a
     *seed, then present it to the user. Once it has been verified by the user,
     *the seed can be fed into this RPC in order to commit the new wallet.
     * </pre>
     */
    public void initWallet(lnrpc.Rpc.InitWalletRequest request,
        io.grpc.stub.StreamObserver<lnrpc.Rpc.InitWalletResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     ** lncli: `unlock`
     *UnlockWallet is used at startup of lnd to provide a password to unlock
     *the wallet database.
     * </pre>
     */
    public void unlockWallet(lnrpc.Rpc.UnlockWalletRequest request,
        io.grpc.stub.StreamObserver<lnrpc.Rpc.UnlockWalletResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlockWalletMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The WalletUnlocker service is used to set up a wallet password for
   * lnd at first startup, and unlock a previously set up wallet.
   * </pre>
   */
  public static final class WalletUnlockerBlockingStub extends io.grpc.stub.AbstractStub<WalletUnlockerBlockingStub> {
    private WalletUnlockerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletUnlockerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletUnlockerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletUnlockerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *GenSeed is the first method that should be used to instantiate a new lnd
     *instance. This method allows a caller to generate a new aezeed cipher seed
     *given an optional passphrase. If provided, the passphrase will be necessary
     *to decrypt the cipherseed to expose the internal wallet seed.
     *Once the cipherseed is obtained and verified by the user, the InitWallet
     *method should be used to commit the newly generated seed, and create the
     *wallet.
     * </pre>
     */
    public lnrpc.Rpc.GenSeedResponse genSeed(lnrpc.Rpc.GenSeedRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenSeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *InitWallet is used when lnd is starting up for the first time to fully
     *initialize the daemon and its internal wallet. At the very least a wallet
     *password must be provided. This will be used to encrypt sensitive material
     *on disk.
     *In the case of a recovery scenario, the user can also specify their aezeed
     *mnemonic and passphrase. If set, then the daemon will use this prior state
     *to initialize its internal wallet.
     *Alternatively, this can be used along with the GenSeed RPC to obtain a
     *seed, then present it to the user. Once it has been verified by the user,
     *the seed can be fed into this RPC in order to commit the new wallet.
     * </pre>
     */
    public lnrpc.Rpc.InitWalletResponse initWallet(lnrpc.Rpc.InitWalletRequest request) {
      return blockingUnaryCall(
          getChannel(), getInitWalletMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     ** lncli: `unlock`
     *UnlockWallet is used at startup of lnd to provide a password to unlock
     *the wallet database.
     * </pre>
     */
    public lnrpc.Rpc.UnlockWalletResponse unlockWallet(lnrpc.Rpc.UnlockWalletRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnlockWalletMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The WalletUnlocker service is used to set up a wallet password for
   * lnd at first startup, and unlock a previously set up wallet.
   * </pre>
   */
  public static final class WalletUnlockerFutureStub extends io.grpc.stub.AbstractStub<WalletUnlockerFutureStub> {
    private WalletUnlockerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletUnlockerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletUnlockerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletUnlockerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *GenSeed is the first method that should be used to instantiate a new lnd
     *instance. This method allows a caller to generate a new aezeed cipher seed
     *given an optional passphrase. If provided, the passphrase will be necessary
     *to decrypt the cipherseed to expose the internal wallet seed.
     *Once the cipherseed is obtained and verified by the user, the InitWallet
     *method should be used to commit the newly generated seed, and create the
     *wallet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lnrpc.Rpc.GenSeedResponse> genSeed(
        lnrpc.Rpc.GenSeedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenSeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *InitWallet is used when lnd is starting up for the first time to fully
     *initialize the daemon and its internal wallet. At the very least a wallet
     *password must be provided. This will be used to encrypt sensitive material
     *on disk.
     *In the case of a recovery scenario, the user can also specify their aezeed
     *mnemonic and passphrase. If set, then the daemon will use this prior state
     *to initialize its internal wallet.
     *Alternatively, this can be used along with the GenSeed RPC to obtain a
     *seed, then present it to the user. Once it has been verified by the user,
     *the seed can be fed into this RPC in order to commit the new wallet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lnrpc.Rpc.InitWalletResponse> initWallet(
        lnrpc.Rpc.InitWalletRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInitWalletMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     ** lncli: `unlock`
     *UnlockWallet is used at startup of lnd to provide a password to unlock
     *the wallet database.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lnrpc.Rpc.UnlockWalletResponse> unlockWallet(
        lnrpc.Rpc.UnlockWalletRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlockWalletMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GEN_SEED = 0;
  private static final int METHODID_INIT_WALLET = 1;
  private static final int METHODID_UNLOCK_WALLET = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WalletUnlockerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WalletUnlockerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GEN_SEED:
          serviceImpl.genSeed((lnrpc.Rpc.GenSeedRequest) request,
              (io.grpc.stub.StreamObserver<lnrpc.Rpc.GenSeedResponse>) responseObserver);
          break;
        case METHODID_INIT_WALLET:
          serviceImpl.initWallet((lnrpc.Rpc.InitWalletRequest) request,
              (io.grpc.stub.StreamObserver<lnrpc.Rpc.InitWalletResponse>) responseObserver);
          break;
        case METHODID_UNLOCK_WALLET:
          serviceImpl.unlockWallet((lnrpc.Rpc.UnlockWalletRequest) request,
              (io.grpc.stub.StreamObserver<lnrpc.Rpc.UnlockWalletResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WalletUnlockerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletUnlockerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lnrpc.Rpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WalletUnlocker");
    }
  }

  private static final class WalletUnlockerFileDescriptorSupplier
      extends WalletUnlockerBaseDescriptorSupplier {
    WalletUnlockerFileDescriptorSupplier() {}
  }

  private static final class WalletUnlockerMethodDescriptorSupplier
      extends WalletUnlockerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WalletUnlockerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WalletUnlockerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WalletUnlockerFileDescriptorSupplier())
              .addMethod(getGenSeedMethod())
              .addMethod(getInitWalletMethod())
              .addMethod(getUnlockWalletMethod())
              .build();
        }
      }
    }
    return result;
  }
}
