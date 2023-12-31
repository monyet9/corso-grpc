package com.monyet9.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: service/bankService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "service.BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.monyet9.service.BankServiceRequest,
      com.monyet9.service.BankServiceResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.monyet9.service.BankServiceRequest.class,
      responseType = com.monyet9.service.BankServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.monyet9.service.BankServiceRequest,
      com.monyet9.service.BankServiceResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.monyet9.service.BankServiceRequest, com.monyet9.service.BankServiceResponse> getLoginMethod;
    if ((getLoginMethod = BankServiceGrpc.getLoginMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getLoginMethod = BankServiceGrpc.getLoginMethod) == null) {
          BankServiceGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<com.monyet9.service.BankServiceRequest, com.monyet9.service.BankServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.monyet9.service.BankServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.monyet9.service.BankServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.monyet9.service.WithdrawRequest,
      com.monyet9.service.WithdrawResponse> getGetMoneyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMoney",
      requestType = com.monyet9.service.WithdrawRequest.class,
      responseType = com.monyet9.service.WithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.monyet9.service.WithdrawRequest,
      com.monyet9.service.WithdrawResponse> getGetMoneyMethod() {
    io.grpc.MethodDescriptor<com.monyet9.service.WithdrawRequest, com.monyet9.service.WithdrawResponse> getGetMoneyMethod;
    if ((getGetMoneyMethod = BankServiceGrpc.getGetMoneyMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetMoneyMethod = BankServiceGrpc.getGetMoneyMethod) == null) {
          BankServiceGrpc.getGetMoneyMethod = getGetMoneyMethod =
              io.grpc.MethodDescriptor.<com.monyet9.service.WithdrawRequest, com.monyet9.service.WithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMoney"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.monyet9.service.WithdrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.monyet9.service.WithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getMoney"))
              .build();
        }
      }
    }
    return getGetMoneyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.monyet9.service.DepositoRequest,
      com.monyet9.service.DepositoResponse> getDepositoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deposito",
      requestType = com.monyet9.service.DepositoRequest.class,
      responseType = com.monyet9.service.DepositoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.monyet9.service.DepositoRequest,
      com.monyet9.service.DepositoResponse> getDepositoMethod() {
    io.grpc.MethodDescriptor<com.monyet9.service.DepositoRequest, com.monyet9.service.DepositoResponse> getDepositoMethod;
    if ((getDepositoMethod = BankServiceGrpc.getDepositoMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getDepositoMethod = BankServiceGrpc.getDepositoMethod) == null) {
          BankServiceGrpc.getDepositoMethod = getDepositoMethod =
              io.grpc.MethodDescriptor.<com.monyet9.service.DepositoRequest, com.monyet9.service.DepositoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deposito"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.monyet9.service.DepositoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.monyet9.service.DepositoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("deposito"))
              .build();
        }
      }
    }
    return getDepositoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceStub>() {
        @java.lang.Override
        public BankServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceStub(channel, callOptions);
        }
      };
    return BankServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub>() {
        @java.lang.Override
        public BankServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceBlockingStub(channel, callOptions);
        }
      };
    return BankServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub>() {
        @java.lang.Override
        public BankServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceFutureStub(channel, callOptions);
        }
      };
    return BankServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * unary request-response sync
     * </pre>
     */
    default void login(com.monyet9.service.BankServiceRequest request,
        io.grpc.stub.StreamObserver<com.monyet9.service.BankServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     *server side -- server streaming , invio una richiesta e ricevo piu risposte
     * </pre>
     */
    default void getMoney(com.monyet9.service.WithdrawRequest request,
        io.grpc.stub.StreamObserver<com.monyet9.service.WithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMoneyMethod(), responseObserver);
    }

    /**
     * <pre>
     *client side --streaming , invio piu richiestee ricevo un unica risposta
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.monyet9.service.DepositoRequest> deposito(
        io.grpc.stub.StreamObserver<com.monyet9.service.DepositoResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getDepositoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BankService.
   */
  public static abstract class BankServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BankServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BankService.
   */
  public static final class BankServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BankServiceStub> {
    private BankServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary request-response sync
     * </pre>
     */
    public void login(com.monyet9.service.BankServiceRequest request,
        io.grpc.stub.StreamObserver<com.monyet9.service.BankServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server side -- server streaming , invio una richiesta e ricevo piu risposte
     * </pre>
     */
    public void getMoney(com.monyet9.service.WithdrawRequest request,
        io.grpc.stub.StreamObserver<com.monyet9.service.WithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetMoneyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client side --streaming , invio piu richiestee ricevo un unica risposta
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.monyet9.service.DepositoRequest> deposito(
        io.grpc.stub.StreamObserver<com.monyet9.service.DepositoResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getDepositoMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BankService.
   */
  public static final class BankServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary request-response sync
     * </pre>
     */
    public com.monyet9.service.BankServiceResponse login(com.monyet9.service.BankServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server side -- server streaming , invio una richiesta e ricevo piu risposte
     * </pre>
     */
    public java.util.Iterator<com.monyet9.service.WithdrawResponse> getMoney(
        com.monyet9.service.WithdrawRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetMoneyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BankService.
   */
  public static final class BankServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BankServiceFutureStub> {
    private BankServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary request-response sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.monyet9.service.BankServiceResponse> login(
        com.monyet9.service.BankServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_GET_MONEY = 1;
  private static final int METHODID_DEPOSITO = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.monyet9.service.BankServiceRequest) request,
              (io.grpc.stub.StreamObserver<com.monyet9.service.BankServiceResponse>) responseObserver);
          break;
        case METHODID_GET_MONEY:
          serviceImpl.getMoney((com.monyet9.service.WithdrawRequest) request,
              (io.grpc.stub.StreamObserver<com.monyet9.service.WithdrawResponse>) responseObserver);
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
        case METHODID_DEPOSITO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.deposito(
              (io.grpc.stub.StreamObserver<com.monyet9.service.DepositoResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.monyet9.service.BankServiceRequest,
              com.monyet9.service.BankServiceResponse>(
                service, METHODID_LOGIN)))
        .addMethod(
          getGetMoneyMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.monyet9.service.WithdrawRequest,
              com.monyet9.service.WithdrawResponse>(
                service, METHODID_GET_MONEY)))
        .addMethod(
          getDepositoMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.monyet9.service.DepositoRequest,
              com.monyet9.service.DepositoResponse>(
                service, METHODID_DEPOSITO)))
        .build();
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.monyet9.service.BankServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getGetMoneyMethod())
              .addMethod(getDepositoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
