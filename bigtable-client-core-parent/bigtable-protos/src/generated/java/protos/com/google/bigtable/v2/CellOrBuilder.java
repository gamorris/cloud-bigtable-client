// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/data.proto

package com.google.bigtable.v2;

public interface CellOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.Cell)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The cell's stored timestamp, which also uniquely identifies it within
   * its column.
   * Values are always expressed in microseconds, but individual tables may set
   * a coarser granularity to further restrict the allowed values. For
   * example, a table which specifies millisecond granularity will only allow
   * values of `timestamp_micros` which are multiples of 1000.
   * </pre>
   *
   * <code>optional int64 timestamp_micros = 1;</code>
   */
  long getTimestampMicros();

  /**
   * <pre>
   * The value stored in the cell.
   * May contain any byte string, including the empty string, up to 100MiB in
   * length.
   * </pre>
   *
   * <code>optional bytes value = 2;</code>
   */
  com.google.protobuf.ByteString getValue();

  /**
   * <pre>
   * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
   * </pre>
   *
   * <code>repeated string labels = 3;</code>
   */
  java.util.List<java.lang.String>
      getLabelsList();
  /**
   * <pre>
   * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
   * </pre>
   *
   * <code>repeated string labels = 3;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
   * </pre>
   *
   * <code>repeated string labels = 3;</code>
   */
  java.lang.String getLabels(int index);
  /**
   * <pre>
   * Labels applied to the cell by a [RowFilter][google.bigtable.v2.RowFilter].
   * </pre>
   *
   * <code>repeated string labels = 3;</code>
   */
  com.google.protobuf.ByteString
      getLabelsBytes(int index);
}
