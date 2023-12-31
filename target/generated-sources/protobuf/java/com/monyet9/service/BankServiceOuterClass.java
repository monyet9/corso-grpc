// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/bankService.proto

package com.monyet9.service;

public final class BankServiceOuterClass {
  private BankServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service_BankServiceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service_BankServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service_WithdrawRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service_WithdrawRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service_WithdrawResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service_WithdrawResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service_Money_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service_Money_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service_BankServiceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service_BankServiceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service_DepositoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service_DepositoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service_DepositoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service_DepositoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031service/bankService.proto\022\007service\032\036go" +
      "ogle/protobuf/wrappers.proto\"8\n\022BankServ" +
      "iceRequest\022\020\n\010username\030\001 \001(\t\022\020\n\010password" +
      "\030\002 \001(\t\"D\n\017WithdrawRequest\022\020\n\010username\030\001 " +
      "\001(\t\022\020\n\010password\030\002 \001(\t\022\r\n\005value\030\003 \001(\t\"1\n\020" +
      "WithdrawResponse\022\035\n\005money\030\001 \001(\0132\016.servic" +
      "e.Money\"\026\n\005Money\022\r\n\005value\030\001 \001(\005\"`\n\023BankS" +
      "erviceResponse\022\014\n\004nome\030\001 \001(\t\022\017\n\007cognome\030" +
      "\002 \001(\t\022*\n\005saldo\030\003 \001(\0132\033.google.protobuf.I" +
      "nt32Value\"N\n\017DepositoRequest\022\020\n\010username" +
      "\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\022\027\n\017amuountDepos" +
      "ito\030\003 \001(\t\"!\n\020DepositoResponse\022\r\n\005total\030\001" +
      " \001(\t2\327\001\n\013BankService\022B\n\005login\022\033.service." +
      "BankServiceRequest\032\034.service.BankService" +
      "Response\022A\n\010getMoney\022\030.service.WithdrawR" +
      "equest\032\031.service.WithdrawResponse0\001\022A\n\010d" +
      "eposito\022\030.service.DepositoRequest\032\031.serv" +
      "ice.DepositoResponse(\001B\027\n\023com.monyet9.se" +
      "rviceP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_service_BankServiceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_service_BankServiceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service_BankServiceRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_service_WithdrawRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_service_WithdrawRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service_WithdrawRequest_descriptor,
        new java.lang.String[] { "Username", "Password", "Value", });
    internal_static_service_WithdrawResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_service_WithdrawResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service_WithdrawResponse_descriptor,
        new java.lang.String[] { "Money", });
    internal_static_service_Money_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_service_Money_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service_Money_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_service_BankServiceResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_service_BankServiceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service_BankServiceResponse_descriptor,
        new java.lang.String[] { "Nome", "Cognome", "Saldo", });
    internal_static_service_DepositoRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_service_DepositoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service_DepositoRequest_descriptor,
        new java.lang.String[] { "Username", "Password", "AmuountDeposito", });
    internal_static_service_DepositoResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_service_DepositoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service_DepositoResponse_descriptor,
        new java.lang.String[] { "Total", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
