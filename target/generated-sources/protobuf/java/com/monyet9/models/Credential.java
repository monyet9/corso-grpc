// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Credential.proto

package com.monyet9.models;

/**
 * Protobuf type {@code proto.Credential}
 */
public final class Credential extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.Credential)
    CredentialOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Credential.newBuilder() to construct.
  private Credential(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Credential() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Credential();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.monyet9.models.CredentialOuterClass.internal_static_proto_Credential_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.monyet9.models.CredentialOuterClass.internal_static_proto_Credential_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.monyet9.models.Credential.class, com.monyet9.models.Credential.Builder.class);
  }

  private int authModeCase_ = 0;
  private java.lang.Object authMode_;
  public enum AuthModeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    USERCREDENTIAL(1),
    EMAILCREDETIAL(2),
    AUTHMODE_NOT_SET(0);
    private final int value;
    private AuthModeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AuthModeCase valueOf(int value) {
      return forNumber(value);
    }

    public static AuthModeCase forNumber(int value) {
      switch (value) {
        case 1: return USERCREDENTIAL;
        case 2: return EMAILCREDETIAL;
        case 0: return AUTHMODE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public AuthModeCase
  getAuthModeCase() {
    return AuthModeCase.forNumber(
        authModeCase_);
  }

  public static final int USERCREDENTIAL_FIELD_NUMBER = 1;
  /**
   * <code>.proto.UserCredential userCredential = 1;</code>
   * @return Whether the userCredential field is set.
   */
  @java.lang.Override
  public boolean hasUserCredential() {
    return authModeCase_ == 1;
  }
  /**
   * <code>.proto.UserCredential userCredential = 1;</code>
   * @return The userCredential.
   */
  @java.lang.Override
  public com.monyet9.models.UserCredential getUserCredential() {
    if (authModeCase_ == 1) {
       return (com.monyet9.models.UserCredential) authMode_;
    }
    return com.monyet9.models.UserCredential.getDefaultInstance();
  }
  /**
   * <code>.proto.UserCredential userCredential = 1;</code>
   */
  @java.lang.Override
  public com.monyet9.models.UserCredentialOrBuilder getUserCredentialOrBuilder() {
    if (authModeCase_ == 1) {
       return (com.monyet9.models.UserCredential) authMode_;
    }
    return com.monyet9.models.UserCredential.getDefaultInstance();
  }

  public static final int EMAILCREDETIAL_FIELD_NUMBER = 2;
  /**
   * <code>.proto.EmailCredential emailCredetial = 2;</code>
   * @return Whether the emailCredetial field is set.
   */
  @java.lang.Override
  public boolean hasEmailCredetial() {
    return authModeCase_ == 2;
  }
  /**
   * <code>.proto.EmailCredential emailCredetial = 2;</code>
   * @return The emailCredetial.
   */
  @java.lang.Override
  public com.monyet9.models.EmailCredential getEmailCredetial() {
    if (authModeCase_ == 2) {
       return (com.monyet9.models.EmailCredential) authMode_;
    }
    return com.monyet9.models.EmailCredential.getDefaultInstance();
  }
  /**
   * <code>.proto.EmailCredential emailCredetial = 2;</code>
   */
  @java.lang.Override
  public com.monyet9.models.EmailCredentialOrBuilder getEmailCredetialOrBuilder() {
    if (authModeCase_ == 2) {
       return (com.monyet9.models.EmailCredential) authMode_;
    }
    return com.monyet9.models.EmailCredential.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (authModeCase_ == 1) {
      output.writeMessage(1, (com.monyet9.models.UserCredential) authMode_);
    }
    if (authModeCase_ == 2) {
      output.writeMessage(2, (com.monyet9.models.EmailCredential) authMode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (authModeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.monyet9.models.UserCredential) authMode_);
    }
    if (authModeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.monyet9.models.EmailCredential) authMode_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.monyet9.models.Credential)) {
      return super.equals(obj);
    }
    com.monyet9.models.Credential other = (com.monyet9.models.Credential) obj;

    if (!getAuthModeCase().equals(other.getAuthModeCase())) return false;
    switch (authModeCase_) {
      case 1:
        if (!getUserCredential()
            .equals(other.getUserCredential())) return false;
        break;
      case 2:
        if (!getEmailCredetial()
            .equals(other.getEmailCredetial())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (authModeCase_) {
      case 1:
        hash = (37 * hash) + USERCREDENTIAL_FIELD_NUMBER;
        hash = (53 * hash) + getUserCredential().hashCode();
        break;
      case 2:
        hash = (37 * hash) + EMAILCREDETIAL_FIELD_NUMBER;
        hash = (53 * hash) + getEmailCredetial().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.monyet9.models.Credential parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.monyet9.models.Credential parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.monyet9.models.Credential parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.monyet9.models.Credential parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.monyet9.models.Credential parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.monyet9.models.Credential parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.monyet9.models.Credential parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.monyet9.models.Credential parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.monyet9.models.Credential parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.monyet9.models.Credential parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.monyet9.models.Credential parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.monyet9.models.Credential parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.monyet9.models.Credential prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.Credential}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.Credential)
      com.monyet9.models.CredentialOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.monyet9.models.CredentialOuterClass.internal_static_proto_Credential_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.monyet9.models.CredentialOuterClass.internal_static_proto_Credential_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.monyet9.models.Credential.class, com.monyet9.models.Credential.Builder.class);
    }

    // Construct using com.monyet9.models.Credential.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userCredentialBuilder_ != null) {
        userCredentialBuilder_.clear();
      }
      if (emailCredetialBuilder_ != null) {
        emailCredetialBuilder_.clear();
      }
      authModeCase_ = 0;
      authMode_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.monyet9.models.CredentialOuterClass.internal_static_proto_Credential_descriptor;
    }

    @java.lang.Override
    public com.monyet9.models.Credential getDefaultInstanceForType() {
      return com.monyet9.models.Credential.getDefaultInstance();
    }

    @java.lang.Override
    public com.monyet9.models.Credential build() {
      com.monyet9.models.Credential result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.monyet9.models.Credential buildPartial() {
      com.monyet9.models.Credential result = new com.monyet9.models.Credential(this);
      if (authModeCase_ == 1) {
        if (userCredentialBuilder_ == null) {
          result.authMode_ = authMode_;
        } else {
          result.authMode_ = userCredentialBuilder_.build();
        }
      }
      if (authModeCase_ == 2) {
        if (emailCredetialBuilder_ == null) {
          result.authMode_ = authMode_;
        } else {
          result.authMode_ = emailCredetialBuilder_.build();
        }
      }
      result.authModeCase_ = authModeCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.monyet9.models.Credential) {
        return mergeFrom((com.monyet9.models.Credential)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.monyet9.models.Credential other) {
      if (other == com.monyet9.models.Credential.getDefaultInstance()) return this;
      switch (other.getAuthModeCase()) {
        case USERCREDENTIAL: {
          mergeUserCredential(other.getUserCredential());
          break;
        }
        case EMAILCREDETIAL: {
          mergeEmailCredetial(other.getEmailCredetial());
          break;
        }
        case AUTHMODE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getUserCredentialFieldBuilder().getBuilder(),
                  extensionRegistry);
              authModeCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getEmailCredetialFieldBuilder().getBuilder(),
                  extensionRegistry);
              authModeCase_ = 2;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int authModeCase_ = 0;
    private java.lang.Object authMode_;
    public AuthModeCase
        getAuthModeCase() {
      return AuthModeCase.forNumber(
          authModeCase_);
    }

    public Builder clearAuthMode() {
      authModeCase_ = 0;
      authMode_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.monyet9.models.UserCredential, com.monyet9.models.UserCredential.Builder, com.monyet9.models.UserCredentialOrBuilder> userCredentialBuilder_;
    /**
     * <code>.proto.UserCredential userCredential = 1;</code>
     * @return Whether the userCredential field is set.
     */
    @java.lang.Override
    public boolean hasUserCredential() {
      return authModeCase_ == 1;
    }
    /**
     * <code>.proto.UserCredential userCredential = 1;</code>
     * @return The userCredential.
     */
    @java.lang.Override
    public com.monyet9.models.UserCredential getUserCredential() {
      if (userCredentialBuilder_ == null) {
        if (authModeCase_ == 1) {
          return (com.monyet9.models.UserCredential) authMode_;
        }
        return com.monyet9.models.UserCredential.getDefaultInstance();
      } else {
        if (authModeCase_ == 1) {
          return userCredentialBuilder_.getMessage();
        }
        return com.monyet9.models.UserCredential.getDefaultInstance();
      }
    }
    /**
     * <code>.proto.UserCredential userCredential = 1;</code>
     */
    public Builder setUserCredential(com.monyet9.models.UserCredential value) {
      if (userCredentialBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authMode_ = value;
        onChanged();
      } else {
        userCredentialBuilder_.setMessage(value);
      }
      authModeCase_ = 1;
      return this;
    }
    /**
     * <code>.proto.UserCredential userCredential = 1;</code>
     */
    public Builder setUserCredential(
        com.monyet9.models.UserCredential.Builder builderForValue) {
      if (userCredentialBuilder_ == null) {
        authMode_ = builderForValue.build();
        onChanged();
      } else {
        userCredentialBuilder_.setMessage(builderForValue.build());
      }
      authModeCase_ = 1;
      return this;
    }
    /**
     * <code>.proto.UserCredential userCredential = 1;</code>
     */
    public Builder mergeUserCredential(com.monyet9.models.UserCredential value) {
      if (userCredentialBuilder_ == null) {
        if (authModeCase_ == 1 &&
            authMode_ != com.monyet9.models.UserCredential.getDefaultInstance()) {
          authMode_ = com.monyet9.models.UserCredential.newBuilder((com.monyet9.models.UserCredential) authMode_)
              .mergeFrom(value).buildPartial();
        } else {
          authMode_ = value;
        }
        onChanged();
      } else {
        if (authModeCase_ == 1) {
          userCredentialBuilder_.mergeFrom(value);
        } else {
          userCredentialBuilder_.setMessage(value);
        }
      }
      authModeCase_ = 1;
      return this;
    }
    /**
     * <code>.proto.UserCredential userCredential = 1;</code>
     */
    public Builder clearUserCredential() {
      if (userCredentialBuilder_ == null) {
        if (authModeCase_ == 1) {
          authModeCase_ = 0;
          authMode_ = null;
          onChanged();
        }
      } else {
        if (authModeCase_ == 1) {
          authModeCase_ = 0;
          authMode_ = null;
        }
        userCredentialBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.proto.UserCredential userCredential = 1;</code>
     */
    public com.monyet9.models.UserCredential.Builder getUserCredentialBuilder() {
      return getUserCredentialFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.UserCredential userCredential = 1;</code>
     */
    @java.lang.Override
    public com.monyet9.models.UserCredentialOrBuilder getUserCredentialOrBuilder() {
      if ((authModeCase_ == 1) && (userCredentialBuilder_ != null)) {
        return userCredentialBuilder_.getMessageOrBuilder();
      } else {
        if (authModeCase_ == 1) {
          return (com.monyet9.models.UserCredential) authMode_;
        }
        return com.monyet9.models.UserCredential.getDefaultInstance();
      }
    }
    /**
     * <code>.proto.UserCredential userCredential = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.monyet9.models.UserCredential, com.monyet9.models.UserCredential.Builder, com.monyet9.models.UserCredentialOrBuilder> 
        getUserCredentialFieldBuilder() {
      if (userCredentialBuilder_ == null) {
        if (!(authModeCase_ == 1)) {
          authMode_ = com.monyet9.models.UserCredential.getDefaultInstance();
        }
        userCredentialBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.monyet9.models.UserCredential, com.monyet9.models.UserCredential.Builder, com.monyet9.models.UserCredentialOrBuilder>(
                (com.monyet9.models.UserCredential) authMode_,
                getParentForChildren(),
                isClean());
        authMode_ = null;
      }
      authModeCase_ = 1;
      onChanged();;
      return userCredentialBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.monyet9.models.EmailCredential, com.monyet9.models.EmailCredential.Builder, com.monyet9.models.EmailCredentialOrBuilder> emailCredetialBuilder_;
    /**
     * <code>.proto.EmailCredential emailCredetial = 2;</code>
     * @return Whether the emailCredetial field is set.
     */
    @java.lang.Override
    public boolean hasEmailCredetial() {
      return authModeCase_ == 2;
    }
    /**
     * <code>.proto.EmailCredential emailCredetial = 2;</code>
     * @return The emailCredetial.
     */
    @java.lang.Override
    public com.monyet9.models.EmailCredential getEmailCredetial() {
      if (emailCredetialBuilder_ == null) {
        if (authModeCase_ == 2) {
          return (com.monyet9.models.EmailCredential) authMode_;
        }
        return com.monyet9.models.EmailCredential.getDefaultInstance();
      } else {
        if (authModeCase_ == 2) {
          return emailCredetialBuilder_.getMessage();
        }
        return com.monyet9.models.EmailCredential.getDefaultInstance();
      }
    }
    /**
     * <code>.proto.EmailCredential emailCredetial = 2;</code>
     */
    public Builder setEmailCredetial(com.monyet9.models.EmailCredential value) {
      if (emailCredetialBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authMode_ = value;
        onChanged();
      } else {
        emailCredetialBuilder_.setMessage(value);
      }
      authModeCase_ = 2;
      return this;
    }
    /**
     * <code>.proto.EmailCredential emailCredetial = 2;</code>
     */
    public Builder setEmailCredetial(
        com.monyet9.models.EmailCredential.Builder builderForValue) {
      if (emailCredetialBuilder_ == null) {
        authMode_ = builderForValue.build();
        onChanged();
      } else {
        emailCredetialBuilder_.setMessage(builderForValue.build());
      }
      authModeCase_ = 2;
      return this;
    }
    /**
     * <code>.proto.EmailCredential emailCredetial = 2;</code>
     */
    public Builder mergeEmailCredetial(com.monyet9.models.EmailCredential value) {
      if (emailCredetialBuilder_ == null) {
        if (authModeCase_ == 2 &&
            authMode_ != com.monyet9.models.EmailCredential.getDefaultInstance()) {
          authMode_ = com.monyet9.models.EmailCredential.newBuilder((com.monyet9.models.EmailCredential) authMode_)
              .mergeFrom(value).buildPartial();
        } else {
          authMode_ = value;
        }
        onChanged();
      } else {
        if (authModeCase_ == 2) {
          emailCredetialBuilder_.mergeFrom(value);
        } else {
          emailCredetialBuilder_.setMessage(value);
        }
      }
      authModeCase_ = 2;
      return this;
    }
    /**
     * <code>.proto.EmailCredential emailCredetial = 2;</code>
     */
    public Builder clearEmailCredetial() {
      if (emailCredetialBuilder_ == null) {
        if (authModeCase_ == 2) {
          authModeCase_ = 0;
          authMode_ = null;
          onChanged();
        }
      } else {
        if (authModeCase_ == 2) {
          authModeCase_ = 0;
          authMode_ = null;
        }
        emailCredetialBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.proto.EmailCredential emailCredetial = 2;</code>
     */
    public com.monyet9.models.EmailCredential.Builder getEmailCredetialBuilder() {
      return getEmailCredetialFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.EmailCredential emailCredetial = 2;</code>
     */
    @java.lang.Override
    public com.monyet9.models.EmailCredentialOrBuilder getEmailCredetialOrBuilder() {
      if ((authModeCase_ == 2) && (emailCredetialBuilder_ != null)) {
        return emailCredetialBuilder_.getMessageOrBuilder();
      } else {
        if (authModeCase_ == 2) {
          return (com.monyet9.models.EmailCredential) authMode_;
        }
        return com.monyet9.models.EmailCredential.getDefaultInstance();
      }
    }
    /**
     * <code>.proto.EmailCredential emailCredetial = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.monyet9.models.EmailCredential, com.monyet9.models.EmailCredential.Builder, com.monyet9.models.EmailCredentialOrBuilder> 
        getEmailCredetialFieldBuilder() {
      if (emailCredetialBuilder_ == null) {
        if (!(authModeCase_ == 2)) {
          authMode_ = com.monyet9.models.EmailCredential.getDefaultInstance();
        }
        emailCredetialBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.monyet9.models.EmailCredential, com.monyet9.models.EmailCredential.Builder, com.monyet9.models.EmailCredentialOrBuilder>(
                (com.monyet9.models.EmailCredential) authMode_,
                getParentForChildren(),
                isClean());
        authMode_ = null;
      }
      authModeCase_ = 2;
      onChanged();;
      return emailCredetialBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.Credential)
  }

  // @@protoc_insertion_point(class_scope:proto.Credential)
  private static final com.monyet9.models.Credential DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.monyet9.models.Credential();
  }

  public static com.monyet9.models.Credential getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Credential>
      PARSER = new com.google.protobuf.AbstractParser<Credential>() {
    @java.lang.Override
    public Credential parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Credential> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Credential> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.monyet9.models.Credential getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

