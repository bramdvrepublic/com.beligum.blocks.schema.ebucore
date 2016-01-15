/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.beligum.blocks.schema.ebucore.v2015.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class positionInteractionRangeType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"positionInteractionRangeType\",\"namespace\":\"com.beligum.blocks.schema.ebucore.v2015.avro\",\"fields\":[{\"name\":\"coordinate\",\"type\":[\"null\",\"string\"],\"source\":\"attribute coordinate\"},{\"name\":\"bound\",\"type\":[\"null\",\"string\"],\"source\":\"attribute bound\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence coordinate;
  @Deprecated public java.lang.CharSequence bound;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public positionInteractionRangeType() {}

  /**
   * All-args constructor.
   */
  public positionInteractionRangeType(java.lang.CharSequence coordinate, java.lang.CharSequence bound) {
    this.coordinate = coordinate;
    this.bound = bound;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return coordinate;
    case 1: return bound;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: coordinate = (java.lang.CharSequence)value$; break;
    case 1: bound = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'coordinate' field.
   */
  public java.lang.CharSequence getCoordinate() {
    return coordinate;
  }

  /**
   * Sets the value of the 'coordinate' field.
   * @param value the value to set.
   */
  public void setCoordinate(java.lang.CharSequence value) {
    this.coordinate = value;
  }

  /**
   * Gets the value of the 'bound' field.
   */
  public java.lang.CharSequence getBound() {
    return bound;
  }

  /**
   * Sets the value of the 'bound' field.
   * @param value the value to set.
   */
  public void setBound(java.lang.CharSequence value) {
    this.bound = value;
  }

  /** Creates a new positionInteractionRangeType RecordBuilder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.positionInteractionRangeType.Builder newBuilder() {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.positionInteractionRangeType.Builder();
  }
  
  /** Creates a new positionInteractionRangeType RecordBuilder by copying an existing Builder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.positionInteractionRangeType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.positionInteractionRangeType.Builder other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.positionInteractionRangeType.Builder(other);
  }
  
  /** Creates a new positionInteractionRangeType RecordBuilder by copying an existing positionInteractionRangeType instance */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.positionInteractionRangeType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.positionInteractionRangeType other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.positionInteractionRangeType.Builder(other);
  }
  
  /**
   * RecordBuilder for positionInteractionRangeType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<positionInteractionRangeType>
    implements org.apache.avro.data.RecordBuilder<positionInteractionRangeType> {

    private java.lang.CharSequence coordinate;
    private java.lang.CharSequence bound;

    /** Creates a new Builder */
    private Builder() {
      super(com.beligum.blocks.schema.ebucore.v2015.avro.positionInteractionRangeType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.positionInteractionRangeType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.coordinate)) {
        this.coordinate = data().deepCopy(fields()[0].schema(), other.coordinate);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.bound)) {
        this.bound = data().deepCopy(fields()[1].schema(), other.bound);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing positionInteractionRangeType instance */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.positionInteractionRangeType other) {
            super(com.beligum.blocks.schema.ebucore.v2015.avro.positionInteractionRangeType.SCHEMA$);
      if (isValidValue(fields()[0], other.coordinate)) {
        this.coordinate = data().deepCopy(fields()[0].schema(), other.coordinate);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.bound)) {
        this.bound = data().deepCopy(fields()[1].schema(), other.bound);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'coordinate' field */
    public java.lang.CharSequence getCoordinate() {
      return coordinate;
    }
    
    /** Sets the value of the 'coordinate' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.positionInteractionRangeType.Builder setCoordinate(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.coordinate = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'coordinate' field has been set */
    public boolean hasCoordinate() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'coordinate' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.positionInteractionRangeType.Builder clearCoordinate() {
      coordinate = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'bound' field */
    public java.lang.CharSequence getBound() {
      return bound;
    }
    
    /** Sets the value of the 'bound' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.positionInteractionRangeType.Builder setBound(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.bound = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'bound' field has been set */
    public boolean hasBound() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'bound' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.positionInteractionRangeType.Builder clearBound() {
      bound = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public positionInteractionRangeType build() {
      try {
        positionInteractionRangeType record = new positionInteractionRangeType();
        record.coordinate = fieldSetFlags()[0] ? this.coordinate : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.bound = fieldSetFlags()[1] ? this.bound : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
