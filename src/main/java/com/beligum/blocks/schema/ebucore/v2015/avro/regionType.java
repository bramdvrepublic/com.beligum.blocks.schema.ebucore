/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class regionType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"regionType\",\"fields\":[{\"name\":\"country\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AnonType_countryregionType\",\"fields\":[{\"name\":\"typeLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLabel\"},{\"name\":\"typeDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeDefinition\"},{\"name\":\"typeLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLink\"},{\"name\":\"typeSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeSource\"},{\"name\":\"typeNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeNamespace\"},{\"name\":\"typeLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLanguage\"}]}],\"source\":\"element country\"},{\"name\":\"countryRegion\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AnonType_countryRegionregionType\",\"fields\":[{\"name\":\"typeLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLabel\"},{\"name\":\"typeDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeDefinition\"},{\"name\":\"typeLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLink\"},{\"name\":\"typeSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeSource\"},{\"name\":\"typeNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeNamespace\"},{\"name\":\"typeLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLanguage\"}]}},\"source\":\"element countryRegion\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public AnonType_countryregionType country;
  @Deprecated public java.util.List<AnonType_countryRegionregionType> countryRegion;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public regionType() {}

  /**
   * All-args constructor.
   */
  public regionType(AnonType_countryregionType country, java.util.List<AnonType_countryRegionregionType> countryRegion) {
    this.country = country;
    this.countryRegion = countryRegion;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return country;
    case 1: return countryRegion;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: country = (AnonType_countryregionType)value$; break;
    case 1: countryRegion = (java.util.List<AnonType_countryRegionregionType>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'country' field.
   */
  public AnonType_countryregionType getCountry() {
    return country;
  }

  /**
   * Sets the value of the 'country' field.
   * @param value the value to set.
   */
  public void setCountry(AnonType_countryregionType value) {
    this.country = value;
  }

  /**
   * Gets the value of the 'countryRegion' field.
   */
  public java.util.List<AnonType_countryRegionregionType> getCountryRegion() {
    return countryRegion;
  }

  /**
   * Sets the value of the 'countryRegion' field.
   * @param value the value to set.
   */
  public void setCountryRegion(java.util.List<AnonType_countryRegionregionType> value) {
    this.countryRegion = value;
  }

  /** Creates a new regionType RecordBuilder */
  public static regionType.Builder newBuilder() {
    return new regionType.Builder();
  }
  
  /** Creates a new regionType RecordBuilder by copying an existing Builder */
  public static regionType.Builder newBuilder(regionType.Builder other) {
    return new regionType.Builder(other);
  }
  
  /** Creates a new regionType RecordBuilder by copying an existing regionType instance */
  public static regionType.Builder newBuilder(regionType other) {
    return new regionType.Builder(other);
  }
  
  /**
   * RecordBuilder for regionType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<regionType>
    implements org.apache.avro.data.RecordBuilder<regionType> {

    private AnonType_countryregionType country;
    private java.util.List<AnonType_countryRegionregionType> countryRegion;

    /** Creates a new Builder */
    private Builder() {
      super(regionType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(regionType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.country)) {
        this.country = data().deepCopy(fields()[0].schema(), other.country);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.countryRegion)) {
        this.countryRegion = data().deepCopy(fields()[1].schema(), other.countryRegion);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing regionType instance */
    private Builder(regionType other) {
            super(regionType.SCHEMA$);
      if (isValidValue(fields()[0], other.country)) {
        this.country = data().deepCopy(fields()[0].schema(), other.country);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.countryRegion)) {
        this.countryRegion = data().deepCopy(fields()[1].schema(), other.countryRegion);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'country' field */
    public AnonType_countryregionType getCountry() {
      return country;
    }
    
    /** Sets the value of the 'country' field */
    public regionType.Builder setCountry(AnonType_countryregionType value) {
      validate(fields()[0], value);
      this.country = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'country' field has been set */
    public boolean hasCountry() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'country' field */
    public regionType.Builder clearCountry() {
      country = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'countryRegion' field */
    public java.util.List<AnonType_countryRegionregionType> getCountryRegion() {
      return countryRegion;
    }
    
    /** Sets the value of the 'countryRegion' field */
    public regionType.Builder setCountryRegion(java.util.List<AnonType_countryRegionregionType> value) {
      validate(fields()[1], value);
      this.countryRegion = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'countryRegion' field has been set */
    public boolean hasCountryRegion() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'countryRegion' field */
    public regionType.Builder clearCountryRegion() {
      countryRegion = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public regionType build() {
      try {
        regionType record = new regionType();
        record.country = fieldSetFlags()[0] ? this.country : (AnonType_countryregionType) defaultValue(fields()[0]);
        record.countryRegion = fieldSetFlags()[1] ? this.countryRegion : (java.util.List<AnonType_countryRegionregionType>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
