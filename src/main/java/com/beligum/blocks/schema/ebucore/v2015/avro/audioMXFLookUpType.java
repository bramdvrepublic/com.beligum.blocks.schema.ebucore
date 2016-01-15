/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.beligum.blocks.schema.ebucore.v2015.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class audioMXFLookUpType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"audioMXFLookUpType\",\"namespace\":\"com.beligum.blocks.schema.ebucore.v2015.avro\",\"fields\":[{\"name\":\"packageUIDRef\",\"type\":\"string\",\"source\":\"element packageUIDRef\"},{\"name\":\"trackIDRef\",\"type\":\"string\",\"source\":\"element trackIDRef\"},{\"name\":\"channelIDRef\",\"type\":\"string\",\"source\":\"element channelIDRef\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence packageUIDRef;
  @Deprecated public java.lang.CharSequence trackIDRef;
  @Deprecated public java.lang.CharSequence channelIDRef;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public audioMXFLookUpType() {}

  /**
   * All-args constructor.
   */
  public audioMXFLookUpType(java.lang.CharSequence packageUIDRef, java.lang.CharSequence trackIDRef, java.lang.CharSequence channelIDRef) {
    this.packageUIDRef = packageUIDRef;
    this.trackIDRef = trackIDRef;
    this.channelIDRef = channelIDRef;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return packageUIDRef;
    case 1: return trackIDRef;
    case 2: return channelIDRef;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: packageUIDRef = (java.lang.CharSequence)value$; break;
    case 1: trackIDRef = (java.lang.CharSequence)value$; break;
    case 2: channelIDRef = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'packageUIDRef' field.
   */
  public java.lang.CharSequence getPackageUIDRef() {
    return packageUIDRef;
  }

  /**
   * Sets the value of the 'packageUIDRef' field.
   * @param value the value to set.
   */
  public void setPackageUIDRef(java.lang.CharSequence value) {
    this.packageUIDRef = value;
  }

  /**
   * Gets the value of the 'trackIDRef' field.
   */
  public java.lang.CharSequence getTrackIDRef() {
    return trackIDRef;
  }

  /**
   * Sets the value of the 'trackIDRef' field.
   * @param value the value to set.
   */
  public void setTrackIDRef(java.lang.CharSequence value) {
    this.trackIDRef = value;
  }

  /**
   * Gets the value of the 'channelIDRef' field.
   */
  public java.lang.CharSequence getChannelIDRef() {
    return channelIDRef;
  }

  /**
   * Sets the value of the 'channelIDRef' field.
   * @param value the value to set.
   */
  public void setChannelIDRef(java.lang.CharSequence value) {
    this.channelIDRef = value;
  }

  /** Creates a new audioMXFLookUpType RecordBuilder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType.Builder newBuilder() {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType.Builder();
  }
  
  /** Creates a new audioMXFLookUpType RecordBuilder by copying an existing Builder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType.Builder other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType.Builder(other);
  }
  
  /** Creates a new audioMXFLookUpType RecordBuilder by copying an existing audioMXFLookUpType instance */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType.Builder(other);
  }
  
  /**
   * RecordBuilder for audioMXFLookUpType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<audioMXFLookUpType>
    implements org.apache.avro.data.RecordBuilder<audioMXFLookUpType> {

    private java.lang.CharSequence packageUIDRef;
    private java.lang.CharSequence trackIDRef;
    private java.lang.CharSequence channelIDRef;

    /** Creates a new Builder */
    private Builder() {
      super(com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.packageUIDRef)) {
        this.packageUIDRef = data().deepCopy(fields()[0].schema(), other.packageUIDRef);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.trackIDRef)) {
        this.trackIDRef = data().deepCopy(fields()[1].schema(), other.trackIDRef);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.channelIDRef)) {
        this.channelIDRef = data().deepCopy(fields()[2].schema(), other.channelIDRef);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing audioMXFLookUpType instance */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType other) {
            super(com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType.SCHEMA$);
      if (isValidValue(fields()[0], other.packageUIDRef)) {
        this.packageUIDRef = data().deepCopy(fields()[0].schema(), other.packageUIDRef);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.trackIDRef)) {
        this.trackIDRef = data().deepCopy(fields()[1].schema(), other.trackIDRef);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.channelIDRef)) {
        this.channelIDRef = data().deepCopy(fields()[2].schema(), other.channelIDRef);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'packageUIDRef' field */
    public java.lang.CharSequence getPackageUIDRef() {
      return packageUIDRef;
    }
    
    /** Sets the value of the 'packageUIDRef' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType.Builder setPackageUIDRef(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.packageUIDRef = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'packageUIDRef' field has been set */
    public boolean hasPackageUIDRef() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'packageUIDRef' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType.Builder clearPackageUIDRef() {
      packageUIDRef = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'trackIDRef' field */
    public java.lang.CharSequence getTrackIDRef() {
      return trackIDRef;
    }
    
    /** Sets the value of the 'trackIDRef' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType.Builder setTrackIDRef(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.trackIDRef = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'trackIDRef' field has been set */
    public boolean hasTrackIDRef() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'trackIDRef' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType.Builder clearTrackIDRef() {
      trackIDRef = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'channelIDRef' field */
    public java.lang.CharSequence getChannelIDRef() {
      return channelIDRef;
    }
    
    /** Sets the value of the 'channelIDRef' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType.Builder setChannelIDRef(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.channelIDRef = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'channelIDRef' field has been set */
    public boolean hasChannelIDRef() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'channelIDRef' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioMXFLookUpType.Builder clearChannelIDRef() {
      channelIDRef = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public audioMXFLookUpType build() {
      try {
        audioMXFLookUpType record = new audioMXFLookUpType();
        record.packageUIDRef = fieldSetFlags()[0] ? this.packageUIDRef : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.trackIDRef = fieldSetFlags()[1] ? this.trackIDRef : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.channelIDRef = fieldSetFlags()[2] ? this.channelIDRef : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
