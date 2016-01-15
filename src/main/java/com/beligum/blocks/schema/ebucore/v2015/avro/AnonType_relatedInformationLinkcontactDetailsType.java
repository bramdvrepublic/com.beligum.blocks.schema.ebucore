/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.beligum.blocks.schema.ebucore.v2015.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AnonType_relatedInformationLinkcontactDetailsType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AnonType_relatedInformationLinkcontactDetailsType\",\"namespace\":\"com.beligum.blocks.schema.ebucore.v2015.avro\",\"fields\":[{\"name\":\"typeLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLabel\"},{\"name\":\"typeDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeDefinition\"},{\"name\":\"typeLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLink\"},{\"name\":\"typeSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeSource\"},{\"name\":\"typeNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeNamespace\"},{\"name\":\"typeLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute typeLanguage\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence typeLabel;
  @Deprecated public java.lang.CharSequence typeDefinition;
  @Deprecated public java.lang.CharSequence typeLink;
  @Deprecated public java.lang.CharSequence typeSource;
  @Deprecated public java.lang.CharSequence typeNamespace;
  @Deprecated public java.lang.CharSequence typeLanguage;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public AnonType_relatedInformationLinkcontactDetailsType() {}

  /**
   * All-args constructor.
   */
  public AnonType_relatedInformationLinkcontactDetailsType(java.lang.CharSequence typeLabel, java.lang.CharSequence typeDefinition, java.lang.CharSequence typeLink, java.lang.CharSequence typeSource, java.lang.CharSequence typeNamespace, java.lang.CharSequence typeLanguage) {
    this.typeLabel = typeLabel;
    this.typeDefinition = typeDefinition;
    this.typeLink = typeLink;
    this.typeSource = typeSource;
    this.typeNamespace = typeNamespace;
    this.typeLanguage = typeLanguage;
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

  /** Creates a new AnonType_relatedInformationLinkcontactDetailsType RecordBuilder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder newBuilder() {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder();
  }
  
  /** Creates a new AnonType_relatedInformationLinkcontactDetailsType RecordBuilder by copying an existing Builder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder(other);
  }
  
  /** Creates a new AnonType_relatedInformationLinkcontactDetailsType RecordBuilder by copying an existing AnonType_relatedInformationLinkcontactDetailsType instance */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder(other);
  }
  
  /**
   * RecordBuilder for AnonType_relatedInformationLinkcontactDetailsType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AnonType_relatedInformationLinkcontactDetailsType>
    implements org.apache.avro.data.RecordBuilder<AnonType_relatedInformationLinkcontactDetailsType> {

    private java.lang.CharSequence typeLabel;
    private java.lang.CharSequence typeDefinition;
    private java.lang.CharSequence typeLink;
    private java.lang.CharSequence typeSource;
    private java.lang.CharSequence typeNamespace;
    private java.lang.CharSequence typeLanguage;

    /** Creates a new Builder */
    private Builder() {
      super(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder other) {
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
    }
    
    /** Creates a Builder by copying an existing AnonType_relatedInformationLinkcontactDetailsType instance */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType other) {
            super(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.SCHEMA$);
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
    }

    /** Gets the value of the 'typeLabel' field */
    public java.lang.CharSequence getTypeLabel() {
      return typeLabel;
    }
    
    /** Sets the value of the 'typeLabel' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder setTypeLabel(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder clearTypeLabel() {
      typeLabel = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'typeDefinition' field */
    public java.lang.CharSequence getTypeDefinition() {
      return typeDefinition;
    }
    
    /** Sets the value of the 'typeDefinition' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder setTypeDefinition(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder clearTypeDefinition() {
      typeDefinition = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'typeLink' field */
    public java.lang.CharSequence getTypeLink() {
      return typeLink;
    }
    
    /** Sets the value of the 'typeLink' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder setTypeLink(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder clearTypeLink() {
      typeLink = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'typeSource' field */
    public java.lang.CharSequence getTypeSource() {
      return typeSource;
    }
    
    /** Sets the value of the 'typeSource' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder setTypeSource(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder clearTypeSource() {
      typeSource = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'typeNamespace' field */
    public java.lang.CharSequence getTypeNamespace() {
      return typeNamespace;
    }
    
    /** Sets the value of the 'typeNamespace' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder setTypeNamespace(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder clearTypeNamespace() {
      typeNamespace = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'typeLanguage' field */
    public java.lang.CharSequence getTypeLanguage() {
      return typeLanguage;
    }
    
    /** Sets the value of the 'typeLanguage' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder setTypeLanguage(java.lang.CharSequence value) {
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
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_relatedInformationLinkcontactDetailsType.Builder clearTypeLanguage() {
      typeLanguage = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public AnonType_relatedInformationLinkcontactDetailsType build() {
      try {
        AnonType_relatedInformationLinkcontactDetailsType record = new AnonType_relatedInformationLinkcontactDetailsType();
        record.typeLabel = fieldSetFlags()[0] ? this.typeLabel : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.typeDefinition = fieldSetFlags()[1] ? this.typeDefinition : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.typeLink = fieldSetFlags()[2] ? this.typeLink : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.typeSource = fieldSetFlags()[3] ? this.typeSource : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.typeNamespace = fieldSetFlags()[4] ? this.typeNamespace : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.typeLanguage = fieldSetFlags()[5] ? this.typeLanguage : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
