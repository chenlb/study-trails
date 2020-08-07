/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hadoop.mapreduce.jobhistory;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class JobQueueChange extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 353561350263775562L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"JobQueueChange\",\"namespace\":\"org.apache.hadoop.mapreduce.jobhistory\",\"fields\":[{\"name\":\"jobid\",\"type\":\"string\"},{\"name\":\"jobQueueName\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<JobQueueChange> ENCODER =
      new BinaryMessageEncoder<JobQueueChange>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<JobQueueChange> DECODER =
      new BinaryMessageDecoder<JobQueueChange>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<JobQueueChange> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<JobQueueChange> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<JobQueueChange>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this JobQueueChange to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a JobQueueChange from a ByteBuffer. */
  public static JobQueueChange fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence jobid;
  @Deprecated public java.lang.CharSequence jobQueueName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public JobQueueChange() {}

  /**
   * All-args constructor.
   * @param jobid The new value for jobid
   * @param jobQueueName The new value for jobQueueName
   */
  public JobQueueChange(java.lang.CharSequence jobid, java.lang.CharSequence jobQueueName) {
    this.jobid = jobid;
    this.jobQueueName = jobQueueName;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return jobid;
    case 1: return jobQueueName;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: jobid = (java.lang.CharSequence)value$; break;
    case 1: jobQueueName = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'jobid' field.
   * @return The value of the 'jobid' field.
   */
  public java.lang.CharSequence getJobid() {
    return jobid;
  }

  /**
   * Sets the value of the 'jobid' field.
   * @param value the value to set.
   */
  public void setJobid(java.lang.CharSequence value) {
    this.jobid = value;
  }

  /**
   * Gets the value of the 'jobQueueName' field.
   * @return The value of the 'jobQueueName' field.
   */
  public java.lang.CharSequence getJobQueueName() {
    return jobQueueName;
  }

  /**
   * Sets the value of the 'jobQueueName' field.
   * @param value the value to set.
   */
  public void setJobQueueName(java.lang.CharSequence value) {
    this.jobQueueName = value;
  }

  /**
   * Creates a new JobQueueChange RecordBuilder.
   * @return A new JobQueueChange RecordBuilder
   */
  public static org.apache.hadoop.mapreduce.jobhistory.JobQueueChange.Builder newBuilder() {
    return new org.apache.hadoop.mapreduce.jobhistory.JobQueueChange.Builder();
  }

  /**
   * Creates a new JobQueueChange RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new JobQueueChange RecordBuilder
   */
  public static org.apache.hadoop.mapreduce.jobhistory.JobQueueChange.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.JobQueueChange.Builder other) {
    return new org.apache.hadoop.mapreduce.jobhistory.JobQueueChange.Builder(other);
  }

  /**
   * Creates a new JobQueueChange RecordBuilder by copying an existing JobQueueChange instance.
   * @param other The existing instance to copy.
   * @return A new JobQueueChange RecordBuilder
   */
  public static org.apache.hadoop.mapreduce.jobhistory.JobQueueChange.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.JobQueueChange other) {
    return new org.apache.hadoop.mapreduce.jobhistory.JobQueueChange.Builder(other);
  }

  /**
   * RecordBuilder for JobQueueChange instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<JobQueueChange>
    implements org.apache.avro.data.RecordBuilder<JobQueueChange> {

    private java.lang.CharSequence jobid;
    private java.lang.CharSequence jobQueueName;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.JobQueueChange.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.jobid)) {
        this.jobid = data().deepCopy(fields()[0].schema(), other.jobid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.jobQueueName)) {
        this.jobQueueName = data().deepCopy(fields()[1].schema(), other.jobQueueName);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing JobQueueChange instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.JobQueueChange other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.jobid)) {
        this.jobid = data().deepCopy(fields()[0].schema(), other.jobid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.jobQueueName)) {
        this.jobQueueName = data().deepCopy(fields()[1].schema(), other.jobQueueName);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'jobid' field.
      * @return The value.
      */
    public java.lang.CharSequence getJobid() {
      return jobid;
    }

    /**
      * Sets the value of the 'jobid' field.
      * @param value The value of 'jobid'.
      * @return This builder.
      */
    public org.apache.hadoop.mapreduce.jobhistory.JobQueueChange.Builder setJobid(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.jobid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'jobid' field has been set.
      * @return True if the 'jobid' field has been set, false otherwise.
      */
    public boolean hasJobid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'jobid' field.
      * @return This builder.
      */
    public org.apache.hadoop.mapreduce.jobhistory.JobQueueChange.Builder clearJobid() {
      jobid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'jobQueueName' field.
      * @return The value.
      */
    public java.lang.CharSequence getJobQueueName() {
      return jobQueueName;
    }

    /**
      * Sets the value of the 'jobQueueName' field.
      * @param value The value of 'jobQueueName'.
      * @return This builder.
      */
    public org.apache.hadoop.mapreduce.jobhistory.JobQueueChange.Builder setJobQueueName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.jobQueueName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'jobQueueName' field has been set.
      * @return True if the 'jobQueueName' field has been set, false otherwise.
      */
    public boolean hasJobQueueName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'jobQueueName' field.
      * @return This builder.
      */
    public org.apache.hadoop.mapreduce.jobhistory.JobQueueChange.Builder clearJobQueueName() {
      jobQueueName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public JobQueueChange build() {
      try {
        JobQueueChange record = new JobQueueChange();
        record.jobid = fieldSetFlags()[0] ? this.jobid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.jobQueueName = fieldSetFlags()[1] ? this.jobQueueName : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<JobQueueChange>
    WRITER$ = (org.apache.avro.io.DatumWriter<JobQueueChange>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<JobQueueChange>
    READER$ = (org.apache.avro.io.DatumReader<JobQueueChange>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}