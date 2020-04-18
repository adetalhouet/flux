package io.adetalhouet.directory.grpc;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.0)",
    comments = "Source: contacts.proto")
public final class ContactServiceGrpc {

  private ContactServiceGrpc() {}

  public static final String SERVICE_NAME = "io.adetalhouet.directory.ContactService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.directory.grpc.Person,
      com.google.protobuf.Empty> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = io.adetalhouet.directory.grpc.Person.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.directory.grpc.Person,
      com.google.protobuf.Empty> getCreateMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.directory.grpc.Person, com.google.protobuf.Empty> getCreateMethod;
    if ((getCreateMethod = ContactServiceGrpc.getCreateMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getCreateMethod = ContactServiceGrpc.getCreateMethod) == null) {
          ContactServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.directory.grpc.Person, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.directory.grpc.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.adetalhouet.directory.grpc.Person> getListsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Lists",
      requestType = com.google.protobuf.Empty.class,
      responseType = io.adetalhouet.directory.grpc.Person.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.adetalhouet.directory.grpc.Person> getListsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, io.adetalhouet.directory.grpc.Person> getListsMethod;
    if ((getListsMethod = ContactServiceGrpc.getListsMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getListsMethod = ContactServiceGrpc.getListsMethod) == null) {
          ContactServiceGrpc.getListsMethod = getListsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, io.adetalhouet.directory.grpc.Person>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Lists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.directory.grpc.Person.getDefaultInstance()))
              .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("Lists"))
              .build();
        }
      }
    }
    return getListsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.adetalhouet.directory.grpc.Identifier,
      io.adetalhouet.directory.grpc.Person> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = io.adetalhouet.directory.grpc.Identifier.class,
      responseType = io.adetalhouet.directory.grpc.Person.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.adetalhouet.directory.grpc.Identifier,
      io.adetalhouet.directory.grpc.Person> getGetMethod() {
    io.grpc.MethodDescriptor<io.adetalhouet.directory.grpc.Identifier, io.adetalhouet.directory.grpc.Person> getGetMethod;
    if ((getGetMethod = ContactServiceGrpc.getGetMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getGetMethod = ContactServiceGrpc.getGetMethod) == null) {
          ContactServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<io.adetalhouet.directory.grpc.Identifier, io.adetalhouet.directory.grpc.Person>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.directory.grpc.Identifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.adetalhouet.directory.grpc.Person.getDefaultInstance()))
              .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContactServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContactServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContactServiceStub>() {
        @java.lang.Override
        public ContactServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContactServiceStub(channel, callOptions);
        }
      };
    return ContactServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContactServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContactServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContactServiceBlockingStub>() {
        @java.lang.Override
        public ContactServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContactServiceBlockingStub(channel, callOptions);
        }
      };
    return ContactServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContactServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContactServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContactServiceFutureStub>() {
        @java.lang.Override
        public ContactServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContactServiceFutureStub(channel, callOptions);
        }
      };
    return ContactServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ContactServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(io.adetalhouet.directory.grpc.Person request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void lists(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.adetalhouet.directory.grpc.Person> responseObserver) {
      asyncUnimplementedUnaryCall(getListsMethod(), responseObserver);
    }

    /**
     */
    public void get(io.adetalhouet.directory.grpc.Identifier request,
        io.grpc.stub.StreamObserver<io.adetalhouet.directory.grpc.Person> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.directory.grpc.Person,
                com.google.protobuf.Empty>(
                  this, METHODID_CREATE)))
          .addMethod(
            getListsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                io.adetalhouet.directory.grpc.Person>(
                  this, METHODID_LISTS)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.adetalhouet.directory.grpc.Identifier,
                io.adetalhouet.directory.grpc.Person>(
                  this, METHODID_GET)))
          .build();
    }
  }

  /**
   */
  public static final class ContactServiceStub extends io.grpc.stub.AbstractAsyncStub<ContactServiceStub> {
    private ContactServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContactServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(io.adetalhouet.directory.grpc.Person request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lists(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.adetalhouet.directory.grpc.Person> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(io.adetalhouet.directory.grpc.Identifier request,
        io.grpc.stub.StreamObserver<io.adetalhouet.directory.grpc.Person> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ContactServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ContactServiceBlockingStub> {
    private ContactServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContactServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty create(io.adetalhouet.directory.grpc.Person request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<io.adetalhouet.directory.grpc.Person> lists(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getListsMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.adetalhouet.directory.grpc.Person get(io.adetalhouet.directory.grpc.Identifier request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ContactServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ContactServiceFutureStub> {
    private ContactServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContactServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> create(
        io.adetalhouet.directory.grpc.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.adetalhouet.directory.grpc.Person> get(
        io.adetalhouet.directory.grpc.Identifier request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_LISTS = 1;
  private static final int METHODID_GET = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ContactServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ContactServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((io.adetalhouet.directory.grpc.Person) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LISTS:
          serviceImpl.lists((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<io.adetalhouet.directory.grpc.Person>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((io.adetalhouet.directory.grpc.Identifier) request,
              (io.grpc.stub.StreamObserver<io.adetalhouet.directory.grpc.Person>) responseObserver);
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

  private static abstract class ContactServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContactServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.adetalhouet.directory.grpc.Contacts.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContactService");
    }
  }

  private static final class ContactServiceFileDescriptorSupplier
      extends ContactServiceBaseDescriptorSupplier {
    ContactServiceFileDescriptorSupplier() {}
  }

  private static final class ContactServiceMethodDescriptorSupplier
      extends ContactServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ContactServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ContactServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContactServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getListsMethod())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
