// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/data.proto

package com.google.bigtable.v2;

public interface ColumnRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.ColumnRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string family_name = 1;</code>
   *
   * <pre>
   * The name of the column family within which this range falls.
   * </pre>
   */
  java.lang.String getFamilyName();
  /**
   * <code>optional string family_name = 1;</code>
   *
   * <pre>
   * The name of the column family within which this range falls.
   * </pre>
   */
  com.google.protobuf.ByteString
      getFamilyNameBytes();

  /**
   * <code>optional bytes start_qualifier_closed = 2;</code>
   *
   * <pre>
   * Used when giving an inclusive lower bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getStartQualifierClosed();

  /**
   * <code>optional bytes start_qualifier_open = 3;</code>
   *
   * <pre>
   * Used when giving an exclusive lower bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getStartQualifierOpen();

  /**
   * <code>optional bytes end_qualifier_closed = 4;</code>
   *
   * <pre>
   * Used when giving an inclusive upper bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getEndQualifierClosed();

  /**
   * <code>optional bytes end_qualifier_open = 5;</code>
   *
   * <pre>
   * Used when giving an exclusive upper bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getEndQualifierOpen();

  public com.google.bigtable.v2.ColumnRange.StartQualifierCase getStartQualifierCase();

  public com.google.bigtable.v2.ColumnRange.EndQualifierCase getEndQualifierCase();
}
