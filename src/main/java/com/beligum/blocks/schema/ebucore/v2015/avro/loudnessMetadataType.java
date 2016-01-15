/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.beligum.blocks.schema.ebucore.v2015.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class loudnessMetadataType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"loudnessMetadataType\",\"namespace\":\"com.beligum.blocks.schema.ebucore.v2015.avro\",\"fields\":[{\"name\":\"loudnessMethod\",\"type\":[\"null\",\"string\"],\"source\":\"attribute loudnessMethod\"},{\"name\":\"loudnessRecType\",\"type\":[\"null\",\"string\"],\"source\":\"attribute loudnessRecType\"},{\"name\":\"loudnessCorrectionType\",\"type\":[\"null\",\"string\"],\"source\":\"attribute loudnessCorrectionType\"},{\"name\":\"integratedLoudness\",\"type\":[\"null\",\"float\"],\"source\":\"element integratedLoudness\"},{\"name\":\"loudnessRange\",\"type\":[\"null\",\"float\"],\"source\":\"element loudnessRange\"},{\"name\":\"maxTruePeak\",\"type\":[\"null\",\"float\"],\"source\":\"element maxTruePeak\"},{\"name\":\"maxMomentary\",\"type\":[\"null\",\"float\"],\"source\":\"element maxMomentary\"},{\"name\":\"maxShortTerm\",\"type\":[\"null\",\"float\"],\"source\":\"element maxShortTerm\"},{\"name\":\"dialogLoudness\",\"type\":[\"null\",\"float\"],\"source\":\"element dialogLoudness\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence loudnessMethod;
  @Deprecated public java.lang.CharSequence loudnessRecType;
  @Deprecated public java.lang.CharSequence loudnessCorrectionType;
  @Deprecated public java.lang.Float integratedLoudness;
  @Deprecated public java.lang.Float loudnessRange;
  @Deprecated public java.lang.Float maxTruePeak;
  @Deprecated public java.lang.Float maxMomentary;
  @Deprecated public java.lang.Float maxShortTerm;
  @Deprecated public java.lang.Float dialogLoudness;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public loudnessMetadataType() {}

  /**
   * All-args constructor.
   */
  public loudnessMetadataType(java.lang.CharSequence loudnessMethod, java.lang.CharSequence loudnessRecType, java.lang.CharSequence loudnessCorrectionType, java.lang.Float integratedLoudness, java.lang.Float loudnessRange, java.lang.Float maxTruePeak, java.lang.Float maxMomentary, java.lang.Float maxShortTerm, java.lang.Float dialogLoudness) {
    this.loudnessMethod = loudnessMethod;
    this.loudnessRecType = loudnessRecType;
    this.loudnessCorrectionType = loudnessCorrectionType;
    this.integratedLoudness = integratedLoudness;
    this.loudnessRange = loudnessRange;
    this.maxTruePeak = maxTruePeak;
    this.maxMomentary = maxMomentary;
    this.maxShortTerm = maxShortTerm;
    this.dialogLoudness = dialogLoudness;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return loudnessMethod;
    case 1: return loudnessRecType;
    case 2: return loudnessCorrectionType;
    case 3: return integratedLoudness;
    case 4: return loudnessRange;
    case 5: return maxTruePeak;
    case 6: return maxMomentary;
    case 7: return maxShortTerm;
    case 8: return dialogLoudness;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: loudnessMethod = (java.lang.CharSequence)value$; break;
    case 1: loudnessRecType = (java.lang.CharSequence)value$; break;
    case 2: loudnessCorrectionType = (java.lang.CharSequence)value$; break;
    case 3: integratedLoudness = (java.lang.Float)value$; break;
    case 4: loudnessRange = (java.lang.Float)value$; break;
    case 5: maxTruePeak = (java.lang.Float)value$; break;
    case 6: maxMomentary = (java.lang.Float)value$; break;
    case 7: maxShortTerm = (java.lang.Float)value$; break;
    case 8: dialogLoudness = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'loudnessMethod' field.
   */
  public java.lang.CharSequence getLoudnessMethod() {
    return loudnessMethod;
  }

  /**
   * Sets the value of the 'loudnessMethod' field.
   * @param value the value to set.
   */
  public void setLoudnessMethod(java.lang.CharSequence value) {
    this.loudnessMethod = value;
  }

  /**
   * Gets the value of the 'loudnessRecType' field.
   */
  public java.lang.CharSequence getLoudnessRecType() {
    return loudnessRecType;
  }

  /**
   * Sets the value of the 'loudnessRecType' field.
   * @param value the value to set.
   */
  public void setLoudnessRecType(java.lang.CharSequence value) {
    this.loudnessRecType = value;
  }

  /**
   * Gets the value of the 'loudnessCorrectionType' field.
   */
  public java.lang.CharSequence getLoudnessCorrectionType() {
    return loudnessCorrectionType;
  }

  /**
   * Sets the value of the 'loudnessCorrectionType' field.
   * @param value the value to set.
   */
  public void setLoudnessCorrectionType(java.lang.CharSequence value) {
    this.loudnessCorrectionType = value;
  }

  /**
   * Gets the value of the 'integratedLoudness' field.
   */
  public java.lang.Float getIntegratedLoudness() {
    return integratedLoudness;
  }

  /**
   * Sets the value of the 'integratedLoudness' field.
   * @param value the value to set.
   */
  public void setIntegratedLoudness(java.lang.Float value) {
    this.integratedLoudness = value;
  }

  /**
   * Gets the value of the 'loudnessRange' field.
   */
  public java.lang.Float getLoudnessRange() {
    return loudnessRange;
  }

  /**
   * Sets the value of the 'loudnessRange' field.
   * @param value the value to set.
   */
  public void setLoudnessRange(java.lang.Float value) {
    this.loudnessRange = value;
  }

  /**
   * Gets the value of the 'maxTruePeak' field.
   */
  public java.lang.Float getMaxTruePeak() {
    return maxTruePeak;
  }

  /**
   * Sets the value of the 'maxTruePeak' field.
   * @param value the value to set.
   */
  public void setMaxTruePeak(java.lang.Float value) {
    this.maxTruePeak = value;
  }

  /**
   * Gets the value of the 'maxMomentary' field.
   */
  public java.lang.Float getMaxMomentary() {
    return maxMomentary;
  }

  /**
   * Sets the value of the 'maxMomentary' field.
   * @param value the value to set.
   */
  public void setMaxMomentary(java.lang.Float value) {
    this.maxMomentary = value;
  }

  /**
   * Gets the value of the 'maxShortTerm' field.
   */
  public java.lang.Float getMaxShortTerm() {
    return maxShortTerm;
  }

  /**
   * Sets the value of the 'maxShortTerm' field.
   * @param value the value to set.
   */
  public void setMaxShortTerm(java.lang.Float value) {
    this.maxShortTerm = value;
  }

  /**
   * Gets the value of the 'dialogLoudness' field.
   */
  public java.lang.Float getDialogLoudness() {
    return dialogLoudness;
  }

  /**
   * Sets the value of the 'dialogLoudness' field.
   * @param value the value to set.
   */
  public void setDialogLoudness(java.lang.Float value) {
    this.dialogLoudness = value;
  }

  /** Creates a new loudnessMetadataType RecordBuilder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder newBuilder() {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder();
  }
  
  /** Creates a new loudnessMetadataType RecordBuilder by copying an existing Builder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder(other);
  }
  
  /** Creates a new loudnessMetadataType RecordBuilder by copying an existing loudnessMetadataType instance */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder(other);
  }
  
  /**
   * RecordBuilder for loudnessMetadataType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<loudnessMetadataType>
    implements org.apache.avro.data.RecordBuilder<loudnessMetadataType> {

    private java.lang.CharSequence loudnessMethod;
    private java.lang.CharSequence loudnessRecType;
    private java.lang.CharSequence loudnessCorrectionType;
    private java.lang.Float integratedLoudness;
    private java.lang.Float loudnessRange;
    private java.lang.Float maxTruePeak;
    private java.lang.Float maxMomentary;
    private java.lang.Float maxShortTerm;
    private java.lang.Float dialogLoudness;

    /** Creates a new Builder */
    private Builder() {
      super(com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.loudnessMethod)) {
        this.loudnessMethod = data().deepCopy(fields()[0].schema(), other.loudnessMethod);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.loudnessRecType)) {
        this.loudnessRecType = data().deepCopy(fields()[1].schema(), other.loudnessRecType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.loudnessCorrectionType)) {
        this.loudnessCorrectionType = data().deepCopy(fields()[2].schema(), other.loudnessCorrectionType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.integratedLoudness)) {
        this.integratedLoudness = data().deepCopy(fields()[3].schema(), other.integratedLoudness);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.loudnessRange)) {
        this.loudnessRange = data().deepCopy(fields()[4].schema(), other.loudnessRange);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.maxTruePeak)) {
        this.maxTruePeak = data().deepCopy(fields()[5].schema(), other.maxTruePeak);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.maxMomentary)) {
        this.maxMomentary = data().deepCopy(fields()[6].schema(), other.maxMomentary);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.maxShortTerm)) {
        this.maxShortTerm = data().deepCopy(fields()[7].schema(), other.maxShortTerm);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.dialogLoudness)) {
        this.dialogLoudness = data().deepCopy(fields()[8].schema(), other.dialogLoudness);
        fieldSetFlags()[8] = true;
      }
    }
    
    /** Creates a Builder by copying an existing loudnessMetadataType instance */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType other) {
            super(com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.SCHEMA$);
      if (isValidValue(fields()[0], other.loudnessMethod)) {
        this.loudnessMethod = data().deepCopy(fields()[0].schema(), other.loudnessMethod);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.loudnessRecType)) {
        this.loudnessRecType = data().deepCopy(fields()[1].schema(), other.loudnessRecType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.loudnessCorrectionType)) {
        this.loudnessCorrectionType = data().deepCopy(fields()[2].schema(), other.loudnessCorrectionType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.integratedLoudness)) {
        this.integratedLoudness = data().deepCopy(fields()[3].schema(), other.integratedLoudness);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.loudnessRange)) {
        this.loudnessRange = data().deepCopy(fields()[4].schema(), other.loudnessRange);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.maxTruePeak)) {
        this.maxTruePeak = data().deepCopy(fields()[5].schema(), other.maxTruePeak);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.maxMomentary)) {
        this.maxMomentary = data().deepCopy(fields()[6].schema(), other.maxMomentary);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.maxShortTerm)) {
        this.maxShortTerm = data().deepCopy(fields()[7].schema(), other.maxShortTerm);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.dialogLoudness)) {
        this.dialogLoudness = data().deepCopy(fields()[8].schema(), other.dialogLoudness);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'loudnessMethod' field */
    public java.lang.CharSequence getLoudnessMethod() {
      return loudnessMethod;
    }
    
    /** Sets the value of the 'loudnessMethod' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder setLoudnessMethod(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.loudnessMethod = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'loudnessMethod' field has been set */
    public boolean hasLoudnessMethod() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'loudnessMethod' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder clearLoudnessMethod() {
      loudnessMethod = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'loudnessRecType' field */
    public java.lang.CharSequence getLoudnessRecType() {
      return loudnessRecType;
    }
    
    /** Sets the value of the 'loudnessRecType' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder setLoudnessRecType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.loudnessRecType = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'loudnessRecType' field has been set */
    public boolean hasLoudnessRecType() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'loudnessRecType' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder clearLoudnessRecType() {
      loudnessRecType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'loudnessCorrectionType' field */
    public java.lang.CharSequence getLoudnessCorrectionType() {
      return loudnessCorrectionType;
    }
    
    /** Sets the value of the 'loudnessCorrectionType' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder setLoudnessCorrectionType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.loudnessCorrectionType = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'loudnessCorrectionType' field has been set */
    public boolean hasLoudnessCorrectionType() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'loudnessCorrectionType' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder clearLoudnessCorrectionType() {
      loudnessCorrectionType = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'integratedLoudness' field */
    public java.lang.Float getIntegratedLoudness() {
      return integratedLoudness;
    }
    
    /** Sets the value of the 'integratedLoudness' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder setIntegratedLoudness(java.lang.Float value) {
      validate(fields()[3], value);
      this.integratedLoudness = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'integratedLoudness' field has been set */
    public boolean hasIntegratedLoudness() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'integratedLoudness' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder clearIntegratedLoudness() {
      integratedLoudness = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'loudnessRange' field */
    public java.lang.Float getLoudnessRange() {
      return loudnessRange;
    }
    
    /** Sets the value of the 'loudnessRange' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder setLoudnessRange(java.lang.Float value) {
      validate(fields()[4], value);
      this.loudnessRange = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'loudnessRange' field has been set */
    public boolean hasLoudnessRange() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'loudnessRange' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder clearLoudnessRange() {
      loudnessRange = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'maxTruePeak' field */
    public java.lang.Float getMaxTruePeak() {
      return maxTruePeak;
    }
    
    /** Sets the value of the 'maxTruePeak' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder setMaxTruePeak(java.lang.Float value) {
      validate(fields()[5], value);
      this.maxTruePeak = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'maxTruePeak' field has been set */
    public boolean hasMaxTruePeak() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'maxTruePeak' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder clearMaxTruePeak() {
      maxTruePeak = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'maxMomentary' field */
    public java.lang.Float getMaxMomentary() {
      return maxMomentary;
    }
    
    /** Sets the value of the 'maxMomentary' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder setMaxMomentary(java.lang.Float value) {
      validate(fields()[6], value);
      this.maxMomentary = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'maxMomentary' field has been set */
    public boolean hasMaxMomentary() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'maxMomentary' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder clearMaxMomentary() {
      maxMomentary = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'maxShortTerm' field */
    public java.lang.Float getMaxShortTerm() {
      return maxShortTerm;
    }
    
    /** Sets the value of the 'maxShortTerm' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder setMaxShortTerm(java.lang.Float value) {
      validate(fields()[7], value);
      this.maxShortTerm = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'maxShortTerm' field has been set */
    public boolean hasMaxShortTerm() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'maxShortTerm' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder clearMaxShortTerm() {
      maxShortTerm = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'dialogLoudness' field */
    public java.lang.Float getDialogLoudness() {
      return dialogLoudness;
    }
    
    /** Sets the value of the 'dialogLoudness' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder setDialogLoudness(java.lang.Float value) {
      validate(fields()[8], value);
      this.dialogLoudness = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'dialogLoudness' field has been set */
    public boolean hasDialogLoudness() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'dialogLoudness' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.loudnessMetadataType.Builder clearDialogLoudness() {
      dialogLoudness = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public loudnessMetadataType build() {
      try {
        loudnessMetadataType record = new loudnessMetadataType();
        record.loudnessMethod = fieldSetFlags()[0] ? this.loudnessMethod : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.loudnessRecType = fieldSetFlags()[1] ? this.loudnessRecType : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.loudnessCorrectionType = fieldSetFlags()[2] ? this.loudnessCorrectionType : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.integratedLoudness = fieldSetFlags()[3] ? this.integratedLoudness : (java.lang.Float) defaultValue(fields()[3]);
        record.loudnessRange = fieldSetFlags()[4] ? this.loudnessRange : (java.lang.Float) defaultValue(fields()[4]);
        record.maxTruePeak = fieldSetFlags()[5] ? this.maxTruePeak : (java.lang.Float) defaultValue(fields()[5]);
        record.maxMomentary = fieldSetFlags()[6] ? this.maxMomentary : (java.lang.Float) defaultValue(fields()[6]);
        record.maxShortTerm = fieldSetFlags()[7] ? this.maxShortTerm : (java.lang.Float) defaultValue(fields()[7]);
        record.dialogLoudness = fieldSetFlags()[8] ? this.dialogLoudness : (java.lang.Float) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
