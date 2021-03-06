// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/util/event.proto

package org.tensorflow.proto.util;

/**
 * Protobuf type {@code tensorflow.WorkerHeartbeatRequest}
 */
public  final class WorkerHeartbeatRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.WorkerHeartbeatRequest)
    WorkerHeartbeatRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WorkerHeartbeatRequest.newBuilder() to construct.
  private WorkerHeartbeatRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkerHeartbeatRequest() {
    shutdownMode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WorkerHeartbeatRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WorkerHeartbeatRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            shutdownMode_ = rawValue;
            break;
          }
          case 18: {
            org.tensorflow.proto.util.WatchdogConfig.Builder subBuilder = null;
            if (watchdogConfig_ != null) {
              subBuilder = watchdogConfig_.toBuilder();
            }
            watchdogConfig_ = input.readMessage(org.tensorflow.proto.util.WatchdogConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(watchdogConfig_);
              watchdogConfig_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            org.tensorflow.proto.util.RequestedExitCode.Builder subBuilder = null;
            if (exitCode_ != null) {
              subBuilder = exitCode_.toBuilder();
            }
            exitCode_ = input.readMessage(org.tensorflow.proto.util.RequestedExitCode.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(exitCode_);
              exitCode_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.util.EventProtos.internal_static_tensorflow_WorkerHeartbeatRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.util.EventProtos.internal_static_tensorflow_WorkerHeartbeatRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.util.WorkerHeartbeatRequest.class, org.tensorflow.proto.util.WorkerHeartbeatRequest.Builder.class);
  }

  public static final int SHUTDOWN_MODE_FIELD_NUMBER = 1;
  private int shutdownMode_;
  /**
   * <code>.tensorflow.WorkerShutdownMode shutdown_mode = 1;</code>
   */
  public int getShutdownModeValue() {
    return shutdownMode_;
  }
  /**
   * <code>.tensorflow.WorkerShutdownMode shutdown_mode = 1;</code>
   */
  public org.tensorflow.proto.util.WorkerShutdownMode getShutdownMode() {
    @SuppressWarnings("deprecation")
    org.tensorflow.proto.util.WorkerShutdownMode result = org.tensorflow.proto.util.WorkerShutdownMode.valueOf(shutdownMode_);
    return result == null ? org.tensorflow.proto.util.WorkerShutdownMode.UNRECOGNIZED : result;
  }

  public static final int WATCHDOG_CONFIG_FIELD_NUMBER = 2;
  private org.tensorflow.proto.util.WatchdogConfig watchdogConfig_;
  /**
   * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
   */
  public boolean hasWatchdogConfig() {
    return watchdogConfig_ != null;
  }
  /**
   * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
   */
  public org.tensorflow.proto.util.WatchdogConfig getWatchdogConfig() {
    return watchdogConfig_ == null ? org.tensorflow.proto.util.WatchdogConfig.getDefaultInstance() : watchdogConfig_;
  }
  /**
   * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
   */
  public org.tensorflow.proto.util.WatchdogConfigOrBuilder getWatchdogConfigOrBuilder() {
    return getWatchdogConfig();
  }

  public static final int EXIT_CODE_FIELD_NUMBER = 3;
  private org.tensorflow.proto.util.RequestedExitCode exitCode_;
  /**
   * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
   */
  public boolean hasExitCode() {
    return exitCode_ != null;
  }
  /**
   * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
   */
  public org.tensorflow.proto.util.RequestedExitCode getExitCode() {
    return exitCode_ == null ? org.tensorflow.proto.util.RequestedExitCode.getDefaultInstance() : exitCode_;
  }
  /**
   * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
   */
  public org.tensorflow.proto.util.RequestedExitCodeOrBuilder getExitCodeOrBuilder() {
    return getExitCode();
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
    if (shutdownMode_ != org.tensorflow.proto.util.WorkerShutdownMode.DEFAULT.getNumber()) {
      output.writeEnum(1, shutdownMode_);
    }
    if (watchdogConfig_ != null) {
      output.writeMessage(2, getWatchdogConfig());
    }
    if (exitCode_ != null) {
      output.writeMessage(3, getExitCode());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (shutdownMode_ != org.tensorflow.proto.util.WorkerShutdownMode.DEFAULT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, shutdownMode_);
    }
    if (watchdogConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getWatchdogConfig());
    }
    if (exitCode_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getExitCode());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.proto.util.WorkerHeartbeatRequest)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.util.WorkerHeartbeatRequest other = (org.tensorflow.proto.util.WorkerHeartbeatRequest) obj;

    if (shutdownMode_ != other.shutdownMode_) return false;
    if (hasWatchdogConfig() != other.hasWatchdogConfig()) return false;
    if (hasWatchdogConfig()) {
      if (!getWatchdogConfig()
          .equals(other.getWatchdogConfig())) return false;
    }
    if (hasExitCode() != other.hasExitCode()) return false;
    if (hasExitCode()) {
      if (!getExitCode()
          .equals(other.getExitCode())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SHUTDOWN_MODE_FIELD_NUMBER;
    hash = (53 * hash) + shutdownMode_;
    if (hasWatchdogConfig()) {
      hash = (37 * hash) + WATCHDOG_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getWatchdogConfig().hashCode();
    }
    if (hasExitCode()) {
      hash = (37 * hash) + EXIT_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getExitCode().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.util.WorkerHeartbeatRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.util.WorkerHeartbeatRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.util.WorkerHeartbeatRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.util.WorkerHeartbeatRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.util.WorkerHeartbeatRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.util.WorkerHeartbeatRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.util.WorkerHeartbeatRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.util.WorkerHeartbeatRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.util.WorkerHeartbeatRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.util.WorkerHeartbeatRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.util.WorkerHeartbeatRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.util.WorkerHeartbeatRequest parseFrom(
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
  public static Builder newBuilder(org.tensorflow.proto.util.WorkerHeartbeatRequest prototype) {
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
   * Protobuf type {@code tensorflow.WorkerHeartbeatRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.WorkerHeartbeatRequest)
      org.tensorflow.proto.util.WorkerHeartbeatRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.util.EventProtos.internal_static_tensorflow_WorkerHeartbeatRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.util.EventProtos.internal_static_tensorflow_WorkerHeartbeatRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.util.WorkerHeartbeatRequest.class, org.tensorflow.proto.util.WorkerHeartbeatRequest.Builder.class);
    }

    // Construct using org.tensorflow.proto.util.WorkerHeartbeatRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      shutdownMode_ = 0;

      if (watchdogConfigBuilder_ == null) {
        watchdogConfig_ = null;
      } else {
        watchdogConfig_ = null;
        watchdogConfigBuilder_ = null;
      }
      if (exitCodeBuilder_ == null) {
        exitCode_ = null;
      } else {
        exitCode_ = null;
        exitCodeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.util.EventProtos.internal_static_tensorflow_WorkerHeartbeatRequest_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.util.WorkerHeartbeatRequest getDefaultInstanceForType() {
      return org.tensorflow.proto.util.WorkerHeartbeatRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.util.WorkerHeartbeatRequest build() {
      org.tensorflow.proto.util.WorkerHeartbeatRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.util.WorkerHeartbeatRequest buildPartial() {
      org.tensorflow.proto.util.WorkerHeartbeatRequest result = new org.tensorflow.proto.util.WorkerHeartbeatRequest(this);
      result.shutdownMode_ = shutdownMode_;
      if (watchdogConfigBuilder_ == null) {
        result.watchdogConfig_ = watchdogConfig_;
      } else {
        result.watchdogConfig_ = watchdogConfigBuilder_.build();
      }
      if (exitCodeBuilder_ == null) {
        result.exitCode_ = exitCode_;
      } else {
        result.exitCode_ = exitCodeBuilder_.build();
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
      if (other instanceof org.tensorflow.proto.util.WorkerHeartbeatRequest) {
        return mergeFrom((org.tensorflow.proto.util.WorkerHeartbeatRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.util.WorkerHeartbeatRequest other) {
      if (other == org.tensorflow.proto.util.WorkerHeartbeatRequest.getDefaultInstance()) return this;
      if (other.shutdownMode_ != 0) {
        setShutdownModeValue(other.getShutdownModeValue());
      }
      if (other.hasWatchdogConfig()) {
        mergeWatchdogConfig(other.getWatchdogConfig());
      }
      if (other.hasExitCode()) {
        mergeExitCode(other.getExitCode());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      org.tensorflow.proto.util.WorkerHeartbeatRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.proto.util.WorkerHeartbeatRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int shutdownMode_ = 0;
    /**
     * <code>.tensorflow.WorkerShutdownMode shutdown_mode = 1;</code>
     */
    public int getShutdownModeValue() {
      return shutdownMode_;
    }
    /**
     * <code>.tensorflow.WorkerShutdownMode shutdown_mode = 1;</code>
     */
    public Builder setShutdownModeValue(int value) {
      shutdownMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.WorkerShutdownMode shutdown_mode = 1;</code>
     */
    public org.tensorflow.proto.util.WorkerShutdownMode getShutdownMode() {
      @SuppressWarnings("deprecation")
      org.tensorflow.proto.util.WorkerShutdownMode result = org.tensorflow.proto.util.WorkerShutdownMode.valueOf(shutdownMode_);
      return result == null ? org.tensorflow.proto.util.WorkerShutdownMode.UNRECOGNIZED : result;
    }
    /**
     * <code>.tensorflow.WorkerShutdownMode shutdown_mode = 1;</code>
     */
    public Builder setShutdownMode(org.tensorflow.proto.util.WorkerShutdownMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      shutdownMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.WorkerShutdownMode shutdown_mode = 1;</code>
     */
    public Builder clearShutdownMode() {
      
      shutdownMode_ = 0;
      onChanged();
      return this;
    }

    private org.tensorflow.proto.util.WatchdogConfig watchdogConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.util.WatchdogConfig, org.tensorflow.proto.util.WatchdogConfig.Builder, org.tensorflow.proto.util.WatchdogConfigOrBuilder> watchdogConfigBuilder_;
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     */
    public boolean hasWatchdogConfig() {
      return watchdogConfigBuilder_ != null || watchdogConfig_ != null;
    }
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     */
    public org.tensorflow.proto.util.WatchdogConfig getWatchdogConfig() {
      if (watchdogConfigBuilder_ == null) {
        return watchdogConfig_ == null ? org.tensorflow.proto.util.WatchdogConfig.getDefaultInstance() : watchdogConfig_;
      } else {
        return watchdogConfigBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     */
    public Builder setWatchdogConfig(org.tensorflow.proto.util.WatchdogConfig value) {
      if (watchdogConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        watchdogConfig_ = value;
        onChanged();
      } else {
        watchdogConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     */
    public Builder setWatchdogConfig(
        org.tensorflow.proto.util.WatchdogConfig.Builder builderForValue) {
      if (watchdogConfigBuilder_ == null) {
        watchdogConfig_ = builderForValue.build();
        onChanged();
      } else {
        watchdogConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     */
    public Builder mergeWatchdogConfig(org.tensorflow.proto.util.WatchdogConfig value) {
      if (watchdogConfigBuilder_ == null) {
        if (watchdogConfig_ != null) {
          watchdogConfig_ =
            org.tensorflow.proto.util.WatchdogConfig.newBuilder(watchdogConfig_).mergeFrom(value).buildPartial();
        } else {
          watchdogConfig_ = value;
        }
        onChanged();
      } else {
        watchdogConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     */
    public Builder clearWatchdogConfig() {
      if (watchdogConfigBuilder_ == null) {
        watchdogConfig_ = null;
        onChanged();
      } else {
        watchdogConfig_ = null;
        watchdogConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     */
    public org.tensorflow.proto.util.WatchdogConfig.Builder getWatchdogConfigBuilder() {
      
      onChanged();
      return getWatchdogConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     */
    public org.tensorflow.proto.util.WatchdogConfigOrBuilder getWatchdogConfigOrBuilder() {
      if (watchdogConfigBuilder_ != null) {
        return watchdogConfigBuilder_.getMessageOrBuilder();
      } else {
        return watchdogConfig_ == null ?
            org.tensorflow.proto.util.WatchdogConfig.getDefaultInstance() : watchdogConfig_;
      }
    }
    /**
     * <code>.tensorflow.WatchdogConfig watchdog_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.util.WatchdogConfig, org.tensorflow.proto.util.WatchdogConfig.Builder, org.tensorflow.proto.util.WatchdogConfigOrBuilder> 
        getWatchdogConfigFieldBuilder() {
      if (watchdogConfigBuilder_ == null) {
        watchdogConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.proto.util.WatchdogConfig, org.tensorflow.proto.util.WatchdogConfig.Builder, org.tensorflow.proto.util.WatchdogConfigOrBuilder>(
                getWatchdogConfig(),
                getParentForChildren(),
                isClean());
        watchdogConfig_ = null;
      }
      return watchdogConfigBuilder_;
    }

    private org.tensorflow.proto.util.RequestedExitCode exitCode_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.util.RequestedExitCode, org.tensorflow.proto.util.RequestedExitCode.Builder, org.tensorflow.proto.util.RequestedExitCodeOrBuilder> exitCodeBuilder_;
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     */
    public boolean hasExitCode() {
      return exitCodeBuilder_ != null || exitCode_ != null;
    }
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     */
    public org.tensorflow.proto.util.RequestedExitCode getExitCode() {
      if (exitCodeBuilder_ == null) {
        return exitCode_ == null ? org.tensorflow.proto.util.RequestedExitCode.getDefaultInstance() : exitCode_;
      } else {
        return exitCodeBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     */
    public Builder setExitCode(org.tensorflow.proto.util.RequestedExitCode value) {
      if (exitCodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        exitCode_ = value;
        onChanged();
      } else {
        exitCodeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     */
    public Builder setExitCode(
        org.tensorflow.proto.util.RequestedExitCode.Builder builderForValue) {
      if (exitCodeBuilder_ == null) {
        exitCode_ = builderForValue.build();
        onChanged();
      } else {
        exitCodeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     */
    public Builder mergeExitCode(org.tensorflow.proto.util.RequestedExitCode value) {
      if (exitCodeBuilder_ == null) {
        if (exitCode_ != null) {
          exitCode_ =
            org.tensorflow.proto.util.RequestedExitCode.newBuilder(exitCode_).mergeFrom(value).buildPartial();
        } else {
          exitCode_ = value;
        }
        onChanged();
      } else {
        exitCodeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     */
    public Builder clearExitCode() {
      if (exitCodeBuilder_ == null) {
        exitCode_ = null;
        onChanged();
      } else {
        exitCode_ = null;
        exitCodeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     */
    public org.tensorflow.proto.util.RequestedExitCode.Builder getExitCodeBuilder() {
      
      onChanged();
      return getExitCodeFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     */
    public org.tensorflow.proto.util.RequestedExitCodeOrBuilder getExitCodeOrBuilder() {
      if (exitCodeBuilder_ != null) {
        return exitCodeBuilder_.getMessageOrBuilder();
      } else {
        return exitCode_ == null ?
            org.tensorflow.proto.util.RequestedExitCode.getDefaultInstance() : exitCode_;
      }
    }
    /**
     * <code>.tensorflow.RequestedExitCode exit_code = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.util.RequestedExitCode, org.tensorflow.proto.util.RequestedExitCode.Builder, org.tensorflow.proto.util.RequestedExitCodeOrBuilder> 
        getExitCodeFieldBuilder() {
      if (exitCodeBuilder_ == null) {
        exitCodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.proto.util.RequestedExitCode, org.tensorflow.proto.util.RequestedExitCode.Builder, org.tensorflow.proto.util.RequestedExitCodeOrBuilder>(
                getExitCode(),
                getParentForChildren(),
                isClean());
        exitCode_ = null;
      }
      return exitCodeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.WorkerHeartbeatRequest)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.WorkerHeartbeatRequest)
  private static final org.tensorflow.proto.util.WorkerHeartbeatRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.util.WorkerHeartbeatRequest();
  }

  public static org.tensorflow.proto.util.WorkerHeartbeatRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkerHeartbeatRequest>
      PARSER = new com.google.protobuf.AbstractParser<WorkerHeartbeatRequest>() {
    @java.lang.Override
    public WorkerHeartbeatRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WorkerHeartbeatRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WorkerHeartbeatRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkerHeartbeatRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.util.WorkerHeartbeatRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

