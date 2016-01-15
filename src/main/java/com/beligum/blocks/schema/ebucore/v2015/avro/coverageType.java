/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.beligum.blocks.schema.ebucore.v2015.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class coverageType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"coverageType\",\"namespace\":\"com.beligum.blocks.schema.ebucore.v2015.avro\",\"fields\":[{\"name\":\"typeLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLabel\"},{\"name\":\"typeDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeDefinition\"},{\"name\":\"typeLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLink\"},{\"name\":\"typeSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeSource\"},{\"name\":\"typeNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeNamespace\"},{\"name\":\"typeLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLanguage\"},{\"name\":\"coverage\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"elementType\",\"fields\":[{\"name\":\"lang\",\"type\":[\"null\",\"string\"],\"source\":\"attribute lang\"}]}],\"source\":\"element coverage\"},{\"name\":\"temporal\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"temporalType\",\"fields\":[{\"name\":\"typeLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLabel\"},{\"name\":\"typeDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeDefinition\"},{\"name\":\"typeLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLink\"},{\"name\":\"typeSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeSource\"},{\"name\":\"typeNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeNamespace\"},{\"name\":\"typeLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLanguage\"},{\"name\":\"note\",\"type\":[\"null\",\"string\"],\"source\":\"attribute note\"},{\"name\":\"PeriodOfTime\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"periodOfTimeType\",\"fields\":[{\"name\":\"periodId\",\"type\":[\"null\",\"string\"],\"source\":\"attribute periodId\"},{\"name\":\"startYear\",\"type\":[\"null\",\"string\"],\"source\":\"attribute startYear\"},{\"name\":\"startDate\",\"type\":[\"null\",\"string\"],\"source\":\"attribute startDate\"},{\"name\":\"startTime\",\"type\":[\"null\",\"string\"],\"source\":\"attribute startTime\"},{\"name\":\"endYear\",\"type\":[\"null\",\"string\"],\"source\":\"attribute endYear\"},{\"name\":\"endDate\",\"type\":[\"null\",\"string\"],\"source\":\"attribute endDate\"},{\"name\":\"endTime\",\"type\":[\"null\",\"string\"],\"source\":\"attribute endTime\"},{\"name\":\"period\",\"type\":[\"null\",\"string\"],\"source\":\"attribute period\"},{\"name\":\"periodName\",\"type\":[\"null\",\"elementType\"],\"source\":\"element periodName\"}]}},\"source\":\"element PeriodOfTime\"}]}],\"source\":\"element temporal\"},{\"name\":\"spatial\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"spatialType\",\"fields\":[{\"name\":\"location\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"locationType\",\"fields\":[{\"name\":\"typeLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLabel\"},{\"name\":\"typeDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeDefinition\"},{\"name\":\"typeLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLink\"},{\"name\":\"typeSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeSource\"},{\"name\":\"typeNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeNamespace\"},{\"name\":\"typeLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLanguage\"},{\"name\":\"note\",\"type\":[\"null\",\"string\"],\"source\":\"attribute note\"},{\"name\":\"locationId\",\"type\":[\"null\",\"string\"],\"source\":\"attribute locationId\"},{\"name\":\"name\",\"type\":[\"null\",\"elementType\"],\"source\":\"element name\"},{\"name\":\"description\",\"type\":[\"null\",\"elementType\"],\"source\":\"element description\"},{\"name\":\"coordinates\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AnonType_coordinateslocationType\",\"fields\":[{\"name\":\"formatLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatLabel\"},{\"name\":\"formatDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatDefinition\"},{\"name\":\"formatLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatLink\"},{\"name\":\"formatSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatSource\"},{\"name\":\"formatNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatNamespace\"},{\"name\":\"formatLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatLanguage\"},{\"name\":\"posy\",\"type\":\"float\",\"source\":\"element posy\"},{\"name\":\"posx\",\"type\":\"float\",\"source\":\"element posx\"}]}],\"source\":\"element coordinates\"},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"source\":\"element code\"},{\"name\":\"region\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"regionType\",\"fields\":[{\"name\":\"country\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AnonType_countryregionType\",\"fields\":[{\"name\":\"typeLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLabel\"},{\"name\":\"typeDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeDefinition\"},{\"name\":\"typeLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLink\"},{\"name\":\"typeSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeSource\"},{\"name\":\"typeNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeNamespace\"},{\"name\":\"typeLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLanguage\"}]}],\"source\":\"element country\"},{\"name\":\"countryRegion\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AnonType_countryRegionregionType\",\"fields\":[{\"name\":\"typeLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLabel\"},{\"name\":\"typeDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeDefinition\"},{\"name\":\"typeLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLink\"},{\"name\":\"typeSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeSource\"},{\"name\":\"typeNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeNamespace\"},{\"name\":\"typeLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLanguage\"}]}},\"source\":\"element countryRegion\"}]}],\"source\":\"element region\"}]}},\"source\":\"element location\"}]}],\"source\":\"element spatial\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence typeLabel;
  @Deprecated public java.lang.CharSequence typeDefinition;
  @Deprecated public java.lang.CharSequence typeLink;
  @Deprecated public java.lang.CharSequence typeSource;
  @Deprecated public java.lang.CharSequence typeNamespace;
  @Deprecated public java.lang.CharSequence typeLanguage;
  @Deprecated public com.beligum.blocks.schema.ebucore.v2015.avro.elementType coverage;
  @Deprecated public com.beligum.blocks.schema.ebucore.v2015.avro.temporalType temporal;
  @Deprecated public com.beligum.blocks.schema.ebucore.v2015.avro.spatialType spatial;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public coverageType() {}

  /**
   * All-args constructor.
   */
  public coverageType(java.lang.CharSequence typeLabel, java.lang.CharSequence typeDefinition, java.lang.CharSequence typeLink, java.lang.CharSequence typeSource, java.lang.CharSequence typeNamespace, java.lang.CharSequence typeLanguage, com.beligum.blocks.schema.ebucore.v2015.avro.elementType coverage, com.beligum.blocks.schema.ebucore.v2015.avro.temporalType temporal, com.beligum.blocks.schema.ebucore.v2015.avro.spatialType spatial) {
    this.typeLabel = typeLabel;
    this.typeDefinition = typeDefinition;
    this.typeLink = typeLink;
    this.typeSource = typeSource;
    this.typeNamespace = typeNamespace;
    this.typeLanguage = typeLanguage;
    this.coverage = coverage;
    this.temporal = temporal;
    this.spatial = spatial;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return typeLabel;
    case 1: return typeDefinition;
    case 2: return typeLink;
    case 3: return typeSource;
    case 4: return typeNamespace;
    case 5: return typeLanguage;
    case 6: return coverage;
    case 7: return temporal;
    case 8: return spatial;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: typeLabel = (java.lang.CharSequence)value$; break;
    case 1: typeDefinition = (java.lang.CharSequence)value$; break;
    case 2: typeLink = (java.lang.CharSequence)value$; break;
    case 3: typeSource = (java.lang.CharSequence)value$; break;
    case 4: typeNamespace = (java.lang.CharSequence)value$; break;
    case 5: typeLanguage = (java.lang.CharSequence)value$; break;
    case 6: coverage = (com.beligum.blocks.schema.ebucore.v2015.avro.elementType)value$; break;
    case 7: temporal = (com.beligum.blocks.schema.ebucore.v2015.avro.temporalType)value$; break;
    case 8: spatial = (com.beligum.blocks.schema.ebucore.v2015.avro.spatialType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'typeLabel' field.
   */
  public java.lang.CharSequence getTypeLabel() {
    return typeLabel;
  }

  /**
   * Sets the value of the 'typeLabel' field.
   * @param value the value to set.
   */
  public void setTypeLabel(java.lang.CharSequence value) {
    this.typeLabel = value;
  }

  /**
   * Gets the value of the 'typeDefinition' field.
   */
  public java.lang.CharSequence getTypeDefinition() {
    return typeDefinition;
  }

  /**
   * Sets the value of the 'typeDefinition' field.
   * @param value the value to set.
   */
  public void setTypeDefinition(java.lang.CharSequence value) {
    this.typeDefinition = value;
  }

  /**
   * Gets the value of the 'typeLink' field.
   */
  public java.lang.CharSequence getTypeLink() {
    return typeLink;
  }

  /**
   * Sets the value of the 'typeLink' field.
   * @param value the value to set.
   */
  public void setTypeLink(java.lang.CharSequence value) {
    this.typeLink = value;
  }

  /**
   * Gets the value of the 'typeSource' field.
   */
  public java.lang.CharSequence getTypeSource() {
    return typeSource;
  }

  /**
   * Sets the value of the 'typeSource' field.
   * @param value the value to set.
   */
  public void setTypeSource(java.lang.CharSequence value) {
    this.typeSource = value;
  }

  /**
   * Gets the value of the 'typeNamespace' field.
   */
  public java.lang.CharSequence getTypeNamespace() {
    return typeNamespace;
  }

  /**
   * Sets the value of the 'typeNamespace' field.
   * @param value the value to set.
   */
  public void setTypeNamespace(java.lang.CharSequence value) {
    this.typeNamespace = value;
  }

  /**
   * Gets the value of the 'typeLanguage' field.
   */
  public java.lang.CharSequence getTypeLanguage() {
    return typeLanguage;
  }

  /**
   * Sets the value of the 'typeLanguage' field.
   * @param value the value to set.
   */
  public void setTypeLanguage(java.lang.CharSequence value) {
    this.typeLanguage = value;
  }

  /**
   * Gets the value of the 'coverage' field.
   */
  public com.beligum.blocks.schema.ebucore.v2015.avro.elementType getCoverage() {
    return coverage;
  }

  /**
   * Sets the value of the 'coverage' field.
   * @param value the value to set.
   */
  public void setCoverage(com.beligum.blocks.schema.ebucore.v2015.avro.elementType value) {
    this.coverage = value;
  }

  /**
   * Gets the value of the 'temporal' field.
   */
  public com.beligum.blocks.schema.ebucore.v2015.avro.temporalType getTemporal() {
    return temporal;
  }

  /**
   * Sets the value of the 'temporal' field.
   * @param value the value to set.
   */
  public void setTemporal(com.beligum.blocks.schema.ebucore.v2015.avro.temporalType value) {
    this.temporal = value;
  }

  /**
   * Gets the value of the 'spatial' field.
   */
  public com.beligum.blocks.schema.ebucore.v2015.avro.spatialType getSpatial() {
    return spatial;
  }

  /**
   * Sets the value of the 'spatial' field.
   * @param value the value to set.
   */
  public void setSpatial(com.beligum.blocks.schema.ebucore.v2015.avro.spatialType value) {
    this.spatial = value;
  }

  /** Creates a new coverageType RecordBuilder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder newBuilder() {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder();
  }
  
  /** Creates a new coverageType RecordBuilder by copying an existing Builder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder(other);
  }
  
  /** Creates a new coverageType RecordBuilder by copying an existing coverageType instance */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.coverageType other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder(other);
  }
  
  /**
   * RecordBuilder for coverageType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<coverageType>
    implements org.apache.avro.data.RecordBuilder<coverageType> {

    private java.lang.CharSequence typeLabel;
    private java.lang.CharSequence typeDefinition;
    private java.lang.CharSequence typeLink;
    private java.lang.CharSequence typeSource;
    private java.lang.CharSequence typeNamespace;
    private java.lang.CharSequence typeLanguage;
    private com.beligum.blocks.schema.ebucore.v2015.avro.elementType coverage;
    private com.beligum.blocks.schema.ebucore.v2015.avro.temporalType temporal;
    private com.beligum.blocks.schema.ebucore.v2015.avro.spatialType spatial;

    /** Creates a new Builder */
    private Builder() {
      super(com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.typeLabel)) {
        this.typeLabel = data().deepCopy(fields()[0].schema(), other.typeLabel);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.typeDefinition)) {
        this.typeDefinition = data().deepCopy(fields()[1].schema(), other.typeDefinition);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.typeLink)) {
        this.typeLink = data().deepCopy(fields()[2].schema(), other.typeLink);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.typeSource)) {
        this.typeSource = data().deepCopy(fields()[3].schema(), other.typeSource);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.typeNamespace)) {
        this.typeNamespace = data().deepCopy(fields()[4].schema(), other.typeNamespace);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.typeLanguage)) {
        this.typeLanguage = data().deepCopy(fields()[5].schema(), other.typeLanguage);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.coverage)) {
        this.coverage = data().deepCopy(fields()[6].schema(), other.coverage);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.temporal)) {
        this.temporal = data().deepCopy(fields()[7].schema(), other.temporal);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.spatial)) {
        this.spatial = data().deepCopy(fields()[8].schema(), other.spatial);
        fieldSetFlags()[8] = true;
      }
    }
    
    /** Creates a Builder by copying an existing coverageType instance */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.coverageType other) {
            super(com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.SCHEMA$);
      if (isValidValue(fields()[0], other.typeLabel)) {
        this.typeLabel = data().deepCopy(fields()[0].schema(), other.typeLabel);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.typeDefinition)) {
        this.typeDefinition = data().deepCopy(fields()[1].schema(), other.typeDefinition);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.typeLink)) {
        this.typeLink = data().deepCopy(fields()[2].schema(), other.typeLink);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.typeSource)) {
        this.typeSource = data().deepCopy(fields()[3].schema(), other.typeSource);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.typeNamespace)) {
        this.typeNamespace = data().deepCopy(fields()[4].schema(), other.typeNamespace);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.typeLanguage)) {
        this.typeLanguage = data().deepCopy(fields()[5].schema(), other.typeLanguage);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.coverage)) {
        this.coverage = data().deepCopy(fields()[6].schema(), other.coverage);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.temporal)) {
        this.temporal = data().deepCopy(fields()[7].schema(), other.temporal);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.spatial)) {
        this.spatial = data().deepCopy(fields()[8].schema(), other.spatial);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'typeLabel' field */
    public java.lang.CharSequence getTypeLabel() {
      return typeLabel;
    }
    
    /** Sets the value of the 'typeLabel' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder setTypeLabel(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.typeLabel = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'typeLabel' field has been set */
    public boolean hasTypeLabel() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'typeLabel' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder clearTypeLabel() {
      typeLabel = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'typeDefinition' field */
    public java.lang.CharSequence getTypeDefinition() {
      return typeDefinition;
    }
    
    /** Sets the value of the 'typeDefinition' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder setTypeDefinition(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.typeDefinition = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'typeDefinition' field has been set */
    public boolean hasTypeDefinition() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'typeDefinition' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder clearTypeDefinition() {
      typeDefinition = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'typeLink' field */
    public java.lang.CharSequence getTypeLink() {
      return typeLink;
    }
    
    /** Sets the value of the 'typeLink' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder setTypeLink(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.typeLink = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'typeLink' field has been set */
    public boolean hasTypeLink() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'typeLink' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder clearTypeLink() {
      typeLink = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'typeSource' field */
    public java.lang.CharSequence getTypeSource() {
      return typeSource;
    }
    
    /** Sets the value of the 'typeSource' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder setTypeSource(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.typeSource = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'typeSource' field has been set */
    public boolean hasTypeSource() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'typeSource' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder clearTypeSource() {
      typeSource = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'typeNamespace' field */
    public java.lang.CharSequence getTypeNamespace() {
      return typeNamespace;
    }
    
    /** Sets the value of the 'typeNamespace' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder setTypeNamespace(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.typeNamespace = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'typeNamespace' field has been set */
    public boolean hasTypeNamespace() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'typeNamespace' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder clearTypeNamespace() {
      typeNamespace = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'typeLanguage' field */
    public java.lang.CharSequence getTypeLanguage() {
      return typeLanguage;
    }
    
    /** Sets the value of the 'typeLanguage' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder setTypeLanguage(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.typeLanguage = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'typeLanguage' field has been set */
    public boolean hasTypeLanguage() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'typeLanguage' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder clearTypeLanguage() {
      typeLanguage = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'coverage' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.elementType getCoverage() {
      return coverage;
    }
    
    /** Sets the value of the 'coverage' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder setCoverage(com.beligum.blocks.schema.ebucore.v2015.avro.elementType value) {
      validate(fields()[6], value);
      this.coverage = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'coverage' field has been set */
    public boolean hasCoverage() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'coverage' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder clearCoverage() {
      coverage = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'temporal' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.temporalType getTemporal() {
      return temporal;
    }
    
    /** Sets the value of the 'temporal' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder setTemporal(com.beligum.blocks.schema.ebucore.v2015.avro.temporalType value) {
      validate(fields()[7], value);
      this.temporal = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'temporal' field has been set */
    public boolean hasTemporal() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'temporal' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder clearTemporal() {
      temporal = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'spatial' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.spatialType getSpatial() {
      return spatial;
    }
    
    /** Sets the value of the 'spatial' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder setSpatial(com.beligum.blocks.schema.ebucore.v2015.avro.spatialType value) {
      validate(fields()[8], value);
      this.spatial = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'spatial' field has been set */
    public boolean hasSpatial() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'spatial' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.coverageType.Builder clearSpatial() {
      spatial = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public coverageType build() {
      try {
        coverageType record = new coverageType();
        record.typeLabel = fieldSetFlags()[0] ? this.typeLabel : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.typeDefinition = fieldSetFlags()[1] ? this.typeDefinition : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.typeLink = fieldSetFlags()[2] ? this.typeLink : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.typeSource = fieldSetFlags()[3] ? this.typeSource : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.typeNamespace = fieldSetFlags()[4] ? this.typeNamespace : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.typeLanguage = fieldSetFlags()[5] ? this.typeLanguage : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.coverage = fieldSetFlags()[6] ? this.coverage : (com.beligum.blocks.schema.ebucore.v2015.avro.elementType) defaultValue(fields()[6]);
        record.temporal = fieldSetFlags()[7] ? this.temporal : (com.beligum.blocks.schema.ebucore.v2015.avro.temporalType) defaultValue(fields()[7]);
        record.spatial = fieldSetFlags()[8] ? this.spatial : (com.beligum.blocks.schema.ebucore.v2015.avro.spatialType) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
