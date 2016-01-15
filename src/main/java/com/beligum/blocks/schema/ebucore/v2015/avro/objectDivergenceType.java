/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.beligum.blocks.schema.ebucore.v2015.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class objectDivergenceType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"objectDivergenceType\",\"namespace\":\"com.beligum.blocks.schema.ebucore.v2015.avro\",\"fields\":[{\"name\":\"azimuthRange\",\"type\":[\"null\",\"float\"],\"source\":\"attribute azimuthRange\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Float azimuthRange;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public objectDivergenceType() {}

  /**
   * All-args constructor.
   */
  public objectDivergenceType(java.lang.Float azimuthRange) {
    this.azimuthRange = azimuthRange;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return azimuthRange;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: azimuthRange = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'azimuthRange' field.
   */
  public java.lang.Float getAzimuthRange() {
    return azimuthRange;
  }

  /**
   * Sets the value of the 'azimuthRange' field.
   * @param value the value to set.
   */
  public void setAzimuthRange(java.lang.Float value) {
    this.azimuthRange = value;
  }

  /** Creates a new objectDivergenceType RecordBuilder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.objectDivergenceType.Builder newBuilder() {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.objectDivergenceType.Builder();
  }
  
  /** Creates a new objectDivergenceType RecordBuilder by copying an existing Builder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.objectDivergenceType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.objectDivergenceType.Builder other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.objectDivergenceType.Builder(other);
  }
  
  /** Creates a new objectDivergenceType RecordBuilder by copying an existing objectDivergenceType instance */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.objectDivergenceType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.objectDivergenceType other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.objectDivergenceType.Builder(other);
  }
  
  /**
   * RecordBuilder for objectDivergenceType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<objectDivergenceType>
    implements org.apache.avro.data.RecordBuilder<objectDivergenceType> {

    private java.lang.Float azimuthRange;

    /** Creates a new Builder */
    private Builder() {
      super(com.beligum.blocks.schema.ebucore.v2015.avro.objectDivergenceType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.objectDivergenceType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.azimuthRange)) {
        this.azimuthRange = data().deepCopy(fields()[0].schema(), other.azimuthRange);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing objectDivergenceType instance */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.objectDivergenceType other) {
            super(com.beligum.blocks.schema.ebucore.v2015.avro.objectDivergenceType.SCHEMA$);
      if (isValidValue(fields()[0], other.azimuthRange)) {
        this.azimuthRange = data().deepCopy(fields()[0].schema(), other.azimuthRange);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'azimuthRange' field */
    public java.lang.Float getAzimuthRange() {
      return azimuthRange;
    }
    
    /** Sets the value of the 'azimuthRange' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.objectDivergenceType.Builder setAzimuthRange(java.lang.Float value) {
      validate(fields()[0], value);
      this.azimuthRange = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'azimuthRange' field has been set */
    public boolean hasAzimuthRange() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'azimuthRange' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.objectDivergenceType.Builder clearAzimuthRange() {
      azimuthRange = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public objectDivergenceType build() {
      try {
        objectDivergenceType record = new objectDivergenceType();
        record.azimuthRange = fieldSetFlags()[0] ? this.azimuthRange : (java.lang.Float) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}