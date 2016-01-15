/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.beligum.blocks.schema.ebucore.v2015.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class channelLockType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"channelLockType\",\"namespace\":\"com.beligum.blocks.schema.ebucore.v2015.avro\",\"fields\":[{\"name\":\"maxDistance\",\"type\":[\"null\",\"float\"],\"source\":\"attribute maxDistance\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Float maxDistance;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public channelLockType() {}

  /**
   * All-args constructor.
   */
  public channelLockType(java.lang.Float maxDistance) {
    this.maxDistance = maxDistance;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return maxDistance;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: maxDistance = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'maxDistance' field.
   */
  public java.lang.Float getMaxDistance() {
    return maxDistance;
  }

  /**
   * Sets the value of the 'maxDistance' field.
   * @param value the value to set.
   */
  public void setMaxDistance(java.lang.Float value) {
    this.maxDistance = value;
  }

  /** Creates a new channelLockType RecordBuilder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.channelLockType.Builder newBuilder() {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.channelLockType.Builder();
  }
  
  /** Creates a new channelLockType RecordBuilder by copying an existing Builder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.channelLockType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.channelLockType.Builder other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.channelLockType.Builder(other);
  }
  
  /** Creates a new channelLockType RecordBuilder by copying an existing channelLockType instance */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.channelLockType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.channelLockType other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.channelLockType.Builder(other);
  }
  
  /**
   * RecordBuilder for channelLockType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<channelLockType>
    implements org.apache.avro.data.RecordBuilder<channelLockType> {

    private java.lang.Float maxDistance;

    /** Creates a new Builder */
    private Builder() {
      super(com.beligum.blocks.schema.ebucore.v2015.avro.channelLockType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.channelLockType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.maxDistance)) {
        this.maxDistance = data().deepCopy(fields()[0].schema(), other.maxDistance);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing channelLockType instance */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.channelLockType other) {
            super(com.beligum.blocks.schema.ebucore.v2015.avro.channelLockType.SCHEMA$);
      if (isValidValue(fields()[0], other.maxDistance)) {
        this.maxDistance = data().deepCopy(fields()[0].schema(), other.maxDistance);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'maxDistance' field */
    public java.lang.Float getMaxDistance() {
      return maxDistance;
    }
    
    /** Sets the value of the 'maxDistance' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.channelLockType.Builder setMaxDistance(java.lang.Float value) {
      validate(fields()[0], value);
      this.maxDistance = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'maxDistance' field has been set */
    public boolean hasMaxDistance() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'maxDistance' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.channelLockType.Builder clearMaxDistance() {
      maxDistance = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public channelLockType build() {
      try {
        channelLockType record = new channelLockType();
        record.maxDistance = fieldSetFlags()[0] ? this.maxDistance : (java.lang.Float) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
