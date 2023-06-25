// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/bankService.proto

package com.monyet9.service;

/**
 * Protobuf type {@code service.WithdrawResponse}
 */
public final class WithdrawResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service.WithdrawResponse)
    WithdrawResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WithdrawResponse.newBuilder() to construct.
  private WithdrawResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WithdrawResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WithdrawResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.monyet9.service.BankServiceOuterClass.internal_static_service_WithdrawResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.monyet9.service.BankServiceOuterClass.internal_static_service_WithdrawResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.monyet9.service.WithdrawResponse.class, com.monyet9.service.WithdrawResponse.Builder.class);
  }

  public static final int MONEY_FIELD_NUMBER = 1;
  private com.monyet9.service.Money money_;
  /**
   * <code>.service.Money money = 1;</code>
   * @return Whether the money field is set.
   */
  @java.lang.Override
  public boolean hasMoney() {
    return money_ != null;
  }
  /**
   * <code>.service.Money money = 1;</code>
   * @return The money.
   */
  @java.lang.Override
  public com.monyet9.service.Money getMoney() {
    return money_ == null ? com.monyet9.service.Money.getDefaultInstance() : money_;
  }
  /**
   * <code>.service.Money money = 1;</code>
   */
  @java.lang.Override
  public com.monyet9.service.MoneyOrBuilder getMoneyOrBuilder() {
    return getMoney();
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
    if (money_ != null) {
      output.writeMessage(1, getMoney());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (money_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMoney());
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
    if (!(obj instanceof com.monyet9.service.WithdrawResponse)) {
      return super.equals(obj);
    }
    com.monyet9.service.WithdrawResponse other = (com.monyet9.service.WithdrawResponse) obj;

    if (hasMoney() != other.hasMoney()) return false;
    if (hasMoney()) {
      if (!getMoney()
          .equals(other.getMoney())) return false;
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
    if (hasMoney()) {
      hash = (37 * hash) + MONEY_FIELD_NUMBER;
      hash = (53 * hash) + getMoney().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.monyet9.service.WithdrawResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.monyet9.service.WithdrawResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.monyet9.service.WithdrawResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.monyet9.service.WithdrawResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.monyet9.service.WithdrawResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.monyet9.service.WithdrawResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.monyet9.service.WithdrawResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.monyet9.service.WithdrawResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.monyet9.service.WithdrawResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.monyet9.service.WithdrawResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.monyet9.service.WithdrawResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.monyet9.service.WithdrawResponse parseFrom(
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
  public static Builder newBuilder(com.monyet9.service.WithdrawResponse prototype) {
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
   * Protobuf type {@code service.WithdrawResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service.WithdrawResponse)
      com.monyet9.service.WithdrawResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.monyet9.service.BankServiceOuterClass.internal_static_service_WithdrawResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.monyet9.service.BankServiceOuterClass.internal_static_service_WithdrawResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.monyet9.service.WithdrawResponse.class, com.monyet9.service.WithdrawResponse.Builder.class);
    }

    // Construct using com.monyet9.service.WithdrawResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (moneyBuilder_ == null) {
        money_ = null;
      } else {
        money_ = null;
        moneyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.monyet9.service.BankServiceOuterClass.internal_static_service_WithdrawResponse_descriptor;
    }

    @java.lang.Override
    public com.monyet9.service.WithdrawResponse getDefaultInstanceForType() {
      return com.monyet9.service.WithdrawResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.monyet9.service.WithdrawResponse build() {
      com.monyet9.service.WithdrawResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.monyet9.service.WithdrawResponse buildPartial() {
      com.monyet9.service.WithdrawResponse result = new com.monyet9.service.WithdrawResponse(this);
      if (moneyBuilder_ == null) {
        result.money_ = money_;
      } else {
        result.money_ = moneyBuilder_.build();
      }
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
      if (other instanceof com.monyet9.service.WithdrawResponse) {
        return mergeFrom((com.monyet9.service.WithdrawResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.monyet9.service.WithdrawResponse other) {
      if (other == com.monyet9.service.WithdrawResponse.getDefaultInstance()) return this;
      if (other.hasMoney()) {
        mergeMoney(other.getMoney());
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
                  getMoneyFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
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

    private com.monyet9.service.Money money_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.monyet9.service.Money, com.monyet9.service.Money.Builder, com.monyet9.service.MoneyOrBuilder> moneyBuilder_;
    /**
     * <code>.service.Money money = 1;</code>
     * @return Whether the money field is set.
     */
    public boolean hasMoney() {
      return moneyBuilder_ != null || money_ != null;
    }
    /**
     * <code>.service.Money money = 1;</code>
     * @return The money.
     */
    public com.monyet9.service.Money getMoney() {
      if (moneyBuilder_ == null) {
        return money_ == null ? com.monyet9.service.Money.getDefaultInstance() : money_;
      } else {
        return moneyBuilder_.getMessage();
      }
    }
    /**
     * <code>.service.Money money = 1;</code>
     */
    public Builder setMoney(com.monyet9.service.Money value) {
      if (moneyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        money_ = value;
        onChanged();
      } else {
        moneyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.service.Money money = 1;</code>
     */
    public Builder setMoney(
        com.monyet9.service.Money.Builder builderForValue) {
      if (moneyBuilder_ == null) {
        money_ = builderForValue.build();
        onChanged();
      } else {
        moneyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.service.Money money = 1;</code>
     */
    public Builder mergeMoney(com.monyet9.service.Money value) {
      if (moneyBuilder_ == null) {
        if (money_ != null) {
          money_ =
            com.monyet9.service.Money.newBuilder(money_).mergeFrom(value).buildPartial();
        } else {
          money_ = value;
        }
        onChanged();
      } else {
        moneyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.service.Money money = 1;</code>
     */
    public Builder clearMoney() {
      if (moneyBuilder_ == null) {
        money_ = null;
        onChanged();
      } else {
        money_ = null;
        moneyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.service.Money money = 1;</code>
     */
    public com.monyet9.service.Money.Builder getMoneyBuilder() {
      
      onChanged();
      return getMoneyFieldBuilder().getBuilder();
    }
    /**
     * <code>.service.Money money = 1;</code>
     */
    public com.monyet9.service.MoneyOrBuilder getMoneyOrBuilder() {
      if (moneyBuilder_ != null) {
        return moneyBuilder_.getMessageOrBuilder();
      } else {
        return money_ == null ?
            com.monyet9.service.Money.getDefaultInstance() : money_;
      }
    }
    /**
     * <code>.service.Money money = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.monyet9.service.Money, com.monyet9.service.Money.Builder, com.monyet9.service.MoneyOrBuilder> 
        getMoneyFieldBuilder() {
      if (moneyBuilder_ == null) {
        moneyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.monyet9.service.Money, com.monyet9.service.Money.Builder, com.monyet9.service.MoneyOrBuilder>(
                getMoney(),
                getParentForChildren(),
                isClean());
        money_ = null;
      }
      return moneyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:service.WithdrawResponse)
  }

  // @@protoc_insertion_point(class_scope:service.WithdrawResponse)
  private static final com.monyet9.service.WithdrawResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.monyet9.service.WithdrawResponse();
  }

  public static com.monyet9.service.WithdrawResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WithdrawResponse>
      PARSER = new com.google.protobuf.AbstractParser<WithdrawResponse>() {
    @java.lang.Override
    public WithdrawResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<WithdrawResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WithdrawResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.monyet9.service.WithdrawResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

