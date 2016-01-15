/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.beligum.blocks.schema.ebucore.v2015.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AnonType_timetimeType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AnonType_timetimeType\",\"namespace\":\"com.beligum.blocks.schema.ebucore.v2015.avro\",\"fields\":[{\"name\":\"formatLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatLabel\"},{\"name\":\"formatDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatDefinition\"},{\"name\":\"formatLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatLink\"},{\"name\":\"formatSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatSource\"},{\"name\":\"formatNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatNamespace\"},{\"name\":\"formatLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatLanguage\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence formatLabel;
  @Deprecated public java.lang.CharSequence formatDefinition;
  @Deprecated public java.lang.CharSequence formatLink;
  @Deprecated public java.lang.CharSequence formatSource;
  @Deprecated public java.lang.CharSequence formatNamespace;
  @Deprecated public java.lang.CharSequence formatLanguage;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public AnonType_timetimeType() {}

  /**
   * All-args constructor.
   */
  public AnonType_timetimeType(java.lang.CharSequence formatLabel, java.lang.CharSequence formatDefinition, java.lang.CharSequence formatLink, java.lang.CharSequence formatSource, java.lang.CharSequence formatNamespace, java.lang.CharSequence formatLanguage) {
    this.formatLabel = formatLabel;
    this.formatDefinition = formatDefinition;
    this.formatLink = formatLink;
    this.formatSource = formatSource;
    this.formatNamespace = formatNamespace;
    this.formatLanguage = formatLanguage;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return formatLabel;
    case 1: return formatDefinition;
    case 2: return formatLink;
    case 3: return formatSource;
    case 4: return formatNamespace;
    case 5: return formatLanguage;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: formatLabel = (java.lang.CharSequence)value$; break;
    case 1: formatDefinition = (java.lang.CharSequence)value$; break;
    case 2: formatLink = (java.lang.CharSequence)value$; break;
    case 3: formatSource = (java.lang.CharSequence)value$; break;
    case 4: formatNamespace = (java.lang.CharSequence)value$; break;
    case 5: formatLanguage = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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

  /** Creates a new AnonType_timetimeType RecordBuilder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder newBuilder() {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder();
  }
  
  /** Creates a new AnonType_timetimeType RecordBuilder by copying an existing Builder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder(other);
  }
  
  /** Creates a new AnonType_timetimeType RecordBuilder by copying an existing AnonType_timetimeType instance */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder(other);
  }
  
  /**
   * RecordBuilder for AnonType_timetimeType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AnonType_timetimeType>
    implements org.apache.avro.data.RecordBuilder<AnonType_timetimeType> {

    private java.lang.CharSequence formatLabel;
    private java.lang.CharSequence formatDefinition;
    private java.lang.CharSequence formatLink;
    private java.lang.CharSequence formatSource;
    private java.lang.CharSequence formatNamespace;
    private java.lang.CharSequence formatLanguage;

    /** Creates a new Builder */
    private Builder() {
      super(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.formatLabel)) {
        this.formatLabel = data().deepCopy(fields()[0].schema(), other.formatLabel);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.formatDefinition)) {
        this.formatDefinition = data().deepCopy(fields()[1].schema(), other.formatDefinition);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.formatLink)) {
        this.formatLink = data().deepCopy(fields()[2].schema(), other.formatLink);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.formatSource)) {
        this.formatSource = data().deepCopy(fields()[3].schema(), other.formatSource);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.formatNamespace)) {
        this.formatNamespace = data().deepCopy(fields()[4].schema(), other.formatNamespace);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.formatLanguage)) {
        this.formatLanguage = data().deepCopy(fields()[5].schema(), other.formatLanguage);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing AnonType_timetimeType instance */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType other) {
            super(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.SCHEMA$);
      if (isValidValue(fields()[0], other.formatLabel)) {
        this.formatLabel = data().deepCopy(fields()[0].schema(), other.formatLabel);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.formatDefinition)) {
        this.formatDefinition = data().deepCopy(fields()[1].schema(), other.formatDefinition);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.formatLink)) {
        this.formatLink = data().deepCopy(fields()[2].schema(), other.formatLink);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.formatSource)) {
        this.formatSource = data().deepCopy(fields()[3].schema(), other.formatSource);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.formatNamespace)) {
        this.formatNamespace = data().deepCopy(fields()[4].schema(), other.formatNamespace);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.formatLanguage)) {
        this.formatLanguage = data().deepCopy(fields()[5].schema(), other.formatLanguage);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'formatLabel' field */
    public java.lang.CharSequence getFormatLabel() {
      return formatLabel;
    }
    
    /** Sets the value of the 'formatLabel' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder setFormatLabel(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.formatLabel = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'formatLabel' field has been set */
    public boolean hasFormatLabel() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'formatLabel' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder clearFormatLabel() {
      formatLabel = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'formatDefinition' field */
    public java.lang.CharSequence getFormatDefinition() {
      return formatDefinition;
    }
    
    /** Sets the value of the 'formatDefinition' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder setFormatDefinition(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.formatDefinition = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'formatDefinition' field has been set */
    public boolean hasFormatDefinition() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'formatDefinition' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder clearFormatDefinition() {
      formatDefinition = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'formatLink' field */
    public java.lang.CharSequence getFormatLink() {
      return formatLink;
    }
    
    /** Sets the value of the 'formatLink' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder setFormatLink(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.formatLink = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'formatLink' field has been set */
    public boolean hasFormatLink() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'formatLink' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder clearFormatLink() {
      formatLink = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'formatSource' field */
    public java.lang.CharSequence getFormatSource() {
      return formatSource;
    }
    
    /** Sets the value of the 'formatSource' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder setFormatSource(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.formatSource = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'formatSource' field has been set */
    public boolean hasFormatSource() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'formatSource' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder clearFormatSource() {
      formatSource = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'formatNamespace' field */
    public java.lang.CharSequence getFormatNamespace() {
      return formatNamespace;
    }
    
    /** Sets the value of the 'formatNamespace' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder setFormatNamespace(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.formatNamespace = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'formatNamespace' field has been set */
    public boolean hasFormatNamespace() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'formatNamespace' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder clearFormatNamespace() {
      formatNamespace = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'formatLanguage' field */
    public java.lang.CharSequence getFormatLanguage() {
      return formatLanguage;
    }
    
    /** Sets the value of the 'formatLanguage' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder setFormatLanguage(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.formatLanguage = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'formatLanguage' field has been set */
    public boolean hasFormatLanguage() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'formatLanguage' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_timetimeType.Builder clearFormatLanguage() {
      formatLanguage = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public AnonType_timetimeType build() {
      try {
        AnonType_timetimeType record = new AnonType_timetimeType();
        record.formatLabel = fieldSetFlags()[0] ? this.formatLabel : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.formatDefinition = fieldSetFlags()[1] ? this.formatDefinition : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.formatLink = fieldSetFlags()[2] ? this.formatLink : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.formatSource = fieldSetFlags()[3] ? this.formatSource : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.formatNamespace = fieldSetFlags()[4] ? this.formatNamespace : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.formatLanguage = fieldSetFlags()[5] ? this.formatLanguage : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
