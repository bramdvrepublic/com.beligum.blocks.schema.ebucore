/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.beligum.blocks.schema.ebucore.v2015.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AnonType_createddateType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AnonType_createddateType\",\"namespace\":\"com.beligum.blocks.schema.ebucore.v2015.avro\",\"fields\":[{\"name\":\"startYear\",\"type\":[\"null\",\"string\"],\"source\":\"attribute startYear\"},{\"name\":\"startDate\",\"type\":[\"null\",\"string\"],\"source\":\"attribute startDate\"},{\"name\":\"startTime\",\"type\":[\"null\",\"string\"],\"source\":\"attribute startTime\"},{\"name\":\"endYear\",\"type\":[\"null\",\"string\"],\"source\":\"attribute endYear\"},{\"name\":\"endDate\",\"type\":[\"null\",\"string\"],\"source\":\"attribute endDate\"},{\"name\":\"endTime\",\"type\":[\"null\",\"string\"],\"source\":\"attribute endTime\"},{\"name\":\"period\",\"type\":[\"null\",\"string\"],\"source\":\"attribute period\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence startYear;
  @Deprecated public java.lang.CharSequence startDate;
  @Deprecated public java.lang.CharSequence startTime;
  @Deprecated public java.lang.CharSequence endYear;
  @Deprecated public java.lang.CharSequence endDate;
  @Deprecated public java.lang.CharSequence endTime;
  @Deprecated public java.lang.CharSequence period;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public AnonType_createddateType() {}

  /**
   * All-args constructor.
   */
  public AnonType_createddateType(java.lang.CharSequence startYear, java.lang.CharSequence startDate, java.lang.CharSequence startTime, java.lang.CharSequence endYear, java.lang.CharSequence endDate, java.lang.CharSequence endTime, java.lang.CharSequence period) {
    this.startYear = startYear;
    this.startDate = startDate;
    this.startTime = startTime;
    this.endYear = endYear;
    this.endDate = endDate;
    this.endTime = endTime;
    this.period = period;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return startYear;
    case 1: return startDate;
    case 2: return startTime;
    case 3: return endYear;
    case 4: return endDate;
    case 5: return endTime;
    case 6: return period;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: startYear = (java.lang.CharSequence)value$; break;
    case 1: startDate = (java.lang.CharSequence)value$; break;
    case 2: startTime = (java.lang.CharSequence)value$; break;
    case 3: endYear = (java.lang.CharSequence)value$; break;
    case 4: endDate = (java.lang.CharSequence)value$; break;
    case 5: endTime = (java.lang.CharSequence)value$; break;
    case 6: period = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'startYear' field.
   */
  public java.lang.CharSequence getStartYear() {
    return startYear;
  }

  /**
   * Sets the value of the 'startYear' field.
   * @param value the value to set.
   */
  public void setStartYear(java.lang.CharSequence value) {
    this.startYear = value;
  }

  /**
   * Gets the value of the 'startDate' field.
   */
  public java.lang.CharSequence getStartDate() {
    return startDate;
  }

  /**
   * Sets the value of the 'startDate' field.
   * @param value the value to set.
   */
  public void setStartDate(java.lang.CharSequence value) {
    this.startDate = value;
  }

  /**
   * Gets the value of the 'startTime' field.
   */
  public java.lang.CharSequence getStartTime() {
    return startTime;
  }

  /**
   * Sets the value of the 'startTime' field.
   * @param value the value to set.
   */
  public void setStartTime(java.lang.CharSequence value) {
    this.startTime = value;
  }

  /**
   * Gets the value of the 'endYear' field.
   */
  public java.lang.CharSequence getEndYear() {
    return endYear;
  }

  /**
   * Sets the value of the 'endYear' field.
   * @param value the value to set.
   */
  public void setEndYear(java.lang.CharSequence value) {
    this.endYear = value;
  }

  /**
   * Gets the value of the 'endDate' field.
   */
  public java.lang.CharSequence getEndDate() {
    return endDate;
  }

  /**
   * Sets the value of the 'endDate' field.
   * @param value the value to set.
   */
  public void setEndDate(java.lang.CharSequence value) {
    this.endDate = value;
  }

  /**
   * Gets the value of the 'endTime' field.
   */
  public java.lang.CharSequence getEndTime() {
    return endTime;
  }

  /**
   * Sets the value of the 'endTime' field.
   * @param value the value to set.
   */
  public void setEndTime(java.lang.CharSequence value) {
    this.endTime = value;
  }

  /**
   * Gets the value of the 'period' field.
   */
  public java.lang.CharSequence getPeriod() {
    return period;
  }

  /**
   * Sets the value of the 'period' field.
   * @param value the value to set.
   */
  public void setPeriod(java.lang.CharSequence value) {
    this.period = value;
  }

  /** Creates a new AnonType_createddateType RecordBuilder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder newBuilder() {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder();
  }
  
  /** Creates a new AnonType_createddateType RecordBuilder by copying an existing Builder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder(other);
  }
  
  /** Creates a new AnonType_createddateType RecordBuilder by copying an existing AnonType_createddateType instance */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder(other);
  }
  
  /**
   * RecordBuilder for AnonType_createddateType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AnonType_createddateType>
    implements org.apache.avro.data.RecordBuilder<AnonType_createddateType> {

    private java.lang.CharSequence startYear;
    private java.lang.CharSequence startDate;
    private java.lang.CharSequence startTime;
    private java.lang.CharSequence endYear;
    private java.lang.CharSequence endDate;
    private java.lang.CharSequence endTime;
    private java.lang.CharSequence period;

    /** Creates a new Builder */
    private Builder() {
      super(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.startYear)) {
        this.startYear = data().deepCopy(fields()[0].schema(), other.startYear);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.startDate)) {
        this.startDate = data().deepCopy(fields()[1].schema(), other.startDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.startTime)) {
        this.startTime = data().deepCopy(fields()[2].schema(), other.startTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.endYear)) {
        this.endYear = data().deepCopy(fields()[3].schema(), other.endYear);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.endDate)) {
        this.endDate = data().deepCopy(fields()[4].schema(), other.endDate);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.endTime)) {
        this.endTime = data().deepCopy(fields()[5].schema(), other.endTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.period)) {
        this.period = data().deepCopy(fields()[6].schema(), other.period);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing AnonType_createddateType instance */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType other) {
            super(com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.SCHEMA$);
      if (isValidValue(fields()[0], other.startYear)) {
        this.startYear = data().deepCopy(fields()[0].schema(), other.startYear);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.startDate)) {
        this.startDate = data().deepCopy(fields()[1].schema(), other.startDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.startTime)) {
        this.startTime = data().deepCopy(fields()[2].schema(), other.startTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.endYear)) {
        this.endYear = data().deepCopy(fields()[3].schema(), other.endYear);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.endDate)) {
        this.endDate = data().deepCopy(fields()[4].schema(), other.endDate);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.endTime)) {
        this.endTime = data().deepCopy(fields()[5].schema(), other.endTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.period)) {
        this.period = data().deepCopy(fields()[6].schema(), other.period);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'startYear' field */
    public java.lang.CharSequence getStartYear() {
      return startYear;
    }
    
    /** Sets the value of the 'startYear' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder setStartYear(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.startYear = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'startYear' field has been set */
    public boolean hasStartYear() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'startYear' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder clearStartYear() {
      startYear = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'startDate' field */
    public java.lang.CharSequence getStartDate() {
      return startDate;
    }
    
    /** Sets the value of the 'startDate' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder setStartDate(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.startDate = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'startDate' field has been set */
    public boolean hasStartDate() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'startDate' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder clearStartDate() {
      startDate = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'startTime' field */
    public java.lang.CharSequence getStartTime() {
      return startTime;
    }
    
    /** Sets the value of the 'startTime' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder setStartTime(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.startTime = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'startTime' field has been set */
    public boolean hasStartTime() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'startTime' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder clearStartTime() {
      startTime = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'endYear' field */
    public java.lang.CharSequence getEndYear() {
      return endYear;
    }
    
    /** Sets the value of the 'endYear' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder setEndYear(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.endYear = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'endYear' field has been set */
    public boolean hasEndYear() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'endYear' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder clearEndYear() {
      endYear = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'endDate' field */
    public java.lang.CharSequence getEndDate() {
      return endDate;
    }
    
    /** Sets the value of the 'endDate' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder setEndDate(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.endDate = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'endDate' field has been set */
    public boolean hasEndDate() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'endDate' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder clearEndDate() {
      endDate = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'endTime' field */
    public java.lang.CharSequence getEndTime() {
      return endTime;
    }
    
    /** Sets the value of the 'endTime' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder setEndTime(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.endTime = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'endTime' field has been set */
    public boolean hasEndTime() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'endTime' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder clearEndTime() {
      endTime = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'period' field */
    public java.lang.CharSequence getPeriod() {
      return period;
    }
    
    /** Sets the value of the 'period' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder setPeriod(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.period = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'period' field has been set */
    public boolean hasPeriod() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'period' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.AnonType_createddateType.Builder clearPeriod() {
      period = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public AnonType_createddateType build() {
      try {
        AnonType_createddateType record = new AnonType_createddateType();
        record.startYear = fieldSetFlags()[0] ? this.startYear : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.startDate = fieldSetFlags()[1] ? this.startDate : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.startTime = fieldSetFlags()[2] ? this.startTime : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.endYear = fieldSetFlags()[3] ? this.endYear : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.endDate = fieldSetFlags()[4] ? this.endDate : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.endTime = fieldSetFlags()[5] ? this.endTime : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.period = fieldSetFlags()[6] ? this.period : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
