// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/data.proto

package com.google.bigtable.v2;

/**
 * <pre>
 * Specifies a contiguous range of columns within a single column family.
 * The range spans from &amp;lt;column_family&amp;gt;:&amp;lt;start_qualifier&amp;gt; to
 * &amp;lt;column_family&amp;gt;:&amp;lt;end_qualifier&amp;gt;, where both bounds can be either
 * inclusive or exclusive.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.v2.ColumnRange}
 */
public  final class ColumnRange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v2.ColumnRange)
    ColumnRangeOrBuilder {
  // Use ColumnRange.newBuilder() to construct.
  private ColumnRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ColumnRange() {
    familyName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ColumnRange(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            familyName_ = s;
            break;
          }
          case 18: {
            startQualifierCase_ = 2;
            startQualifier_ = input.readBytes();
            break;
          }
          case 26: {
            startQualifierCase_ = 3;
            startQualifier_ = input.readBytes();
            break;
          }
          case 34: {
            endQualifierCase_ = 4;
            endQualifier_ = input.readBytes();
            break;
          }
          case 42: {
            endQualifierCase_ = 5;
            endQualifier_ = input.readBytes();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_ColumnRange_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_ColumnRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v2.ColumnRange.class, com.google.bigtable.v2.ColumnRange.Builder.class);
  }

  private int startQualifierCase_ = 0;
  private java.lang.Object startQualifier_;
  public enum StartQualifierCase
      implements com.google.protobuf.Internal.EnumLite {
    START_QUALIFIER_CLOSED(2),
    START_QUALIFIER_OPEN(3),
    STARTQUALIFIER_NOT_SET(0);
    private final int value;
    private StartQualifierCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StartQualifierCase valueOf(int value) {
      return forNumber(value);
    }

    public static StartQualifierCase forNumber(int value) {
      switch (value) {
        case 2: return START_QUALIFIER_CLOSED;
        case 3: return START_QUALIFIER_OPEN;
        case 0: return STARTQUALIFIER_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public StartQualifierCase
  getStartQualifierCase() {
    return StartQualifierCase.forNumber(
        startQualifierCase_);
  }

  private int endQualifierCase_ = 0;
  private java.lang.Object endQualifier_;
  public enum EndQualifierCase
      implements com.google.protobuf.Internal.EnumLite {
    END_QUALIFIER_CLOSED(4),
    END_QUALIFIER_OPEN(5),
    ENDQUALIFIER_NOT_SET(0);
    private final int value;
    private EndQualifierCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EndQualifierCase valueOf(int value) {
      return forNumber(value);
    }

    public static EndQualifierCase forNumber(int value) {
      switch (value) {
        case 4: return END_QUALIFIER_CLOSED;
        case 5: return END_QUALIFIER_OPEN;
        case 0: return ENDQUALIFIER_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public EndQualifierCase
  getEndQualifierCase() {
    return EndQualifierCase.forNumber(
        endQualifierCase_);
  }

  public static final int FAMILY_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object familyName_;
  /**
   * <pre>
   * The name of the column family within which this range falls.
   * </pre>
   *
   * <code>optional string family_name = 1;</code>
   */
  public java.lang.String getFamilyName() {
    java.lang.Object ref = familyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      familyName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the column family within which this range falls.
   * </pre>
   *
   * <code>optional string family_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFamilyNameBytes() {
    java.lang.Object ref = familyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      familyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int START_QUALIFIER_CLOSED_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Used when giving an inclusive lower bound for the range.
   * </pre>
   *
   * <code>optional bytes start_qualifier_closed = 2;</code>
   */
  public com.google.protobuf.ByteString getStartQualifierClosed() {
    if (startQualifierCase_ == 2) {
      return (com.google.protobuf.ByteString) startQualifier_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int START_QUALIFIER_OPEN_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Used when giving an exclusive lower bound for the range.
   * </pre>
   *
   * <code>optional bytes start_qualifier_open = 3;</code>
   */
  public com.google.protobuf.ByteString getStartQualifierOpen() {
    if (startQualifierCase_ == 3) {
      return (com.google.protobuf.ByteString) startQualifier_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int END_QUALIFIER_CLOSED_FIELD_NUMBER = 4;
  /**
   * <pre>
   * Used when giving an inclusive upper bound for the range.
   * </pre>
   *
   * <code>optional bytes end_qualifier_closed = 4;</code>
   */
  public com.google.protobuf.ByteString getEndQualifierClosed() {
    if (endQualifierCase_ == 4) {
      return (com.google.protobuf.ByteString) endQualifier_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int END_QUALIFIER_OPEN_FIELD_NUMBER = 5;
  /**
   * <pre>
   * Used when giving an exclusive upper bound for the range.
   * </pre>
   *
   * <code>optional bytes end_qualifier_open = 5;</code>
   */
  public com.google.protobuf.ByteString getEndQualifierOpen() {
    if (endQualifierCase_ == 5) {
      return (com.google.protobuf.ByteString) endQualifier_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getFamilyNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, familyName_);
    }
    if (startQualifierCase_ == 2) {
      output.writeBytes(
          2, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) startQualifier_));
    }
    if (startQualifierCase_ == 3) {
      output.writeBytes(
          3, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) startQualifier_));
    }
    if (endQualifierCase_ == 4) {
      output.writeBytes(
          4, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) endQualifier_));
    }
    if (endQualifierCase_ == 5) {
      output.writeBytes(
          5, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) endQualifier_));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFamilyNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, familyName_);
    }
    if (startQualifierCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            2, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) startQualifier_));
    }
    if (startQualifierCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            3, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) startQualifier_));
    }
    if (endQualifierCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            4, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) endQualifier_));
    }
    if (endQualifierCase_ == 5) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            5, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) endQualifier_));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.bigtable.v2.ColumnRange)) {
      return super.equals(obj);
    }
    com.google.bigtable.v2.ColumnRange other = (com.google.bigtable.v2.ColumnRange) obj;

    boolean result = true;
    result = result && getFamilyName()
        .equals(other.getFamilyName());
    result = result && getStartQualifierCase().equals(
        other.getStartQualifierCase());
    if (!result) return false;
    switch (startQualifierCase_) {
      case 2:
        result = result && getStartQualifierClosed()
            .equals(other.getStartQualifierClosed());
        break;
      case 3:
        result = result && getStartQualifierOpen()
            .equals(other.getStartQualifierOpen());
        break;
      case 0:
      default:
    }
    result = result && getEndQualifierCase().equals(
        other.getEndQualifierCase());
    if (!result) return false;
    switch (endQualifierCase_) {
      case 4:
        result = result && getEndQualifierClosed()
            .equals(other.getEndQualifierClosed());
        break;
      case 5:
        result = result && getEndQualifierOpen()
            .equals(other.getEndQualifierOpen());
        break;
      case 0:
      default:
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + FAMILY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFamilyName().hashCode();
    switch (startQualifierCase_) {
      case 2:
        hash = (37 * hash) + START_QUALIFIER_CLOSED_FIELD_NUMBER;
        hash = (53 * hash) + getStartQualifierClosed().hashCode();
        break;
      case 3:
        hash = (37 * hash) + START_QUALIFIER_OPEN_FIELD_NUMBER;
        hash = (53 * hash) + getStartQualifierOpen().hashCode();
        break;
      case 0:
      default:
    }
    switch (endQualifierCase_) {
      case 4:
        hash = (37 * hash) + END_QUALIFIER_CLOSED_FIELD_NUMBER;
        hash = (53 * hash) + getEndQualifierClosed().hashCode();
        break;
      case 5:
        hash = (37 * hash) + END_QUALIFIER_OPEN_FIELD_NUMBER;
        hash = (53 * hash) + getEndQualifierOpen().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.v2.ColumnRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v2.ColumnRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v2.ColumnRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v2.ColumnRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v2.ColumnRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v2.ColumnRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.v2.ColumnRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v2.ColumnRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.v2.ColumnRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v2.ColumnRange parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.bigtable.v2.ColumnRange prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * Specifies a contiguous range of columns within a single column family.
   * The range spans from &amp;lt;column_family&amp;gt;:&amp;lt;start_qualifier&amp;gt; to
   * &amp;lt;column_family&amp;gt;:&amp;lt;end_qualifier&amp;gt;, where both bounds can be either
   * inclusive or exclusive.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.v2.ColumnRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v2.ColumnRange)
      com.google.bigtable.v2.ColumnRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_ColumnRange_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_ColumnRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v2.ColumnRange.class, com.google.bigtable.v2.ColumnRange.Builder.class);
    }

    // Construct using com.google.bigtable.v2.ColumnRange.newBuilder()
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
    public Builder clear() {
      super.clear();
      familyName_ = "";

      startQualifierCase_ = 0;
      startQualifier_ = null;
      endQualifierCase_ = 0;
      endQualifier_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_ColumnRange_descriptor;
    }

    public com.google.bigtable.v2.ColumnRange getDefaultInstanceForType() {
      return com.google.bigtable.v2.ColumnRange.getDefaultInstance();
    }

    public com.google.bigtable.v2.ColumnRange build() {
      com.google.bigtable.v2.ColumnRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.v2.ColumnRange buildPartial() {
      com.google.bigtable.v2.ColumnRange result = new com.google.bigtable.v2.ColumnRange(this);
      result.familyName_ = familyName_;
      if (startQualifierCase_ == 2) {
        result.startQualifier_ = startQualifier_;
      }
      if (startQualifierCase_ == 3) {
        result.startQualifier_ = startQualifier_;
      }
      if (endQualifierCase_ == 4) {
        result.endQualifier_ = endQualifier_;
      }
      if (endQualifierCase_ == 5) {
        result.endQualifier_ = endQualifier_;
      }
      result.startQualifierCase_ = startQualifierCase_;
      result.endQualifierCase_ = endQualifierCase_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.v2.ColumnRange) {
        return mergeFrom((com.google.bigtable.v2.ColumnRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.v2.ColumnRange other) {
      if (other == com.google.bigtable.v2.ColumnRange.getDefaultInstance()) return this;
      if (!other.getFamilyName().isEmpty()) {
        familyName_ = other.familyName_;
        onChanged();
      }
      switch (other.getStartQualifierCase()) {
        case START_QUALIFIER_CLOSED: {
          setStartQualifierClosed(other.getStartQualifierClosed());
          break;
        }
        case START_QUALIFIER_OPEN: {
          setStartQualifierOpen(other.getStartQualifierOpen());
          break;
        }
        case STARTQUALIFIER_NOT_SET: {
          break;
        }
      }
      switch (other.getEndQualifierCase()) {
        case END_QUALIFIER_CLOSED: {
          setEndQualifierClosed(other.getEndQualifierClosed());
          break;
        }
        case END_QUALIFIER_OPEN: {
          setEndQualifierOpen(other.getEndQualifierOpen());
          break;
        }
        case ENDQUALIFIER_NOT_SET: {
          break;
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.v2.ColumnRange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.v2.ColumnRange) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int startQualifierCase_ = 0;
    private java.lang.Object startQualifier_;
    public StartQualifierCase
        getStartQualifierCase() {
      return StartQualifierCase.forNumber(
          startQualifierCase_);
    }

    public Builder clearStartQualifier() {
      startQualifierCase_ = 0;
      startQualifier_ = null;
      onChanged();
      return this;
    }

    private int endQualifierCase_ = 0;
    private java.lang.Object endQualifier_;
    public EndQualifierCase
        getEndQualifierCase() {
      return EndQualifierCase.forNumber(
          endQualifierCase_);
    }

    public Builder clearEndQualifier() {
      endQualifierCase_ = 0;
      endQualifier_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object familyName_ = "";
    /**
     * <pre>
     * The name of the column family within which this range falls.
     * </pre>
     *
     * <code>optional string family_name = 1;</code>
     */
    public java.lang.String getFamilyName() {
      java.lang.Object ref = familyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        familyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the column family within which this range falls.
     * </pre>
     *
     * <code>optional string family_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFamilyNameBytes() {
      java.lang.Object ref = familyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        familyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the column family within which this range falls.
     * </pre>
     *
     * <code>optional string family_name = 1;</code>
     */
    public Builder setFamilyName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      familyName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the column family within which this range falls.
     * </pre>
     *
     * <code>optional string family_name = 1;</code>
     */
    public Builder clearFamilyName() {
      
      familyName_ = getDefaultInstance().getFamilyName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the column family within which this range falls.
     * </pre>
     *
     * <code>optional string family_name = 1;</code>
     */
    public Builder setFamilyNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      familyName_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Used when giving an inclusive lower bound for the range.
     * </pre>
     *
     * <code>optional bytes start_qualifier_closed = 2;</code>
     */
    public com.google.protobuf.ByteString getStartQualifierClosed() {
      if (startQualifierCase_ == 2) {
        return (com.google.protobuf.ByteString) startQualifier_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Used when giving an inclusive lower bound for the range.
     * </pre>
     *
     * <code>optional bytes start_qualifier_closed = 2;</code>
     */
    public Builder setStartQualifierClosed(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  startQualifierCase_ = 2;
      startQualifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used when giving an inclusive lower bound for the range.
     * </pre>
     *
     * <code>optional bytes start_qualifier_closed = 2;</code>
     */
    public Builder clearStartQualifierClosed() {
      if (startQualifierCase_ == 2) {
        startQualifierCase_ = 0;
        startQualifier_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Used when giving an exclusive lower bound for the range.
     * </pre>
     *
     * <code>optional bytes start_qualifier_open = 3;</code>
     */
    public com.google.protobuf.ByteString getStartQualifierOpen() {
      if (startQualifierCase_ == 3) {
        return (com.google.protobuf.ByteString) startQualifier_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Used when giving an exclusive lower bound for the range.
     * </pre>
     *
     * <code>optional bytes start_qualifier_open = 3;</code>
     */
    public Builder setStartQualifierOpen(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  startQualifierCase_ = 3;
      startQualifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used when giving an exclusive lower bound for the range.
     * </pre>
     *
     * <code>optional bytes start_qualifier_open = 3;</code>
     */
    public Builder clearStartQualifierOpen() {
      if (startQualifierCase_ == 3) {
        startQualifierCase_ = 0;
        startQualifier_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Used when giving an inclusive upper bound for the range.
     * </pre>
     *
     * <code>optional bytes end_qualifier_closed = 4;</code>
     */
    public com.google.protobuf.ByteString getEndQualifierClosed() {
      if (endQualifierCase_ == 4) {
        return (com.google.protobuf.ByteString) endQualifier_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Used when giving an inclusive upper bound for the range.
     * </pre>
     *
     * <code>optional bytes end_qualifier_closed = 4;</code>
     */
    public Builder setEndQualifierClosed(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  endQualifierCase_ = 4;
      endQualifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used when giving an inclusive upper bound for the range.
     * </pre>
     *
     * <code>optional bytes end_qualifier_closed = 4;</code>
     */
    public Builder clearEndQualifierClosed() {
      if (endQualifierCase_ == 4) {
        endQualifierCase_ = 0;
        endQualifier_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Used when giving an exclusive upper bound for the range.
     * </pre>
     *
     * <code>optional bytes end_qualifier_open = 5;</code>
     */
    public com.google.protobuf.ByteString getEndQualifierOpen() {
      if (endQualifierCase_ == 5) {
        return (com.google.protobuf.ByteString) endQualifier_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Used when giving an exclusive upper bound for the range.
     * </pre>
     *
     * <code>optional bytes end_qualifier_open = 5;</code>
     */
    public Builder setEndQualifierOpen(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  endQualifierCase_ = 5;
      endQualifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used when giving an exclusive upper bound for the range.
     * </pre>
     *
     * <code>optional bytes end_qualifier_open = 5;</code>
     */
    public Builder clearEndQualifierOpen() {
      if (endQualifierCase_ == 5) {
        endQualifierCase_ = 0;
        endQualifier_ = null;
        onChanged();
      }
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.v2.ColumnRange)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v2.ColumnRange)
  private static final com.google.bigtable.v2.ColumnRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v2.ColumnRange();
  }

  public static com.google.bigtable.v2.ColumnRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ColumnRange>
      PARSER = new com.google.protobuf.AbstractParser<ColumnRange>() {
    public ColumnRange parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ColumnRange(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ColumnRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ColumnRange> getParserForType() {
    return PARSER;
  }

  public com.google.bigtable.v2.ColumnRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

