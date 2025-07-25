package org.example.proto;

public final class WorldUps {
  private WorldUps() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UInitTruckOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UInitTruck)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>required int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>required int32 x = 2;</code>
     */
    boolean hasX();
    /**
     * <code>required int32 x = 2;</code>
     */
    int getX();

    /**
     * <code>required int32 y = 3;</code>
     */
    boolean hasY();
    /**
     * <code>required int32 y = 3;</code>
     */
    int getY();
  }
  /**
   * Protobuf type {@code UInitTruck}
   */
  public  static final class UInitTruck extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UInitTruck)
      UInitTruckOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UInitTruck.newBuilder() to construct.
    private UInitTruck(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UInitTruck() {
      id_ = 0;
      x_ = 0;
      y_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UInitTruck(
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
              bitField0_ |= 0x00000001;
              id_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              x_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              y_ = input.readInt32();
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
      return WorldUps.internal_static_UInitTruck_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WorldUps.internal_static_UInitTruck_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WorldUps.UInitTruck.class, WorldUps.UInitTruck.Builder.class);
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>required int32 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int X_FIELD_NUMBER = 2;
    private int x_;
    /**
     * <code>required int32 x = 2;</code>
     */
    public boolean hasX() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 x = 2;</code>
     */
    public int getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 3;
    private int y_;
    /**
     * <code>required int32 y = 3;</code>
     */
    public boolean hasY() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 y = 3;</code>
     */
    public int getY() {
      return y_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasX()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasY()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, x_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, y_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, x_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, y_);
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
      if (!(obj instanceof WorldUps.UInitTruck)) {
        return super.equals(obj);
      }
      WorldUps.UInitTruck other = (WorldUps.UInitTruck) obj;

      boolean result = true;
      result = result && (hasId() == other.hasId());
      if (hasId()) {
        result = result && (getId()
            == other.getId());
      }
      result = result && (hasX() == other.hasX());
      if (hasX()) {
        result = result && (getX()
            == other.getX());
      }
      result = result && (hasY() == other.hasY());
      if (hasY()) {
        result = result && (getY()
            == other.getY());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId();
      }
      if (hasX()) {
        hash = (37 * hash) + X_FIELD_NUMBER;
        hash = (53 * hash) + getX();
      }
      if (hasY()) {
        hash = (37 * hash) + Y_FIELD_NUMBER;
        hash = (53 * hash) + getY();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static WorldUps.UInitTruck parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UInitTruck parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UInitTruck parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UInitTruck parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UInitTruck parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UInitTruck parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UInitTruck parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UInitTruck parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UInitTruck parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static WorldUps.UInitTruck parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UInitTruck parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UInitTruck parseFrom(
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
    public static Builder newBuilder(WorldUps.UInitTruck prototype) {
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
     * Protobuf type {@code UInitTruck}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UInitTruck)
        WorldUps.UInitTruckOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WorldUps.internal_static_UInitTruck_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WorldUps.internal_static_UInitTruck_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                WorldUps.UInitTruck.class, WorldUps.UInitTruck.Builder.class);
      }

      // Construct using WorldUps.UInitTruck.newBuilder()
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
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        x_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        y_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WorldUps.internal_static_UInitTruck_descriptor;
      }

      @java.lang.Override
      public WorldUps.UInitTruck getDefaultInstanceForType() {
        return WorldUps.UInitTruck.getDefaultInstance();
      }

      @java.lang.Override
      public WorldUps.UInitTruck build() {
        WorldUps.UInitTruck result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public WorldUps.UInitTruck buildPartial() {
        WorldUps.UInitTruck result = new WorldUps.UInitTruck(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.x_ = x_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.y_ = y_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof WorldUps.UInitTruck) {
          return mergeFrom((WorldUps.UInitTruck)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(WorldUps.UInitTruck other) {
        if (other == WorldUps.UInitTruck.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasId()) {
          return false;
        }
        if (!hasX()) {
          return false;
        }
        if (!hasY()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        WorldUps.UInitTruck parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (WorldUps.UInitTruck) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>required int32 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private int x_ ;
      /**
       * <code>required int32 x = 2;</code>
       */
      public boolean hasX() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 x = 2;</code>
       */
      public int getX() {
        return x_;
      }
      /**
       * <code>required int32 x = 2;</code>
       */
      public Builder setX(int value) {
        bitField0_ |= 0x00000002;
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 x = 2;</code>
       */
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000002);
        x_ = 0;
        onChanged();
        return this;
      }

      private int y_ ;
      /**
       * <code>required int32 y = 3;</code>
       */
      public boolean hasY() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 y = 3;</code>
       */
      public int getY() {
        return y_;
      }
      /**
       * <code>required int32 y = 3;</code>
       */
      public Builder setY(int value) {
        bitField0_ |= 0x00000004;
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 y = 3;</code>
       */
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000004);
        y_ = 0;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:UInitTruck)
    }

    // @@protoc_insertion_point(class_scope:UInitTruck)
    private static final WorldUps.UInitTruck DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new WorldUps.UInitTruck();
    }

    public static WorldUps.UInitTruck getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<UInitTruck>
        PARSER = new com.google.protobuf.AbstractParser<UInitTruck>() {
      @java.lang.Override
      public UInitTruck parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UInitTruck(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UInitTruck> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UInitTruck> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public WorldUps.UInitTruck getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UConnectOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UConnect)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 worldid = 1;</code>
     */
    boolean hasWorldid();
    /**
     * <code>optional int64 worldid = 1;</code>
     */
    long getWorldid();

    /**
     * <code>repeated .UInitTruck trucks = 2;</code>
     */
    java.util.List<WorldUps.UInitTruck> 
        getTrucksList();
    /**
     * <code>repeated .UInitTruck trucks = 2;</code>
     */
    WorldUps.UInitTruck getTrucks(int index);
    /**
     * <code>repeated .UInitTruck trucks = 2;</code>
     */
    int getTrucksCount();
    /**
     * <code>repeated .UInitTruck trucks = 2;</code>
     */
    java.util.List<? extends WorldUps.UInitTruckOrBuilder> 
        getTrucksOrBuilderList();
    /**
     * <code>repeated .UInitTruck trucks = 2;</code>
     */
    WorldUps.UInitTruckOrBuilder getTrucksOrBuilder(
        int index);

    /**
     * <code>required bool isAmazon = 3;</code>
     */
    boolean hasIsAmazon();
    /**
     * <code>required bool isAmazon = 3;</code>
     */
    boolean getIsAmazon();
  }
  /**
   * Protobuf type {@code UConnect}
   */
  public  static final class UConnect extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UConnect)
      UConnectOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UConnect.newBuilder() to construct.
    private UConnect(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UConnect() {
      worldid_ = 0L;
      trucks_ = java.util.Collections.emptyList();
      isAmazon_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UConnect(
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
              bitField0_ |= 0x00000001;
              worldid_ = input.readInt64();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                trucks_ = new java.util.ArrayList<WorldUps.UInitTruck>();
                mutable_bitField0_ |= 0x00000002;
              }
              trucks_.add(
                  input.readMessage(WorldUps.UInitTruck.PARSER, extensionRegistry));
              break;
            }
            case 24: {
              bitField0_ |= 0x00000002;
              isAmazon_ = input.readBool();
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          trucks_ = java.util.Collections.unmodifiableList(trucks_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return WorldUps.internal_static_UConnect_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WorldUps.internal_static_UConnect_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WorldUps.UConnect.class, WorldUps.UConnect.Builder.class);
    }

    private int bitField0_;
    public static final int WORLDID_FIELD_NUMBER = 1;
    private long worldid_;
    /**
     * <code>optional int64 worldid = 1;</code>
     */
    public boolean hasWorldid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 worldid = 1;</code>
     */
    public long getWorldid() {
      return worldid_;
    }

    public static final int TRUCKS_FIELD_NUMBER = 2;
    private java.util.List<WorldUps.UInitTruck> trucks_;
    /**
     * <code>repeated .UInitTruck trucks = 2;</code>
     */
    public java.util.List<WorldUps.UInitTruck> getTrucksList() {
      return trucks_;
    }
    /**
     * <code>repeated .UInitTruck trucks = 2;</code>
     */
    public java.util.List<? extends WorldUps.UInitTruckOrBuilder> 
        getTrucksOrBuilderList() {
      return trucks_;
    }
    /**
     * <code>repeated .UInitTruck trucks = 2;</code>
     */
    public int getTrucksCount() {
      return trucks_.size();
    }
    /**
     * <code>repeated .UInitTruck trucks = 2;</code>
     */
    public WorldUps.UInitTruck getTrucks(int index) {
      return trucks_.get(index);
    }
    /**
     * <code>repeated .UInitTruck trucks = 2;</code>
     */
    public WorldUps.UInitTruckOrBuilder getTrucksOrBuilder(
        int index) {
      return trucks_.get(index);
    }

    public static final int ISAMAZON_FIELD_NUMBER = 3;
    private boolean isAmazon_;
    /**
     * <code>required bool isAmazon = 3;</code>
     */
    public boolean hasIsAmazon() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required bool isAmazon = 3;</code>
     */
    public boolean getIsAmazon() {
      return isAmazon_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasIsAmazon()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getTrucksCount(); i++) {
        if (!getTrucks(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, worldid_);
      }
      for (int i = 0; i < trucks_.size(); i++) {
        output.writeMessage(2, trucks_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(3, isAmazon_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, worldid_);
      }
      for (int i = 0; i < trucks_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, trucks_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isAmazon_);
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
      if (!(obj instanceof WorldUps.UConnect)) {
        return super.equals(obj);
      }
      WorldUps.UConnect other = (WorldUps.UConnect) obj;

      boolean result = true;
      result = result && (hasWorldid() == other.hasWorldid());
      if (hasWorldid()) {
        result = result && (getWorldid()
            == other.getWorldid());
      }
      result = result && getTrucksList()
          .equals(other.getTrucksList());
      result = result && (hasIsAmazon() == other.hasIsAmazon());
      if (hasIsAmazon()) {
        result = result && (getIsAmazon()
            == other.getIsAmazon());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasWorldid()) {
        hash = (37 * hash) + WORLDID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getWorldid());
      }
      if (getTrucksCount() > 0) {
        hash = (37 * hash) + TRUCKS_FIELD_NUMBER;
        hash = (53 * hash) + getTrucksList().hashCode();
      }
      if (hasIsAmazon()) {
        hash = (37 * hash) + ISAMAZON_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getIsAmazon());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static WorldUps.UConnect parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UConnect parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UConnect parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UConnect parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UConnect parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UConnect parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UConnect parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UConnect parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UConnect parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static WorldUps.UConnect parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UConnect parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UConnect parseFrom(
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
    public static Builder newBuilder(WorldUps.UConnect prototype) {
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
     * Protobuf type {@code UConnect}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UConnect)
        WorldUps.UConnectOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WorldUps.internal_static_UConnect_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WorldUps.internal_static_UConnect_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                WorldUps.UConnect.class, WorldUps.UConnect.Builder.class);
      }

      // Construct using WorldUps.UConnect.newBuilder()
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
          getTrucksFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        worldid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (trucksBuilder_ == null) {
          trucks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          trucksBuilder_.clear();
        }
        isAmazon_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WorldUps.internal_static_UConnect_descriptor;
      }

      @java.lang.Override
      public WorldUps.UConnect getDefaultInstanceForType() {
        return WorldUps.UConnect.getDefaultInstance();
      }

      @java.lang.Override
      public WorldUps.UConnect build() {
        WorldUps.UConnect result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public WorldUps.UConnect buildPartial() {
        WorldUps.UConnect result = new WorldUps.UConnect(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.worldid_ = worldid_;
        if (trucksBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            trucks_ = java.util.Collections.unmodifiableList(trucks_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.trucks_ = trucks_;
        } else {
          result.trucks_ = trucksBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        result.isAmazon_ = isAmazon_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof WorldUps.UConnect) {
          return mergeFrom((WorldUps.UConnect)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(WorldUps.UConnect other) {
        if (other == WorldUps.UConnect.getDefaultInstance()) return this;
        if (other.hasWorldid()) {
          setWorldid(other.getWorldid());
        }
        if (trucksBuilder_ == null) {
          if (!other.trucks_.isEmpty()) {
            if (trucks_.isEmpty()) {
              trucks_ = other.trucks_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureTrucksIsMutable();
              trucks_.addAll(other.trucks_);
            }
            onChanged();
          }
        } else {
          if (!other.trucks_.isEmpty()) {
            if (trucksBuilder_.isEmpty()) {
              trucksBuilder_.dispose();
              trucksBuilder_ = null;
              trucks_ = other.trucks_;
              bitField0_ = (bitField0_ & ~0x00000002);
              trucksBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTrucksFieldBuilder() : null;
            } else {
              trucksBuilder_.addAllMessages(other.trucks_);
            }
          }
        }
        if (other.hasIsAmazon()) {
          setIsAmazon(other.getIsAmazon());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasIsAmazon()) {
          return false;
        }
        for (int i = 0; i < getTrucksCount(); i++) {
          if (!getTrucks(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        WorldUps.UConnect parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (WorldUps.UConnect) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long worldid_ ;
      /**
       * <code>optional int64 worldid = 1;</code>
       */
      public boolean hasWorldid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int64 worldid = 1;</code>
       */
      public long getWorldid() {
        return worldid_;
      }
      /**
       * <code>optional int64 worldid = 1;</code>
       */
      public Builder setWorldid(long value) {
        bitField0_ |= 0x00000001;
        worldid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 worldid = 1;</code>
       */
      public Builder clearWorldid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        worldid_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<WorldUps.UInitTruck> trucks_ =
        java.util.Collections.emptyList();
      private void ensureTrucksIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          trucks_ = new java.util.ArrayList<WorldUps.UInitTruck>(trucks_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UInitTruck, WorldUps.UInitTruck.Builder, WorldUps.UInitTruckOrBuilder> trucksBuilder_;

      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public java.util.List<WorldUps.UInitTruck> getTrucksList() {
        if (trucksBuilder_ == null) {
          return java.util.Collections.unmodifiableList(trucks_);
        } else {
          return trucksBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public int getTrucksCount() {
        if (trucksBuilder_ == null) {
          return trucks_.size();
        } else {
          return trucksBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public WorldUps.UInitTruck getTrucks(int index) {
        if (trucksBuilder_ == null) {
          return trucks_.get(index);
        } else {
          return trucksBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public Builder setTrucks(
          int index, WorldUps.UInitTruck value) {
        if (trucksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTrucksIsMutable();
          trucks_.set(index, value);
          onChanged();
        } else {
          trucksBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public Builder setTrucks(
          int index, WorldUps.UInitTruck.Builder builderForValue) {
        if (trucksBuilder_ == null) {
          ensureTrucksIsMutable();
          trucks_.set(index, builderForValue.build());
          onChanged();
        } else {
          trucksBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public Builder addTrucks(WorldUps.UInitTruck value) {
        if (trucksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTrucksIsMutable();
          trucks_.add(value);
          onChanged();
        } else {
          trucksBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public Builder addTrucks(
          int index, WorldUps.UInitTruck value) {
        if (trucksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTrucksIsMutable();
          trucks_.add(index, value);
          onChanged();
        } else {
          trucksBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public Builder addTrucks(
          WorldUps.UInitTruck.Builder builderForValue) {
        if (trucksBuilder_ == null) {
          ensureTrucksIsMutable();
          trucks_.add(builderForValue.build());
          onChanged();
        } else {
          trucksBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public Builder addTrucks(
          int index, WorldUps.UInitTruck.Builder builderForValue) {
        if (trucksBuilder_ == null) {
          ensureTrucksIsMutable();
          trucks_.add(index, builderForValue.build());
          onChanged();
        } else {
          trucksBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public Builder addAllTrucks(
          java.lang.Iterable<? extends WorldUps.UInitTruck> values) {
        if (trucksBuilder_ == null) {
          ensureTrucksIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, trucks_);
          onChanged();
        } else {
          trucksBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public Builder clearTrucks() {
        if (trucksBuilder_ == null) {
          trucks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          trucksBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public Builder removeTrucks(int index) {
        if (trucksBuilder_ == null) {
          ensureTrucksIsMutable();
          trucks_.remove(index);
          onChanged();
        } else {
          trucksBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public WorldUps.UInitTruck.Builder getTrucksBuilder(
          int index) {
        return getTrucksFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public WorldUps.UInitTruckOrBuilder getTrucksOrBuilder(
          int index) {
        if (trucksBuilder_ == null) {
          return trucks_.get(index);  } else {
          return trucksBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public java.util.List<? extends WorldUps.UInitTruckOrBuilder> 
           getTrucksOrBuilderList() {
        if (trucksBuilder_ != null) {
          return trucksBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(trucks_);
        }
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public WorldUps.UInitTruck.Builder addTrucksBuilder() {
        return getTrucksFieldBuilder().addBuilder(
            WorldUps.UInitTruck.getDefaultInstance());
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public WorldUps.UInitTruck.Builder addTrucksBuilder(
          int index) {
        return getTrucksFieldBuilder().addBuilder(
            index, WorldUps.UInitTruck.getDefaultInstance());
      }
      /**
       * <code>repeated .UInitTruck trucks = 2;</code>
       */
      public java.util.List<WorldUps.UInitTruck.Builder> 
           getTrucksBuilderList() {
        return getTrucksFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UInitTruck, WorldUps.UInitTruck.Builder, WorldUps.UInitTruckOrBuilder> 
          getTrucksFieldBuilder() {
        if (trucksBuilder_ == null) {
          trucksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              WorldUps.UInitTruck, WorldUps.UInitTruck.Builder, WorldUps.UInitTruckOrBuilder>(
                  trucks_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          trucks_ = null;
        }
        return trucksBuilder_;
      }

      private boolean isAmazon_ ;
      /**
       * <code>required bool isAmazon = 3;</code>
       */
      public boolean hasIsAmazon() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required bool isAmazon = 3;</code>
       */
      public boolean getIsAmazon() {
        return isAmazon_;
      }
      /**
       * <code>required bool isAmazon = 3;</code>
       */
      public Builder setIsAmazon(boolean value) {
        bitField0_ |= 0x00000004;
        isAmazon_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool isAmazon = 3;</code>
       */
      public Builder clearIsAmazon() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isAmazon_ = false;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:UConnect)
    }

    // @@protoc_insertion_point(class_scope:UConnect)
    private static final WorldUps.UConnect DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new WorldUps.UConnect();
    }

    public static WorldUps.UConnect getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<UConnect>
        PARSER = new com.google.protobuf.AbstractParser<UConnect>() {
      @java.lang.Override
      public UConnect parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UConnect(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UConnect> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UConnect> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public WorldUps.UConnect getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UConnectedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UConnected)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 worldid = 1;</code>
     */
    boolean hasWorldid();
    /**
     * <code>required int64 worldid = 1;</code>
     */
    long getWorldid();

    /**
     * <code>required string result = 2;</code>
     */
    boolean hasResult();
    /**
     * <code>required string result = 2;</code>
     */
    java.lang.String getResult();
    /**
     * <code>required string result = 2;</code>
     */
    com.google.protobuf.ByteString
        getResultBytes();
  }
  /**
   * Protobuf type {@code UConnected}
   */
  public  static final class UConnected extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UConnected)
      UConnectedOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UConnected.newBuilder() to construct.
    private UConnected(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UConnected() {
      worldid_ = 0L;
      result_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UConnected(
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
              bitField0_ |= 0x00000001;
              worldid_ = input.readInt64();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              result_ = bs;
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
      return WorldUps.internal_static_UConnected_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WorldUps.internal_static_UConnected_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WorldUps.UConnected.class, WorldUps.UConnected.Builder.class);
    }

    private int bitField0_;
    public static final int WORLDID_FIELD_NUMBER = 1;
    private long worldid_;
    /**
     * <code>required int64 worldid = 1;</code>
     */
    public boolean hasWorldid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 worldid = 1;</code>
     */
    public long getWorldid() {
      return worldid_;
    }

    public static final int RESULT_FIELD_NUMBER = 2;
    private volatile java.lang.Object result_;
    /**
     * <code>required string result = 2;</code>
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string result = 2;</code>
     */
    public java.lang.String getResult() {
      java.lang.Object ref = result_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          result_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string result = 2;</code>
     */
    public com.google.protobuf.ByteString
        getResultBytes() {
      java.lang.Object ref = result_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        result_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasWorldid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasResult()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, worldid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, result_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, worldid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, result_);
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
      if (!(obj instanceof WorldUps.UConnected)) {
        return super.equals(obj);
      }
      WorldUps.UConnected other = (WorldUps.UConnected) obj;

      boolean result = true;
      result = result && (hasWorldid() == other.hasWorldid());
      if (hasWorldid()) {
        result = result && (getWorldid()
            == other.getWorldid());
      }
      result = result && (hasResult() == other.hasResult());
      if (hasResult()) {
        result = result && getResult()
            .equals(other.getResult());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasWorldid()) {
        hash = (37 * hash) + WORLDID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getWorldid());
      }
      if (hasResult()) {
        hash = (37 * hash) + RESULT_FIELD_NUMBER;
        hash = (53 * hash) + getResult().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static WorldUps.UConnected parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UConnected parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UConnected parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UConnected parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UConnected parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UConnected parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UConnected parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UConnected parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UConnected parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static WorldUps.UConnected parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UConnected parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UConnected parseFrom(
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
    public static Builder newBuilder(WorldUps.UConnected prototype) {
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
     * Protobuf type {@code UConnected}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UConnected)
        WorldUps.UConnectedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WorldUps.internal_static_UConnected_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WorldUps.internal_static_UConnected_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                WorldUps.UConnected.class, WorldUps.UConnected.Builder.class);
      }

      // Construct using WorldUps.UConnected.newBuilder()
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
        worldid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        result_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WorldUps.internal_static_UConnected_descriptor;
      }

      @java.lang.Override
      public WorldUps.UConnected getDefaultInstanceForType() {
        return WorldUps.UConnected.getDefaultInstance();
      }

      @java.lang.Override
      public WorldUps.UConnected build() {
        WorldUps.UConnected result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public WorldUps.UConnected buildPartial() {
        WorldUps.UConnected result = new WorldUps.UConnected(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.worldid_ = worldid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.result_ = result_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof WorldUps.UConnected) {
          return mergeFrom((WorldUps.UConnected)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(WorldUps.UConnected other) {
        if (other == WorldUps.UConnected.getDefaultInstance()) return this;
        if (other.hasWorldid()) {
          setWorldid(other.getWorldid());
        }
        if (other.hasResult()) {
          bitField0_ |= 0x00000002;
          result_ = other.result_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasWorldid()) {
          return false;
        }
        if (!hasResult()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        WorldUps.UConnected parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (WorldUps.UConnected) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long worldid_ ;
      /**
       * <code>required int64 worldid = 1;</code>
       */
      public boolean hasWorldid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 worldid = 1;</code>
       */
      public long getWorldid() {
        return worldid_;
      }
      /**
       * <code>required int64 worldid = 1;</code>
       */
      public Builder setWorldid(long value) {
        bitField0_ |= 0x00000001;
        worldid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 worldid = 1;</code>
       */
      public Builder clearWorldid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        worldid_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object result_ = "";
      /**
       * <code>required string result = 2;</code>
       */
      public boolean hasResult() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string result = 2;</code>
       */
      public java.lang.String getResult() {
        java.lang.Object ref = result_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            result_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string result = 2;</code>
       */
      public com.google.protobuf.ByteString
          getResultBytes() {
        java.lang.Object ref = result_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          result_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string result = 2;</code>
       */
      public Builder setResult(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string result = 2;</code>
       */
      public Builder clearResult() {
        bitField0_ = (bitField0_ & ~0x00000002);
        result_ = getDefaultInstance().getResult();
        onChanged();
        return this;
      }
      /**
       * <code>required string result = 2;</code>
       */
      public Builder setResultBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        result_ = value;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:UConnected)
    }

    // @@protoc_insertion_point(class_scope:UConnected)
    private static final WorldUps.UConnected DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new WorldUps.UConnected();
    }

    public static WorldUps.UConnected getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<UConnected>
        PARSER = new com.google.protobuf.AbstractParser<UConnected>() {
      @java.lang.Override
      public UConnected parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UConnected(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UConnected> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UConnected> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public WorldUps.UConnected getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UGoPickupOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UGoPickup)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 truckid = 1;</code>
     */
    boolean hasTruckid();
    /**
     * <code>required int32 truckid = 1;</code>
     */
    int getTruckid();

    /**
     * <code>required int32 whid = 2;</code>
     */
    boolean hasWhid();
    /**
     * <code>required int32 whid = 2;</code>
     */
    int getWhid();

    /**
     * <code>required int64 seqnum = 3;</code>
     */
    boolean hasSeqnum();
    /**
     * <code>required int64 seqnum = 3;</code>
     */
    long getSeqnum();
  }
  /**
   * Protobuf type {@code UGoPickup}
   */
  public  static final class UGoPickup extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UGoPickup)
      UGoPickupOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UGoPickup.newBuilder() to construct.
    private UGoPickup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UGoPickup() {
      truckid_ = 0;
      whid_ = 0;
      seqnum_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UGoPickup(
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
              bitField0_ |= 0x00000001;
              truckid_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              whid_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              seqnum_ = input.readInt64();
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
      return WorldUps.internal_static_UGoPickup_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WorldUps.internal_static_UGoPickup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WorldUps.UGoPickup.class, WorldUps.UGoPickup.Builder.class);
    }

    private int bitField0_;
    public static final int TRUCKID_FIELD_NUMBER = 1;
    private int truckid_;
    /**
     * <code>required int32 truckid = 1;</code>
     */
    public boolean hasTruckid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 truckid = 1;</code>
     */
    public int getTruckid() {
      return truckid_;
    }

    public static final int WHID_FIELD_NUMBER = 2;
    private int whid_;
    /**
     * <code>required int32 whid = 2;</code>
     */
    public boolean hasWhid() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 whid = 2;</code>
     */
    public int getWhid() {
      return whid_;
    }

    public static final int SEQNUM_FIELD_NUMBER = 3;
    private long seqnum_;
    /**
     * <code>required int64 seqnum = 3;</code>
     */
    public boolean hasSeqnum() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int64 seqnum = 3;</code>
     */
    public long getSeqnum() {
      return seqnum_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTruckid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasWhid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSeqnum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, truckid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, whid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, seqnum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, truckid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, whid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, seqnum_);
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
      if (!(obj instanceof WorldUps.UGoPickup)) {
        return super.equals(obj);
      }
      WorldUps.UGoPickup other = (WorldUps.UGoPickup) obj;

      boolean result = true;
      result = result && (hasTruckid() == other.hasTruckid());
      if (hasTruckid()) {
        result = result && (getTruckid()
            == other.getTruckid());
      }
      result = result && (hasWhid() == other.hasWhid());
      if (hasWhid()) {
        result = result && (getWhid()
            == other.getWhid());
      }
      result = result && (hasSeqnum() == other.hasSeqnum());
      if (hasSeqnum()) {
        result = result && (getSeqnum()
            == other.getSeqnum());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTruckid()) {
        hash = (37 * hash) + TRUCKID_FIELD_NUMBER;
        hash = (53 * hash) + getTruckid();
      }
      if (hasWhid()) {
        hash = (37 * hash) + WHID_FIELD_NUMBER;
        hash = (53 * hash) + getWhid();
      }
      if (hasSeqnum()) {
        hash = (37 * hash) + SEQNUM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSeqnum());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static WorldUps.UGoPickup parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UGoPickup parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UGoPickup parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UGoPickup parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UGoPickup parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UGoPickup parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UGoPickup parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UGoPickup parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UGoPickup parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static WorldUps.UGoPickup parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UGoPickup parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UGoPickup parseFrom(
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
    public static Builder newBuilder(WorldUps.UGoPickup prototype) {
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
     * Protobuf type {@code UGoPickup}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UGoPickup)
        WorldUps.UGoPickupOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WorldUps.internal_static_UGoPickup_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WorldUps.internal_static_UGoPickup_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                WorldUps.UGoPickup.class, WorldUps.UGoPickup.Builder.class);
      }

      // Construct using WorldUps.UGoPickup.newBuilder()
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
        truckid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        whid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        seqnum_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WorldUps.internal_static_UGoPickup_descriptor;
      }

      @java.lang.Override
      public WorldUps.UGoPickup getDefaultInstanceForType() {
        return WorldUps.UGoPickup.getDefaultInstance();
      }

      @java.lang.Override
      public WorldUps.UGoPickup build() {
        WorldUps.UGoPickup result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public WorldUps.UGoPickup buildPartial() {
        WorldUps.UGoPickup result = new WorldUps.UGoPickup(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.truckid_ = truckid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.whid_ = whid_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.seqnum_ = seqnum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof WorldUps.UGoPickup) {
          return mergeFrom((WorldUps.UGoPickup)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(WorldUps.UGoPickup other) {
        if (other == WorldUps.UGoPickup.getDefaultInstance()) return this;
        if (other.hasTruckid()) {
          setTruckid(other.getTruckid());
        }
        if (other.hasWhid()) {
          setWhid(other.getWhid());
        }
        if (other.hasSeqnum()) {
          setSeqnum(other.getSeqnum());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasTruckid()) {
          return false;
        }
        if (!hasWhid()) {
          return false;
        }
        if (!hasSeqnum()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        WorldUps.UGoPickup parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (WorldUps.UGoPickup) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int truckid_ ;
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public boolean hasTruckid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public int getTruckid() {
        return truckid_;
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public Builder setTruckid(int value) {
        bitField0_ |= 0x00000001;
        truckid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public Builder clearTruckid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        truckid_ = 0;
        onChanged();
        return this;
      }

      private int whid_ ;
      /**
       * <code>required int32 whid = 2;</code>
       */
      public boolean hasWhid() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 whid = 2;</code>
       */
      public int getWhid() {
        return whid_;
      }
      /**
       * <code>required int32 whid = 2;</code>
       */
      public Builder setWhid(int value) {
        bitField0_ |= 0x00000002;
        whid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 whid = 2;</code>
       */
      public Builder clearWhid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        whid_ = 0;
        onChanged();
        return this;
      }

      private long seqnum_ ;
      /**
       * <code>required int64 seqnum = 3;</code>
       */
      public boolean hasSeqnum() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int64 seqnum = 3;</code>
       */
      public long getSeqnum() {
        return seqnum_;
      }
      /**
       * <code>required int64 seqnum = 3;</code>
       */
      public Builder setSeqnum(long value) {
        bitField0_ |= 0x00000004;
        seqnum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 seqnum = 3;</code>
       */
      public Builder clearSeqnum() {
        bitField0_ = (bitField0_ & ~0x00000004);
        seqnum_ = 0L;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:UGoPickup)
    }

    // @@protoc_insertion_point(class_scope:UGoPickup)
    private static final WorldUps.UGoPickup DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new WorldUps.UGoPickup();
    }

    public static WorldUps.UGoPickup getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<UGoPickup>
        PARSER = new com.google.protobuf.AbstractParser<UGoPickup>() {
      @java.lang.Override
      public UGoPickup parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UGoPickup(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UGoPickup> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UGoPickup> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public WorldUps.UGoPickup getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UFinishedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UFinished)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 truckid = 1;</code>
     */
    boolean hasTruckid();
    /**
     * <code>required int32 truckid = 1;</code>
     */
    int getTruckid();

    /**
     * <code>required int32 x = 2;</code>
     */
    boolean hasX();
    /**
     * <code>required int32 x = 2;</code>
     */
    int getX();

    /**
     * <code>required int32 y = 3;</code>
     */
    boolean hasY();
    /**
     * <code>required int32 y = 3;</code>
     */
    int getY();

    /**
     * <code>required string status = 4;</code>
     */
    boolean hasStatus();
    /**
     * <code>required string status = 4;</code>
     */
    java.lang.String getStatus();
    /**
     * <code>required string status = 4;</code>
     */
    com.google.protobuf.ByteString
        getStatusBytes();

    /**
     * <code>required int64 seqnum = 5;</code>
     */
    boolean hasSeqnum();
    /**
     * <code>required int64 seqnum = 5;</code>
     */
    long getSeqnum();
  }
  /**
   * Protobuf type {@code UFinished}
   */
  public  static final class UFinished extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UFinished)
      UFinishedOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UFinished.newBuilder() to construct.
    private UFinished(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UFinished() {
      truckid_ = 0;
      x_ = 0;
      y_ = 0;
      status_ = "";
      seqnum_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UFinished(
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
              bitField0_ |= 0x00000001;
              truckid_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              x_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              y_ = input.readInt32();
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              status_ = bs;
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              seqnum_ = input.readInt64();
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
      return WorldUps.internal_static_UFinished_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WorldUps.internal_static_UFinished_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WorldUps.UFinished.class, WorldUps.UFinished.Builder.class);
    }

    private int bitField0_;
    public static final int TRUCKID_FIELD_NUMBER = 1;
    private int truckid_;
    /**
     * <code>required int32 truckid = 1;</code>
     */
    public boolean hasTruckid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 truckid = 1;</code>
     */
    public int getTruckid() {
      return truckid_;
    }

    public static final int X_FIELD_NUMBER = 2;
    private int x_;
    /**
     * <code>required int32 x = 2;</code>
     */
    public boolean hasX() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 x = 2;</code>
     */
    public int getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 3;
    private int y_;
    /**
     * <code>required int32 y = 3;</code>
     */
    public boolean hasY() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 y = 3;</code>
     */
    public int getY() {
      return y_;
    }

    public static final int STATUS_FIELD_NUMBER = 4;
    private volatile java.lang.Object status_;
    /**
     * <code>required string status = 4;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string status = 4;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          status_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string status = 4;</code>
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SEQNUM_FIELD_NUMBER = 5;
    private long seqnum_;
    /**
     * <code>required int64 seqnum = 5;</code>
     */
    public boolean hasSeqnum() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int64 seqnum = 5;</code>
     */
    public long getSeqnum() {
      return seqnum_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTruckid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasX()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasY()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStatus()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSeqnum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, truckid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, x_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, y_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, status_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, seqnum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, truckid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, x_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, y_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, status_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, seqnum_);
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
      if (!(obj instanceof WorldUps.UFinished)) {
        return super.equals(obj);
      }
      WorldUps.UFinished other = (WorldUps.UFinished) obj;

      boolean result = true;
      result = result && (hasTruckid() == other.hasTruckid());
      if (hasTruckid()) {
        result = result && (getTruckid()
            == other.getTruckid());
      }
      result = result && (hasX() == other.hasX());
      if (hasX()) {
        result = result && (getX()
            == other.getX());
      }
      result = result && (hasY() == other.hasY());
      if (hasY()) {
        result = result && (getY()
            == other.getY());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus()
            .equals(other.getStatus());
      }
      result = result && (hasSeqnum() == other.hasSeqnum());
      if (hasSeqnum()) {
        result = result && (getSeqnum()
            == other.getSeqnum());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTruckid()) {
        hash = (37 * hash) + TRUCKID_FIELD_NUMBER;
        hash = (53 * hash) + getTruckid();
      }
      if (hasX()) {
        hash = (37 * hash) + X_FIELD_NUMBER;
        hash = (53 * hash) + getX();
      }
      if (hasY()) {
        hash = (37 * hash) + Y_FIELD_NUMBER;
        hash = (53 * hash) + getY();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      if (hasSeqnum()) {
        hash = (37 * hash) + SEQNUM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSeqnum());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static WorldUps.UFinished parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UFinished parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UFinished parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UFinished parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UFinished parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UFinished parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UFinished parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UFinished parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UFinished parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static WorldUps.UFinished parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UFinished parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UFinished parseFrom(
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
    public static Builder newBuilder(WorldUps.UFinished prototype) {
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
     * Protobuf type {@code UFinished}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UFinished)
        WorldUps.UFinishedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WorldUps.internal_static_UFinished_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WorldUps.internal_static_UFinished_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                WorldUps.UFinished.class, WorldUps.UFinished.Builder.class);
      }

      // Construct using WorldUps.UFinished.newBuilder()
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
        truckid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        x_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        y_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        status_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        seqnum_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WorldUps.internal_static_UFinished_descriptor;
      }

      @java.lang.Override
      public WorldUps.UFinished getDefaultInstanceForType() {
        return WorldUps.UFinished.getDefaultInstance();
      }

      @java.lang.Override
      public WorldUps.UFinished build() {
        WorldUps.UFinished result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public WorldUps.UFinished buildPartial() {
        WorldUps.UFinished result = new WorldUps.UFinished(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.truckid_ = truckid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.x_ = x_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.y_ = y_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.seqnum_ = seqnum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof WorldUps.UFinished) {
          return mergeFrom((WorldUps.UFinished)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(WorldUps.UFinished other) {
        if (other == WorldUps.UFinished.getDefaultInstance()) return this;
        if (other.hasTruckid()) {
          setTruckid(other.getTruckid());
        }
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        if (other.hasStatus()) {
          bitField0_ |= 0x00000008;
          status_ = other.status_;
          onChanged();
        }
        if (other.hasSeqnum()) {
          setSeqnum(other.getSeqnum());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasTruckid()) {
          return false;
        }
        if (!hasX()) {
          return false;
        }
        if (!hasY()) {
          return false;
        }
        if (!hasStatus()) {
          return false;
        }
        if (!hasSeqnum()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        WorldUps.UFinished parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (WorldUps.UFinished) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int truckid_ ;
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public boolean hasTruckid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public int getTruckid() {
        return truckid_;
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public Builder setTruckid(int value) {
        bitField0_ |= 0x00000001;
        truckid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public Builder clearTruckid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        truckid_ = 0;
        onChanged();
        return this;
      }

      private int x_ ;
      /**
       * <code>required int32 x = 2;</code>
       */
      public boolean hasX() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 x = 2;</code>
       */
      public int getX() {
        return x_;
      }
      /**
       * <code>required int32 x = 2;</code>
       */
      public Builder setX(int value) {
        bitField0_ |= 0x00000002;
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 x = 2;</code>
       */
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000002);
        x_ = 0;
        onChanged();
        return this;
      }

      private int y_ ;
      /**
       * <code>required int32 y = 3;</code>
       */
      public boolean hasY() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 y = 3;</code>
       */
      public int getY() {
        return y_;
      }
      /**
       * <code>required int32 y = 3;</code>
       */
      public Builder setY(int value) {
        bitField0_ |= 0x00000004;
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 y = 3;</code>
       */
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000004);
        y_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object status_ = "";
      /**
       * <code>required string status = 4;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string status = 4;</code>
       */
      public java.lang.String getStatus() {
        java.lang.Object ref = status_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            status_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string status = 4;</code>
       */
      public com.google.protobuf.ByteString
          getStatusBytes() {
        java.lang.Object ref = status_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          status_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string status = 4;</code>
       */
      public Builder setStatus(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string status = 4;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000008);
        status_ = getDefaultInstance().getStatus();
        onChanged();
        return this;
      }
      /**
       * <code>required string status = 4;</code>
       */
      public Builder setStatusBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        status_ = value;
        onChanged();
        return this;
      }

      private long seqnum_ ;
      /**
       * <code>required int64 seqnum = 5;</code>
       */
      public boolean hasSeqnum() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required int64 seqnum = 5;</code>
       */
      public long getSeqnum() {
        return seqnum_;
      }
      /**
       * <code>required int64 seqnum = 5;</code>
       */
      public Builder setSeqnum(long value) {
        bitField0_ |= 0x00000010;
        seqnum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 seqnum = 5;</code>
       */
      public Builder clearSeqnum() {
        bitField0_ = (bitField0_ & ~0x00000010);
        seqnum_ = 0L;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:UFinished)
    }

    // @@protoc_insertion_point(class_scope:UFinished)
    private static final WorldUps.UFinished DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new WorldUps.UFinished();
    }

    public static WorldUps.UFinished getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<UFinished>
        PARSER = new com.google.protobuf.AbstractParser<UFinished>() {
      @java.lang.Override
      public UFinished parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UFinished(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UFinished> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UFinished> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public WorldUps.UFinished getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UDeliveryMadeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UDeliveryMade)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 truckid = 1;</code>
     */
    boolean hasTruckid();
    /**
     * <code>required int32 truckid = 1;</code>
     */
    int getTruckid();

    /**
     * <code>required int64 packageid = 2;</code>
     */
    boolean hasPackageid();
    /**
     * <code>required int64 packageid = 2;</code>
     */
    long getPackageid();

    /**
     * <code>required int64 seqnum = 3;</code>
     */
    boolean hasSeqnum();
    /**
     * <code>required int64 seqnum = 3;</code>
     */
    long getSeqnum();
  }
  /**
   * Protobuf type {@code UDeliveryMade}
   */
  public  static final class UDeliveryMade extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UDeliveryMade)
      UDeliveryMadeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UDeliveryMade.newBuilder() to construct.
    private UDeliveryMade(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UDeliveryMade() {
      truckid_ = 0;
      packageid_ = 0L;
      seqnum_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UDeliveryMade(
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
              bitField0_ |= 0x00000001;
              truckid_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              packageid_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              seqnum_ = input.readInt64();
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
      return WorldUps.internal_static_UDeliveryMade_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WorldUps.internal_static_UDeliveryMade_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WorldUps.UDeliveryMade.class, WorldUps.UDeliveryMade.Builder.class);
    }

    private int bitField0_;
    public static final int TRUCKID_FIELD_NUMBER = 1;
    private int truckid_;
    /**
     * <code>required int32 truckid = 1;</code>
     */
    public boolean hasTruckid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 truckid = 1;</code>
     */
    public int getTruckid() {
      return truckid_;
    }

    public static final int PACKAGEID_FIELD_NUMBER = 2;
    private long packageid_;
    /**
     * <code>required int64 packageid = 2;</code>
     */
    public boolean hasPackageid() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 packageid = 2;</code>
     */
    public long getPackageid() {
      return packageid_;
    }

    public static final int SEQNUM_FIELD_NUMBER = 3;
    private long seqnum_;
    /**
     * <code>required int64 seqnum = 3;</code>
     */
    public boolean hasSeqnum() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int64 seqnum = 3;</code>
     */
    public long getSeqnum() {
      return seqnum_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTruckid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPackageid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSeqnum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, truckid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, packageid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, seqnum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, truckid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, packageid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, seqnum_);
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
      if (!(obj instanceof WorldUps.UDeliveryMade)) {
        return super.equals(obj);
      }
      WorldUps.UDeliveryMade other = (WorldUps.UDeliveryMade) obj;

      boolean result = true;
      result = result && (hasTruckid() == other.hasTruckid());
      if (hasTruckid()) {
        result = result && (getTruckid()
            == other.getTruckid());
      }
      result = result && (hasPackageid() == other.hasPackageid());
      if (hasPackageid()) {
        result = result && (getPackageid()
            == other.getPackageid());
      }
      result = result && (hasSeqnum() == other.hasSeqnum());
      if (hasSeqnum()) {
        result = result && (getSeqnum()
            == other.getSeqnum());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTruckid()) {
        hash = (37 * hash) + TRUCKID_FIELD_NUMBER;
        hash = (53 * hash) + getTruckid();
      }
      if (hasPackageid()) {
        hash = (37 * hash) + PACKAGEID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getPackageid());
      }
      if (hasSeqnum()) {
        hash = (37 * hash) + SEQNUM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSeqnum());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static WorldUps.UDeliveryMade parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UDeliveryMade parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UDeliveryMade parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UDeliveryMade parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UDeliveryMade parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UDeliveryMade parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UDeliveryMade parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UDeliveryMade parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UDeliveryMade parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static WorldUps.UDeliveryMade parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UDeliveryMade parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UDeliveryMade parseFrom(
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
    public static Builder newBuilder(WorldUps.UDeliveryMade prototype) {
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
     * Protobuf type {@code UDeliveryMade}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UDeliveryMade)
        WorldUps.UDeliveryMadeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WorldUps.internal_static_UDeliveryMade_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WorldUps.internal_static_UDeliveryMade_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                WorldUps.UDeliveryMade.class, WorldUps.UDeliveryMade.Builder.class);
      }

      // Construct using WorldUps.UDeliveryMade.newBuilder()
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
        truckid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        packageid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        seqnum_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WorldUps.internal_static_UDeliveryMade_descriptor;
      }

      @java.lang.Override
      public WorldUps.UDeliveryMade getDefaultInstanceForType() {
        return WorldUps.UDeliveryMade.getDefaultInstance();
      }

      @java.lang.Override
      public WorldUps.UDeliveryMade build() {
        WorldUps.UDeliveryMade result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public WorldUps.UDeliveryMade buildPartial() {
        WorldUps.UDeliveryMade result = new WorldUps.UDeliveryMade(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.truckid_ = truckid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.packageid_ = packageid_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.seqnum_ = seqnum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof WorldUps.UDeliveryMade) {
          return mergeFrom((WorldUps.UDeliveryMade)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(WorldUps.UDeliveryMade other) {
        if (other == WorldUps.UDeliveryMade.getDefaultInstance()) return this;
        if (other.hasTruckid()) {
          setTruckid(other.getTruckid());
        }
        if (other.hasPackageid()) {
          setPackageid(other.getPackageid());
        }
        if (other.hasSeqnum()) {
          setSeqnum(other.getSeqnum());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasTruckid()) {
          return false;
        }
        if (!hasPackageid()) {
          return false;
        }
        if (!hasSeqnum()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        WorldUps.UDeliveryMade parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (WorldUps.UDeliveryMade) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int truckid_ ;
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public boolean hasTruckid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public int getTruckid() {
        return truckid_;
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public Builder setTruckid(int value) {
        bitField0_ |= 0x00000001;
        truckid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public Builder clearTruckid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        truckid_ = 0;
        onChanged();
        return this;
      }

      private long packageid_ ;
      /**
       * <code>required int64 packageid = 2;</code>
       */
      public boolean hasPackageid() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 packageid = 2;</code>
       */
      public long getPackageid() {
        return packageid_;
      }
      /**
       * <code>required int64 packageid = 2;</code>
       */
      public Builder setPackageid(long value) {
        bitField0_ |= 0x00000002;
        packageid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 packageid = 2;</code>
       */
      public Builder clearPackageid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        packageid_ = 0L;
        onChanged();
        return this;
      }

      private long seqnum_ ;
      /**
       * <code>required int64 seqnum = 3;</code>
       */
      public boolean hasSeqnum() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int64 seqnum = 3;</code>
       */
      public long getSeqnum() {
        return seqnum_;
      }
      /**
       * <code>required int64 seqnum = 3;</code>
       */
      public Builder setSeqnum(long value) {
        bitField0_ |= 0x00000004;
        seqnum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 seqnum = 3;</code>
       */
      public Builder clearSeqnum() {
        bitField0_ = (bitField0_ & ~0x00000004);
        seqnum_ = 0L;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:UDeliveryMade)
    }

    // @@protoc_insertion_point(class_scope:UDeliveryMade)
    private static final WorldUps.UDeliveryMade DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new WorldUps.UDeliveryMade();
    }

    public static WorldUps.UDeliveryMade getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<UDeliveryMade>
        PARSER = new com.google.protobuf.AbstractParser<UDeliveryMade>() {
      @java.lang.Override
      public UDeliveryMade parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UDeliveryMade(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UDeliveryMade> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UDeliveryMade> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public WorldUps.UDeliveryMade getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UDeliveryLocationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UDeliveryLocation)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 packageid = 1;</code>
     */
    boolean hasPackageid();
    /**
     * <code>required int64 packageid = 1;</code>
     */
    long getPackageid();

    /**
     * <code>required int32 x = 2;</code>
     */
    boolean hasX();
    /**
     * <code>required int32 x = 2;</code>
     */
    int getX();

    /**
     * <code>required int32 y = 3;</code>
     */
    boolean hasY();
    /**
     * <code>required int32 y = 3;</code>
     */
    int getY();
  }
  /**
   * Protobuf type {@code UDeliveryLocation}
   */
  public  static final class UDeliveryLocation extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UDeliveryLocation)
      UDeliveryLocationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UDeliveryLocation.newBuilder() to construct.
    private UDeliveryLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UDeliveryLocation() {
      packageid_ = 0L;
      x_ = 0;
      y_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UDeliveryLocation(
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
              bitField0_ |= 0x00000001;
              packageid_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              x_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              y_ = input.readInt32();
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
      return WorldUps.internal_static_UDeliveryLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WorldUps.internal_static_UDeliveryLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WorldUps.UDeliveryLocation.class, WorldUps.UDeliveryLocation.Builder.class);
    }

    private int bitField0_;
    public static final int PACKAGEID_FIELD_NUMBER = 1;
    private long packageid_;
    /**
     * <code>required int64 packageid = 1;</code>
     */
    public boolean hasPackageid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 packageid = 1;</code>
     */
    public long getPackageid() {
      return packageid_;
    }

    public static final int X_FIELD_NUMBER = 2;
    private int x_;
    /**
     * <code>required int32 x = 2;</code>
     */
    public boolean hasX() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 x = 2;</code>
     */
    public int getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 3;
    private int y_;
    /**
     * <code>required int32 y = 3;</code>
     */
    public boolean hasY() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 y = 3;</code>
     */
    public int getY() {
      return y_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasPackageid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasX()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasY()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, packageid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, x_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, y_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, packageid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, x_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, y_);
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
      if (!(obj instanceof WorldUps.UDeliveryLocation)) {
        return super.equals(obj);
      }
      WorldUps.UDeliveryLocation other = (WorldUps.UDeliveryLocation) obj;

      boolean result = true;
      result = result && (hasPackageid() == other.hasPackageid());
      if (hasPackageid()) {
        result = result && (getPackageid()
            == other.getPackageid());
      }
      result = result && (hasX() == other.hasX());
      if (hasX()) {
        result = result && (getX()
            == other.getX());
      }
      result = result && (hasY() == other.hasY());
      if (hasY()) {
        result = result && (getY()
            == other.getY());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasPackageid()) {
        hash = (37 * hash) + PACKAGEID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getPackageid());
      }
      if (hasX()) {
        hash = (37 * hash) + X_FIELD_NUMBER;
        hash = (53 * hash) + getX();
      }
      if (hasY()) {
        hash = (37 * hash) + Y_FIELD_NUMBER;
        hash = (53 * hash) + getY();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static WorldUps.UDeliveryLocation parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UDeliveryLocation parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UDeliveryLocation parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UDeliveryLocation parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UDeliveryLocation parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UDeliveryLocation parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UDeliveryLocation parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UDeliveryLocation parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UDeliveryLocation parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static WorldUps.UDeliveryLocation parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UDeliveryLocation parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UDeliveryLocation parseFrom(
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
    public static Builder newBuilder(WorldUps.UDeliveryLocation prototype) {
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
     * Protobuf type {@code UDeliveryLocation}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UDeliveryLocation)
        WorldUps.UDeliveryLocationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WorldUps.internal_static_UDeliveryLocation_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WorldUps.internal_static_UDeliveryLocation_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                WorldUps.UDeliveryLocation.class, WorldUps.UDeliveryLocation.Builder.class);
      }

      // Construct using WorldUps.UDeliveryLocation.newBuilder()
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
        packageid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        x_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        y_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WorldUps.internal_static_UDeliveryLocation_descriptor;
      }

      @java.lang.Override
      public WorldUps.UDeliveryLocation getDefaultInstanceForType() {
        return WorldUps.UDeliveryLocation.getDefaultInstance();
      }

      @java.lang.Override
      public WorldUps.UDeliveryLocation build() {
        WorldUps.UDeliveryLocation result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public WorldUps.UDeliveryLocation buildPartial() {
        WorldUps.UDeliveryLocation result = new WorldUps.UDeliveryLocation(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.packageid_ = packageid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.x_ = x_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.y_ = y_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof WorldUps.UDeliveryLocation) {
          return mergeFrom((WorldUps.UDeliveryLocation)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(WorldUps.UDeliveryLocation other) {
        if (other == WorldUps.UDeliveryLocation.getDefaultInstance()) return this;
        if (other.hasPackageid()) {
          setPackageid(other.getPackageid());
        }
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasPackageid()) {
          return false;
        }
        if (!hasX()) {
          return false;
        }
        if (!hasY()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        WorldUps.UDeliveryLocation parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (WorldUps.UDeliveryLocation) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long packageid_ ;
      /**
       * <code>required int64 packageid = 1;</code>
       */
      public boolean hasPackageid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 packageid = 1;</code>
       */
      public long getPackageid() {
        return packageid_;
      }
      /**
       * <code>required int64 packageid = 1;</code>
       */
      public Builder setPackageid(long value) {
        bitField0_ |= 0x00000001;
        packageid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 packageid = 1;</code>
       */
      public Builder clearPackageid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        packageid_ = 0L;
        onChanged();
        return this;
      }

      private int x_ ;
      /**
       * <code>required int32 x = 2;</code>
       */
      public boolean hasX() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 x = 2;</code>
       */
      public int getX() {
        return x_;
      }
      /**
       * <code>required int32 x = 2;</code>
       */
      public Builder setX(int value) {
        bitField0_ |= 0x00000002;
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 x = 2;</code>
       */
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000002);
        x_ = 0;
        onChanged();
        return this;
      }

      private int y_ ;
      /**
       * <code>required int32 y = 3;</code>
       */
      public boolean hasY() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 y = 3;</code>
       */
      public int getY() {
        return y_;
      }
      /**
       * <code>required int32 y = 3;</code>
       */
      public Builder setY(int value) {
        bitField0_ |= 0x00000004;
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 y = 3;</code>
       */
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000004);
        y_ = 0;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:UDeliveryLocation)
    }

    // @@protoc_insertion_point(class_scope:UDeliveryLocation)
    private static final WorldUps.UDeliveryLocation DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new WorldUps.UDeliveryLocation();
    }

    public static WorldUps.UDeliveryLocation getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<UDeliveryLocation>
        PARSER = new com.google.protobuf.AbstractParser<UDeliveryLocation>() {
      @java.lang.Override
      public UDeliveryLocation parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UDeliveryLocation(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UDeliveryLocation> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UDeliveryLocation> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public WorldUps.UDeliveryLocation getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UGoDeliverOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UGoDeliver)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 truckid = 1;</code>
     */
    boolean hasTruckid();
    /**
     * <code>required int32 truckid = 1;</code>
     */
    int getTruckid();

    /**
     * <code>repeated .UDeliveryLocation packages = 2;</code>
     */
    java.util.List<WorldUps.UDeliveryLocation> 
        getPackagesList();
    /**
     * <code>repeated .UDeliveryLocation packages = 2;</code>
     */
    WorldUps.UDeliveryLocation getPackages(int index);
    /**
     * <code>repeated .UDeliveryLocation packages = 2;</code>
     */
    int getPackagesCount();
    /**
     * <code>repeated .UDeliveryLocation packages = 2;</code>
     */
    java.util.List<? extends WorldUps.UDeliveryLocationOrBuilder> 
        getPackagesOrBuilderList();
    /**
     * <code>repeated .UDeliveryLocation packages = 2;</code>
     */
    WorldUps.UDeliveryLocationOrBuilder getPackagesOrBuilder(
        int index);

    /**
     * <code>required int64 seqnum = 3;</code>
     */
    boolean hasSeqnum();
    /**
     * <code>required int64 seqnum = 3;</code>
     */
    long getSeqnum();
  }
  /**
   * Protobuf type {@code UGoDeliver}
   */
  public  static final class UGoDeliver extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UGoDeliver)
      UGoDeliverOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UGoDeliver.newBuilder() to construct.
    private UGoDeliver(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UGoDeliver() {
      truckid_ = 0;
      packages_ = java.util.Collections.emptyList();
      seqnum_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UGoDeliver(
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
              bitField0_ |= 0x00000001;
              truckid_ = input.readInt32();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                packages_ = new java.util.ArrayList<WorldUps.UDeliveryLocation>();
                mutable_bitField0_ |= 0x00000002;
              }
              packages_.add(
                  input.readMessage(WorldUps.UDeliveryLocation.PARSER, extensionRegistry));
              break;
            }
            case 24: {
              bitField0_ |= 0x00000002;
              seqnum_ = input.readInt64();
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          packages_ = java.util.Collections.unmodifiableList(packages_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return WorldUps.internal_static_UGoDeliver_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WorldUps.internal_static_UGoDeliver_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WorldUps.UGoDeliver.class, WorldUps.UGoDeliver.Builder.class);
    }

    private int bitField0_;
    public static final int TRUCKID_FIELD_NUMBER = 1;
    private int truckid_;
    /**
     * <code>required int32 truckid = 1;</code>
     */
    public boolean hasTruckid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 truckid = 1;</code>
     */
    public int getTruckid() {
      return truckid_;
    }

    public static final int PACKAGES_FIELD_NUMBER = 2;
    private java.util.List<WorldUps.UDeliveryLocation> packages_;
    /**
     * <code>repeated .UDeliveryLocation packages = 2;</code>
     */
    public java.util.List<WorldUps.UDeliveryLocation> getPackagesList() {
      return packages_;
    }
    /**
     * <code>repeated .UDeliveryLocation packages = 2;</code>
     */
    public java.util.List<? extends WorldUps.UDeliveryLocationOrBuilder> 
        getPackagesOrBuilderList() {
      return packages_;
    }
    /**
     * <code>repeated .UDeliveryLocation packages = 2;</code>
     */
    public int getPackagesCount() {
      return packages_.size();
    }
    /**
     * <code>repeated .UDeliveryLocation packages = 2;</code>
     */
    public WorldUps.UDeliveryLocation getPackages(int index) {
      return packages_.get(index);
    }
    /**
     * <code>repeated .UDeliveryLocation packages = 2;</code>
     */
    public WorldUps.UDeliveryLocationOrBuilder getPackagesOrBuilder(
        int index) {
      return packages_.get(index);
    }

    public static final int SEQNUM_FIELD_NUMBER = 3;
    private long seqnum_;
    /**
     * <code>required int64 seqnum = 3;</code>
     */
    public boolean hasSeqnum() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 seqnum = 3;</code>
     */
    public long getSeqnum() {
      return seqnum_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTruckid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSeqnum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getPackagesCount(); i++) {
        if (!getPackages(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, truckid_);
      }
      for (int i = 0; i < packages_.size(); i++) {
        output.writeMessage(2, packages_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(3, seqnum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, truckid_);
      }
      for (int i = 0; i < packages_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, packages_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, seqnum_);
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
      if (!(obj instanceof WorldUps.UGoDeliver)) {
        return super.equals(obj);
      }
      WorldUps.UGoDeliver other = (WorldUps.UGoDeliver) obj;

      boolean result = true;
      result = result && (hasTruckid() == other.hasTruckid());
      if (hasTruckid()) {
        result = result && (getTruckid()
            == other.getTruckid());
      }
      result = result && getPackagesList()
          .equals(other.getPackagesList());
      result = result && (hasSeqnum() == other.hasSeqnum());
      if (hasSeqnum()) {
        result = result && (getSeqnum()
            == other.getSeqnum());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTruckid()) {
        hash = (37 * hash) + TRUCKID_FIELD_NUMBER;
        hash = (53 * hash) + getTruckid();
      }
      if (getPackagesCount() > 0) {
        hash = (37 * hash) + PACKAGES_FIELD_NUMBER;
        hash = (53 * hash) + getPackagesList().hashCode();
      }
      if (hasSeqnum()) {
        hash = (37 * hash) + SEQNUM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSeqnum());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static WorldUps.UGoDeliver parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UGoDeliver parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UGoDeliver parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UGoDeliver parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UGoDeliver parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UGoDeliver parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UGoDeliver parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UGoDeliver parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UGoDeliver parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static WorldUps.UGoDeliver parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UGoDeliver parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UGoDeliver parseFrom(
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
    public static Builder newBuilder(WorldUps.UGoDeliver prototype) {
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
     * Protobuf type {@code UGoDeliver}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UGoDeliver)
        WorldUps.UGoDeliverOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WorldUps.internal_static_UGoDeliver_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WorldUps.internal_static_UGoDeliver_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                WorldUps.UGoDeliver.class, WorldUps.UGoDeliver.Builder.class);
      }

      // Construct using WorldUps.UGoDeliver.newBuilder()
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
          getPackagesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        truckid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (packagesBuilder_ == null) {
          packages_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          packagesBuilder_.clear();
        }
        seqnum_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WorldUps.internal_static_UGoDeliver_descriptor;
      }

      @java.lang.Override
      public WorldUps.UGoDeliver getDefaultInstanceForType() {
        return WorldUps.UGoDeliver.getDefaultInstance();
      }

      @java.lang.Override
      public WorldUps.UGoDeliver build() {
        WorldUps.UGoDeliver result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public WorldUps.UGoDeliver buildPartial() {
        WorldUps.UGoDeliver result = new WorldUps.UGoDeliver(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.truckid_ = truckid_;
        if (packagesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            packages_ = java.util.Collections.unmodifiableList(packages_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.packages_ = packages_;
        } else {
          result.packages_ = packagesBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        result.seqnum_ = seqnum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof WorldUps.UGoDeliver) {
          return mergeFrom((WorldUps.UGoDeliver)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(WorldUps.UGoDeliver other) {
        if (other == WorldUps.UGoDeliver.getDefaultInstance()) return this;
        if (other.hasTruckid()) {
          setTruckid(other.getTruckid());
        }
        if (packagesBuilder_ == null) {
          if (!other.packages_.isEmpty()) {
            if (packages_.isEmpty()) {
              packages_ = other.packages_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensurePackagesIsMutable();
              packages_.addAll(other.packages_);
            }
            onChanged();
          }
        } else {
          if (!other.packages_.isEmpty()) {
            if (packagesBuilder_.isEmpty()) {
              packagesBuilder_.dispose();
              packagesBuilder_ = null;
              packages_ = other.packages_;
              bitField0_ = (bitField0_ & ~0x00000002);
              packagesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPackagesFieldBuilder() : null;
            } else {
              packagesBuilder_.addAllMessages(other.packages_);
            }
          }
        }
        if (other.hasSeqnum()) {
          setSeqnum(other.getSeqnum());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasTruckid()) {
          return false;
        }
        if (!hasSeqnum()) {
          return false;
        }
        for (int i = 0; i < getPackagesCount(); i++) {
          if (!getPackages(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        WorldUps.UGoDeliver parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (WorldUps.UGoDeliver) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int truckid_ ;
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public boolean hasTruckid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public int getTruckid() {
        return truckid_;
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public Builder setTruckid(int value) {
        bitField0_ |= 0x00000001;
        truckid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public Builder clearTruckid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        truckid_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<WorldUps.UDeliveryLocation> packages_ =
        java.util.Collections.emptyList();
      private void ensurePackagesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          packages_ = new java.util.ArrayList<WorldUps.UDeliveryLocation>(packages_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UDeliveryLocation, WorldUps.UDeliveryLocation.Builder, WorldUps.UDeliveryLocationOrBuilder> packagesBuilder_;

      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public java.util.List<WorldUps.UDeliveryLocation> getPackagesList() {
        if (packagesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(packages_);
        } else {
          return packagesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public int getPackagesCount() {
        if (packagesBuilder_ == null) {
          return packages_.size();
        } else {
          return packagesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public WorldUps.UDeliveryLocation getPackages(int index) {
        if (packagesBuilder_ == null) {
          return packages_.get(index);
        } else {
          return packagesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public Builder setPackages(
          int index, WorldUps.UDeliveryLocation value) {
        if (packagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePackagesIsMutable();
          packages_.set(index, value);
          onChanged();
        } else {
          packagesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public Builder setPackages(
          int index, WorldUps.UDeliveryLocation.Builder builderForValue) {
        if (packagesBuilder_ == null) {
          ensurePackagesIsMutable();
          packages_.set(index, builderForValue.build());
          onChanged();
        } else {
          packagesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public Builder addPackages(WorldUps.UDeliveryLocation value) {
        if (packagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePackagesIsMutable();
          packages_.add(value);
          onChanged();
        } else {
          packagesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public Builder addPackages(
          int index, WorldUps.UDeliveryLocation value) {
        if (packagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePackagesIsMutable();
          packages_.add(index, value);
          onChanged();
        } else {
          packagesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public Builder addPackages(
          WorldUps.UDeliveryLocation.Builder builderForValue) {
        if (packagesBuilder_ == null) {
          ensurePackagesIsMutable();
          packages_.add(builderForValue.build());
          onChanged();
        } else {
          packagesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public Builder addPackages(
          int index, WorldUps.UDeliveryLocation.Builder builderForValue) {
        if (packagesBuilder_ == null) {
          ensurePackagesIsMutable();
          packages_.add(index, builderForValue.build());
          onChanged();
        } else {
          packagesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public Builder addAllPackages(
          java.lang.Iterable<? extends WorldUps.UDeliveryLocation> values) {
        if (packagesBuilder_ == null) {
          ensurePackagesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, packages_);
          onChanged();
        } else {
          packagesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public Builder clearPackages() {
        if (packagesBuilder_ == null) {
          packages_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          packagesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public Builder removePackages(int index) {
        if (packagesBuilder_ == null) {
          ensurePackagesIsMutable();
          packages_.remove(index);
          onChanged();
        } else {
          packagesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public WorldUps.UDeliveryLocation.Builder getPackagesBuilder(
          int index) {
        return getPackagesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public WorldUps.UDeliveryLocationOrBuilder getPackagesOrBuilder(
          int index) {
        if (packagesBuilder_ == null) {
          return packages_.get(index);  } else {
          return packagesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public java.util.List<? extends WorldUps.UDeliveryLocationOrBuilder> 
           getPackagesOrBuilderList() {
        if (packagesBuilder_ != null) {
          return packagesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(packages_);
        }
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public WorldUps.UDeliveryLocation.Builder addPackagesBuilder() {
        return getPackagesFieldBuilder().addBuilder(
            WorldUps.UDeliveryLocation.getDefaultInstance());
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public WorldUps.UDeliveryLocation.Builder addPackagesBuilder(
          int index) {
        return getPackagesFieldBuilder().addBuilder(
            index, WorldUps.UDeliveryLocation.getDefaultInstance());
      }
      /**
       * <code>repeated .UDeliveryLocation packages = 2;</code>
       */
      public java.util.List<WorldUps.UDeliveryLocation.Builder> 
           getPackagesBuilderList() {
        return getPackagesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UDeliveryLocation, WorldUps.UDeliveryLocation.Builder, WorldUps.UDeliveryLocationOrBuilder> 
          getPackagesFieldBuilder() {
        if (packagesBuilder_ == null) {
          packagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              WorldUps.UDeliveryLocation, WorldUps.UDeliveryLocation.Builder, WorldUps.UDeliveryLocationOrBuilder>(
                  packages_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          packages_ = null;
        }
        return packagesBuilder_;
      }

      private long seqnum_ ;
      /**
       * <code>required int64 seqnum = 3;</code>
       */
      public boolean hasSeqnum() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int64 seqnum = 3;</code>
       */
      public long getSeqnum() {
        return seqnum_;
      }
      /**
       * <code>required int64 seqnum = 3;</code>
       */
      public Builder setSeqnum(long value) {
        bitField0_ |= 0x00000004;
        seqnum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 seqnum = 3;</code>
       */
      public Builder clearSeqnum() {
        bitField0_ = (bitField0_ & ~0x00000004);
        seqnum_ = 0L;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:UGoDeliver)
    }

    // @@protoc_insertion_point(class_scope:UGoDeliver)
    private static final WorldUps.UGoDeliver DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new WorldUps.UGoDeliver();
    }

    public static WorldUps.UGoDeliver getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<UGoDeliver>
        PARSER = new com.google.protobuf.AbstractParser<UGoDeliver>() {
      @java.lang.Override
      public UGoDeliver parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UGoDeliver(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UGoDeliver> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UGoDeliver> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public WorldUps.UGoDeliver getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UErrOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UErr)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string err = 1;</code>
     */
    boolean hasErr();
    /**
     * <code>required string err = 1;</code>
     */
    java.lang.String getErr();
    /**
     * <code>required string err = 1;</code>
     */
    com.google.protobuf.ByteString
        getErrBytes();

    /**
     * <code>required int64 originseqnum = 2;</code>
     */
    boolean hasOriginseqnum();
    /**
     * <code>required int64 originseqnum = 2;</code>
     */
    long getOriginseqnum();

    /**
     * <code>required int64 seqnum = 3;</code>
     */
    boolean hasSeqnum();
    /**
     * <code>required int64 seqnum = 3;</code>
     */
    long getSeqnum();
  }
  /**
   * Protobuf type {@code UErr}
   */
  public  static final class UErr extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UErr)
      UErrOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UErr.newBuilder() to construct.
    private UErr(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UErr() {
      err_ = "";
      originseqnum_ = 0L;
      seqnum_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UErr(
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
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              err_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              originseqnum_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              seqnum_ = input.readInt64();
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
      return WorldUps.internal_static_UErr_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WorldUps.internal_static_UErr_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WorldUps.UErr.class, WorldUps.UErr.Builder.class);
    }

    private int bitField0_;
    public static final int ERR_FIELD_NUMBER = 1;
    private volatile java.lang.Object err_;
    /**
     * <code>required string err = 1;</code>
     */
    public boolean hasErr() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string err = 1;</code>
     */
    public java.lang.String getErr() {
      java.lang.Object ref = err_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          err_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string err = 1;</code>
     */
    public com.google.protobuf.ByteString
        getErrBytes() {
      java.lang.Object ref = err_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        err_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ORIGINSEQNUM_FIELD_NUMBER = 2;
    private long originseqnum_;
    /**
     * <code>required int64 originseqnum = 2;</code>
     */
    public boolean hasOriginseqnum() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 originseqnum = 2;</code>
     */
    public long getOriginseqnum() {
      return originseqnum_;
    }

    public static final int SEQNUM_FIELD_NUMBER = 3;
    private long seqnum_;
    /**
     * <code>required int64 seqnum = 3;</code>
     */
    public boolean hasSeqnum() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int64 seqnum = 3;</code>
     */
    public long getSeqnum() {
      return seqnum_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasErr()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOriginseqnum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSeqnum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, err_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, originseqnum_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, seqnum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, err_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, originseqnum_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, seqnum_);
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
      if (!(obj instanceof WorldUps.UErr)) {
        return super.equals(obj);
      }
      WorldUps.UErr other = (WorldUps.UErr) obj;

      boolean result = true;
      result = result && (hasErr() == other.hasErr());
      if (hasErr()) {
        result = result && getErr()
            .equals(other.getErr());
      }
      result = result && (hasOriginseqnum() == other.hasOriginseqnum());
      if (hasOriginseqnum()) {
        result = result && (getOriginseqnum()
            == other.getOriginseqnum());
      }
      result = result && (hasSeqnum() == other.hasSeqnum());
      if (hasSeqnum()) {
        result = result && (getSeqnum()
            == other.getSeqnum());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasErr()) {
        hash = (37 * hash) + ERR_FIELD_NUMBER;
        hash = (53 * hash) + getErr().hashCode();
      }
      if (hasOriginseqnum()) {
        hash = (37 * hash) + ORIGINSEQNUM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getOriginseqnum());
      }
      if (hasSeqnum()) {
        hash = (37 * hash) + SEQNUM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSeqnum());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static WorldUps.UErr parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UErr parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UErr parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UErr parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UErr parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UErr parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UErr parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UErr parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UErr parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static WorldUps.UErr parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UErr parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UErr parseFrom(
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
    public static Builder newBuilder(WorldUps.UErr prototype) {
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
     * Protobuf type {@code UErr}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UErr)
        WorldUps.UErrOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WorldUps.internal_static_UErr_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WorldUps.internal_static_UErr_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                WorldUps.UErr.class, WorldUps.UErr.Builder.class);
      }

      // Construct using WorldUps.UErr.newBuilder()
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
        err_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        originseqnum_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        seqnum_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WorldUps.internal_static_UErr_descriptor;
      }

      @java.lang.Override
      public WorldUps.UErr getDefaultInstanceForType() {
        return WorldUps.UErr.getDefaultInstance();
      }

      @java.lang.Override
      public WorldUps.UErr build() {
        WorldUps.UErr result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public WorldUps.UErr buildPartial() {
        WorldUps.UErr result = new WorldUps.UErr(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.err_ = err_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.originseqnum_ = originseqnum_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.seqnum_ = seqnum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof WorldUps.UErr) {
          return mergeFrom((WorldUps.UErr)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(WorldUps.UErr other) {
        if (other == WorldUps.UErr.getDefaultInstance()) return this;
        if (other.hasErr()) {
          bitField0_ |= 0x00000001;
          err_ = other.err_;
          onChanged();
        }
        if (other.hasOriginseqnum()) {
          setOriginseqnum(other.getOriginseqnum());
        }
        if (other.hasSeqnum()) {
          setSeqnum(other.getSeqnum());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasErr()) {
          return false;
        }
        if (!hasOriginseqnum()) {
          return false;
        }
        if (!hasSeqnum()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        WorldUps.UErr parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (WorldUps.UErr) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object err_ = "";
      /**
       * <code>required string err = 1;</code>
       */
      public boolean hasErr() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string err = 1;</code>
       */
      public java.lang.String getErr() {
        java.lang.Object ref = err_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            err_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string err = 1;</code>
       */
      public com.google.protobuf.ByteString
          getErrBytes() {
        java.lang.Object ref = err_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          err_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string err = 1;</code>
       */
      public Builder setErr(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        err_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string err = 1;</code>
       */
      public Builder clearErr() {
        bitField0_ = (bitField0_ & ~0x00000001);
        err_ = getDefaultInstance().getErr();
        onChanged();
        return this;
      }
      /**
       * <code>required string err = 1;</code>
       */
      public Builder setErrBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        err_ = value;
        onChanged();
        return this;
      }

      private long originseqnum_ ;
      /**
       * <code>required int64 originseqnum = 2;</code>
       */
      public boolean hasOriginseqnum() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 originseqnum = 2;</code>
       */
      public long getOriginseqnum() {
        return originseqnum_;
      }
      /**
       * <code>required int64 originseqnum = 2;</code>
       */
      public Builder setOriginseqnum(long value) {
        bitField0_ |= 0x00000002;
        originseqnum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 originseqnum = 2;</code>
       */
      public Builder clearOriginseqnum() {
        bitField0_ = (bitField0_ & ~0x00000002);
        originseqnum_ = 0L;
        onChanged();
        return this;
      }

      private long seqnum_ ;
      /**
       * <code>required int64 seqnum = 3;</code>
       */
      public boolean hasSeqnum() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int64 seqnum = 3;</code>
       */
      public long getSeqnum() {
        return seqnum_;
      }
      /**
       * <code>required int64 seqnum = 3;</code>
       */
      public Builder setSeqnum(long value) {
        bitField0_ |= 0x00000004;
        seqnum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 seqnum = 3;</code>
       */
      public Builder clearSeqnum() {
        bitField0_ = (bitField0_ & ~0x00000004);
        seqnum_ = 0L;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:UErr)
    }

    // @@protoc_insertion_point(class_scope:UErr)
    private static final WorldUps.UErr DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new WorldUps.UErr();
    }

    public static WorldUps.UErr getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<UErr>
        PARSER = new com.google.protobuf.AbstractParser<UErr>() {
      @java.lang.Override
      public UErr parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UErr(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UErr> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UErr> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public WorldUps.UErr getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UQueryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UQuery)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 truckid = 1;</code>
     */
    boolean hasTruckid();
    /**
     * <code>required int32 truckid = 1;</code>
     */
    int getTruckid();

    /**
     * <code>required int64 seqnum = 2;</code>
     */
    boolean hasSeqnum();
    /**
     * <code>required int64 seqnum = 2;</code>
     */
    long getSeqnum();
  }
  /**
   * Protobuf type {@code UQuery}
   */
  public  static final class UQuery extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UQuery)
      UQueryOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UQuery.newBuilder() to construct.
    private UQuery(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UQuery() {
      truckid_ = 0;
      seqnum_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UQuery(
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
              bitField0_ |= 0x00000001;
              truckid_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              seqnum_ = input.readInt64();
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
      return WorldUps.internal_static_UQuery_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WorldUps.internal_static_UQuery_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WorldUps.UQuery.class, WorldUps.UQuery.Builder.class);
    }

    private int bitField0_;
    public static final int TRUCKID_FIELD_NUMBER = 1;
    private int truckid_;
    /**
     * <code>required int32 truckid = 1;</code>
     */
    public boolean hasTruckid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 truckid = 1;</code>
     */
    public int getTruckid() {
      return truckid_;
    }

    public static final int SEQNUM_FIELD_NUMBER = 2;
    private long seqnum_;
    /**
     * <code>required int64 seqnum = 2;</code>
     */
    public boolean hasSeqnum() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 seqnum = 2;</code>
     */
    public long getSeqnum() {
      return seqnum_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTruckid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSeqnum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, truckid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, seqnum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, truckid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, seqnum_);
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
      if (!(obj instanceof WorldUps.UQuery)) {
        return super.equals(obj);
      }
      WorldUps.UQuery other = (WorldUps.UQuery) obj;

      boolean result = true;
      result = result && (hasTruckid() == other.hasTruckid());
      if (hasTruckid()) {
        result = result && (getTruckid()
            == other.getTruckid());
      }
      result = result && (hasSeqnum() == other.hasSeqnum());
      if (hasSeqnum()) {
        result = result && (getSeqnum()
            == other.getSeqnum());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTruckid()) {
        hash = (37 * hash) + TRUCKID_FIELD_NUMBER;
        hash = (53 * hash) + getTruckid();
      }
      if (hasSeqnum()) {
        hash = (37 * hash) + SEQNUM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSeqnum());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static WorldUps.UQuery parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UQuery parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UQuery parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UQuery parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UQuery parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UQuery parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UQuery parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UQuery parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UQuery parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static WorldUps.UQuery parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UQuery parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UQuery parseFrom(
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
    public static Builder newBuilder(WorldUps.UQuery prototype) {
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
     * Protobuf type {@code UQuery}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UQuery)
        WorldUps.UQueryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WorldUps.internal_static_UQuery_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WorldUps.internal_static_UQuery_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                WorldUps.UQuery.class, WorldUps.UQuery.Builder.class);
      }

      // Construct using WorldUps.UQuery.newBuilder()
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
        truckid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        seqnum_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WorldUps.internal_static_UQuery_descriptor;
      }

      @java.lang.Override
      public WorldUps.UQuery getDefaultInstanceForType() {
        return WorldUps.UQuery.getDefaultInstance();
      }

      @java.lang.Override
      public WorldUps.UQuery build() {
        WorldUps.UQuery result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public WorldUps.UQuery buildPartial() {
        WorldUps.UQuery result = new WorldUps.UQuery(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.truckid_ = truckid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.seqnum_ = seqnum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof WorldUps.UQuery) {
          return mergeFrom((WorldUps.UQuery)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(WorldUps.UQuery other) {
        if (other == WorldUps.UQuery.getDefaultInstance()) return this;
        if (other.hasTruckid()) {
          setTruckid(other.getTruckid());
        }
        if (other.hasSeqnum()) {
          setSeqnum(other.getSeqnum());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasTruckid()) {
          return false;
        }
        if (!hasSeqnum()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        WorldUps.UQuery parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (WorldUps.UQuery) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int truckid_ ;
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public boolean hasTruckid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public int getTruckid() {
        return truckid_;
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public Builder setTruckid(int value) {
        bitField0_ |= 0x00000001;
        truckid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public Builder clearTruckid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        truckid_ = 0;
        onChanged();
        return this;
      }

      private long seqnum_ ;
      /**
       * <code>required int64 seqnum = 2;</code>
       */
      public boolean hasSeqnum() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 seqnum = 2;</code>
       */
      public long getSeqnum() {
        return seqnum_;
      }
      /**
       * <code>required int64 seqnum = 2;</code>
       */
      public Builder setSeqnum(long value) {
        bitField0_ |= 0x00000002;
        seqnum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 seqnum = 2;</code>
       */
      public Builder clearSeqnum() {
        bitField0_ = (bitField0_ & ~0x00000002);
        seqnum_ = 0L;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:UQuery)
    }

    // @@protoc_insertion_point(class_scope:UQuery)
    private static final WorldUps.UQuery DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new WorldUps.UQuery();
    }

    public static WorldUps.UQuery getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<UQuery>
        PARSER = new com.google.protobuf.AbstractParser<UQuery>() {
      @java.lang.Override
      public UQuery parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UQuery(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UQuery> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UQuery> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public WorldUps.UQuery getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UTruckOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UTruck)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 truckid = 1;</code>
     */
    boolean hasTruckid();
    /**
     * <code>required int32 truckid = 1;</code>
     */
    int getTruckid();

    /**
     * <code>required string status = 2;</code>
     */
    boolean hasStatus();
    /**
     * <code>required string status = 2;</code>
     */
    java.lang.String getStatus();
    /**
     * <code>required string status = 2;</code>
     */
    com.google.protobuf.ByteString
        getStatusBytes();

    /**
     * <code>required int32 x = 3;</code>
     */
    boolean hasX();
    /**
     * <code>required int32 x = 3;</code>
     */
    int getX();

    /**
     * <code>required int32 y = 4;</code>
     */
    boolean hasY();
    /**
     * <code>required int32 y = 4;</code>
     */
    int getY();

    /**
     * <code>required int64 seqnum = 5;</code>
     */
    boolean hasSeqnum();
    /**
     * <code>required int64 seqnum = 5;</code>
     */
    long getSeqnum();
  }
  /**
   * Protobuf type {@code UTruck}
   */
  public  static final class UTruck extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UTruck)
      UTruckOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UTruck.newBuilder() to construct.
    private UTruck(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UTruck() {
      truckid_ = 0;
      status_ = "";
      x_ = 0;
      y_ = 0;
      seqnum_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UTruck(
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
              bitField0_ |= 0x00000001;
              truckid_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              status_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              x_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              y_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              seqnum_ = input.readInt64();
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
      return WorldUps.internal_static_UTruck_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WorldUps.internal_static_UTruck_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WorldUps.UTruck.class, WorldUps.UTruck.Builder.class);
    }

    private int bitField0_;
    public static final int TRUCKID_FIELD_NUMBER = 1;
    private int truckid_;
    /**
     * <code>required int32 truckid = 1;</code>
     */
    public boolean hasTruckid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 truckid = 1;</code>
     */
    public int getTruckid() {
      return truckid_;
    }

    public static final int STATUS_FIELD_NUMBER = 2;
    private volatile java.lang.Object status_;
    /**
     * <code>required string status = 2;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string status = 2;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          status_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string status = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int X_FIELD_NUMBER = 3;
    private int x_;
    /**
     * <code>required int32 x = 3;</code>
     */
    public boolean hasX() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 x = 3;</code>
     */
    public int getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 4;
    private int y_;
    /**
     * <code>required int32 y = 4;</code>
     */
    public boolean hasY() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 y = 4;</code>
     */
    public int getY() {
      return y_;
    }

    public static final int SEQNUM_FIELD_NUMBER = 5;
    private long seqnum_;
    /**
     * <code>required int64 seqnum = 5;</code>
     */
    public boolean hasSeqnum() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int64 seqnum = 5;</code>
     */
    public long getSeqnum() {
      return seqnum_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTruckid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStatus()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasX()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasY()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSeqnum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, truckid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, status_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, x_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, y_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, seqnum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, truckid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, status_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, x_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, y_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, seqnum_);
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
      if (!(obj instanceof WorldUps.UTruck)) {
        return super.equals(obj);
      }
      WorldUps.UTruck other = (WorldUps.UTruck) obj;

      boolean result = true;
      result = result && (hasTruckid() == other.hasTruckid());
      if (hasTruckid()) {
        result = result && (getTruckid()
            == other.getTruckid());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus()
            .equals(other.getStatus());
      }
      result = result && (hasX() == other.hasX());
      if (hasX()) {
        result = result && (getX()
            == other.getX());
      }
      result = result && (hasY() == other.hasY());
      if (hasY()) {
        result = result && (getY()
            == other.getY());
      }
      result = result && (hasSeqnum() == other.hasSeqnum());
      if (hasSeqnum()) {
        result = result && (getSeqnum()
            == other.getSeqnum());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTruckid()) {
        hash = (37 * hash) + TRUCKID_FIELD_NUMBER;
        hash = (53 * hash) + getTruckid();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      if (hasX()) {
        hash = (37 * hash) + X_FIELD_NUMBER;
        hash = (53 * hash) + getX();
      }
      if (hasY()) {
        hash = (37 * hash) + Y_FIELD_NUMBER;
        hash = (53 * hash) + getY();
      }
      if (hasSeqnum()) {
        hash = (37 * hash) + SEQNUM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSeqnum());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static WorldUps.UTruck parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UTruck parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UTruck parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UTruck parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UTruck parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UTruck parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UTruck parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UTruck parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UTruck parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static WorldUps.UTruck parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UTruck parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UTruck parseFrom(
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
    public static Builder newBuilder(WorldUps.UTruck prototype) {
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
     * Protobuf type {@code UTruck}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UTruck)
        WorldUps.UTruckOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WorldUps.internal_static_UTruck_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WorldUps.internal_static_UTruck_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                WorldUps.UTruck.class, WorldUps.UTruck.Builder.class);
      }

      // Construct using WorldUps.UTruck.newBuilder()
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
        truckid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        x_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        y_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        seqnum_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WorldUps.internal_static_UTruck_descriptor;
      }

      @java.lang.Override
      public WorldUps.UTruck getDefaultInstanceForType() {
        return WorldUps.UTruck.getDefaultInstance();
      }

      @java.lang.Override
      public WorldUps.UTruck build() {
        WorldUps.UTruck result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public WorldUps.UTruck buildPartial() {
        WorldUps.UTruck result = new WorldUps.UTruck(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.truckid_ = truckid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.x_ = x_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.y_ = y_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.seqnum_ = seqnum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof WorldUps.UTruck) {
          return mergeFrom((WorldUps.UTruck)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(WorldUps.UTruck other) {
        if (other == WorldUps.UTruck.getDefaultInstance()) return this;
        if (other.hasTruckid()) {
          setTruckid(other.getTruckid());
        }
        if (other.hasStatus()) {
          bitField0_ |= 0x00000002;
          status_ = other.status_;
          onChanged();
        }
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        if (other.hasSeqnum()) {
          setSeqnum(other.getSeqnum());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasTruckid()) {
          return false;
        }
        if (!hasStatus()) {
          return false;
        }
        if (!hasX()) {
          return false;
        }
        if (!hasY()) {
          return false;
        }
        if (!hasSeqnum()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        WorldUps.UTruck parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (WorldUps.UTruck) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int truckid_ ;
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public boolean hasTruckid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public int getTruckid() {
        return truckid_;
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public Builder setTruckid(int value) {
        bitField0_ |= 0x00000001;
        truckid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 truckid = 1;</code>
       */
      public Builder clearTruckid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        truckid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object status_ = "";
      /**
       * <code>required string status = 2;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string status = 2;</code>
       */
      public java.lang.String getStatus() {
        java.lang.Object ref = status_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            status_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string status = 2;</code>
       */
      public com.google.protobuf.ByteString
          getStatusBytes() {
        java.lang.Object ref = status_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          status_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string status = 2;</code>
       */
      public Builder setStatus(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string status = 2;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000002);
        status_ = getDefaultInstance().getStatus();
        onChanged();
        return this;
      }
      /**
       * <code>required string status = 2;</code>
       */
      public Builder setStatusBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        status_ = value;
        onChanged();
        return this;
      }

      private int x_ ;
      /**
       * <code>required int32 x = 3;</code>
       */
      public boolean hasX() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 x = 3;</code>
       */
      public int getX() {
        return x_;
      }
      /**
       * <code>required int32 x = 3;</code>
       */
      public Builder setX(int value) {
        bitField0_ |= 0x00000004;
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 x = 3;</code>
       */
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000004);
        x_ = 0;
        onChanged();
        return this;
      }

      private int y_ ;
      /**
       * <code>required int32 y = 4;</code>
       */
      public boolean hasY() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 y = 4;</code>
       */
      public int getY() {
        return y_;
      }
      /**
       * <code>required int32 y = 4;</code>
       */
      public Builder setY(int value) {
        bitField0_ |= 0x00000008;
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 y = 4;</code>
       */
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000008);
        y_ = 0;
        onChanged();
        return this;
      }

      private long seqnum_ ;
      /**
       * <code>required int64 seqnum = 5;</code>
       */
      public boolean hasSeqnum() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required int64 seqnum = 5;</code>
       */
      public long getSeqnum() {
        return seqnum_;
      }
      /**
       * <code>required int64 seqnum = 5;</code>
       */
      public Builder setSeqnum(long value) {
        bitField0_ |= 0x00000010;
        seqnum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 seqnum = 5;</code>
       */
      public Builder clearSeqnum() {
        bitField0_ = (bitField0_ & ~0x00000010);
        seqnum_ = 0L;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:UTruck)
    }

    // @@protoc_insertion_point(class_scope:UTruck)
    private static final WorldUps.UTruck DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new WorldUps.UTruck();
    }

    public static WorldUps.UTruck getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<UTruck>
        PARSER = new com.google.protobuf.AbstractParser<UTruck>() {
      @java.lang.Override
      public UTruck parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UTruck(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UTruck> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UTruck> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public WorldUps.UTruck getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UCommandsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UCommands)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .UGoPickup pickups = 1;</code>
     */
    java.util.List<WorldUps.UGoPickup> 
        getPickupsList();
    /**
     * <code>repeated .UGoPickup pickups = 1;</code>
     */
    WorldUps.UGoPickup getPickups(int index);
    /**
     * <code>repeated .UGoPickup pickups = 1;</code>
     */
    int getPickupsCount();
    /**
     * <code>repeated .UGoPickup pickups = 1;</code>
     */
    java.util.List<? extends WorldUps.UGoPickupOrBuilder> 
        getPickupsOrBuilderList();
    /**
     * <code>repeated .UGoPickup pickups = 1;</code>
     */
    WorldUps.UGoPickupOrBuilder getPickupsOrBuilder(
        int index);

    /**
     * <code>repeated .UGoDeliver deliveries = 2;</code>
     */
    java.util.List<WorldUps.UGoDeliver> 
        getDeliveriesList();
    /**
     * <code>repeated .UGoDeliver deliveries = 2;</code>
     */
    WorldUps.UGoDeliver getDeliveries(int index);
    /**
     * <code>repeated .UGoDeliver deliveries = 2;</code>
     */
    int getDeliveriesCount();
    /**
     * <code>repeated .UGoDeliver deliveries = 2;</code>
     */
    java.util.List<? extends WorldUps.UGoDeliverOrBuilder> 
        getDeliveriesOrBuilderList();
    /**
     * <code>repeated .UGoDeliver deliveries = 2;</code>
     */
    WorldUps.UGoDeliverOrBuilder getDeliveriesOrBuilder(
        int index);

    /**
     * <code>optional uint32 simspeed = 3;</code>
     */
    boolean hasSimspeed();
    /**
     * <code>optional uint32 simspeed = 3;</code>
     */
    int getSimspeed();

    /**
     * <code>optional bool disconnect = 4;</code>
     */
    boolean hasDisconnect();
    /**
     * <code>optional bool disconnect = 4;</code>
     */
    boolean getDisconnect();

    /**
     * <code>repeated .UQuery queries = 5;</code>
     */
    java.util.List<WorldUps.UQuery> 
        getQueriesList();
    /**
     * <code>repeated .UQuery queries = 5;</code>
     */
    WorldUps.UQuery getQueries(int index);
    /**
     * <code>repeated .UQuery queries = 5;</code>
     */
    int getQueriesCount();
    /**
     * <code>repeated .UQuery queries = 5;</code>
     */
    java.util.List<? extends WorldUps.UQueryOrBuilder> 
        getQueriesOrBuilderList();
    /**
     * <code>repeated .UQuery queries = 5;</code>
     */
    WorldUps.UQueryOrBuilder getQueriesOrBuilder(
        int index);

    /**
     * <code>repeated int64 acks = 6;</code>
     */
    java.util.List<java.lang.Long> getAcksList();
    /**
     * <code>repeated int64 acks = 6;</code>
     */
    int getAcksCount();
    /**
     * <code>repeated int64 acks = 6;</code>
     */
    long getAcks(int index);
  }
  /**
   * Protobuf type {@code UCommands}
   */
  public  static final class UCommands extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UCommands)
      UCommandsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UCommands.newBuilder() to construct.
    private UCommands(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UCommands() {
      pickups_ = java.util.Collections.emptyList();
      deliveries_ = java.util.Collections.emptyList();
      simspeed_ = 0;
      disconnect_ = false;
      queries_ = java.util.Collections.emptyList();
      acks_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UCommands(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                pickups_ = new java.util.ArrayList<WorldUps.UGoPickup>();
                mutable_bitField0_ |= 0x00000001;
              }
              pickups_.add(
                  input.readMessage(WorldUps.UGoPickup.PARSER, extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                deliveries_ = new java.util.ArrayList<WorldUps.UGoDeliver>();
                mutable_bitField0_ |= 0x00000002;
              }
              deliveries_.add(
                  input.readMessage(WorldUps.UGoDeliver.PARSER, extensionRegistry));
              break;
            }
            case 24: {
              bitField0_ |= 0x00000001;
              simspeed_ = input.readUInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000002;
              disconnect_ = input.readBool();
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                queries_ = new java.util.ArrayList<WorldUps.UQuery>();
                mutable_bitField0_ |= 0x00000010;
              }
              queries_.add(
                  input.readMessage(WorldUps.UQuery.PARSER, extensionRegistry));
              break;
            }
            case 48: {
              if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                acks_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000020;
              }
              acks_.add(input.readInt64());
              break;
            }
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000020) == 0x00000020) && input.getBytesUntilLimit() > 0) {
                acks_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000020;
              }
              while (input.getBytesUntilLimit() > 0) {
                acks_.add(input.readInt64());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          pickups_ = java.util.Collections.unmodifiableList(pickups_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          deliveries_ = java.util.Collections.unmodifiableList(deliveries_);
        }
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          queries_ = java.util.Collections.unmodifiableList(queries_);
        }
        if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
          acks_ = java.util.Collections.unmodifiableList(acks_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return WorldUps.internal_static_UCommands_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WorldUps.internal_static_UCommands_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WorldUps.UCommands.class, WorldUps.UCommands.Builder.class);
    }

    private int bitField0_;
    public static final int PICKUPS_FIELD_NUMBER = 1;
    private java.util.List<WorldUps.UGoPickup> pickups_;
    /**
     * <code>repeated .UGoPickup pickups = 1;</code>
     */
    public java.util.List<WorldUps.UGoPickup> getPickupsList() {
      return pickups_;
    }
    /**
     * <code>repeated .UGoPickup pickups = 1;</code>
     */
    public java.util.List<? extends WorldUps.UGoPickupOrBuilder> 
        getPickupsOrBuilderList() {
      return pickups_;
    }
    /**
     * <code>repeated .UGoPickup pickups = 1;</code>
     */
    public int getPickupsCount() {
      return pickups_.size();
    }
    /**
     * <code>repeated .UGoPickup pickups = 1;</code>
     */
    public WorldUps.UGoPickup getPickups(int index) {
      return pickups_.get(index);
    }
    /**
     * <code>repeated .UGoPickup pickups = 1;</code>
     */
    public WorldUps.UGoPickupOrBuilder getPickupsOrBuilder(
        int index) {
      return pickups_.get(index);
    }

    public static final int DELIVERIES_FIELD_NUMBER = 2;
    private java.util.List<WorldUps.UGoDeliver> deliveries_;
    /**
     * <code>repeated .UGoDeliver deliveries = 2;</code>
     */
    public java.util.List<WorldUps.UGoDeliver> getDeliveriesList() {
      return deliveries_;
    }
    /**
     * <code>repeated .UGoDeliver deliveries = 2;</code>
     */
    public java.util.List<? extends WorldUps.UGoDeliverOrBuilder> 
        getDeliveriesOrBuilderList() {
      return deliveries_;
    }
    /**
     * <code>repeated .UGoDeliver deliveries = 2;</code>
     */
    public int getDeliveriesCount() {
      return deliveries_.size();
    }
    /**
     * <code>repeated .UGoDeliver deliveries = 2;</code>
     */
    public WorldUps.UGoDeliver getDeliveries(int index) {
      return deliveries_.get(index);
    }
    /**
     * <code>repeated .UGoDeliver deliveries = 2;</code>
     */
    public WorldUps.UGoDeliverOrBuilder getDeliveriesOrBuilder(
        int index) {
      return deliveries_.get(index);
    }

    public static final int SIMSPEED_FIELD_NUMBER = 3;
    private int simspeed_;
    /**
     * <code>optional uint32 simspeed = 3;</code>
     */
    public boolean hasSimspeed() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 simspeed = 3;</code>
     */
    public int getSimspeed() {
      return simspeed_;
    }

    public static final int DISCONNECT_FIELD_NUMBER = 4;
    private boolean disconnect_;
    /**
     * <code>optional bool disconnect = 4;</code>
     */
    public boolean hasDisconnect() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool disconnect = 4;</code>
     */
    public boolean getDisconnect() {
      return disconnect_;
    }

    public static final int QUERIES_FIELD_NUMBER = 5;
    private java.util.List<WorldUps.UQuery> queries_;
    /**
     * <code>repeated .UQuery queries = 5;</code>
     */
    public java.util.List<WorldUps.UQuery> getQueriesList() {
      return queries_;
    }
    /**
     * <code>repeated .UQuery queries = 5;</code>
     */
    public java.util.List<? extends WorldUps.UQueryOrBuilder> 
        getQueriesOrBuilderList() {
      return queries_;
    }
    /**
     * <code>repeated .UQuery queries = 5;</code>
     */
    public int getQueriesCount() {
      return queries_.size();
    }
    /**
     * <code>repeated .UQuery queries = 5;</code>
     */
    public WorldUps.UQuery getQueries(int index) {
      return queries_.get(index);
    }
    /**
     * <code>repeated .UQuery queries = 5;</code>
     */
    public WorldUps.UQueryOrBuilder getQueriesOrBuilder(
        int index) {
      return queries_.get(index);
    }

    public static final int ACKS_FIELD_NUMBER = 6;
    private java.util.List<java.lang.Long> acks_;
    /**
     * <code>repeated int64 acks = 6;</code>
     */
    public java.util.List<java.lang.Long>
        getAcksList() {
      return acks_;
    }
    /**
     * <code>repeated int64 acks = 6;</code>
     */
    public int getAcksCount() {
      return acks_.size();
    }
    /**
     * <code>repeated int64 acks = 6;</code>
     */
    public long getAcks(int index) {
      return acks_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getPickupsCount(); i++) {
        if (!getPickups(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getDeliveriesCount(); i++) {
        if (!getDeliveries(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getQueriesCount(); i++) {
        if (!getQueries(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < pickups_.size(); i++) {
        output.writeMessage(1, pickups_.get(i));
      }
      for (int i = 0; i < deliveries_.size(); i++) {
        output.writeMessage(2, deliveries_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(3, simspeed_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(4, disconnect_);
      }
      for (int i = 0; i < queries_.size(); i++) {
        output.writeMessage(5, queries_.get(i));
      }
      for (int i = 0; i < acks_.size(); i++) {
        output.writeInt64(6, acks_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < pickups_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, pickups_.get(i));
      }
      for (int i = 0; i < deliveries_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, deliveries_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, simspeed_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, disconnect_);
      }
      for (int i = 0; i < queries_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, queries_.get(i));
      }
      {
        int dataSize = 0;
        for (int i = 0; i < acks_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt64SizeNoTag(acks_.get(i));
        }
        size += dataSize;
        size += 1 * getAcksList().size();
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
      if (!(obj instanceof WorldUps.UCommands)) {
        return super.equals(obj);
      }
      WorldUps.UCommands other = (WorldUps.UCommands) obj;

      boolean result = true;
      result = result && getPickupsList()
          .equals(other.getPickupsList());
      result = result && getDeliveriesList()
          .equals(other.getDeliveriesList());
      result = result && (hasSimspeed() == other.hasSimspeed());
      if (hasSimspeed()) {
        result = result && (getSimspeed()
            == other.getSimspeed());
      }
      result = result && (hasDisconnect() == other.hasDisconnect());
      if (hasDisconnect()) {
        result = result && (getDisconnect()
            == other.getDisconnect());
      }
      result = result && getQueriesList()
          .equals(other.getQueriesList());
      result = result && getAcksList()
          .equals(other.getAcksList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getPickupsCount() > 0) {
        hash = (37 * hash) + PICKUPS_FIELD_NUMBER;
        hash = (53 * hash) + getPickupsList().hashCode();
      }
      if (getDeliveriesCount() > 0) {
        hash = (37 * hash) + DELIVERIES_FIELD_NUMBER;
        hash = (53 * hash) + getDeliveriesList().hashCode();
      }
      if (hasSimspeed()) {
        hash = (37 * hash) + SIMSPEED_FIELD_NUMBER;
        hash = (53 * hash) + getSimspeed();
      }
      if (hasDisconnect()) {
        hash = (37 * hash) + DISCONNECT_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getDisconnect());
      }
      if (getQueriesCount() > 0) {
        hash = (37 * hash) + QUERIES_FIELD_NUMBER;
        hash = (53 * hash) + getQueriesList().hashCode();
      }
      if (getAcksCount() > 0) {
        hash = (37 * hash) + ACKS_FIELD_NUMBER;
        hash = (53 * hash) + getAcksList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static WorldUps.UCommands parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UCommands parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UCommands parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UCommands parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UCommands parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UCommands parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UCommands parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UCommands parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UCommands parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static WorldUps.UCommands parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UCommands parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UCommands parseFrom(
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
    public static Builder newBuilder(WorldUps.UCommands prototype) {
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
     * Protobuf type {@code UCommands}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UCommands)
        WorldUps.UCommandsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WorldUps.internal_static_UCommands_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WorldUps.internal_static_UCommands_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                WorldUps.UCommands.class, WorldUps.UCommands.Builder.class);
      }

      // Construct using WorldUps.UCommands.newBuilder()
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
          getPickupsFieldBuilder();
          getDeliveriesFieldBuilder();
          getQueriesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (pickupsBuilder_ == null) {
          pickups_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          pickupsBuilder_.clear();
        }
        if (deliveriesBuilder_ == null) {
          deliveries_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          deliveriesBuilder_.clear();
        }
        simspeed_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        disconnect_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        if (queriesBuilder_ == null) {
          queries_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          queriesBuilder_.clear();
        }
        acks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WorldUps.internal_static_UCommands_descriptor;
      }

      @java.lang.Override
      public WorldUps.UCommands getDefaultInstanceForType() {
        return WorldUps.UCommands.getDefaultInstance();
      }

      @java.lang.Override
      public WorldUps.UCommands build() {
        WorldUps.UCommands result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public WorldUps.UCommands buildPartial() {
        WorldUps.UCommands result = new WorldUps.UCommands(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (pickupsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            pickups_ = java.util.Collections.unmodifiableList(pickups_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.pickups_ = pickups_;
        } else {
          result.pickups_ = pickupsBuilder_.build();
        }
        if (deliveriesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            deliveries_ = java.util.Collections.unmodifiableList(deliveries_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.deliveries_ = deliveries_;
        } else {
          result.deliveries_ = deliveriesBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000001;
        }
        result.simspeed_ = simspeed_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000002;
        }
        result.disconnect_ = disconnect_;
        if (queriesBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)) {
            queries_ = java.util.Collections.unmodifiableList(queries_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.queries_ = queries_;
        } else {
          result.queries_ = queriesBuilder_.build();
        }
        if (((bitField0_ & 0x00000020) == 0x00000020)) {
          acks_ = java.util.Collections.unmodifiableList(acks_);
          bitField0_ = (bitField0_ & ~0x00000020);
        }
        result.acks_ = acks_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof WorldUps.UCommands) {
          return mergeFrom((WorldUps.UCommands)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(WorldUps.UCommands other) {
        if (other == WorldUps.UCommands.getDefaultInstance()) return this;
        if (pickupsBuilder_ == null) {
          if (!other.pickups_.isEmpty()) {
            if (pickups_.isEmpty()) {
              pickups_ = other.pickups_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePickupsIsMutable();
              pickups_.addAll(other.pickups_);
            }
            onChanged();
          }
        } else {
          if (!other.pickups_.isEmpty()) {
            if (pickupsBuilder_.isEmpty()) {
              pickupsBuilder_.dispose();
              pickupsBuilder_ = null;
              pickups_ = other.pickups_;
              bitField0_ = (bitField0_ & ~0x00000001);
              pickupsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPickupsFieldBuilder() : null;
            } else {
              pickupsBuilder_.addAllMessages(other.pickups_);
            }
          }
        }
        if (deliveriesBuilder_ == null) {
          if (!other.deliveries_.isEmpty()) {
            if (deliveries_.isEmpty()) {
              deliveries_ = other.deliveries_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureDeliveriesIsMutable();
              deliveries_.addAll(other.deliveries_);
            }
            onChanged();
          }
        } else {
          if (!other.deliveries_.isEmpty()) {
            if (deliveriesBuilder_.isEmpty()) {
              deliveriesBuilder_.dispose();
              deliveriesBuilder_ = null;
              deliveries_ = other.deliveries_;
              bitField0_ = (bitField0_ & ~0x00000002);
              deliveriesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDeliveriesFieldBuilder() : null;
            } else {
              deliveriesBuilder_.addAllMessages(other.deliveries_);
            }
          }
        }
        if (other.hasSimspeed()) {
          setSimspeed(other.getSimspeed());
        }
        if (other.hasDisconnect()) {
          setDisconnect(other.getDisconnect());
        }
        if (queriesBuilder_ == null) {
          if (!other.queries_.isEmpty()) {
            if (queries_.isEmpty()) {
              queries_ = other.queries_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureQueriesIsMutable();
              queries_.addAll(other.queries_);
            }
            onChanged();
          }
        } else {
          if (!other.queries_.isEmpty()) {
            if (queriesBuilder_.isEmpty()) {
              queriesBuilder_.dispose();
              queriesBuilder_ = null;
              queries_ = other.queries_;
              bitField0_ = (bitField0_ & ~0x00000010);
              queriesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getQueriesFieldBuilder() : null;
            } else {
              queriesBuilder_.addAllMessages(other.queries_);
            }
          }
        }
        if (!other.acks_.isEmpty()) {
          if (acks_.isEmpty()) {
            acks_ = other.acks_;
            bitField0_ = (bitField0_ & ~0x00000020);
          } else {
            ensureAcksIsMutable();
            acks_.addAll(other.acks_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getPickupsCount(); i++) {
          if (!getPickups(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getDeliveriesCount(); i++) {
          if (!getDeliveries(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getQueriesCount(); i++) {
          if (!getQueries(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        WorldUps.UCommands parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (WorldUps.UCommands) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<WorldUps.UGoPickup> pickups_ =
        java.util.Collections.emptyList();
      private void ensurePickupsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          pickups_ = new java.util.ArrayList<WorldUps.UGoPickup>(pickups_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UGoPickup, WorldUps.UGoPickup.Builder, WorldUps.UGoPickupOrBuilder> pickupsBuilder_;

      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public java.util.List<WorldUps.UGoPickup> getPickupsList() {
        if (pickupsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(pickups_);
        } else {
          return pickupsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public int getPickupsCount() {
        if (pickupsBuilder_ == null) {
          return pickups_.size();
        } else {
          return pickupsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public WorldUps.UGoPickup getPickups(int index) {
        if (pickupsBuilder_ == null) {
          return pickups_.get(index);
        } else {
          return pickupsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public Builder setPickups(
          int index, WorldUps.UGoPickup value) {
        if (pickupsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePickupsIsMutable();
          pickups_.set(index, value);
          onChanged();
        } else {
          pickupsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public Builder setPickups(
          int index, WorldUps.UGoPickup.Builder builderForValue) {
        if (pickupsBuilder_ == null) {
          ensurePickupsIsMutable();
          pickups_.set(index, builderForValue.build());
          onChanged();
        } else {
          pickupsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public Builder addPickups(WorldUps.UGoPickup value) {
        if (pickupsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePickupsIsMutable();
          pickups_.add(value);
          onChanged();
        } else {
          pickupsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public Builder addPickups(
          int index, WorldUps.UGoPickup value) {
        if (pickupsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePickupsIsMutable();
          pickups_.add(index, value);
          onChanged();
        } else {
          pickupsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public Builder addPickups(
          WorldUps.UGoPickup.Builder builderForValue) {
        if (pickupsBuilder_ == null) {
          ensurePickupsIsMutable();
          pickups_.add(builderForValue.build());
          onChanged();
        } else {
          pickupsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public Builder addPickups(
          int index, WorldUps.UGoPickup.Builder builderForValue) {
        if (pickupsBuilder_ == null) {
          ensurePickupsIsMutable();
          pickups_.add(index, builderForValue.build());
          onChanged();
        } else {
          pickupsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public Builder addAllPickups(
          java.lang.Iterable<? extends WorldUps.UGoPickup> values) {
        if (pickupsBuilder_ == null) {
          ensurePickupsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, pickups_);
          onChanged();
        } else {
          pickupsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public Builder clearPickups() {
        if (pickupsBuilder_ == null) {
          pickups_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          pickupsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public Builder removePickups(int index) {
        if (pickupsBuilder_ == null) {
          ensurePickupsIsMutable();
          pickups_.remove(index);
          onChanged();
        } else {
          pickupsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public WorldUps.UGoPickup.Builder getPickupsBuilder(
          int index) {
        return getPickupsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public WorldUps.UGoPickupOrBuilder getPickupsOrBuilder(
          int index) {
        if (pickupsBuilder_ == null) {
          return pickups_.get(index);  } else {
          return pickupsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public java.util.List<? extends WorldUps.UGoPickupOrBuilder> 
           getPickupsOrBuilderList() {
        if (pickupsBuilder_ != null) {
          return pickupsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(pickups_);
        }
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public WorldUps.UGoPickup.Builder addPickupsBuilder() {
        return getPickupsFieldBuilder().addBuilder(
            WorldUps.UGoPickup.getDefaultInstance());
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public WorldUps.UGoPickup.Builder addPickupsBuilder(
          int index) {
        return getPickupsFieldBuilder().addBuilder(
            index, WorldUps.UGoPickup.getDefaultInstance());
      }
      /**
       * <code>repeated .UGoPickup pickups = 1;</code>
       */
      public java.util.List<WorldUps.UGoPickup.Builder> 
           getPickupsBuilderList() {
        return getPickupsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UGoPickup, WorldUps.UGoPickup.Builder, WorldUps.UGoPickupOrBuilder> 
          getPickupsFieldBuilder() {
        if (pickupsBuilder_ == null) {
          pickupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              WorldUps.UGoPickup, WorldUps.UGoPickup.Builder, WorldUps.UGoPickupOrBuilder>(
                  pickups_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          pickups_ = null;
        }
        return pickupsBuilder_;
      }

      private java.util.List<WorldUps.UGoDeliver> deliveries_ =
        java.util.Collections.emptyList();
      private void ensureDeliveriesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          deliveries_ = new java.util.ArrayList<WorldUps.UGoDeliver>(deliveries_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UGoDeliver, WorldUps.UGoDeliver.Builder, WorldUps.UGoDeliverOrBuilder> deliveriesBuilder_;

      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public java.util.List<WorldUps.UGoDeliver> getDeliveriesList() {
        if (deliveriesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(deliveries_);
        } else {
          return deliveriesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public int getDeliveriesCount() {
        if (deliveriesBuilder_ == null) {
          return deliveries_.size();
        } else {
          return deliveriesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public WorldUps.UGoDeliver getDeliveries(int index) {
        if (deliveriesBuilder_ == null) {
          return deliveries_.get(index);
        } else {
          return deliveriesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public Builder setDeliveries(
          int index, WorldUps.UGoDeliver value) {
        if (deliveriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeliveriesIsMutable();
          deliveries_.set(index, value);
          onChanged();
        } else {
          deliveriesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public Builder setDeliveries(
          int index, WorldUps.UGoDeliver.Builder builderForValue) {
        if (deliveriesBuilder_ == null) {
          ensureDeliveriesIsMutable();
          deliveries_.set(index, builderForValue.build());
          onChanged();
        } else {
          deliveriesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public Builder addDeliveries(WorldUps.UGoDeliver value) {
        if (deliveriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeliveriesIsMutable();
          deliveries_.add(value);
          onChanged();
        } else {
          deliveriesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public Builder addDeliveries(
          int index, WorldUps.UGoDeliver value) {
        if (deliveriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeliveriesIsMutable();
          deliveries_.add(index, value);
          onChanged();
        } else {
          deliveriesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public Builder addDeliveries(
          WorldUps.UGoDeliver.Builder builderForValue) {
        if (deliveriesBuilder_ == null) {
          ensureDeliveriesIsMutable();
          deliveries_.add(builderForValue.build());
          onChanged();
        } else {
          deliveriesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public Builder addDeliveries(
          int index, WorldUps.UGoDeliver.Builder builderForValue) {
        if (deliveriesBuilder_ == null) {
          ensureDeliveriesIsMutable();
          deliveries_.add(index, builderForValue.build());
          onChanged();
        } else {
          deliveriesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public Builder addAllDeliveries(
          java.lang.Iterable<? extends WorldUps.UGoDeliver> values) {
        if (deliveriesBuilder_ == null) {
          ensureDeliveriesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, deliveries_);
          onChanged();
        } else {
          deliveriesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public Builder clearDeliveries() {
        if (deliveriesBuilder_ == null) {
          deliveries_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          deliveriesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public Builder removeDeliveries(int index) {
        if (deliveriesBuilder_ == null) {
          ensureDeliveriesIsMutable();
          deliveries_.remove(index);
          onChanged();
        } else {
          deliveriesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public WorldUps.UGoDeliver.Builder getDeliveriesBuilder(
          int index) {
        return getDeliveriesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public WorldUps.UGoDeliverOrBuilder getDeliveriesOrBuilder(
          int index) {
        if (deliveriesBuilder_ == null) {
          return deliveries_.get(index);  } else {
          return deliveriesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public java.util.List<? extends WorldUps.UGoDeliverOrBuilder> 
           getDeliveriesOrBuilderList() {
        if (deliveriesBuilder_ != null) {
          return deliveriesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(deliveries_);
        }
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public WorldUps.UGoDeliver.Builder addDeliveriesBuilder() {
        return getDeliveriesFieldBuilder().addBuilder(
            WorldUps.UGoDeliver.getDefaultInstance());
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public WorldUps.UGoDeliver.Builder addDeliveriesBuilder(
          int index) {
        return getDeliveriesFieldBuilder().addBuilder(
            index, WorldUps.UGoDeliver.getDefaultInstance());
      }
      /**
       * <code>repeated .UGoDeliver deliveries = 2;</code>
       */
      public java.util.List<WorldUps.UGoDeliver.Builder> 
           getDeliveriesBuilderList() {
        return getDeliveriesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UGoDeliver, WorldUps.UGoDeliver.Builder, WorldUps.UGoDeliverOrBuilder> 
          getDeliveriesFieldBuilder() {
        if (deliveriesBuilder_ == null) {
          deliveriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              WorldUps.UGoDeliver, WorldUps.UGoDeliver.Builder, WorldUps.UGoDeliverOrBuilder>(
                  deliveries_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          deliveries_ = null;
        }
        return deliveriesBuilder_;
      }

      private int simspeed_ ;
      /**
       * <code>optional uint32 simspeed = 3;</code>
       */
      public boolean hasSimspeed() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint32 simspeed = 3;</code>
       */
      public int getSimspeed() {
        return simspeed_;
      }
      /**
       * <code>optional uint32 simspeed = 3;</code>
       */
      public Builder setSimspeed(int value) {
        bitField0_ |= 0x00000004;
        simspeed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 simspeed = 3;</code>
       */
      public Builder clearSimspeed() {
        bitField0_ = (bitField0_ & ~0x00000004);
        simspeed_ = 0;
        onChanged();
        return this;
      }

      private boolean disconnect_ ;
      /**
       * <code>optional bool disconnect = 4;</code>
       */
      public boolean hasDisconnect() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional bool disconnect = 4;</code>
       */
      public boolean getDisconnect() {
        return disconnect_;
      }
      /**
       * <code>optional bool disconnect = 4;</code>
       */
      public Builder setDisconnect(boolean value) {
        bitField0_ |= 0x00000008;
        disconnect_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool disconnect = 4;</code>
       */
      public Builder clearDisconnect() {
        bitField0_ = (bitField0_ & ~0x00000008);
        disconnect_ = false;
        onChanged();
        return this;
      }

      private java.util.List<WorldUps.UQuery> queries_ =
        java.util.Collections.emptyList();
      private void ensureQueriesIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          queries_ = new java.util.ArrayList<WorldUps.UQuery>(queries_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UQuery, WorldUps.UQuery.Builder, WorldUps.UQueryOrBuilder> queriesBuilder_;

      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public java.util.List<WorldUps.UQuery> getQueriesList() {
        if (queriesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(queries_);
        } else {
          return queriesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public int getQueriesCount() {
        if (queriesBuilder_ == null) {
          return queries_.size();
        } else {
          return queriesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public WorldUps.UQuery getQueries(int index) {
        if (queriesBuilder_ == null) {
          return queries_.get(index);
        } else {
          return queriesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public Builder setQueries(
          int index, WorldUps.UQuery value) {
        if (queriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureQueriesIsMutable();
          queries_.set(index, value);
          onChanged();
        } else {
          queriesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public Builder setQueries(
          int index, WorldUps.UQuery.Builder builderForValue) {
        if (queriesBuilder_ == null) {
          ensureQueriesIsMutable();
          queries_.set(index, builderForValue.build());
          onChanged();
        } else {
          queriesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public Builder addQueries(WorldUps.UQuery value) {
        if (queriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureQueriesIsMutable();
          queries_.add(value);
          onChanged();
        } else {
          queriesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public Builder addQueries(
          int index, WorldUps.UQuery value) {
        if (queriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureQueriesIsMutable();
          queries_.add(index, value);
          onChanged();
        } else {
          queriesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public Builder addQueries(
          WorldUps.UQuery.Builder builderForValue) {
        if (queriesBuilder_ == null) {
          ensureQueriesIsMutable();
          queries_.add(builderForValue.build());
          onChanged();
        } else {
          queriesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public Builder addQueries(
          int index, WorldUps.UQuery.Builder builderForValue) {
        if (queriesBuilder_ == null) {
          ensureQueriesIsMutable();
          queries_.add(index, builderForValue.build());
          onChanged();
        } else {
          queriesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public Builder addAllQueries(
          java.lang.Iterable<? extends WorldUps.UQuery> values) {
        if (queriesBuilder_ == null) {
          ensureQueriesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, queries_);
          onChanged();
        } else {
          queriesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public Builder clearQueries() {
        if (queriesBuilder_ == null) {
          queries_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          queriesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public Builder removeQueries(int index) {
        if (queriesBuilder_ == null) {
          ensureQueriesIsMutable();
          queries_.remove(index);
          onChanged();
        } else {
          queriesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public WorldUps.UQuery.Builder getQueriesBuilder(
          int index) {
        return getQueriesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public WorldUps.UQueryOrBuilder getQueriesOrBuilder(
          int index) {
        if (queriesBuilder_ == null) {
          return queries_.get(index);  } else {
          return queriesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public java.util.List<? extends WorldUps.UQueryOrBuilder> 
           getQueriesOrBuilderList() {
        if (queriesBuilder_ != null) {
          return queriesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(queries_);
        }
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public WorldUps.UQuery.Builder addQueriesBuilder() {
        return getQueriesFieldBuilder().addBuilder(
            WorldUps.UQuery.getDefaultInstance());
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public WorldUps.UQuery.Builder addQueriesBuilder(
          int index) {
        return getQueriesFieldBuilder().addBuilder(
            index, WorldUps.UQuery.getDefaultInstance());
      }
      /**
       * <code>repeated .UQuery queries = 5;</code>
       */
      public java.util.List<WorldUps.UQuery.Builder> 
           getQueriesBuilderList() {
        return getQueriesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UQuery, WorldUps.UQuery.Builder, WorldUps.UQueryOrBuilder> 
          getQueriesFieldBuilder() {
        if (queriesBuilder_ == null) {
          queriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              WorldUps.UQuery, WorldUps.UQuery.Builder, WorldUps.UQueryOrBuilder>(
                  queries_,
                  ((bitField0_ & 0x00000010) == 0x00000010),
                  getParentForChildren(),
                  isClean());
          queries_ = null;
        }
        return queriesBuilder_;
      }

      private java.util.List<java.lang.Long> acks_ = java.util.Collections.emptyList();
      private void ensureAcksIsMutable() {
        if (!((bitField0_ & 0x00000020) == 0x00000020)) {
          acks_ = new java.util.ArrayList<java.lang.Long>(acks_);
          bitField0_ |= 0x00000020;
         }
      }
      /**
       * <code>repeated int64 acks = 6;</code>
       */
      public java.util.List<java.lang.Long>
          getAcksList() {
        return java.util.Collections.unmodifiableList(acks_);
      }
      /**
       * <code>repeated int64 acks = 6;</code>
       */
      public int getAcksCount() {
        return acks_.size();
      }
      /**
       * <code>repeated int64 acks = 6;</code>
       */
      public long getAcks(int index) {
        return acks_.get(index);
      }
      /**
       * <code>repeated int64 acks = 6;</code>
       */
      public Builder setAcks(
          int index, long value) {
        ensureAcksIsMutable();
        acks_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 acks = 6;</code>
       */
      public Builder addAcks(long value) {
        ensureAcksIsMutable();
        acks_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 acks = 6;</code>
       */
      public Builder addAllAcks(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureAcksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, acks_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 acks = 6;</code>
       */
      public Builder clearAcks() {
        acks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:UCommands)
    }

    // @@protoc_insertion_point(class_scope:UCommands)
    private static final WorldUps.UCommands DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new WorldUps.UCommands();
    }

    public static WorldUps.UCommands getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<UCommands>
        PARSER = new com.google.protobuf.AbstractParser<UCommands>() {
      @java.lang.Override
      public UCommands parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UCommands(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UCommands> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UCommands> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public WorldUps.UCommands getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UResponsesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UResponses)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .UFinished completions = 1;</code>
     */
    java.util.List<WorldUps.UFinished> 
        getCompletionsList();
    /**
     * <code>repeated .UFinished completions = 1;</code>
     */
    WorldUps.UFinished getCompletions(int index);
    /**
     * <code>repeated .UFinished completions = 1;</code>
     */
    int getCompletionsCount();
    /**
     * <code>repeated .UFinished completions = 1;</code>
     */
    java.util.List<? extends WorldUps.UFinishedOrBuilder> 
        getCompletionsOrBuilderList();
    /**
     * <code>repeated .UFinished completions = 1;</code>
     */
    WorldUps.UFinishedOrBuilder getCompletionsOrBuilder(
        int index);

    /**
     * <code>repeated .UDeliveryMade delivered = 2;</code>
     */
    java.util.List<WorldUps.UDeliveryMade> 
        getDeliveredList();
    /**
     * <code>repeated .UDeliveryMade delivered = 2;</code>
     */
    WorldUps.UDeliveryMade getDelivered(int index);
    /**
     * <code>repeated .UDeliveryMade delivered = 2;</code>
     */
    int getDeliveredCount();
    /**
     * <code>repeated .UDeliveryMade delivered = 2;</code>
     */
    java.util.List<? extends WorldUps.UDeliveryMadeOrBuilder> 
        getDeliveredOrBuilderList();
    /**
     * <code>repeated .UDeliveryMade delivered = 2;</code>
     */
    WorldUps.UDeliveryMadeOrBuilder getDeliveredOrBuilder(
        int index);

    /**
     * <code>optional bool finished = 3;</code>
     */
    boolean hasFinished();
    /**
     * <code>optional bool finished = 3;</code>
     */
    boolean getFinished();

    /**
     * <code>repeated int64 acks = 4;</code>
     */
    java.util.List<java.lang.Long> getAcksList();
    /**
     * <code>repeated int64 acks = 4;</code>
     */
    int getAcksCount();
    /**
     * <code>repeated int64 acks = 4;</code>
     */
    long getAcks(int index);

    /**
     * <code>repeated .UTruck truckstatus = 5;</code>
     */
    java.util.List<WorldUps.UTruck> 
        getTruckstatusList();
    /**
     * <code>repeated .UTruck truckstatus = 5;</code>
     */
    WorldUps.UTruck getTruckstatus(int index);
    /**
     * <code>repeated .UTruck truckstatus = 5;</code>
     */
    int getTruckstatusCount();
    /**
     * <code>repeated .UTruck truckstatus = 5;</code>
     */
    java.util.List<? extends WorldUps.UTruckOrBuilder> 
        getTruckstatusOrBuilderList();
    /**
     * <code>repeated .UTruck truckstatus = 5;</code>
     */
    WorldUps.UTruckOrBuilder getTruckstatusOrBuilder(
        int index);

    /**
     * <code>repeated .UErr error = 6;</code>
     */
    java.util.List<WorldUps.UErr> 
        getErrorList();
    /**
     * <code>repeated .UErr error = 6;</code>
     */
    WorldUps.UErr getError(int index);
    /**
     * <code>repeated .UErr error = 6;</code>
     */
    int getErrorCount();
    /**
     * <code>repeated .UErr error = 6;</code>
     */
    java.util.List<? extends WorldUps.UErrOrBuilder> 
        getErrorOrBuilderList();
    /**
     * <code>repeated .UErr error = 6;</code>
     */
    WorldUps.UErrOrBuilder getErrorOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code UResponses}
   */
  public  static final class UResponses extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UResponses)
      UResponsesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UResponses.newBuilder() to construct.
    private UResponses(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UResponses() {
      completions_ = java.util.Collections.emptyList();
      delivered_ = java.util.Collections.emptyList();
      finished_ = false;
      acks_ = java.util.Collections.emptyList();
      truckstatus_ = java.util.Collections.emptyList();
      error_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UResponses(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                completions_ = new java.util.ArrayList<WorldUps.UFinished>();
                mutable_bitField0_ |= 0x00000001;
              }
              completions_.add(
                  input.readMessage(WorldUps.UFinished.PARSER, extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                delivered_ = new java.util.ArrayList<WorldUps.UDeliveryMade>();
                mutable_bitField0_ |= 0x00000002;
              }
              delivered_.add(
                  input.readMessage(WorldUps.UDeliveryMade.PARSER, extensionRegistry));
              break;
            }
            case 24: {
              bitField0_ |= 0x00000001;
              finished_ = input.readBool();
              break;
            }
            case 32: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                acks_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000008;
              }
              acks_.add(input.readInt64());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008) && input.getBytesUntilLimit() > 0) {
                acks_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000008;
              }
              while (input.getBytesUntilLimit() > 0) {
                acks_.add(input.readInt64());
              }
              input.popLimit(limit);
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                truckstatus_ = new java.util.ArrayList<WorldUps.UTruck>();
                mutable_bitField0_ |= 0x00000010;
              }
              truckstatus_.add(
                  input.readMessage(WorldUps.UTruck.PARSER, extensionRegistry));
              break;
            }
            case 50: {
              if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                error_ = new java.util.ArrayList<WorldUps.UErr>();
                mutable_bitField0_ |= 0x00000020;
              }
              error_.add(
                  input.readMessage(WorldUps.UErr.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          completions_ = java.util.Collections.unmodifiableList(completions_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          delivered_ = java.util.Collections.unmodifiableList(delivered_);
        }
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          acks_ = java.util.Collections.unmodifiableList(acks_);
        }
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          truckstatus_ = java.util.Collections.unmodifiableList(truckstatus_);
        }
        if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
          error_ = java.util.Collections.unmodifiableList(error_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return WorldUps.internal_static_UResponses_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WorldUps.internal_static_UResponses_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WorldUps.UResponses.class, WorldUps.UResponses.Builder.class);
    }

    private int bitField0_;
    public static final int COMPLETIONS_FIELD_NUMBER = 1;
    private java.util.List<WorldUps.UFinished> completions_;
    /**
     * <code>repeated .UFinished completions = 1;</code>
     */
    public java.util.List<WorldUps.UFinished> getCompletionsList() {
      return completions_;
    }
    /**
     * <code>repeated .UFinished completions = 1;</code>
     */
    public java.util.List<? extends WorldUps.UFinishedOrBuilder> 
        getCompletionsOrBuilderList() {
      return completions_;
    }
    /**
     * <code>repeated .UFinished completions = 1;</code>
     */
    public int getCompletionsCount() {
      return completions_.size();
    }
    /**
     * <code>repeated .UFinished completions = 1;</code>
     */
    public WorldUps.UFinished getCompletions(int index) {
      return completions_.get(index);
    }
    /**
     * <code>repeated .UFinished completions = 1;</code>
     */
    public WorldUps.UFinishedOrBuilder getCompletionsOrBuilder(
        int index) {
      return completions_.get(index);
    }

    public static final int DELIVERED_FIELD_NUMBER = 2;
    private java.util.List<WorldUps.UDeliveryMade> delivered_;
    /**
     * <code>repeated .UDeliveryMade delivered = 2;</code>
     */
    public java.util.List<WorldUps.UDeliveryMade> getDeliveredList() {
      return delivered_;
    }
    /**
     * <code>repeated .UDeliveryMade delivered = 2;</code>
     */
    public java.util.List<? extends WorldUps.UDeliveryMadeOrBuilder> 
        getDeliveredOrBuilderList() {
      return delivered_;
    }
    /**
     * <code>repeated .UDeliveryMade delivered = 2;</code>
     */
    public int getDeliveredCount() {
      return delivered_.size();
    }
    /**
     * <code>repeated .UDeliveryMade delivered = 2;</code>
     */
    public WorldUps.UDeliveryMade getDelivered(int index) {
      return delivered_.get(index);
    }
    /**
     * <code>repeated .UDeliveryMade delivered = 2;</code>
     */
    public WorldUps.UDeliveryMadeOrBuilder getDeliveredOrBuilder(
        int index) {
      return delivered_.get(index);
    }

    public static final int FINISHED_FIELD_NUMBER = 3;
    private boolean finished_;
    /**
     * <code>optional bool finished = 3;</code>
     */
    public boolean hasFinished() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bool finished = 3;</code>
     */
    public boolean getFinished() {
      return finished_;
    }

    public static final int ACKS_FIELD_NUMBER = 4;
    private java.util.List<java.lang.Long> acks_;
    /**
     * <code>repeated int64 acks = 4;</code>
     */
    public java.util.List<java.lang.Long>
        getAcksList() {
      return acks_;
    }
    /**
     * <code>repeated int64 acks = 4;</code>
     */
    public int getAcksCount() {
      return acks_.size();
    }
    /**
     * <code>repeated int64 acks = 4;</code>
     */
    public long getAcks(int index) {
      return acks_.get(index);
    }

    public static final int TRUCKSTATUS_FIELD_NUMBER = 5;
    private java.util.List<WorldUps.UTruck> truckstatus_;
    /**
     * <code>repeated .UTruck truckstatus = 5;</code>
     */
    public java.util.List<WorldUps.UTruck> getTruckstatusList() {
      return truckstatus_;
    }
    /**
     * <code>repeated .UTruck truckstatus = 5;</code>
     */
    public java.util.List<? extends WorldUps.UTruckOrBuilder> 
        getTruckstatusOrBuilderList() {
      return truckstatus_;
    }
    /**
     * <code>repeated .UTruck truckstatus = 5;</code>
     */
    public int getTruckstatusCount() {
      return truckstatus_.size();
    }
    /**
     * <code>repeated .UTruck truckstatus = 5;</code>
     */
    public WorldUps.UTruck getTruckstatus(int index) {
      return truckstatus_.get(index);
    }
    /**
     * <code>repeated .UTruck truckstatus = 5;</code>
     */
    public WorldUps.UTruckOrBuilder getTruckstatusOrBuilder(
        int index) {
      return truckstatus_.get(index);
    }

    public static final int ERROR_FIELD_NUMBER = 6;
    private java.util.List<WorldUps.UErr> error_;
    /**
     * <code>repeated .UErr error = 6;</code>
     */
    public java.util.List<WorldUps.UErr> getErrorList() {
      return error_;
    }
    /**
     * <code>repeated .UErr error = 6;</code>
     */
    public java.util.List<? extends WorldUps.UErrOrBuilder> 
        getErrorOrBuilderList() {
      return error_;
    }
    /**
     * <code>repeated .UErr error = 6;</code>
     */
    public int getErrorCount() {
      return error_.size();
    }
    /**
     * <code>repeated .UErr error = 6;</code>
     */
    public WorldUps.UErr getError(int index) {
      return error_.get(index);
    }
    /**
     * <code>repeated .UErr error = 6;</code>
     */
    public WorldUps.UErrOrBuilder getErrorOrBuilder(
        int index) {
      return error_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getCompletionsCount(); i++) {
        if (!getCompletions(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getDeliveredCount(); i++) {
        if (!getDelivered(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getTruckstatusCount(); i++) {
        if (!getTruckstatus(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getErrorCount(); i++) {
        if (!getError(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < completions_.size(); i++) {
        output.writeMessage(1, completions_.get(i));
      }
      for (int i = 0; i < delivered_.size(); i++) {
        output.writeMessage(2, delivered_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(3, finished_);
      }
      for (int i = 0; i < acks_.size(); i++) {
        output.writeInt64(4, acks_.get(i));
      }
      for (int i = 0; i < truckstatus_.size(); i++) {
        output.writeMessage(5, truckstatus_.get(i));
      }
      for (int i = 0; i < error_.size(); i++) {
        output.writeMessage(6, error_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < completions_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, completions_.get(i));
      }
      for (int i = 0; i < delivered_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, delivered_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, finished_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < acks_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt64SizeNoTag(acks_.get(i));
        }
        size += dataSize;
        size += 1 * getAcksList().size();
      }
      for (int i = 0; i < truckstatus_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, truckstatus_.get(i));
      }
      for (int i = 0; i < error_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, error_.get(i));
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
      if (!(obj instanceof WorldUps.UResponses)) {
        return super.equals(obj);
      }
      WorldUps.UResponses other = (WorldUps.UResponses) obj;

      boolean result = true;
      result = result && getCompletionsList()
          .equals(other.getCompletionsList());
      result = result && getDeliveredList()
          .equals(other.getDeliveredList());
      result = result && (hasFinished() == other.hasFinished());
      if (hasFinished()) {
        result = result && (getFinished()
            == other.getFinished());
      }
      result = result && getAcksList()
          .equals(other.getAcksList());
      result = result && getTruckstatusList()
          .equals(other.getTruckstatusList());
      result = result && getErrorList()
          .equals(other.getErrorList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getCompletionsCount() > 0) {
        hash = (37 * hash) + COMPLETIONS_FIELD_NUMBER;
        hash = (53 * hash) + getCompletionsList().hashCode();
      }
      if (getDeliveredCount() > 0) {
        hash = (37 * hash) + DELIVERED_FIELD_NUMBER;
        hash = (53 * hash) + getDeliveredList().hashCode();
      }
      if (hasFinished()) {
        hash = (37 * hash) + FINISHED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getFinished());
      }
      if (getAcksCount() > 0) {
        hash = (37 * hash) + ACKS_FIELD_NUMBER;
        hash = (53 * hash) + getAcksList().hashCode();
      }
      if (getTruckstatusCount() > 0) {
        hash = (37 * hash) + TRUCKSTATUS_FIELD_NUMBER;
        hash = (53 * hash) + getTruckstatusList().hashCode();
      }
      if (getErrorCount() > 0) {
        hash = (37 * hash) + ERROR_FIELD_NUMBER;
        hash = (53 * hash) + getErrorList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static WorldUps.UResponses parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UResponses parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UResponses parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UResponses parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UResponses parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorldUps.UResponses parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorldUps.UResponses parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UResponses parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UResponses parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static WorldUps.UResponses parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorldUps.UResponses parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static WorldUps.UResponses parseFrom(
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
    public static Builder newBuilder(WorldUps.UResponses prototype) {
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
     * Protobuf type {@code UResponses}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UResponses)
        WorldUps.UResponsesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WorldUps.internal_static_UResponses_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WorldUps.internal_static_UResponses_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                WorldUps.UResponses.class, WorldUps.UResponses.Builder.class);
      }

      // Construct using WorldUps.UResponses.newBuilder()
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
          getCompletionsFieldBuilder();
          getDeliveredFieldBuilder();
          getTruckstatusFieldBuilder();
          getErrorFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (completionsBuilder_ == null) {
          completions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          completionsBuilder_.clear();
        }
        if (deliveredBuilder_ == null) {
          delivered_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          deliveredBuilder_.clear();
        }
        finished_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        acks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        if (truckstatusBuilder_ == null) {
          truckstatus_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          truckstatusBuilder_.clear();
        }
        if (errorBuilder_ == null) {
          error_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          errorBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WorldUps.internal_static_UResponses_descriptor;
      }

      @java.lang.Override
      public WorldUps.UResponses getDefaultInstanceForType() {
        return WorldUps.UResponses.getDefaultInstance();
      }

      @java.lang.Override
      public WorldUps.UResponses build() {
        WorldUps.UResponses result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public WorldUps.UResponses buildPartial() {
        WorldUps.UResponses result = new WorldUps.UResponses(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (completionsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            completions_ = java.util.Collections.unmodifiableList(completions_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.completions_ = completions_;
        } else {
          result.completions_ = completionsBuilder_.build();
        }
        if (deliveredBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            delivered_ = java.util.Collections.unmodifiableList(delivered_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.delivered_ = delivered_;
        } else {
          result.delivered_ = deliveredBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000001;
        }
        result.finished_ = finished_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          acks_ = java.util.Collections.unmodifiableList(acks_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.acks_ = acks_;
        if (truckstatusBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)) {
            truckstatus_ = java.util.Collections.unmodifiableList(truckstatus_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.truckstatus_ = truckstatus_;
        } else {
          result.truckstatus_ = truckstatusBuilder_.build();
        }
        if (errorBuilder_ == null) {
          if (((bitField0_ & 0x00000020) == 0x00000020)) {
            error_ = java.util.Collections.unmodifiableList(error_);
            bitField0_ = (bitField0_ & ~0x00000020);
          }
          result.error_ = error_;
        } else {
          result.error_ = errorBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof WorldUps.UResponses) {
          return mergeFrom((WorldUps.UResponses)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(WorldUps.UResponses other) {
        if (other == WorldUps.UResponses.getDefaultInstance()) return this;
        if (completionsBuilder_ == null) {
          if (!other.completions_.isEmpty()) {
            if (completions_.isEmpty()) {
              completions_ = other.completions_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCompletionsIsMutable();
              completions_.addAll(other.completions_);
            }
            onChanged();
          }
        } else {
          if (!other.completions_.isEmpty()) {
            if (completionsBuilder_.isEmpty()) {
              completionsBuilder_.dispose();
              completionsBuilder_ = null;
              completions_ = other.completions_;
              bitField0_ = (bitField0_ & ~0x00000001);
              completionsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCompletionsFieldBuilder() : null;
            } else {
              completionsBuilder_.addAllMessages(other.completions_);
            }
          }
        }
        if (deliveredBuilder_ == null) {
          if (!other.delivered_.isEmpty()) {
            if (delivered_.isEmpty()) {
              delivered_ = other.delivered_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureDeliveredIsMutable();
              delivered_.addAll(other.delivered_);
            }
            onChanged();
          }
        } else {
          if (!other.delivered_.isEmpty()) {
            if (deliveredBuilder_.isEmpty()) {
              deliveredBuilder_.dispose();
              deliveredBuilder_ = null;
              delivered_ = other.delivered_;
              bitField0_ = (bitField0_ & ~0x00000002);
              deliveredBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDeliveredFieldBuilder() : null;
            } else {
              deliveredBuilder_.addAllMessages(other.delivered_);
            }
          }
        }
        if (other.hasFinished()) {
          setFinished(other.getFinished());
        }
        if (!other.acks_.isEmpty()) {
          if (acks_.isEmpty()) {
            acks_ = other.acks_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureAcksIsMutable();
            acks_.addAll(other.acks_);
          }
          onChanged();
        }
        if (truckstatusBuilder_ == null) {
          if (!other.truckstatus_.isEmpty()) {
            if (truckstatus_.isEmpty()) {
              truckstatus_ = other.truckstatus_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureTruckstatusIsMutable();
              truckstatus_.addAll(other.truckstatus_);
            }
            onChanged();
          }
        } else {
          if (!other.truckstatus_.isEmpty()) {
            if (truckstatusBuilder_.isEmpty()) {
              truckstatusBuilder_.dispose();
              truckstatusBuilder_ = null;
              truckstatus_ = other.truckstatus_;
              bitField0_ = (bitField0_ & ~0x00000010);
              truckstatusBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTruckstatusFieldBuilder() : null;
            } else {
              truckstatusBuilder_.addAllMessages(other.truckstatus_);
            }
          }
        }
        if (errorBuilder_ == null) {
          if (!other.error_.isEmpty()) {
            if (error_.isEmpty()) {
              error_ = other.error_;
              bitField0_ = (bitField0_ & ~0x00000020);
            } else {
              ensureErrorIsMutable();
              error_.addAll(other.error_);
            }
            onChanged();
          }
        } else {
          if (!other.error_.isEmpty()) {
            if (errorBuilder_.isEmpty()) {
              errorBuilder_.dispose();
              errorBuilder_ = null;
              error_ = other.error_;
              bitField0_ = (bitField0_ & ~0x00000020);
              errorBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getErrorFieldBuilder() : null;
            } else {
              errorBuilder_.addAllMessages(other.error_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getCompletionsCount(); i++) {
          if (!getCompletions(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getDeliveredCount(); i++) {
          if (!getDelivered(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getTruckstatusCount(); i++) {
          if (!getTruckstatus(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getErrorCount(); i++) {
          if (!getError(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        WorldUps.UResponses parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (WorldUps.UResponses) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<WorldUps.UFinished> completions_ =
        java.util.Collections.emptyList();
      private void ensureCompletionsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          completions_ = new java.util.ArrayList<WorldUps.UFinished>(completions_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UFinished, WorldUps.UFinished.Builder, WorldUps.UFinishedOrBuilder> completionsBuilder_;

      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public java.util.List<WorldUps.UFinished> getCompletionsList() {
        if (completionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(completions_);
        } else {
          return completionsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public int getCompletionsCount() {
        if (completionsBuilder_ == null) {
          return completions_.size();
        } else {
          return completionsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public WorldUps.UFinished getCompletions(int index) {
        if (completionsBuilder_ == null) {
          return completions_.get(index);
        } else {
          return completionsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public Builder setCompletions(
          int index, WorldUps.UFinished value) {
        if (completionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCompletionsIsMutable();
          completions_.set(index, value);
          onChanged();
        } else {
          completionsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public Builder setCompletions(
          int index, WorldUps.UFinished.Builder builderForValue) {
        if (completionsBuilder_ == null) {
          ensureCompletionsIsMutable();
          completions_.set(index, builderForValue.build());
          onChanged();
        } else {
          completionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public Builder addCompletions(WorldUps.UFinished value) {
        if (completionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCompletionsIsMutable();
          completions_.add(value);
          onChanged();
        } else {
          completionsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public Builder addCompletions(
          int index, WorldUps.UFinished value) {
        if (completionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCompletionsIsMutable();
          completions_.add(index, value);
          onChanged();
        } else {
          completionsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public Builder addCompletions(
          WorldUps.UFinished.Builder builderForValue) {
        if (completionsBuilder_ == null) {
          ensureCompletionsIsMutable();
          completions_.add(builderForValue.build());
          onChanged();
        } else {
          completionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public Builder addCompletions(
          int index, WorldUps.UFinished.Builder builderForValue) {
        if (completionsBuilder_ == null) {
          ensureCompletionsIsMutable();
          completions_.add(index, builderForValue.build());
          onChanged();
        } else {
          completionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public Builder addAllCompletions(
          java.lang.Iterable<? extends WorldUps.UFinished> values) {
        if (completionsBuilder_ == null) {
          ensureCompletionsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, completions_);
          onChanged();
        } else {
          completionsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public Builder clearCompletions() {
        if (completionsBuilder_ == null) {
          completions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          completionsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public Builder removeCompletions(int index) {
        if (completionsBuilder_ == null) {
          ensureCompletionsIsMutable();
          completions_.remove(index);
          onChanged();
        } else {
          completionsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public WorldUps.UFinished.Builder getCompletionsBuilder(
          int index) {
        return getCompletionsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public WorldUps.UFinishedOrBuilder getCompletionsOrBuilder(
          int index) {
        if (completionsBuilder_ == null) {
          return completions_.get(index);  } else {
          return completionsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public java.util.List<? extends WorldUps.UFinishedOrBuilder> 
           getCompletionsOrBuilderList() {
        if (completionsBuilder_ != null) {
          return completionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(completions_);
        }
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public WorldUps.UFinished.Builder addCompletionsBuilder() {
        return getCompletionsFieldBuilder().addBuilder(
            WorldUps.UFinished.getDefaultInstance());
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public WorldUps.UFinished.Builder addCompletionsBuilder(
          int index) {
        return getCompletionsFieldBuilder().addBuilder(
            index, WorldUps.UFinished.getDefaultInstance());
      }
      /**
       * <code>repeated .UFinished completions = 1;</code>
       */
      public java.util.List<WorldUps.UFinished.Builder> 
           getCompletionsBuilderList() {
        return getCompletionsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UFinished, WorldUps.UFinished.Builder, WorldUps.UFinishedOrBuilder> 
          getCompletionsFieldBuilder() {
        if (completionsBuilder_ == null) {
          completionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              WorldUps.UFinished, WorldUps.UFinished.Builder, WorldUps.UFinishedOrBuilder>(
                  completions_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          completions_ = null;
        }
        return completionsBuilder_;
      }

      private java.util.List<WorldUps.UDeliveryMade> delivered_ =
        java.util.Collections.emptyList();
      private void ensureDeliveredIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          delivered_ = new java.util.ArrayList<WorldUps.UDeliveryMade>(delivered_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UDeliveryMade, WorldUps.UDeliveryMade.Builder, WorldUps.UDeliveryMadeOrBuilder> deliveredBuilder_;

      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public java.util.List<WorldUps.UDeliveryMade> getDeliveredList() {
        if (deliveredBuilder_ == null) {
          return java.util.Collections.unmodifiableList(delivered_);
        } else {
          return deliveredBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public int getDeliveredCount() {
        if (deliveredBuilder_ == null) {
          return delivered_.size();
        } else {
          return deliveredBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public WorldUps.UDeliveryMade getDelivered(int index) {
        if (deliveredBuilder_ == null) {
          return delivered_.get(index);
        } else {
          return deliveredBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public Builder setDelivered(
          int index, WorldUps.UDeliveryMade value) {
        if (deliveredBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeliveredIsMutable();
          delivered_.set(index, value);
          onChanged();
        } else {
          deliveredBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public Builder setDelivered(
          int index, WorldUps.UDeliveryMade.Builder builderForValue) {
        if (deliveredBuilder_ == null) {
          ensureDeliveredIsMutable();
          delivered_.set(index, builderForValue.build());
          onChanged();
        } else {
          deliveredBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public Builder addDelivered(WorldUps.UDeliveryMade value) {
        if (deliveredBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeliveredIsMutable();
          delivered_.add(value);
          onChanged();
        } else {
          deliveredBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public Builder addDelivered(
          int index, WorldUps.UDeliveryMade value) {
        if (deliveredBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDeliveredIsMutable();
          delivered_.add(index, value);
          onChanged();
        } else {
          deliveredBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public Builder addDelivered(
          WorldUps.UDeliveryMade.Builder builderForValue) {
        if (deliveredBuilder_ == null) {
          ensureDeliveredIsMutable();
          delivered_.add(builderForValue.build());
          onChanged();
        } else {
          deliveredBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public Builder addDelivered(
          int index, WorldUps.UDeliveryMade.Builder builderForValue) {
        if (deliveredBuilder_ == null) {
          ensureDeliveredIsMutable();
          delivered_.add(index, builderForValue.build());
          onChanged();
        } else {
          deliveredBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public Builder addAllDelivered(
          java.lang.Iterable<? extends WorldUps.UDeliveryMade> values) {
        if (deliveredBuilder_ == null) {
          ensureDeliveredIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, delivered_);
          onChanged();
        } else {
          deliveredBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public Builder clearDelivered() {
        if (deliveredBuilder_ == null) {
          delivered_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          deliveredBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public Builder removeDelivered(int index) {
        if (deliveredBuilder_ == null) {
          ensureDeliveredIsMutable();
          delivered_.remove(index);
          onChanged();
        } else {
          deliveredBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public WorldUps.UDeliveryMade.Builder getDeliveredBuilder(
          int index) {
        return getDeliveredFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public WorldUps.UDeliveryMadeOrBuilder getDeliveredOrBuilder(
          int index) {
        if (deliveredBuilder_ == null) {
          return delivered_.get(index);  } else {
          return deliveredBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public java.util.List<? extends WorldUps.UDeliveryMadeOrBuilder> 
           getDeliveredOrBuilderList() {
        if (deliveredBuilder_ != null) {
          return deliveredBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(delivered_);
        }
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public WorldUps.UDeliveryMade.Builder addDeliveredBuilder() {
        return getDeliveredFieldBuilder().addBuilder(
            WorldUps.UDeliveryMade.getDefaultInstance());
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public WorldUps.UDeliveryMade.Builder addDeliveredBuilder(
          int index) {
        return getDeliveredFieldBuilder().addBuilder(
            index, WorldUps.UDeliveryMade.getDefaultInstance());
      }
      /**
       * <code>repeated .UDeliveryMade delivered = 2;</code>
       */
      public java.util.List<WorldUps.UDeliveryMade.Builder> 
           getDeliveredBuilderList() {
        return getDeliveredFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UDeliveryMade, WorldUps.UDeliveryMade.Builder, WorldUps.UDeliveryMadeOrBuilder> 
          getDeliveredFieldBuilder() {
        if (deliveredBuilder_ == null) {
          deliveredBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              WorldUps.UDeliveryMade, WorldUps.UDeliveryMade.Builder, WorldUps.UDeliveryMadeOrBuilder>(
                  delivered_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          delivered_ = null;
        }
        return deliveredBuilder_;
      }

      private boolean finished_ ;
      /**
       * <code>optional bool finished = 3;</code>
       */
      public boolean hasFinished() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bool finished = 3;</code>
       */
      public boolean getFinished() {
        return finished_;
      }
      /**
       * <code>optional bool finished = 3;</code>
       */
      public Builder setFinished(boolean value) {
        bitField0_ |= 0x00000004;
        finished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool finished = 3;</code>
       */
      public Builder clearFinished() {
        bitField0_ = (bitField0_ & ~0x00000004);
        finished_ = false;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Long> acks_ = java.util.Collections.emptyList();
      private void ensureAcksIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          acks_ = new java.util.ArrayList<java.lang.Long>(acks_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <code>repeated int64 acks = 4;</code>
       */
      public java.util.List<java.lang.Long>
          getAcksList() {
        return java.util.Collections.unmodifiableList(acks_);
      }
      /**
       * <code>repeated int64 acks = 4;</code>
       */
      public int getAcksCount() {
        return acks_.size();
      }
      /**
       * <code>repeated int64 acks = 4;</code>
       */
      public long getAcks(int index) {
        return acks_.get(index);
      }
      /**
       * <code>repeated int64 acks = 4;</code>
       */
      public Builder setAcks(
          int index, long value) {
        ensureAcksIsMutable();
        acks_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 acks = 4;</code>
       */
      public Builder addAcks(long value) {
        ensureAcksIsMutable();
        acks_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 acks = 4;</code>
       */
      public Builder addAllAcks(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureAcksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, acks_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 acks = 4;</code>
       */
      public Builder clearAcks() {
        acks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }

      private java.util.List<WorldUps.UTruck> truckstatus_ =
        java.util.Collections.emptyList();
      private void ensureTruckstatusIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          truckstatus_ = new java.util.ArrayList<WorldUps.UTruck>(truckstatus_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UTruck, WorldUps.UTruck.Builder, WorldUps.UTruckOrBuilder> truckstatusBuilder_;

      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public java.util.List<WorldUps.UTruck> getTruckstatusList() {
        if (truckstatusBuilder_ == null) {
          return java.util.Collections.unmodifiableList(truckstatus_);
        } else {
          return truckstatusBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public int getTruckstatusCount() {
        if (truckstatusBuilder_ == null) {
          return truckstatus_.size();
        } else {
          return truckstatusBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public WorldUps.UTruck getTruckstatus(int index) {
        if (truckstatusBuilder_ == null) {
          return truckstatus_.get(index);
        } else {
          return truckstatusBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public Builder setTruckstatus(
          int index, WorldUps.UTruck value) {
        if (truckstatusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTruckstatusIsMutable();
          truckstatus_.set(index, value);
          onChanged();
        } else {
          truckstatusBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public Builder setTruckstatus(
          int index, WorldUps.UTruck.Builder builderForValue) {
        if (truckstatusBuilder_ == null) {
          ensureTruckstatusIsMutable();
          truckstatus_.set(index, builderForValue.build());
          onChanged();
        } else {
          truckstatusBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public Builder addTruckstatus(WorldUps.UTruck value) {
        if (truckstatusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTruckstatusIsMutable();
          truckstatus_.add(value);
          onChanged();
        } else {
          truckstatusBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public Builder addTruckstatus(
          int index, WorldUps.UTruck value) {
        if (truckstatusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTruckstatusIsMutable();
          truckstatus_.add(index, value);
          onChanged();
        } else {
          truckstatusBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public Builder addTruckstatus(
          WorldUps.UTruck.Builder builderForValue) {
        if (truckstatusBuilder_ == null) {
          ensureTruckstatusIsMutable();
          truckstatus_.add(builderForValue.build());
          onChanged();
        } else {
          truckstatusBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public Builder addTruckstatus(
          int index, WorldUps.UTruck.Builder builderForValue) {
        if (truckstatusBuilder_ == null) {
          ensureTruckstatusIsMutable();
          truckstatus_.add(index, builderForValue.build());
          onChanged();
        } else {
          truckstatusBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public Builder addAllTruckstatus(
          java.lang.Iterable<? extends WorldUps.UTruck> values) {
        if (truckstatusBuilder_ == null) {
          ensureTruckstatusIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, truckstatus_);
          onChanged();
        } else {
          truckstatusBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public Builder clearTruckstatus() {
        if (truckstatusBuilder_ == null) {
          truckstatus_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          truckstatusBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public Builder removeTruckstatus(int index) {
        if (truckstatusBuilder_ == null) {
          ensureTruckstatusIsMutable();
          truckstatus_.remove(index);
          onChanged();
        } else {
          truckstatusBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public WorldUps.UTruck.Builder getTruckstatusBuilder(
          int index) {
        return getTruckstatusFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public WorldUps.UTruckOrBuilder getTruckstatusOrBuilder(
          int index) {
        if (truckstatusBuilder_ == null) {
          return truckstatus_.get(index);  } else {
          return truckstatusBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public java.util.List<? extends WorldUps.UTruckOrBuilder> 
           getTruckstatusOrBuilderList() {
        if (truckstatusBuilder_ != null) {
          return truckstatusBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(truckstatus_);
        }
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public WorldUps.UTruck.Builder addTruckstatusBuilder() {
        return getTruckstatusFieldBuilder().addBuilder(
            WorldUps.UTruck.getDefaultInstance());
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public WorldUps.UTruck.Builder addTruckstatusBuilder(
          int index) {
        return getTruckstatusFieldBuilder().addBuilder(
            index, WorldUps.UTruck.getDefaultInstance());
      }
      /**
       * <code>repeated .UTruck truckstatus = 5;</code>
       */
      public java.util.List<WorldUps.UTruck.Builder> 
           getTruckstatusBuilderList() {
        return getTruckstatusFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UTruck, WorldUps.UTruck.Builder, WorldUps.UTruckOrBuilder> 
          getTruckstatusFieldBuilder() {
        if (truckstatusBuilder_ == null) {
          truckstatusBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              WorldUps.UTruck, WorldUps.UTruck.Builder, WorldUps.UTruckOrBuilder>(
                  truckstatus_,
                  ((bitField0_ & 0x00000010) == 0x00000010),
                  getParentForChildren(),
                  isClean());
          truckstatus_ = null;
        }
        return truckstatusBuilder_;
      }

      private java.util.List<WorldUps.UErr> error_ =
        java.util.Collections.emptyList();
      private void ensureErrorIsMutable() {
        if (!((bitField0_ & 0x00000020) == 0x00000020)) {
          error_ = new java.util.ArrayList<WorldUps.UErr>(error_);
          bitField0_ |= 0x00000020;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UErr, WorldUps.UErr.Builder, WorldUps.UErrOrBuilder> errorBuilder_;

      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public java.util.List<WorldUps.UErr> getErrorList() {
        if (errorBuilder_ == null) {
          return java.util.Collections.unmodifiableList(error_);
        } else {
          return errorBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public int getErrorCount() {
        if (errorBuilder_ == null) {
          return error_.size();
        } else {
          return errorBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public WorldUps.UErr getError(int index) {
        if (errorBuilder_ == null) {
          return error_.get(index);
        } else {
          return errorBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public Builder setError(
          int index, WorldUps.UErr value) {
        if (errorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureErrorIsMutable();
          error_.set(index, value);
          onChanged();
        } else {
          errorBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public Builder setError(
          int index, WorldUps.UErr.Builder builderForValue) {
        if (errorBuilder_ == null) {
          ensureErrorIsMutable();
          error_.set(index, builderForValue.build());
          onChanged();
        } else {
          errorBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public Builder addError(WorldUps.UErr value) {
        if (errorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureErrorIsMutable();
          error_.add(value);
          onChanged();
        } else {
          errorBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public Builder addError(
          int index, WorldUps.UErr value) {
        if (errorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureErrorIsMutable();
          error_.add(index, value);
          onChanged();
        } else {
          errorBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public Builder addError(
          WorldUps.UErr.Builder builderForValue) {
        if (errorBuilder_ == null) {
          ensureErrorIsMutable();
          error_.add(builderForValue.build());
          onChanged();
        } else {
          errorBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public Builder addError(
          int index, WorldUps.UErr.Builder builderForValue) {
        if (errorBuilder_ == null) {
          ensureErrorIsMutable();
          error_.add(index, builderForValue.build());
          onChanged();
        } else {
          errorBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public Builder addAllError(
          java.lang.Iterable<? extends WorldUps.UErr> values) {
        if (errorBuilder_ == null) {
          ensureErrorIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, error_);
          onChanged();
        } else {
          errorBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public Builder clearError() {
        if (errorBuilder_ == null) {
          error_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
          onChanged();
        } else {
          errorBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public Builder removeError(int index) {
        if (errorBuilder_ == null) {
          ensureErrorIsMutable();
          error_.remove(index);
          onChanged();
        } else {
          errorBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public WorldUps.UErr.Builder getErrorBuilder(
          int index) {
        return getErrorFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public WorldUps.UErrOrBuilder getErrorOrBuilder(
          int index) {
        if (errorBuilder_ == null) {
          return error_.get(index);  } else {
          return errorBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public java.util.List<? extends WorldUps.UErrOrBuilder> 
           getErrorOrBuilderList() {
        if (errorBuilder_ != null) {
          return errorBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(error_);
        }
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public WorldUps.UErr.Builder addErrorBuilder() {
        return getErrorFieldBuilder().addBuilder(
            WorldUps.UErr.getDefaultInstance());
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public WorldUps.UErr.Builder addErrorBuilder(
          int index) {
        return getErrorFieldBuilder().addBuilder(
            index, WorldUps.UErr.getDefaultInstance());
      }
      /**
       * <code>repeated .UErr error = 6;</code>
       */
      public java.util.List<WorldUps.UErr.Builder> 
           getErrorBuilderList() {
        return getErrorFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          WorldUps.UErr, WorldUps.UErr.Builder, WorldUps.UErrOrBuilder> 
          getErrorFieldBuilder() {
        if (errorBuilder_ == null) {
          errorBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              WorldUps.UErr, WorldUps.UErr.Builder, WorldUps.UErrOrBuilder>(
                  error_,
                  ((bitField0_ & 0x00000020) == 0x00000020),
                  getParentForChildren(),
                  isClean());
          error_ = null;
        }
        return errorBuilder_;
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


      // @@protoc_insertion_point(builder_scope:UResponses)
    }

    // @@protoc_insertion_point(class_scope:UResponses)
    private static final WorldUps.UResponses DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new WorldUps.UResponses();
    }

    public static WorldUps.UResponses getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<UResponses>
        PARSER = new com.google.protobuf.AbstractParser<UResponses>() {
      @java.lang.Override
      public UResponses parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UResponses(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UResponses> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UResponses> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public WorldUps.UResponses getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UInitTruck_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UInitTruck_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UConnect_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UConnect_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UConnected_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UConnected_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UGoPickup_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UGoPickup_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UFinished_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UFinished_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UDeliveryMade_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UDeliveryMade_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UDeliveryLocation_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UDeliveryLocation_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UGoDeliver_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UGoDeliver_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UErr_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UErr_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UQuery_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UQuery_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UTruck_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UTruck_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UCommands_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UCommands_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UResponses_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UResponses_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017world_ups.proto\".\n\nUInitTruck\022\n\n\002id\030\001 " +
      "\002(\005\022\t\n\001x\030\002 \002(\005\022\t\n\001y\030\003 \002(\005\"J\n\010UConnect\022\017\n" +
      "\007worldid\030\001 \001(\003\022\033\n\006trucks\030\002 \003(\0132\013.UInitTr" +
      "uck\022\020\n\010isAmazon\030\003 \002(\010\"-\n\nUConnected\022\017\n\007w" +
      "orldid\030\001 \002(\003\022\016\n\006result\030\002 \002(\t\":\n\tUGoPicku" +
      "p\022\017\n\007truckid\030\001 \002(\005\022\014\n\004whid\030\002 \002(\005\022\016\n\006seqn" +
      "um\030\003 \002(\003\"R\n\tUFinished\022\017\n\007truckid\030\001 \002(\005\022\t" +
      "\n\001x\030\002 \002(\005\022\t\n\001y\030\003 \002(\005\022\016\n\006status\030\004 \002(\t\022\016\n\006" +
      "seqnum\030\005 \002(\003\"C\n\rUDeliveryMade\022\017\n\007truckid" +
      "\030\001 \002(\005\022\021\n\tpackageid\030\002 \002(\003\022\016\n\006seqnum\030\003 \002(" +
      "\003\"<\n\021UDeliveryLocation\022\021\n\tpackageid\030\001 \002(" +
      "\003\022\t\n\001x\030\002 \002(\005\022\t\n\001y\030\003 \002(\005\"S\n\nUGoDeliver\022\017\n" +
      "\007truckid\030\001 \002(\005\022$\n\010packages\030\002 \003(\0132\022.UDeli" +
      "veryLocation\022\016\n\006seqnum\030\003 \002(\003\"9\n\004UErr\022\013\n\003" +
      "err\030\001 \002(\t\022\024\n\014originseqnum\030\002 \002(\003\022\016\n\006seqnu" +
      "m\030\003 \002(\003\")\n\006UQuery\022\017\n\007truckid\030\001 \002(\005\022\016\n\006se" +
      "qnum\030\002 \002(\003\"O\n\006UTruck\022\017\n\007truckid\030\001 \002(\005\022\016\n" +
      "\006status\030\002 \002(\t\022\t\n\001x\030\003 \002(\005\022\t\n\001y\030\004 \002(\005\022\016\n\006s" +
      "eqnum\030\005 \002(\003\"\227\001\n\tUCommands\022\033\n\007pickups\030\001 \003" +
      "(\0132\n.UGoPickup\022\037\n\ndeliveries\030\002 \003(\0132\013.UGo" +
      "Deliver\022\020\n\010simspeed\030\003 \001(\r\022\022\n\ndisconnect\030" +
      "\004 \001(\010\022\030\n\007queries\030\005 \003(\0132\007.UQuery\022\014\n\004acks\030" +
      "\006 \003(\003\"\244\001\n\nUResponses\022\037\n\013completions\030\001 \003(" +
      "\0132\n.UFinished\022!\n\tdelivered\030\002 \003(\0132\016.UDeli" +
      "veryMade\022\020\n\010finished\030\003 \001(\010\022\014\n\004acks\030\004 \003(\003" +
      "\022\034\n\013truckstatus\030\005 \003(\0132\007.UTruck\022\024\n\005error\030" +
      "\006 \003(\0132\005.UErr"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_UInitTruck_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UInitTruck_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UInitTruck_descriptor,
        new java.lang.String[] { "Id", "X", "Y", });
    internal_static_UConnect_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_UConnect_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UConnect_descriptor,
        new java.lang.String[] { "Worldid", "Trucks", "IsAmazon", });
    internal_static_UConnected_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_UConnected_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UConnected_descriptor,
        new java.lang.String[] { "Worldid", "Result", });
    internal_static_UGoPickup_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_UGoPickup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UGoPickup_descriptor,
        new java.lang.String[] { "Truckid", "Whid", "Seqnum", });
    internal_static_UFinished_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_UFinished_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UFinished_descriptor,
        new java.lang.String[] { "Truckid", "X", "Y", "Status", "Seqnum", });
    internal_static_UDeliveryMade_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_UDeliveryMade_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UDeliveryMade_descriptor,
        new java.lang.String[] { "Truckid", "Packageid", "Seqnum", });
    internal_static_UDeliveryLocation_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_UDeliveryLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UDeliveryLocation_descriptor,
        new java.lang.String[] { "Packageid", "X", "Y", });
    internal_static_UGoDeliver_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_UGoDeliver_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UGoDeliver_descriptor,
        new java.lang.String[] { "Truckid", "Packages", "Seqnum", });
    internal_static_UErr_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_UErr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UErr_descriptor,
        new java.lang.String[] { "Err", "Originseqnum", "Seqnum", });
    internal_static_UQuery_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_UQuery_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UQuery_descriptor,
        new java.lang.String[] { "Truckid", "Seqnum", });
    internal_static_UTruck_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_UTruck_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UTruck_descriptor,
        new java.lang.String[] { "Truckid", "Status", "X", "Y", "Seqnum", });
    internal_static_UCommands_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_UCommands_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UCommands_descriptor,
        new java.lang.String[] { "Pickups", "Deliveries", "Simspeed", "Disconnect", "Queries", "Acks", });
    internal_static_UResponses_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_UResponses_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UResponses_descriptor,
        new java.lang.String[] { "Completions", "Delivered", "Finished", "Acks", "Truckstatus", "Error", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
