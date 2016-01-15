/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.beligum.blocks.schema.ebucore.v2015.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class audioStreamFormatType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"audioStreamFormatType\",\"namespace\":\"com.beligum.blocks.schema.ebucore.v2015.avro\",\"fields\":[{\"name\":\"audioStreamFormatID\",\"type\":\"string\",\"source\":\"attribute audioStreamFormatID\"},{\"name\":\"audioStreamFormatName\",\"type\":[\"null\",\"string\"],\"source\":\"attribute audioStreamFormatName\"},{\"name\":\"formatLabel\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatLabel\"},{\"name\":\"formatDefinition\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatDefinition\"},{\"name\":\"formatLink\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatLink\"},{\"name\":\"formatSource\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatSource\"},{\"name\":\"formatNamespace\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatNamespace\"},{\"name\":\"formatLanguage\",\"type\":[\"null\",\"string\"],\"source\":\"attribute formatLanguage\"},{\"name\":\"audioChannelFormatIDRef\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"source\":\"element audioChannelFormatIDRef\"},{\"name\":\"audioPackFormatIDRef\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"source\":\"element audioPackFormatIDRef\"},{\"name\":\"audioTrackFormatIDRef\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"source\":\"element audioTrackFormatIDRef\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence audioStreamFormatID;
  @Deprecated public java.lang.CharSequence audioStreamFormatName;
  @Deprecated public java.lang.CharSequence formatLabel;
  @Deprecated public java.lang.CharSequence formatDefinition;
  @Deprecated public java.lang.CharSequence formatLink;
  @Deprecated public java.lang.CharSequence formatSource;
  @Deprecated public java.lang.CharSequence formatNamespace;
  @Deprecated public java.lang.CharSequence formatLanguage;
  @Deprecated public java.util.List<java.lang.CharSequence> audioChannelFormatIDRef;
  @Deprecated public java.util.List<java.lang.CharSequence> audioPackFormatIDRef;
  @Deprecated public java.util.List<java.lang.CharSequence> audioTrackFormatIDRef;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public audioStreamFormatType() {}

  /**
   * All-args constructor.
   */
  public audioStreamFormatType(java.lang.CharSequence audioStreamFormatID, java.lang.CharSequence audioStreamFormatName, java.lang.CharSequence formatLabel, java.lang.CharSequence formatDefinition, java.lang.CharSequence formatLink, java.lang.CharSequence formatSource, java.lang.CharSequence formatNamespace, java.lang.CharSequence formatLanguage, java.util.List<java.lang.CharSequence> audioChannelFormatIDRef, java.util.List<java.lang.CharSequence> audioPackFormatIDRef, java.util.List<java.lang.CharSequence> audioTrackFormatIDRef) {
    this.audioStreamFormatID = audioStreamFormatID;
    this.audioStreamFormatName = audioStreamFormatName;
    this.formatLabel = formatLabel;
    this.formatDefinition = formatDefinition;
    this.formatLink = formatLink;
    this.formatSource = formatSource;
    this.formatNamespace = formatNamespace;
    this.formatLanguage = formatLanguage;
    this.audioChannelFormatIDRef = audioChannelFormatIDRef;
    this.audioPackFormatIDRef = audioPackFormatIDRef;
    this.audioTrackFormatIDRef = audioTrackFormatIDRef;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return audioStreamFormatID;
    case 1: return audioStreamFormatName;
    case 2: return formatLabel;
    case 3: return formatDefinition;
    case 4: return formatLink;
    case 5: return formatSource;
    case 6: return formatNamespace;
    case 7: return formatLanguage;
    case 8: return audioChannelFormatIDRef;
    case 9: return audioPackFormatIDRef;
    case 10: return audioTrackFormatIDRef;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: audioStreamFormatID = (java.lang.CharSequence)value$; break;
    case 1: audioStreamFormatName = (java.lang.CharSequence)value$; break;
    case 2: formatLabel = (java.lang.CharSequence)value$; break;
    case 3: formatDefinition = (java.lang.CharSequence)value$; break;
    case 4: formatLink = (java.lang.CharSequence)value$; break;
    case 5: formatSource = (java.lang.CharSequence)value$; break;
    case 6: formatNamespace = (java.lang.CharSequence)value$; break;
    case 7: formatLanguage = (java.lang.CharSequence)value$; break;
    case 8: audioChannelFormatIDRef = (java.util.List<java.lang.CharSequence>)value$; break;
    case 9: audioPackFormatIDRef = (java.util.List<java.lang.CharSequence>)value$; break;
    case 10: audioTrackFormatIDRef = (java.util.List<java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'audioStreamFormatID' field.
   */
  public java.lang.CharSequence getAudioStreamFormatID() {
    return audioStreamFormatID;
  }

  /**
   * Sets the value of the 'audioStreamFormatID' field.
   * @param value the value to set.
   */
  public void setAudioStreamFormatID(java.lang.CharSequence value) {
    this.audioStreamFormatID = value;
  }

  /**
   * Gets the value of the 'audioStreamFormatName' field.
   */
  public java.lang.CharSequence getAudioStreamFormatName() {
    return audioStreamFormatName;
  }

  /**
   * Sets the value of the 'audioStreamFormatName' field.
   * @param value the value to set.
   */
  public void setAudioStreamFormatName(java.lang.CharSequence value) {
    this.audioStreamFormatName = value;
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
   * Gets the value of the 'audioChannelFormatIDRef' field.
   */
  public java.util.List<java.lang.CharSequence> getAudioChannelFormatIDRef() {
    return audioChannelFormatIDRef;
  }

  /**
   * Sets the value of the 'audioChannelFormatIDRef' field.
   * @param value the value to set.
   */
  public void setAudioChannelFormatIDRef(java.util.List<java.lang.CharSequence> value) {
    this.audioChannelFormatIDRef = value;
  }

  /**
   * Gets the value of the 'audioPackFormatIDRef' field.
   */
  public java.util.List<java.lang.CharSequence> getAudioPackFormatIDRef() {
    return audioPackFormatIDRef;
  }

  /**
   * Sets the value of the 'audioPackFormatIDRef' field.
   * @param value the value to set.
   */
  public void setAudioPackFormatIDRef(java.util.List<java.lang.CharSequence> value) {
    this.audioPackFormatIDRef = value;
  }

  /**
   * Gets the value of the 'audioTrackFormatIDRef' field.
   */
  public java.util.List<java.lang.CharSequence> getAudioTrackFormatIDRef() {
    return audioTrackFormatIDRef;
  }

  /**
   * Sets the value of the 'audioTrackFormatIDRef' field.
   * @param value the value to set.
   */
  public void setAudioTrackFormatIDRef(java.util.List<java.lang.CharSequence> value) {
    this.audioTrackFormatIDRef = value;
  }

  /** Creates a new audioStreamFormatType RecordBuilder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder newBuilder() {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder();
  }
  
  /** Creates a new audioStreamFormatType RecordBuilder by copying an existing Builder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder(other);
  }
  
  /** Creates a new audioStreamFormatType RecordBuilder by copying an existing audioStreamFormatType instance */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder(other);
  }
  
  /**
   * RecordBuilder for audioStreamFormatType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<audioStreamFormatType>
    implements org.apache.avro.data.RecordBuilder<audioStreamFormatType> {

    private java.lang.CharSequence audioStreamFormatID;
    private java.lang.CharSequence audioStreamFormatName;
    private java.lang.CharSequence formatLabel;
    private java.lang.CharSequence formatDefinition;
    private java.lang.CharSequence formatLink;
    private java.lang.CharSequence formatSource;
    private java.lang.CharSequence formatNamespace;
    private java.lang.CharSequence formatLanguage;
    private java.util.List<java.lang.CharSequence> audioChannelFormatIDRef;
    private java.util.List<java.lang.CharSequence> audioPackFormatIDRef;
    private java.util.List<java.lang.CharSequence> audioTrackFormatIDRef;

    /** Creates a new Builder */
    private Builder() {
      super(com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.audioStreamFormatID)) {
        this.audioStreamFormatID = data().deepCopy(fields()[0].schema(), other.audioStreamFormatID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.audioStreamFormatName)) {
        this.audioStreamFormatName = data().deepCopy(fields()[1].schema(), other.audioStreamFormatName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.formatLabel)) {
        this.formatLabel = data().deepCopy(fields()[2].schema(), other.formatLabel);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.formatDefinition)) {
        this.formatDefinition = data().deepCopy(fields()[3].schema(), other.formatDefinition);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.formatLink)) {
        this.formatLink = data().deepCopy(fields()[4].schema(), other.formatLink);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.formatSource)) {
        this.formatSource = data().deepCopy(fields()[5].schema(), other.formatSource);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.formatNamespace)) {
        this.formatNamespace = data().deepCopy(fields()[6].schema(), other.formatNamespace);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.formatLanguage)) {
        this.formatLanguage = data().deepCopy(fields()[7].schema(), other.formatLanguage);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.audioChannelFormatIDRef)) {
        this.audioChannelFormatIDRef = data().deepCopy(fields()[8].schema(), other.audioChannelFormatIDRef);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.audioPackFormatIDRef)) {
        this.audioPackFormatIDRef = data().deepCopy(fields()[9].schema(), other.audioPackFormatIDRef);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.audioTrackFormatIDRef)) {
        this.audioTrackFormatIDRef = data().deepCopy(fields()[10].schema(), other.audioTrackFormatIDRef);
        fieldSetFlags()[10] = true;
      }
    }
    
    /** Creates a Builder by copying an existing audioStreamFormatType instance */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType other) {
            super(com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.SCHEMA$);
      if (isValidValue(fields()[0], other.audioStreamFormatID)) {
        this.audioStreamFormatID = data().deepCopy(fields()[0].schema(), other.audioStreamFormatID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.audioStreamFormatName)) {
        this.audioStreamFormatName = data().deepCopy(fields()[1].schema(), other.audioStreamFormatName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.formatLabel)) {
        this.formatLabel = data().deepCopy(fields()[2].schema(), other.formatLabel);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.formatDefinition)) {
        this.formatDefinition = data().deepCopy(fields()[3].schema(), other.formatDefinition);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.formatLink)) {
        this.formatLink = data().deepCopy(fields()[4].schema(), other.formatLink);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.formatSource)) {
        this.formatSource = data().deepCopy(fields()[5].schema(), other.formatSource);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.formatNamespace)) {
        this.formatNamespace = data().deepCopy(fields()[6].schema(), other.formatNamespace);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.formatLanguage)) {
        this.formatLanguage = data().deepCopy(fields()[7].schema(), other.formatLanguage);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.audioChannelFormatIDRef)) {
        this.audioChannelFormatIDRef = data().deepCopy(fields()[8].schema(), other.audioChannelFormatIDRef);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.audioPackFormatIDRef)) {
        this.audioPackFormatIDRef = data().deepCopy(fields()[9].schema(), other.audioPackFormatIDRef);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.audioTrackFormatIDRef)) {
        this.audioTrackFormatIDRef = data().deepCopy(fields()[10].schema(), other.audioTrackFormatIDRef);
        fieldSetFlags()[10] = true;
      }
    }

    /** Gets the value of the 'audioStreamFormatID' field */
    public java.lang.CharSequence getAudioStreamFormatID() {
      return audioStreamFormatID;
    }
    
    /** Sets the value of the 'audioStreamFormatID' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder setAudioStreamFormatID(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.audioStreamFormatID = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'audioStreamFormatID' field has been set */
    public boolean hasAudioStreamFormatID() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'audioStreamFormatID' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder clearAudioStreamFormatID() {
      audioStreamFormatID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'audioStreamFormatName' field */
    public java.lang.CharSequence getAudioStreamFormatName() {
      return audioStreamFormatName;
    }
    
    /** Sets the value of the 'audioStreamFormatName' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder setAudioStreamFormatName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.audioStreamFormatName = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'audioStreamFormatName' field has been set */
    public boolean hasAudioStreamFormatName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'audioStreamFormatName' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder clearAudioStreamFormatName() {
      audioStreamFormatName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'formatLabel' field */
    public java.lang.CharSequence getFormatLabel() {
      return formatLabel;
    }
    
    /** Sets the value of the 'formatLabel' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder setFormatLabel(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.formatLabel = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'formatLabel' field has been set */
    public boolean hasFormatLabel() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'formatLabel' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder clearFormatLabel() {
      formatLabel = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'formatDefinition' field */
    public java.lang.CharSequence getFormatDefinition() {
      return formatDefinition;
    }
    
    /** Sets the value of the 'formatDefinition' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder setFormatDefinition(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.formatDefinition = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'formatDefinition' field has been set */
    public boolean hasFormatDefinition() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'formatDefinition' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder clearFormatDefinition() {
      formatDefinition = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'formatLink' field */
    public java.lang.CharSequence getFormatLink() {
      return formatLink;
    }
    
    /** Sets the value of the 'formatLink' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder setFormatLink(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.formatLink = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'formatLink' field has been set */
    public boolean hasFormatLink() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'formatLink' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder clearFormatLink() {
      formatLink = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'formatSource' field */
    public java.lang.CharSequence getFormatSource() {
      return formatSource;
    }
    
    /** Sets the value of the 'formatSource' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder setFormatSource(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.formatSource = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'formatSource' field has been set */
    public boolean hasFormatSource() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'formatSource' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder clearFormatSource() {
      formatSource = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'formatNamespace' field */
    public java.lang.CharSequence getFormatNamespace() {
      return formatNamespace;
    }
    
    /** Sets the value of the 'formatNamespace' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder setFormatNamespace(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.formatNamespace = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'formatNamespace' field has been set */
    public boolean hasFormatNamespace() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'formatNamespace' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder clearFormatNamespace() {
      formatNamespace = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'formatLanguage' field */
    public java.lang.CharSequence getFormatLanguage() {
      return formatLanguage;
    }
    
    /** Sets the value of the 'formatLanguage' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder setFormatLanguage(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.formatLanguage = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'formatLanguage' field has been set */
    public boolean hasFormatLanguage() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'formatLanguage' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder clearFormatLanguage() {
      formatLanguage = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'audioChannelFormatIDRef' field */
    public java.util.List<java.lang.CharSequence> getAudioChannelFormatIDRef() {
      return audioChannelFormatIDRef;
    }
    
    /** Sets the value of the 'audioChannelFormatIDRef' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder setAudioChannelFormatIDRef(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[8], value);
      this.audioChannelFormatIDRef = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'audioChannelFormatIDRef' field has been set */
    public boolean hasAudioChannelFormatIDRef() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'audioChannelFormatIDRef' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder clearAudioChannelFormatIDRef() {
      audioChannelFormatIDRef = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'audioPackFormatIDRef' field */
    public java.util.List<java.lang.CharSequence> getAudioPackFormatIDRef() {
      return audioPackFormatIDRef;
    }
    
    /** Sets the value of the 'audioPackFormatIDRef' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder setAudioPackFormatIDRef(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[9], value);
      this.audioPackFormatIDRef = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'audioPackFormatIDRef' field has been set */
    public boolean hasAudioPackFormatIDRef() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'audioPackFormatIDRef' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder clearAudioPackFormatIDRef() {
      audioPackFormatIDRef = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'audioTrackFormatIDRef' field */
    public java.util.List<java.lang.CharSequence> getAudioTrackFormatIDRef() {
      return audioTrackFormatIDRef;
    }
    
    /** Sets the value of the 'audioTrackFormatIDRef' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder setAudioTrackFormatIDRef(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[10], value);
      this.audioTrackFormatIDRef = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'audioTrackFormatIDRef' field has been set */
    public boolean hasAudioTrackFormatIDRef() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'audioTrackFormatIDRef' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.audioStreamFormatType.Builder clearAudioTrackFormatIDRef() {
      audioTrackFormatIDRef = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    public audioStreamFormatType build() {
      try {
        audioStreamFormatType record = new audioStreamFormatType();
        record.audioStreamFormatID = fieldSetFlags()[0] ? this.audioStreamFormatID : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.audioStreamFormatName = fieldSetFlags()[1] ? this.audioStreamFormatName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.formatLabel = fieldSetFlags()[2] ? this.formatLabel : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.formatDefinition = fieldSetFlags()[3] ? this.formatDefinition : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.formatLink = fieldSetFlags()[4] ? this.formatLink : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.formatSource = fieldSetFlags()[5] ? this.formatSource : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.formatNamespace = fieldSetFlags()[6] ? this.formatNamespace : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.formatLanguage = fieldSetFlags()[7] ? this.formatLanguage : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.audioChannelFormatIDRef = fieldSetFlags()[8] ? this.audioChannelFormatIDRef : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[8]);
        record.audioPackFormatIDRef = fieldSetFlags()[9] ? this.audioPackFormatIDRef : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[9]);
        record.audioTrackFormatIDRef = fieldSetFlags()[10] ? this.audioTrackFormatIDRef : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[10]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}