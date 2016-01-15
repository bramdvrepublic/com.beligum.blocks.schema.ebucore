/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.beligum.blocks.schema.ebucore.v2015.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class hashType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"hashType\",\"namespace\":\"com.beligum.blocks.schema.ebucore.v2015.avro\",\"fields\":[{\"name\":\"hashValue\",\"type\":\"string\",\"source\":\"element hashValue\"},{\"name\":\"hashFunction\",\"type\":{\"type\":\"record\",\"name\":\"AnonType_hashFunctionhashType\",\"fields\":[{\"name\":\"typeLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLabel\"},{\"name\":\"typeDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeDefinition\"},{\"name\":\"typeLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLink\"},{\"name\":\"typeSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeSource\"},{\"name\":\"typeNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeNamespace\"},{\"name\":\"typeLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLanguage\"}]},\"source\":\"element hashFunction\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence hashValue;
  @Deprecated public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_hashFunctionhashType hashFunction;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public hashType() {}

  /**
   * All-args constructor.
   */
  public hashType(java.lang.CharSequence hashValue, com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_hashFunctionhashType hashFunction) {
    this.hashValue = hashValue;
    this.hashFunction = hashFunction;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return hashValue;
    case 1: return hashFunction;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: hashValue = (java.lang.CharSequence)value$; break;
    case 1: hashFunction = (com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_hashFunctionhashType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'hashValue' field.
   */
  public java.lang.CharSequence getHashValue() {
    return hashValue;
  }

  /**
   * Sets the value of the 'hashValue' field.
   * @param value the value to set.
   */
  public void setHashValue(java.lang.CharSequence value) {
    this.hashValue = value;
  }

  /**
   * Gets the value of the 'hashFunction' field.
   */
  public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_hashFunctionhashType getHashFunction() {
    return hashFunction;
  }

  /**
   * Sets the value of the 'hashFunction' field.
   * @param value the value to set.
   */
  public void setHashFunction(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_hashFunctionhashType value) {
    this.hashFunction = value;
  }

  /** Creates a new hashType RecordBuilder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.hashType.Builder newBuilder() {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.hashType.Builder();
  }
  
  /** Creates a new hashType RecordBuilder by copying an existing Builder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.hashType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.hashType.Builder other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.hashType.Builder(other);
  }
  
  /** Creates a new hashType RecordBuilder by copying an existing hashType instance */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.hashType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.hashType other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.hashType.Builder(other);
  }
  
  /**
   * RecordBuilder for hashType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<hashType>
    implements org.apache.avro.data.RecordBuilder<hashType> {

    private java.lang.CharSequence hashValue;
    private com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_hashFunctionhashType hashFunction;

    /** Creates a new Builder */
    private Builder() {
      super(com.beligum.blocks.schema.ebucore.v2015.avro.hashType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.hashType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.hashValue)) {
        this.hashValue = data().deepCopy(fields()[0].schema(), other.hashValue);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.hashFunction)) {
        this.hashFunction = data().deepCopy(fields()[1].schema(), other.hashFunction);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing hashType instance */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.hashType other) {
            super(com.beligum.blocks.schema.ebucore.v2015.avro.hashType.SCHEMA$);
      if (isValidValue(fields()[0], other.hashValue)) {
        this.hashValue = data().deepCopy(fields()[0].schema(), other.hashValue);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.hashFunction)) {
        this.hashFunction = data().deepCopy(fields()[1].schema(), other.hashFunction);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'hashValue' field */
    public java.lang.CharSequence getHashValue() {
      return hashValue;
    }
    
    /** Sets the value of the 'hashValue' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.hashType.Builder setHashValue(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.hashValue = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'hashValue' field has been set */
    public boolean hasHashValue() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'hashValue' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.hashType.Builder clearHashValue() {
      hashValue = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'hashFunction' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_hashFunctionhashType getHashFunction() {
      return hashFunction;
    }
    
    /** Sets the value of the 'hashFunction' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.hashType.Builder setHashFunction(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_hashFunctionhashType value) {
      validate(fields()[1], value);
      this.hashFunction = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'hashFunction' field has been set */
    public boolean hasHashFunction() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'hashFunction' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.hashType.Builder clearHashFunction() {
      hashFunction = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public hashType build() {
      try {
        hashType record = new hashType();
        record.hashValue = fieldSetFlags()[0] ? this.hashValue : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.hashFunction = fieldSetFlags()[1] ? this.hashFunction : (com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_hashFunctionhashType) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}