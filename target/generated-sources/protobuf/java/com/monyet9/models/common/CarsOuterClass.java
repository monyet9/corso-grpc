// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/cars.proto

package com.monyet9.models.common;

public final class CarsOuterClass {
  private CarsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_Cars_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_Cars_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021common/cars.proto\022\006common\"\024\n\004Cars\022\014\n\004t" +
      "ype\030\001 \001(\tB\035\n\031com.monyet9.models.commonP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_common_Cars_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_common_Cars_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_Cars_descriptor,
        new java.lang.String[] { "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
