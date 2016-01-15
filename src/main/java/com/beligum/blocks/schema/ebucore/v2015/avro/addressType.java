/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.beligum.blocks.schema.ebucore.v2015.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class addressType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"addressType\",\"namespace\":\"com.beligum.blocks.schema.ebucore.v2015.avro\",\"fields\":[{\"name\":\"addressLine\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"elementType\",\"fields\":[{\"name\":\"lang\",\"type\":[\"null\",\"string\"],\"source\":\"attribute lang\"}]}},\"source\":\"element addressLine\"},{\"name\":\"addressTownCity\",\"type\":[\"null\",\"elementType\"],\"source\":\"element addressTownCity\"},{\"name\":\"addressCountyState\",\"type\":[\"null\",\"elementType\"],\"source\":\"element addressCountyState\"},{\"name\":\"addressDeliveryCode\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"source\":\"element addressDeliveryCode\"},{\"name\":\"country\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AnonType_countryaddressType\",\"fields\":[{\"name\":\"typeLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLabel\"},{\"name\":\"typeDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeDefinition\"},{\"name\":\"typeLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLink\"},{\"name\":\"typeSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeSource\"},{\"name\":\"typeNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeNamespace\"},{\"name\":\"typeLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLanguage\"}]}],\"source\":\"element country\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<com.beligum.blocks.schema.ebucore.v2015.avro.elementType> addressLine;
  @Deprecated public com.beligum.blocks.schema.ebucore.v2015.avro.elementType addressTownCity;
  @Deprecated public com.beligum.blocks.schema.ebucore.v2015.avro.elementType addressCountyState;
  @Deprecated public java.util.List<java.lang.CharSequence> addressDeliveryCode;
  @Deprecated public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_countryaddressType country;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public addressType() {}

  /**
   * All-args constructor.
   */
  public addressType(java.util.List<com.beligum.blocks.schema.ebucore.v2015.avro.elementType> addressLine, com.beligum.blocks.schema.ebucore.v2015.avro.elementType addressTownCity, com.beligum.blocks.schema.ebucore.v2015.avro.elementType addressCountyState, java.util.List<java.lang.CharSequence> addressDeliveryCode, com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_countryaddressType country) {
    this.addressLine = addressLine;
    this.addressTownCity = addressTownCity;
    this.addressCountyState = addressCountyState;
    this.addressDeliveryCode = addressDeliveryCode;
    this.country = country;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return addressLine;
    case 1: return addressTownCity;
    case 2: return addressCountyState;
    case 3: return addressDeliveryCode;
    case 4: return country;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: addressLine = (java.util.List<com.beligum.blocks.schema.ebucore.v2015.avro.elementType>)value$; break;
    case 1: addressTownCity = (com.beligum.blocks.schema.ebucore.v2015.avro.elementType)value$; break;
    case 2: addressCountyState = (com.beligum.blocks.schema.ebucore.v2015.avro.elementType)value$; break;
    case 3: addressDeliveryCode = (java.util.List<java.lang.CharSequence>)value$; break;
    case 4: country = (com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_countryaddressType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'addressLine' field.
   */
  public java.util.List<com.beligum.blocks.schema.ebucore.v2015.avro.elementType> getAddressLine() {
    return addressLine;
  }

  /**
   * Sets the value of the 'addressLine' field.
   * @param value the value to set.
   */
  public void setAddressLine(java.util.List<com.beligum.blocks.schema.ebucore.v2015.avro.elementType> value) {
    this.addressLine = value;
  }

  /**
   * Gets the value of the 'addressTownCity' field.
   */
  public com.beligum.blocks.schema.ebucore.v2015.avro.elementType getAddressTownCity() {
    return addressTownCity;
  }

  /**
   * Sets the value of the 'addressTownCity' field.
   * @param value the value to set.
   */
  public void setAddressTownCity(com.beligum.blocks.schema.ebucore.v2015.avro.elementType value) {
    this.addressTownCity = value;
  }

  /**
   * Gets the value of the 'addressCountyState' field.
   */
  public com.beligum.blocks.schema.ebucore.v2015.avro.elementType getAddressCountyState() {
    return addressCountyState;
  }

  /**
   * Sets the value of the 'addressCountyState' field.
   * @param value the value to set.
   */
  public void setAddressCountyState(com.beligum.blocks.schema.ebucore.v2015.avro.elementType value) {
    this.addressCountyState = value;
  }

  /**
   * Gets the value of the 'addressDeliveryCode' field.
   */
  public java.util.List<java.lang.CharSequence> getAddressDeliveryCode() {
    return addressDeliveryCode;
  }

  /**
   * Sets the value of the 'addressDeliveryCode' field.
   * @param value the value to set.
   */
  public void setAddressDeliveryCode(java.util.List<java.lang.CharSequence> value) {
    this.addressDeliveryCode = value;
  }

  /**
   * Gets the value of the 'country' field.
   */
  public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_countryaddressType getCountry() {
    return country;
  }

  /**
   * Sets the value of the 'country' field.
   * @param value the value to set.
   */
  public void setCountry(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_countryaddressType value) {
    this.country = value;
  }

  /** Creates a new addressType RecordBuilder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder newBuilder() {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder();
  }
  
  /** Creates a new addressType RecordBuilder by copying an existing Builder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder(other);
  }
  
  /** Creates a new addressType RecordBuilder by copying an existing addressType instance */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.addressType other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder(other);
  }
  
  /**
   * RecordBuilder for addressType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<addressType>
    implements org.apache.avro.data.RecordBuilder<addressType> {

    private java.util.List<com.beligum.blocks.schema.ebucore.v2015.avro.elementType> addressLine;
    private com.beligum.blocks.schema.ebucore.v2015.avro.elementType addressTownCity;
    private com.beligum.blocks.schema.ebucore.v2015.avro.elementType addressCountyState;
    private java.util.List<java.lang.CharSequence> addressDeliveryCode;
    private com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_countryaddressType country;

    /** Creates a new Builder */
    private Builder() {
      super(com.beligum.blocks.schema.ebucore.v2015.avro.addressType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.addressLine)) {
        this.addressLine = data().deepCopy(fields()[0].schema(), other.addressLine);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.addressTownCity)) {
        this.addressTownCity = data().deepCopy(fields()[1].schema(), other.addressTownCity);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.addressCountyState)) {
        this.addressCountyState = data().deepCopy(fields()[2].schema(), other.addressCountyState);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.addressDeliveryCode)) {
        this.addressDeliveryCode = data().deepCopy(fields()[3].schema(), other.addressDeliveryCode);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.country)) {
        this.country = data().deepCopy(fields()[4].schema(), other.country);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing addressType instance */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.addressType other) {
            super(com.beligum.blocks.schema.ebucore.v2015.avro.addressType.SCHEMA$);
      if (isValidValue(fields()[0], other.addressLine)) {
        this.addressLine = data().deepCopy(fields()[0].schema(), other.addressLine);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.addressTownCity)) {
        this.addressTownCity = data().deepCopy(fields()[1].schema(), other.addressTownCity);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.addressCountyState)) {
        this.addressCountyState = data().deepCopy(fields()[2].schema(), other.addressCountyState);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.addressDeliveryCode)) {
        this.addressDeliveryCode = data().deepCopy(fields()[3].schema(), other.addressDeliveryCode);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.country)) {
        this.country = data().deepCopy(fields()[4].schema(), other.country);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'addressLine' field */
    public java.util.List<com.beligum.blocks.schema.ebucore.v2015.avro.elementType> getAddressLine() {
      return addressLine;
    }
    
    /** Sets the value of the 'addressLine' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder setAddressLine(java.util.List<com.beligum.blocks.schema.ebucore.v2015.avro.elementType> value) {
      validate(fields()[0], value);
      this.addressLine = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'addressLine' field has been set */
    public boolean hasAddressLine() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'addressLine' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder clearAddressLine() {
      addressLine = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'addressTownCity' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.elementType getAddressTownCity() {
      return addressTownCity;
    }
    
    /** Sets the value of the 'addressTownCity' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder setAddressTownCity(com.beligum.blocks.schema.ebucore.v2015.avro.elementType value) {
      validate(fields()[1], value);
      this.addressTownCity = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'addressTownCity' field has been set */
    public boolean hasAddressTownCity() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'addressTownCity' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder clearAddressTownCity() {
      addressTownCity = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'addressCountyState' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.elementType getAddressCountyState() {
      return addressCountyState;
    }
    
    /** Sets the value of the 'addressCountyState' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder setAddressCountyState(com.beligum.blocks.schema.ebucore.v2015.avro.elementType value) {
      validate(fields()[2], value);
      this.addressCountyState = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'addressCountyState' field has been set */
    public boolean hasAddressCountyState() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'addressCountyState' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder clearAddressCountyState() {
      addressCountyState = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'addressDeliveryCode' field */
    public java.util.List<java.lang.CharSequence> getAddressDeliveryCode() {
      return addressDeliveryCode;
    }
    
    /** Sets the value of the 'addressDeliveryCode' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder setAddressDeliveryCode(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[3], value);
      this.addressDeliveryCode = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'addressDeliveryCode' field has been set */
    public boolean hasAddressDeliveryCode() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'addressDeliveryCode' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder clearAddressDeliveryCode() {
      addressDeliveryCode = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'country' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_countryaddressType getCountry() {
      return country;
    }
    
    /** Sets the value of the 'country' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder setCountry(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_countryaddressType value) {
      validate(fields()[4], value);
      this.country = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'country' field has been set */
    public boolean hasCountry() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'country' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.addressType.Builder clearCountry() {
      country = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public addressType build() {
      try {
        addressType record = new addressType();
        record.addressLine = fieldSetFlags()[0] ? this.addressLine : (java.util.List<com.beligum.blocks.schema.ebucore.v2015.avro.elementType>) defaultValue(fields()[0]);
        record.addressTownCity = fieldSetFlags()[1] ? this.addressTownCity : (com.beligum.blocks.schema.ebucore.v2015.avro.elementType) defaultValue(fields()[1]);
        record.addressCountyState = fieldSetFlags()[2] ? this.addressCountyState : (com.beligum.blocks.schema.ebucore.v2015.avro.elementType) defaultValue(fields()[2]);
        record.addressDeliveryCode = fieldSetFlags()[3] ? this.addressDeliveryCode : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[3]);
        record.country = fieldSetFlags()[4] ? this.country : (com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_countryaddressType) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}