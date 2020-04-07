// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/trace_events.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.profiler.TraceEvent}
 */
public  final class TraceEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.profiler.TraceEvent)
    TraceEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TraceEvent.newBuilder() to construct.
  private TraceEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TraceEvent() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TraceEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TraceEvent(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            deviceId_ = input.readUInt32();
            break;
          }
          case 16: {

            resourceId_ = input.readUInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 72: {

            timestampPs_ = input.readUInt64();
            break;
          }
          case 80: {

            durationPs_ = input.readUInt64();
            break;
          }
          case 90: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              args_ = com.google.protobuf.MapField.newMapField(
                  ArgsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            args__ = input.readMessage(
                ArgsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            args_.getMutableMap().put(
                args__.getKey(), args__.getValue());
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
    return org.tensorflow.framework.TraceEventsProtos.internal_static_tensorflow_profiler_TraceEvent_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 11:
        return internalGetArgs();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.TraceEventsProtos.internal_static_tensorflow_profiler_TraceEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.TraceEvent.class, org.tensorflow.framework.TraceEvent.Builder.class);
  }

  public static final int DEVICE_ID_FIELD_NUMBER = 1;
  private int deviceId_;
  /**
   * <pre>
   * The id of the device that this event occurred on. The full dataset should
   * have this device present in the Trace object.
   * </pre>
   *
   * <code>uint32 device_id = 1;</code>
   */
  public int getDeviceId() {
    return deviceId_;
  }

  public static final int RESOURCE_ID_FIELD_NUMBER = 2;
  private int resourceId_;
  /**
   * <pre>
   * The id of the resource that this event occurred on. The full dataset should
   * have this resource present in the Device object of the Trace object. A
   * resource_id is unique on a specific device, but not necessarily within the
   * trace.
   * </pre>
   *
   * <code>uint32 resource_id = 2;</code>
   */
  public int getResourceId() {
    return resourceId_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The name of this trace event.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of this trace event.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_PS_FIELD_NUMBER = 9;
  private long timestampPs_;
  /**
   * <pre>
   * The timestamp that this event occurred at (in picos since tracing started).
   * </pre>
   *
   * <code>uint64 timestamp_ps = 9;</code>
   */
  public long getTimestampPs() {
    return timestampPs_;
  }

  public static final int DURATION_PS_FIELD_NUMBER = 10;
  private long durationPs_;
  /**
   * <pre>
   * The duration of the event in picoseconds if applicable.
   * Events without duration are called instant events.
   * </pre>
   *
   * <code>uint64 duration_ps = 10;</code>
   */
  public long getDurationPs() {
    return durationPs_;
  }

  public static final int ARGS_FIELD_NUMBER = 11;
  private static final class ArgsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                org.tensorflow.framework.TraceEventsProtos.internal_static_tensorflow_profiler_TraceEvent_ArgsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> args_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetArgs() {
    if (args_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ArgsDefaultEntryHolder.defaultEntry);
    }
    return args_;
  }

  public int getArgsCount() {
    return internalGetArgs().getMap().size();
  }
  /**
   * <pre>
   * Extra arguments that will be displayed in trace view.
   * </pre>
   *
   * <code>map&lt;string, string&gt; args = 11;</code>
   */

  public boolean containsArgs(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetArgs().getMap().containsKey(key);
  }
  /**
   * Use {@link #getArgsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getArgs() {
    return getArgsMap();
  }
  /**
   * <pre>
   * Extra arguments that will be displayed in trace view.
   * </pre>
   *
   * <code>map&lt;string, string&gt; args = 11;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getArgsMap() {
    return internalGetArgs().getMap();
  }
  /**
   * <pre>
   * Extra arguments that will be displayed in trace view.
   * </pre>
   *
   * <code>map&lt;string, string&gt; args = 11;</code>
   */

  public java.lang.String getArgsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetArgs().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Extra arguments that will be displayed in trace view.
   * </pre>
   *
   * <code>map&lt;string, string&gt; args = 11;</code>
   */

  public java.lang.String getArgsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetArgs().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (deviceId_ != 0) {
      output.writeUInt32(1, deviceId_);
    }
    if (resourceId_ != 0) {
      output.writeUInt32(2, resourceId_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (timestampPs_ != 0L) {
      output.writeUInt64(9, timestampPs_);
    }
    if (durationPs_ != 0L) {
      output.writeUInt64(10, durationPs_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetArgs(),
        ArgsDefaultEntryHolder.defaultEntry,
        11);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deviceId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, deviceId_);
    }
    if (resourceId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, resourceId_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (timestampPs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(9, timestampPs_);
    }
    if (durationPs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(10, durationPs_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetArgs().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      args__ = ArgsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, args__);
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
    if (!(obj instanceof org.tensorflow.framework.TraceEvent)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.TraceEvent other = (org.tensorflow.framework.TraceEvent) obj;

    if (getDeviceId()
        != other.getDeviceId()) return false;
    if (getResourceId()
        != other.getResourceId()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (getTimestampPs()
        != other.getTimestampPs()) return false;
    if (getDurationPs()
        != other.getDurationPs()) return false;
    if (!internalGetArgs().equals(
        other.internalGetArgs())) return false;
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
    hash = (37 * hash) + DEVICE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceId();
    hash = (37 * hash) + RESOURCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getResourceId();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TIMESTAMP_PS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestampPs());
    hash = (37 * hash) + DURATION_PS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDurationPs());
    if (!internalGetArgs().getMap().isEmpty()) {
      hash = (37 * hash) + ARGS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetArgs().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.TraceEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.TraceEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.TraceEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.TraceEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.TraceEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.TraceEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.TraceEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.TraceEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.TraceEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.TraceEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.TraceEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.TraceEvent parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.TraceEvent prototype) {
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
   * Protobuf type {@code tensorflow.profiler.TraceEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.profiler.TraceEvent)
      org.tensorflow.framework.TraceEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.TraceEventsProtos.internal_static_tensorflow_profiler_TraceEvent_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 11:
          return internalGetArgs();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 11:
          return internalGetMutableArgs();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.TraceEventsProtos.internal_static_tensorflow_profiler_TraceEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.TraceEvent.class, org.tensorflow.framework.TraceEvent.Builder.class);
    }

    // Construct using org.tensorflow.framework.TraceEvent.newBuilder()
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
      deviceId_ = 0;

      resourceId_ = 0;

      name_ = "";

      timestampPs_ = 0L;

      durationPs_ = 0L;

      internalGetMutableArgs().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.TraceEventsProtos.internal_static_tensorflow_profiler_TraceEvent_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.TraceEvent getDefaultInstanceForType() {
      return org.tensorflow.framework.TraceEvent.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.TraceEvent build() {
      org.tensorflow.framework.TraceEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.TraceEvent buildPartial() {
      org.tensorflow.framework.TraceEvent result = new org.tensorflow.framework.TraceEvent(this);
      int from_bitField0_ = bitField0_;
      result.deviceId_ = deviceId_;
      result.resourceId_ = resourceId_;
      result.name_ = name_;
      result.timestampPs_ = timestampPs_;
      result.durationPs_ = durationPs_;
      result.args_ = internalGetArgs();
      result.args_.makeImmutable();
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
      if (other instanceof org.tensorflow.framework.TraceEvent) {
        return mergeFrom((org.tensorflow.framework.TraceEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.TraceEvent other) {
      if (other == org.tensorflow.framework.TraceEvent.getDefaultInstance()) return this;
      if (other.getDeviceId() != 0) {
        setDeviceId(other.getDeviceId());
      }
      if (other.getResourceId() != 0) {
        setResourceId(other.getResourceId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getTimestampPs() != 0L) {
        setTimestampPs(other.getTimestampPs());
      }
      if (other.getDurationPs() != 0L) {
        setDurationPs(other.getDurationPs());
      }
      internalGetMutableArgs().mergeFrom(
          other.internalGetArgs());
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
      org.tensorflow.framework.TraceEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.TraceEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int deviceId_ ;
    /**
     * <pre>
     * The id of the device that this event occurred on. The full dataset should
     * have this device present in the Trace object.
     * </pre>
     *
     * <code>uint32 device_id = 1;</code>
     */
    public int getDeviceId() {
      return deviceId_;
    }
    /**
     * <pre>
     * The id of the device that this event occurred on. The full dataset should
     * have this device present in the Trace object.
     * </pre>
     *
     * <code>uint32 device_id = 1;</code>
     */
    public Builder setDeviceId(int value) {
      
      deviceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The id of the device that this event occurred on. The full dataset should
     * have this device present in the Trace object.
     * </pre>
     *
     * <code>uint32 device_id = 1;</code>
     */
    public Builder clearDeviceId() {
      
      deviceId_ = 0;
      onChanged();
      return this;
    }

    private int resourceId_ ;
    /**
     * <pre>
     * The id of the resource that this event occurred on. The full dataset should
     * have this resource present in the Device object of the Trace object. A
     * resource_id is unique on a specific device, but not necessarily within the
     * trace.
     * </pre>
     *
     * <code>uint32 resource_id = 2;</code>
     */
    public int getResourceId() {
      return resourceId_;
    }
    /**
     * <pre>
     * The id of the resource that this event occurred on. The full dataset should
     * have this resource present in the Device object of the Trace object. A
     * resource_id is unique on a specific device, but not necessarily within the
     * trace.
     * </pre>
     *
     * <code>uint32 resource_id = 2;</code>
     */
    public Builder setResourceId(int value) {
      
      resourceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The id of the resource that this event occurred on. The full dataset should
     * have this resource present in the Device object of the Trace object. A
     * resource_id is unique on a specific device, but not necessarily within the
     * trace.
     * </pre>
     *
     * <code>uint32 resource_id = 2;</code>
     */
    public Builder clearResourceId() {
      
      resourceId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of this trace event.
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of this trace event.
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of this trace event.
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of this trace event.
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of this trace event.
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private long timestampPs_ ;
    /**
     * <pre>
     * The timestamp that this event occurred at (in picos since tracing started).
     * </pre>
     *
     * <code>uint64 timestamp_ps = 9;</code>
     */
    public long getTimestampPs() {
      return timestampPs_;
    }
    /**
     * <pre>
     * The timestamp that this event occurred at (in picos since tracing started).
     * </pre>
     *
     * <code>uint64 timestamp_ps = 9;</code>
     */
    public Builder setTimestampPs(long value) {
      
      timestampPs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The timestamp that this event occurred at (in picos since tracing started).
     * </pre>
     *
     * <code>uint64 timestamp_ps = 9;</code>
     */
    public Builder clearTimestampPs() {
      
      timestampPs_ = 0L;
      onChanged();
      return this;
    }

    private long durationPs_ ;
    /**
     * <pre>
     * The duration of the event in picoseconds if applicable.
     * Events without duration are called instant events.
     * </pre>
     *
     * <code>uint64 duration_ps = 10;</code>
     */
    public long getDurationPs() {
      return durationPs_;
    }
    /**
     * <pre>
     * The duration of the event in picoseconds if applicable.
     * Events without duration are called instant events.
     * </pre>
     *
     * <code>uint64 duration_ps = 10;</code>
     */
    public Builder setDurationPs(long value) {
      
      durationPs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The duration of the event in picoseconds if applicable.
     * Events without duration are called instant events.
     * </pre>
     *
     * <code>uint64 duration_ps = 10;</code>
     */
    public Builder clearDurationPs() {
      
      durationPs_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> args_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetArgs() {
      if (args_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ArgsDefaultEntryHolder.defaultEntry);
      }
      return args_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableArgs() {
      onChanged();;
      if (args_ == null) {
        args_ = com.google.protobuf.MapField.newMapField(
            ArgsDefaultEntryHolder.defaultEntry);
      }
      if (!args_.isMutable()) {
        args_ = args_.copy();
      }
      return args_;
    }

    public int getArgsCount() {
      return internalGetArgs().getMap().size();
    }
    /**
     * <pre>
     * Extra arguments that will be displayed in trace view.
     * </pre>
     *
     * <code>map&lt;string, string&gt; args = 11;</code>
     */

    public boolean containsArgs(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetArgs().getMap().containsKey(key);
    }
    /**
     * Use {@link #getArgsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getArgs() {
      return getArgsMap();
    }
    /**
     * <pre>
     * Extra arguments that will be displayed in trace view.
     * </pre>
     *
     * <code>map&lt;string, string&gt; args = 11;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getArgsMap() {
      return internalGetArgs().getMap();
    }
    /**
     * <pre>
     * Extra arguments that will be displayed in trace view.
     * </pre>
     *
     * <code>map&lt;string, string&gt; args = 11;</code>
     */

    public java.lang.String getArgsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetArgs().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Extra arguments that will be displayed in trace view.
     * </pre>
     *
     * <code>map&lt;string, string&gt; args = 11;</code>
     */

    public java.lang.String getArgsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetArgs().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearArgs() {
      internalGetMutableArgs().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Extra arguments that will be displayed in trace view.
     * </pre>
     *
     * <code>map&lt;string, string&gt; args = 11;</code>
     */

    public Builder removeArgs(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableArgs().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableArgs() {
      return internalGetMutableArgs().getMutableMap();
    }
    /**
     * <pre>
     * Extra arguments that will be displayed in trace view.
     * </pre>
     *
     * <code>map&lt;string, string&gt; args = 11;</code>
     */
    public Builder putArgs(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableArgs().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Extra arguments that will be displayed in trace view.
     * </pre>
     *
     * <code>map&lt;string, string&gt; args = 11;</code>
     */

    public Builder putAllArgs(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableArgs().getMutableMap()
          .putAll(values);
      return this;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.profiler.TraceEvent)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.profiler.TraceEvent)
  private static final org.tensorflow.framework.TraceEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.TraceEvent();
  }

  public static org.tensorflow.framework.TraceEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TraceEvent>
      PARSER = new com.google.protobuf.AbstractParser<TraceEvent>() {
    @java.lang.Override
    public TraceEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TraceEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TraceEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TraceEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.TraceEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
