/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.beligum.blocks.schema.ebucore.v2015.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class dialogueType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"dialogueType\",\"namespace\":\"com.beligum.blocks.schema.ebucore.v2015.avro\",\"fields\":[{\"name\":\"nonDialogueContentKind\",\"type\":[\"null\",\"int\"],\"source\":\"attribute nonDialogueContentKind\"},{\"name\":\"dialogueContentKind\",\"type\":[\"null\",\"int\"],\"source\":\"attribute dialogueContentKind\"},{\"name\":\"mixedContentKind\",\"type\":[\"null\",\"int\"],\"source\":\"attribute mixedContentKind\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Integer nonDialogueContentKind;
  @Deprecated public java.lang.Integer dialogueContentKind;
  @Deprecated public java.lang.Integer mixedContentKind;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public dialogueType() {}

  /**
   * All-args constructor.
   */
  public dialogueType(java.lang.Integer nonDialogueContentKind, java.lang.Integer dialogueContentKind, java.lang.Integer mixedContentKind) {
    this.nonDialogueContentKind = nonDialogueContentKind;
    this.dialogueContentKind = dialogueContentKind;
    this.mixedContentKind = mixedContentKind;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return nonDialogueContentKind;
    case 1: return dialogueContentKind;
    case 2: return mixedContentKind;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: nonDialogueContentKind = (java.lang.Integer)value$; break;
    case 1: dialogueContentKind = (java.lang.Integer)value$; break;
    case 2: mixedContentKind = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'nonDialogueContentKind' field.
   */
  public java.lang.Integer getNonDialogueContentKind() {
    return nonDialogueContentKind;
  }

  /**
   * Sets the value of the 'nonDialogueContentKind' field.
   * @param value the value to set.
   */
  public void setNonDialogueContentKind(java.lang.Integer value) {
    this.nonDialogueContentKind = value;
  }

  /**
   * Gets the value of the 'dialogueContentKind' field.
   */
  public java.lang.Integer getDialogueContentKind() {
    return dialogueContentKind;
  }

  /**
   * Sets the value of the 'dialogueContentKind' field.
   * @param value the value to set.
   */
  public void setDialogueContentKind(java.lang.Integer value) {
    this.dialogueContentKind = value;
  }

  /**
   * Gets the value of the 'mixedContentKind' field.
   */
  public java.lang.Integer getMixedContentKind() {
    return mixedContentKind;
  }

  /**
   * Sets the value of the 'mixedContentKind' field.
   * @param value the value to set.
   */
  public void setMixedContentKind(java.lang.Integer value) {
    this.mixedContentKind = value;
  }

  /** Creates a new dialogueType RecordBuilder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType.Builder newBuilder() {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType.Builder();
  }
  
  /** Creates a new dialogueType RecordBuilder by copying an existing Builder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType.Builder other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType.Builder(other);
  }
  
  /** Creates a new dialogueType RecordBuilder by copying an existing dialogueType instance */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType.Builder(other);
  }
  
  /**
   * RecordBuilder for dialogueType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<dialogueType>
    implements org.apache.avro.data.RecordBuilder<dialogueType> {

    private java.lang.Integer nonDialogueContentKind;
    private java.lang.Integer dialogueContentKind;
    private java.lang.Integer mixedContentKind;

    /** Creates a new Builder */
    private Builder() {
      super(com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.nonDialogueContentKind)) {
        this.nonDialogueContentKind = data().deepCopy(fields()[0].schema(), other.nonDialogueContentKind);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.dialogueContentKind)) {
        this.dialogueContentKind = data().deepCopy(fields()[1].schema(), other.dialogueContentKind);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.mixedContentKind)) {
        this.mixedContentKind = data().deepCopy(fields()[2].schema(), other.mixedContentKind);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing dialogueType instance */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType other) {
            super(com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType.SCHEMA$);
      if (isValidValue(fields()[0], other.nonDialogueContentKind)) {
        this.nonDialogueContentKind = data().deepCopy(fields()[0].schema(), other.nonDialogueContentKind);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.dialogueContentKind)) {
        this.dialogueContentKind = data().deepCopy(fields()[1].schema(), other.dialogueContentKind);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.mixedContentKind)) {
        this.mixedContentKind = data().deepCopy(fields()[2].schema(), other.mixedContentKind);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'nonDialogueContentKind' field */
    public java.lang.Integer getNonDialogueContentKind() {
      return nonDialogueContentKind;
    }
    
    /** Sets the value of the 'nonDialogueContentKind' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType.Builder setNonDialogueContentKind(java.lang.Integer value) {
      validate(fields()[0], value);
      this.nonDialogueContentKind = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'nonDialogueContentKind' field has been set */
    public boolean hasNonDialogueContentKind() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'nonDialogueContentKind' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType.Builder clearNonDialogueContentKind() {
      nonDialogueContentKind = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'dialogueContentKind' field */
    public java.lang.Integer getDialogueContentKind() {
      return dialogueContentKind;
    }
    
    /** Sets the value of the 'dialogueContentKind' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType.Builder setDialogueContentKind(java.lang.Integer value) {
      validate(fields()[1], value);
      this.dialogueContentKind = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'dialogueContentKind' field has been set */
    public boolean hasDialogueContentKind() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'dialogueContentKind' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType.Builder clearDialogueContentKind() {
      dialogueContentKind = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'mixedContentKind' field */
    public java.lang.Integer getMixedContentKind() {
      return mixedContentKind;
    }
    
    /** Sets the value of the 'mixedContentKind' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType.Builder setMixedContentKind(java.lang.Integer value) {
      validate(fields()[2], value);
      this.mixedContentKind = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'mixedContentKind' field has been set */
    public boolean hasMixedContentKind() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'mixedContentKind' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.dialogueType.Builder clearMixedContentKind() {
      mixedContentKind = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public dialogueType build() {
      try {
        dialogueType record = new dialogueType();
        record.nonDialogueContentKind = fieldSetFlags()[0] ? this.nonDialogueContentKind : (java.lang.Integer) defaultValue(fields()[0]);
        record.dialogueContentKind = fieldSetFlags()[1] ? this.dialogueContentKind : (java.lang.Integer) defaultValue(fields()[1]);
        record.mixedContentKind = fieldSetFlags()[2] ? this.mixedContentKind : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
