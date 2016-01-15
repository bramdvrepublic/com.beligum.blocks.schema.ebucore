/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.beligum.blocks.schema.ebucore.v2015.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class locationType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"locationType\",\"namespace\":\"com.beligum.blocks.schema.ebucore.v2015.avro\",\"fields\":[{\"name\":\"typeLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLabel\"},{\"name\":\"typeDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeDefinition\"},{\"name\":\"typeLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLink\"},{\"name\":\"typeSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeSource\"},{\"name\":\"typeNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeNamespace\"},{\"name\":\"typeLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLanguage\"},{\"name\":\"note\",\"type\":[\"null\",\"string\"],\"source\":\"attribute note\"},{\"name\":\"locationId\",\"type\":[\"null\",\"string\"],\"source\":\"attribute locationId\"},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"elementType\",\"fields\":[{\"name\":\"lang\",\"type\":[\"null\",\"string\"],\"source\":\"attribute lang\"}]}],\"source\":\"element name\"},{\"name\":\"description\",\"type\":[\"null\",\"elementType\"],\"source\":\"element description\"},{\"name\":\"coordinates\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AnonType_coordinateslocationType\",\"fields\":[{\"name\":\"formatLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatLabel\"},{\"name\":\"formatDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatDefinition\"},{\"name\":\"formatLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatLink\"},{\"name\":\"formatSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatSource\"},{\"name\":\"formatNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatNamespace\"},{\"name\":\"formatLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatLanguage\"},{\"name\":\"posy\",\"type\":\"float\",\"source\":\"element posy\"},{\"name\":\"posx\",\"type\":\"float\",\"source\":\"element posx\"}]}],\"source\":\"element coordinates\"},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"source\":\"element code\"},{\"name\":\"region\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"regionType\",\"fields\":[{\"name\":\"country\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AnonType_countryregionType\",\"fields\":[{\"name\":\"typeLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLabel\"},{\"name\":\"typeDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeDefinition\"},{\"name\":\"typeLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLink\"},{\"name\":\"typeSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeSource\"},{\"name\":\"typeNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeNamespace\"},{\"name\":\"typeLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLanguage\"}]}],\"source\":\"element country\"},{\"name\":\"countryRegion\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AnonType_countryRegionregionType\",\"fields\":[{\"name\":\"typeLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLabel\"},{\"name\":\"typeDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeDefinition\"},{\"name\":\"typeLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLink\"},{\"name\":\"typeSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeSource\"},{\"name\":\"typeNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeNamespace\"},{\"name\":\"typeLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLanguage\"}]}},\"source\":\"element countryRegion\"}]}],\"source\":\"element region\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence typeLabel;
  @Deprecated public java.lang.CharSequence typeDefinition;
  @Deprecated public java.lang.CharSequence typeLink;
  @Deprecated public java.lang.CharSequence typeSource;
  @Deprecated public java.lang.CharSequence typeNamespace;
  @Deprecated public java.lang.CharSequence typeLanguage;
  @Deprecated public java.lang.CharSequence note;
  @Deprecated public java.lang.CharSequence locationId;
  @Deprecated public com.beligum.blocks.schema.ebucore.v2015.avro.elementType name;
  @Deprecated public com.beligum.blocks.schema.ebucore.v2015.avro.elementType description;
  @Deprecated public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_coordinateslocationType coordinates;
  @Deprecated public java.lang.CharSequence code;
  @Deprecated public com.beligum.blocks.schema.ebucore.v2015.avro.regionType region;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public locationType() {}

  /**
   * All-args constructor.
   */
  public locationType(java.lang.CharSequence typeLabel, java.lang.CharSequence typeDefinition, java.lang.CharSequence typeLink, java.lang.CharSequence typeSource, java.lang.CharSequence typeNamespace, java.lang.CharSequence typeLanguage, java.lang.CharSequence note, java.lang.CharSequence locationId, com.beligum.blocks.schema.ebucore.v2015.avro.elementType name, com.beligum.blocks.schema.ebucore.v2015.avro.elementType description, com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_coordinateslocationType coordinates, java.lang.CharSequence code, com.beligum.blocks.schema.ebucore.v2015.avro.regionType region) {
    this.typeLabel = typeLabel;
    this.typeDefinition = typeDefinition;
    this.typeLink = typeLink;
    this.typeSource = typeSource;
    this.typeNamespace = typeNamespace;
    this.typeLanguage = typeLanguage;
    this.note = note;
    this.locationId = locationId;
    this.name = name;
    this.description = description;
    this.coordinates = coordinates;
    this.code = code;
    this.region = region;
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
    case 6: return note;
    case 7: return locationId;
    case 8: return name;
    case 9: return description;
    case 10: return coordinates;
    case 11: return code;
    case 12: return region;
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
    case 6: note = (java.lang.CharSequence)value$; break;
    case 7: locationId = (java.lang.CharSequence)value$; break;
    case 8: name = (com.beligum.blocks.schema.ebucore.v2015.avro.elementType)value$; break;
    case 9: description = (com.beligum.blocks.schema.ebucore.v2015.avro.elementType)value$; break;
    case 10: coordinates = (com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_coordinateslocationType)value$; break;
    case 11: code = (java.lang.CharSequence)value$; break;
    case 12: region = (com.beligum.blocks.schema.ebucore.v2015.avro.regionType)value$; break;
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
   * Gets the value of the 'note' field.
   */
  public java.lang.CharSequence getNote() {
    return note;
  }

  /**
   * Sets the value of the 'note' field.
   * @param value the value to set.
   */
  public void setNote(java.lang.CharSequence value) {
    this.note = value;
  }

  /**
   * Gets the value of the 'locationId' field.
   */
  public java.lang.CharSequence getLocationId() {
    return locationId;
  }

  /**
   * Sets the value of the 'locationId' field.
   * @param value the value to set.
   */
  public void setLocationId(java.lang.CharSequence value) {
    this.locationId = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public com.beligum.blocks.schema.ebucore.v2015.avro.elementType getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(com.beligum.blocks.schema.ebucore.v2015.avro.elementType value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   */
  public com.beligum.blocks.schema.ebucore.v2015.avro.elementType getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(com.beligum.blocks.schema.ebucore.v2015.avro.elementType value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'coordinates' field.
   */
  public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_coordinateslocationType getCoordinates() {
    return coordinates;
  }

  /**
   * Sets the value of the 'coordinates' field.
   * @param value the value to set.
   */
  public void setCoordinates(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_coordinateslocationType value) {
    this.coordinates = value;
  }

  /**
   * Gets the value of the 'code' field.
   */
  public java.lang.CharSequence getCode() {
    return code;
  }

  /**
   * Sets the value of the 'code' field.
   * @param value the value to set.
   */
  public void setCode(java.lang.CharSequence value) {
    this.code = value;
  }

  /**
   * Gets the value of the 'region' field.
   */
  public com.beligum.blocks.schema.ebucore.v2015.avro.regionType getRegion() {
    return region;
  }

  /**
   * Sets the value of the 'region' field.
   * @param value the value to set.
   */
  public void setRegion(com.beligum.blocks.schema.ebucore.v2015.avro.regionType value) {
    this.region = value;
  }

  /** Creates a new locationType RecordBuilder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder newBuilder() {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder();
  }
  
  /** Creates a new locationType RecordBuilder by copying an existing Builder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder(other);
  }
  
  /** Creates a new locationType RecordBuilder by copying an existing locationType instance */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.locationType other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder(other);
  }
  
  /**
   * RecordBuilder for locationType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<locationType>
    implements org.apache.avro.data.RecordBuilder<locationType> {

    private java.lang.CharSequence typeLabel;
    private java.lang.CharSequence typeDefinition;
    private java.lang.CharSequence typeLink;
    private java.lang.CharSequence typeSource;
    private java.lang.CharSequence typeNamespace;
    private java.lang.CharSequence typeLanguage;
    private java.lang.CharSequence note;
    private java.lang.CharSequence locationId;
    private com.beligum.blocks.schema.ebucore.v2015.avro.elementType name;
    private com.beligum.blocks.schema.ebucore.v2015.avro.elementType description;
    private com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_coordinateslocationType coordinates;
    private java.lang.CharSequence code;
    private com.beligum.blocks.schema.ebucore.v2015.avro.regionType region;

    /** Creates a new Builder */
    private Builder() {
      super(com.beligum.blocks.schema.ebucore.v2015.avro.locationType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder other) {
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
      if (isValidValue(fields()[6], other.note)) {
        this.note = data().deepCopy(fields()[6].schema(), other.note);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.locationId)) {
        this.locationId = data().deepCopy(fields()[7].schema(), other.locationId);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.name)) {
        this.name = data().deepCopy(fields()[8].schema(), other.name);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.description)) {
        this.description = data().deepCopy(fields()[9].schema(), other.description);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.coordinates)) {
        this.coordinates = data().deepCopy(fields()[10].schema(), other.coordinates);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.code)) {
        this.code = data().deepCopy(fields()[11].schema(), other.code);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.region)) {
        this.region = data().deepCopy(fields()[12].schema(), other.region);
        fieldSetFlags()[12] = true;
      }
    }
    
    /** Creates a Builder by copying an existing locationType instance */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.locationType other) {
            super(com.beligum.blocks.schema.ebucore.v2015.avro.locationType.SCHEMA$);
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
      if (isValidValue(fields()[6], other.note)) {
        this.note = data().deepCopy(fields()[6].schema(), other.note);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.locationId)) {
        this.locationId = data().deepCopy(fields()[7].schema(), other.locationId);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.name)) {
        this.name = data().deepCopy(fields()[8].schema(), other.name);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.description)) {
        this.description = data().deepCopy(fields()[9].schema(), other.description);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.coordinates)) {
        this.coordinates = data().deepCopy(fields()[10].schema(), other.coordinates);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.code)) {
        this.code = data().deepCopy(fields()[11].schema(), other.code);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.region)) {
        this.region = data().deepCopy(fields()[12].schema(), other.region);
        fieldSetFlags()[12] = true;
      }
    }

    /** Gets the value of the 'typeLabel' field */
    public java.lang.CharSequence getTypeLabel() {
      return typeLabel;
    }
    
    /** Sets the value of the 'typeLabel' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder setTypeLabel(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder clearTypeLabel() {
      typeLabel = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'typeDefinition' field */
    public java.lang.CharSequence getTypeDefinition() {
      return typeDefinition;
    }
    
    /** Sets the value of the 'typeDefinition' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder setTypeDefinition(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder clearTypeDefinition() {
      typeDefinition = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'typeLink' field */
    public java.lang.CharSequence getTypeLink() {
      return typeLink;
    }
    
    /** Sets the value of the 'typeLink' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder setTypeLink(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder clearTypeLink() {
      typeLink = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'typeSource' field */
    public java.lang.CharSequence getTypeSource() {
      return typeSource;
    }
    
    /** Sets the value of the 'typeSource' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder setTypeSource(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder clearTypeSource() {
      typeSource = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'typeNamespace' field */
    public java.lang.CharSequence getTypeNamespace() {
      return typeNamespace;
    }
    
    /** Sets the value of the 'typeNamespace' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder setTypeNamespace(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder clearTypeNamespace() {
      typeNamespace = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'typeLanguage' field */
    public java.lang.CharSequence getTypeLanguage() {
      return typeLanguage;
    }
    
    /** Sets the value of the 'typeLanguage' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder setTypeLanguage(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder clearTypeLanguage() {
      typeLanguage = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'note' field */
    public java.lang.CharSequence getNote() {
      return note;
    }
    
    /** Sets the value of the 'note' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder setNote(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.note = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'note' field has been set */
    public boolean hasNote() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'note' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder clearNote() {
      note = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'locationId' field */
    public java.lang.CharSequence getLocationId() {
      return locationId;
    }
    
    /** Sets the value of the 'locationId' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder setLocationId(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.locationId = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'locationId' field has been set */
    public boolean hasLocationId() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'locationId' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder clearLocationId() {
      locationId = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.elementType getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder setName(com.beligum.blocks.schema.ebucore.v2015.avro.elementType value) {
      validate(fields()[8], value);
      this.name = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'name' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder clearName() {
      name = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.elementType getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder setDescription(com.beligum.blocks.schema.ebucore.v2015.avro.elementType value) {
      validate(fields()[9], value);
      this.description = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'description' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder clearDescription() {
      description = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'coordinates' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_coordinateslocationType getCoordinates() {
      return coordinates;
    }
    
    /** Sets the value of the 'coordinates' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder setCoordinates(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_coordinateslocationType value) {
      validate(fields()[10], value);
      this.coordinates = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'coordinates' field has been set */
    public boolean hasCoordinates() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'coordinates' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder clearCoordinates() {
      coordinates = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'code' field */
    public java.lang.CharSequence getCode() {
      return code;
    }
    
    /** Sets the value of the 'code' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder setCode(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.code = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'code' field has been set */
    public boolean hasCode() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'code' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder clearCode() {
      code = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'region' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.regionType getRegion() {
      return region;
    }
    
    /** Sets the value of the 'region' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder setRegion(com.beligum.blocks.schema.ebucore.v2015.avro.regionType value) {
      validate(fields()[12], value);
      this.region = value;
      fieldSetFlags()[12] = true;
      return this; 
    }
    
    /** Checks whether the 'region' field has been set */
    public boolean hasRegion() {
      return fieldSetFlags()[12];
    }
    
    /** Clears the value of the 'region' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.locationType.Builder clearRegion() {
      region = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    @Override
    public locationType build() {
      try {
        locationType record = new locationType();
        record.typeLabel = fieldSetFlags()[0] ? this.typeLabel : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.typeDefinition = fieldSetFlags()[1] ? this.typeDefinition : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.typeLink = fieldSetFlags()[2] ? this.typeLink : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.typeSource = fieldSetFlags()[3] ? this.typeSource : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.typeNamespace = fieldSetFlags()[4] ? this.typeNamespace : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.typeLanguage = fieldSetFlags()[5] ? this.typeLanguage : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.note = fieldSetFlags()[6] ? this.note : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.locationId = fieldSetFlags()[7] ? this.locationId : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.name = fieldSetFlags()[8] ? this.name : (com.beligum.blocks.schema.ebucore.v2015.avro.elementType) defaultValue(fields()[8]);
        record.description = fieldSetFlags()[9] ? this.description : (com.beligum.blocks.schema.ebucore.v2015.avro.elementType) defaultValue(fields()[9]);
        record.coordinates = fieldSetFlags()[10] ? this.coordinates : (com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_coordinateslocationType) defaultValue(fields()[10]);
        record.code = fieldSetFlags()[11] ? this.code : (java.lang.CharSequence) defaultValue(fields()[11]);
        record.region = fieldSetFlags()[12] ? this.region : (com.beligum.blocks.schema.ebucore.v2015.avro.regionType) defaultValue(fields()[12]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
