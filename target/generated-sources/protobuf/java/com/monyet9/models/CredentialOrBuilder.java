// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Credential.proto

package com.monyet9.models;

public interface CredentialOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Credential)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.proto.UserCredential userCredential = 1;</code>
   * @return Whether the userCredential field is set.
   */
  boolean hasUserCredential();
  /**
   * <code>.proto.UserCredential userCredential = 1;</code>
   * @return The userCredential.
   */
  com.monyet9.models.UserCredential getUserCredential();
  /**
   * <code>.proto.UserCredential userCredential = 1;</code>
   */
  com.monyet9.models.UserCredentialOrBuilder getUserCredentialOrBuilder();

  /**
   * <code>.proto.EmailCredential emailCredetial = 2;</code>
   * @return Whether the emailCredetial field is set.
   */
  boolean hasEmailCredetial();
  /**
   * <code>.proto.EmailCredential emailCredetial = 2;</code>
   * @return The emailCredetial.
   */
  com.monyet9.models.EmailCredential getEmailCredetial();
  /**
   * <code>.proto.EmailCredential emailCredetial = 2;</code>
   */
  com.monyet9.models.EmailCredentialOrBuilder getEmailCredetialOrBuilder();

  public com.monyet9.models.Credential.AuthModeCase getAuthModeCase();
}
