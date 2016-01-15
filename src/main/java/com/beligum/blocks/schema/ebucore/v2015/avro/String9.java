/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.beligum.blocks.schema.ebucore.v2015.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class String9 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"String9\",\"namespace\":\"com.beligum.blocks.schema.ebucore.v2015.avro\",\"fields\":[{\"name\":\"typeLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLabel\"},{\"name\":\"typeDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeDefinition\"},{\"name\":\"typeLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLink\"},{\"name\":\"typeSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeSource\"},{\"name\":\"typeNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeNamespace\"},{\"name\":\"typeLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLanguage\"},{\"name\":\"formatLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatLabel\"},{\"name\":\"formatDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatDefinition\"},{\"name\":\"formatLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatLink\"},{\"name\":\"formatSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatSource\"},{\"name\":\"formatNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatNamespace\"},{\"name\":\"formatLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatLanguage\"},{\"name\":\"unit\",\"type\":[\"null\",\"string\"],\"source\":\"attribute unit\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence typeLabel;
  @Deprecated public java.lang.CharSequence typeDefinition;
  @Deprecated public java.lang.CharSequence typeLink;
  @Deprecated public java.lang.CharSequence typeSource;
  @Deprecated public java.lang.CharSequence typeNamespace;
  @Deprecated public java.lang.CharSequence typeLanguage;
  @Deprecated public java.lang.CharSequence formatLabel;
  @Deprecated public java.lang.CharSequence formatDefinition;
  @Deprecated public java.lang.CharSequence formatLink;
  @Deprecated public java.lang.CharSequence formatSource;
  @Deprecated public java.lang.CharSequence formatNamespace;
  @Deprecated public java.lang.CharSequence formatLanguage;
  @Deprecated public java.lang.CharSequence unit;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public String9() {}

  /**
   * All-args constructor.
   */
  public String9(java.lang.CharSequence typeLabel, java.lang.CharSequence typeDefinition, java.lang.CharSequence typeLink, java.lang.CharSequence typeSource, java.lang.CharSequence typeNamespace, java.lang.CharSequence typeLanguage, java.lang.CharSequence formatLabel, java.lang.CharSequence formatDefinition, java.lang.CharSequence formatLink, java.lang.CharSequence formatSource, java.lang.CharSequence formatNamespace, java.lang.CharSequence formatLanguage, java.lang.CharSequence unit) {
    this.typeLabel = typeLabel;
    this.typeDefinition = typeDefinition;
    this.typeLink = typeLink;
    this.typeSource = typeSource;
    this.typeNamespace = typeNamespace;
    this.typeLanguage = typeLanguage;
    this.formatLabel = formatLabel;
    this.formatDefinition = formatDefinition;
    this.formatLink = formatLink;
    this.formatSource = formatSource;
    this.formatNamespace = formatNamespace;
    this.formatLanguage = formatLanguage;
    this.unit = unit;
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
    case 6: return formatLabel;
    case 7: return formatDefinition;
    case 8: return formatLink;
    case 9: return formatSource;
    case 10: return formatNamespace;
    case 11: return formatLanguage;
    case 12: return unit;
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
    case 6: formatLabel = (java.lang.CharSequence)value$; break;
    case 7: formatDefinition = (java.lang.CharSequence)value$; break;
    case 8: formatLink = (java.lang.CharSequence)value$; break;
    case 9: formatSource = (java.lang.CharSequence)value$; break;
    case 10: formatNamespace = (java.lang.CharSequence)value$; break;
    case 11: formatLanguage = (java.lang.CharSequence)value$; break;
    case 12: unit = (java.lang.CharSequence)value$; break;
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
   * Gets the value of the 'formatLabel' field.
   */
  public java.lang.CharSequence getFormatLabel() {
    return formatLabel;
  }

  /**
   * Sets the value of the 'formatLabel' field.
   * @param value the value to set.
   */
  public void setFormatLabel(java.lang.CharSequence value) {
    this.formatLabel = value;
  }

  /**
   * Gets the value of the 'formatDefinition' field.
   */
  public java.lang.CharSequence getFormatDefinition() {
    return formatDefinition;
  }

  /**
   * Sets the value of the 'formatDefinition' field.
   * @param value the value to set.
   */
  public void setFormatDefinition(java.lang.CharSequence value) {
    this.formatDefinition = value;
  }

  /**
   * Gets the value of the 'formatLink' field.
   */
  public java.lang.CharSequence getFormatLink() {
    return formatLink;
  }

  /**
   * Sets the value of the 'formatLink' field.
   * @param value the value to set.
   */
  public void setFormatLink(java.lang.CharSequence value) {
    this.formatLink = value;
  }

  /**
   * Gets the value of the 'formatSource' field.
   */
  public java.lang.CharSequence getFormatSource() {
    return formatSource;
  }

  /**
   * Sets the value of the 'formatSource' field.
   * @param value the value to set.
   */
  public void setFormatSource(java.lang.CharSequence value) {
    this.formatSource = value;
  }

  /**
   * Gets the value of the 'formatNamespace' field.
   */
  public java.lang.CharSequence getFormatNamespace() {
    return formatNamespace;
  }

  /**
   * Sets the value of the 'formatNamespace' field.
   * @param value the value to set.
   */
  public void setFormatNamespace(java.lang.CharSequence value) {
    this.formatNamespace = value;
  }

  /**
   * Gets the value of the 'formatLanguage' field.
   */
  public java.lang.CharSequence getFormatLanguage() {
    return formatLanguage;
  }

  /**
   * Sets the value of the 'formatLanguage' field.
   * @param value the value to set.
   */
  public void setFormatLanguage(java.lang.CharSequence value) {
    this.formatLanguage = value;
  }

  /**
   * Gets the value of the 'unit' field.
   */
  public java.lang.CharSequence getUnit() {
    return unit;
  }

  /**
   * Sets the value of the 'unit' field.
   * @param value the value to set.
   */
  public void setUnit(java.lang.CharSequence value) {
    this.unit = value;
  }

  /** Creates a new String9 RecordBuilder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder newBuilder() {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder();
  }
  
  /** Creates a new String9 RecordBuilder by copying an existing Builder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder(other);
  }
  
  /** Creates a new String9 RecordBuilder by copying an existing String9 instance */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.String9 other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder(other);
  }
  
  /**
   * RecordBuilder for String9 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<String9>
    implements org.apache.avro.data.RecordBuilder<String9> {

    private java.lang.CharSequence typeLabel;
    private java.lang.CharSequence typeDefinition;
    private java.lang.CharSequence typeLink;
    private java.lang.CharSequence typeSource;
    private java.lang.CharSequence typeNamespace;
    private java.lang.CharSequence typeLanguage;
    private java.lang.CharSequence formatLabel;
    private java.lang.CharSequence formatDefinition;
    private java.lang.CharSequence formatLink;
    private java.lang.CharSequence formatSource;
    private java.lang.CharSequence formatNamespace;
    private java.lang.CharSequence formatLanguage;
    private java.lang.CharSequence unit;

    /** Creates a new Builder */
    private Builder() {
      super(com.beligum.blocks.schema.ebucore.v2015.avro.String9.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder other) {
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
      if (isValidValue(fields()[6], other.formatLabel)) {
        this.formatLabel = data().deepCopy(fields()[6].schema(), other.formatLabel);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.formatDefinition)) {
        this.formatDefinition = data().deepCopy(fields()[7].schema(), other.formatDefinition);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.formatLink)) {
        this.formatLink = data().deepCopy(fields()[8].schema(), other.formatLink);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.formatSource)) {
        this.formatSource = data().deepCopy(fields()[9].schema(), other.formatSource);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.formatNamespace)) {
        this.formatNamespace = data().deepCopy(fields()[10].schema(), other.formatNamespace);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.formatLanguage)) {
        this.formatLanguage = data().deepCopy(fields()[11].schema(), other.formatLanguage);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.unit)) {
        this.unit = data().deepCopy(fields()[12].schema(), other.unit);
        fieldSetFlags()[12] = true;
      }
    }
    
    /** Creates a Builder by copying an existing String9 instance */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.String9 other) {
            super(com.beligum.blocks.schema.ebucore.v2015.avro.String9.SCHEMA$);
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
      if (isValidValue(fields()[6], other.formatLabel)) {
        this.formatLabel = data().deepCopy(fields()[6].schema(), other.formatLabel);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.formatDefinition)) {
        this.formatDefinition = data().deepCopy(fields()[7].schema(), other.formatDefinition);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.formatLink)) {
        this.formatLink = data().deepCopy(fields()[8].schema(), other.formatLink);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.formatSource)) {
        this.formatSource = data().deepCopy(fields()[9].schema(), other.formatSource);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.formatNamespace)) {
        this.formatNamespace = data().deepCopy(fields()[10].schema(), other.formatNamespace);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.formatLanguage)) {
        this.formatLanguage = data().deepCopy(fields()[11].schema(), other.formatLanguage);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.unit)) {
        this.unit = data().deepCopy(fields()[12].schema(), other.unit);
        fieldSetFlags()[12] = true;
      }
    }

    /** Gets the value of the 'typeLabel' field */
    public java.lang.CharSequence getTypeLabel() {
      return typeLabel;
    }
    
    /** Sets the value of the 'typeLabel' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder setTypeLabel(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder clearTypeLabel() {
      typeLabel = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'typeDefinition' field */
    public java.lang.CharSequence getTypeDefinition() {
      return typeDefinition;
    }
    
    /** Sets the value of the 'typeDefinition' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder setTypeDefinition(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder clearTypeDefinition() {
      typeDefinition = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'typeLink' field */
    public java.lang.CharSequence getTypeLink() {
      return typeLink;
    }
    
    /** Sets the value of the 'typeLink' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder setTypeLink(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder clearTypeLink() {
      typeLink = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'typeSource' field */
    public java.lang.CharSequence getTypeSource() {
      return typeSource;
    }
    
    /** Sets the value of the 'typeSource' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder setTypeSource(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder clearTypeSource() {
      typeSource = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'typeNamespace' field */
    public java.lang.CharSequence getTypeNamespace() {
      return typeNamespace;
    }
    
    /** Sets the value of the 'typeNamespace' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder setTypeNamespace(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder clearTypeNamespace() {
      typeNamespace = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'typeLanguage' field */
    public java.lang.CharSequence getTypeLanguage() {
      return typeLanguage;
    }
    
    /** Sets the value of the 'typeLanguage' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder setTypeLanguage(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder clearTypeLanguage() {
      typeLanguage = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'formatLabel' field */
    public java.lang.CharSequence getFormatLabel() {
      return formatLabel;
    }
    
    /** Sets the value of the 'formatLabel' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder setFormatLabel(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.formatLabel = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'formatLabel' field has been set */
    public boolean hasFormatLabel() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'formatLabel' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder clearFormatLabel() {
      formatLabel = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'formatDefinition' field */
    public java.lang.CharSequence getFormatDefinition() {
      return formatDefinition;
    }
    
    /** Sets the value of the 'formatDefinition' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder setFormatDefinition(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.formatDefinition = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'formatDefinition' field has been set */
    public boolean hasFormatDefinition() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'formatDefinition' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder clearFormatDefinition() {
      formatDefinition = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'formatLink' field */
    public java.lang.CharSequence getFormatLink() {
      return formatLink;
    }
    
    /** Sets the value of the 'formatLink' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder setFormatLink(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.formatLink = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'formatLink' field has been set */
    public boolean hasFormatLink() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'formatLink' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder clearFormatLink() {
      formatLink = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'formatSource' field */
    public java.lang.CharSequence getFormatSource() {
      return formatSource;
    }
    
    /** Sets the value of the 'formatSource' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder setFormatSource(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.formatSource = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'formatSource' field has been set */
    public boolean hasFormatSource() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'formatSource' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder clearFormatSource() {
      formatSource = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'formatNamespace' field */
    public java.lang.CharSequence getFormatNamespace() {
      return formatNamespace;
    }
    
    /** Sets the value of the 'formatNamespace' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder setFormatNamespace(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.formatNamespace = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'formatNamespace' field has been set */
    public boolean hasFormatNamespace() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'formatNamespace' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder clearFormatNamespace() {
      formatNamespace = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'formatLanguage' field */
    public java.lang.CharSequence getFormatLanguage() {
      return formatLanguage;
    }
    
    /** Sets the value of the 'formatLanguage' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder setFormatLanguage(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.formatLanguage = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'formatLanguage' field has been set */
    public boolean hasFormatLanguage() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'formatLanguage' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder clearFormatLanguage() {
      formatLanguage = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'unit' field */
    public java.lang.CharSequence getUnit() {
      return unit;
    }
    
    /** Sets the value of the 'unit' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder setUnit(java.lang.CharSequence value) {
      validate(fields()[12], value);
      this.unit = value;
      fieldSetFlags()[12] = true;
      return this; 
    }
    
    /** Checks whether the 'unit' field has been set */
    public boolean hasUnit() {
      return fieldSetFlags()[12];
    }
    
    /** Clears the value of the 'unit' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.String9.Builder clearUnit() {
      unit = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    @Override
    public String9 build() {
      try {
        String9 record = new String9();
        record.typeLabel = fieldSetFlags()[0] ? this.typeLabel : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.typeDefinition = fieldSetFlags()[1] ? this.typeDefinition : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.typeLink = fieldSetFlags()[2] ? this.typeLink : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.typeSource = fieldSetFlags()[3] ? this.typeSource : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.typeNamespace = fieldSetFlags()[4] ? this.typeNamespace : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.typeLanguage = fieldSetFlags()[5] ? this.typeLanguage : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.formatLabel = fieldSetFlags()[6] ? this.formatLabel : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.formatDefinition = fieldSetFlags()[7] ? this.formatDefinition : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.formatLink = fieldSetFlags()[8] ? this.formatLink : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.formatSource = fieldSetFlags()[9] ? this.formatSource : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.formatNamespace = fieldSetFlags()[10] ? this.formatNamespace : (java.lang.CharSequence) defaultValue(fields()[10]);
        record.formatLanguage = fieldSetFlags()[11] ? this.formatLanguage : (java.lang.CharSequence) defaultValue(fields()[11]);
        record.unit = fieldSetFlags()[12] ? this.unit : (java.lang.CharSequence) defaultValue(fields()[12]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
