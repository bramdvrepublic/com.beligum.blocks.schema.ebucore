/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.beligum.blocks.schema.ebucore.v2015.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class screenCentrePositionType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"screenCentrePositionType\",\"namespace\":\"com.beligum.blocks.schema.ebucore.v2015.avro\",\"fields\":[{\"name\":\"azimuth\",\"type\":[\"null\",\"float\"],\"source\":\"attribute azimuth\"},{\"name\":\"elevation\",\"type\":[\"null\",\"float\"],\"source\":\"attribute elevation\"},{\"name\":\"distance\",\"type\":[\"null\",\"float\"],\"source\":\"attribute distance\"},{\"name\":\"X\",\"type\":[\"null\",\"float\"],\"source\":\"attribute X\"},{\"name\":\"Y\",\"type\":[\"null\",\"float\"],\"source\":\"attribute Y\"},{\"name\":\"Z\",\"type\":[\"null\",\"float\"],\"source\":\"attribute Z\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Float azimuth;
  @Deprecated public java.lang.Float elevation;
  @Deprecated public java.lang.Float distance;
  @Deprecated public java.lang.Float X;
  @Deprecated public java.lang.Float Y;
  @Deprecated public java.lang.Float Z;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public screenCentrePositionType() {}

  /**
   * All-args constructor.
   */
  public screenCentrePositionType(java.lang.Float azimuth, java.lang.Float elevation, java.lang.Float distance, java.lang.Float X, java.lang.Float Y, java.lang.Float Z) {
    this.azimuth = azimuth;
    this.elevation = elevation;
    this.distance = distance;
    this.X = X;
    this.Y = Y;
    this.Z = Z;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return azimuth;
    case 1: return elevation;
    case 2: return distance;
    case 3: return X;
    case 4: return Y;
    case 5: return Z;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: azimuth = (java.lang.Float)value$; break;
    case 1: elevation = (java.lang.Float)value$; break;
    case 2: distance = (java.lang.Float)value$; break;
    case 3: X = (java.lang.Float)value$; break;
    case 4: Y = (java.lang.Float)value$; break;
    case 5: Z = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'azimuth' field.
   */
  public java.lang.Float getAzimuth() {
    return azimuth;
  }

  /**
   * Sets the value of the 'azimuth' field.
   * @param value the value to set.
   */
  public void setAzimuth(java.lang.Float value) {
    this.azimuth = value;
  }

  /**
   * Gets the value of the 'elevation' field.
   */
  public java.lang.Float getElevation() {
    return elevation;
  }

  /**
   * Sets the value of the 'elevation' field.
   * @param value the value to set.
   */
  public void setElevation(java.lang.Float value) {
    this.elevation = value;
  }

  /**
   * Gets the value of the 'distance' field.
   */
  public java.lang.Float getDistance() {
    return distance;
  }

  /**
   * Sets the value of the 'distance' field.
   * @param value the value to set.
   */
  public void setDistance(java.lang.Float value) {
    this.distance = value;
  }

  /**
   * Gets the value of the 'X' field.
   */
  public java.lang.Float getX() {
    return X;
  }

  /**
   * Sets the value of the 'X' field.
   * @param value the value to set.
   */
  public void setX(java.lang.Float value) {
    this.X = value;
  }

  /**
   * Gets the value of the 'Y' field.
   */
  public java.lang.Float getY() {
    return Y;
  }

  /**
   * Sets the value of the 'Y' field.
   * @param value the value to set.
   */
  public void setY(java.lang.Float value) {
    this.Y = value;
  }

  /**
   * Gets the value of the 'Z' field.
   */
  public java.lang.Float getZ() {
    return Z;
  }

  /**
   * Sets the value of the 'Z' field.
   * @param value the value to set.
   */
  public void setZ(java.lang.Float value) {
    this.Z = value;
  }

  /** Creates a new screenCentrePositionType RecordBuilder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder newBuilder() {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder();
  }
  
  /** Creates a new screenCentrePositionType RecordBuilder by copying an existing Builder */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder(other);
  }
  
  /** Creates a new screenCentrePositionType RecordBuilder by copying an existing screenCentrePositionType instance */
  public static com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder newBuilder(com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType other) {
    return new com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder(other);
  }
  
  /**
   * RecordBuilder for screenCentrePositionType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<screenCentrePositionType>
    implements org.apache.avro.data.RecordBuilder<screenCentrePositionType> {

    private java.lang.Float azimuth;
    private java.lang.Float elevation;
    private java.lang.Float distance;
    private java.lang.Float X;
    private java.lang.Float Y;
    private java.lang.Float Z;

    /** Creates a new Builder */
    private Builder() {
      super(com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.azimuth)) {
        this.azimuth = data().deepCopy(fields()[0].schema(), other.azimuth);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.elevation)) {
        this.elevation = data().deepCopy(fields()[1].schema(), other.elevation);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.distance)) {
        this.distance = data().deepCopy(fields()[2].schema(), other.distance);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.X)) {
        this.X = data().deepCopy(fields()[3].schema(), other.X);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.Y)) {
        this.Y = data().deepCopy(fields()[4].schema(), other.Y);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Z)) {
        this.Z = data().deepCopy(fields()[5].schema(), other.Z);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing screenCentrePositionType instance */
    private Builder(com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType other) {
            super(com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.SCHEMA$);
      if (isValidValue(fields()[0], other.azimuth)) {
        this.azimuth = data().deepCopy(fields()[0].schema(), other.azimuth);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.elevation)) {
        this.elevation = data().deepCopy(fields()[1].schema(), other.elevation);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.distance)) {
        this.distance = data().deepCopy(fields()[2].schema(), other.distance);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.X)) {
        this.X = data().deepCopy(fields()[3].schema(), other.X);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.Y)) {
        this.Y = data().deepCopy(fields()[4].schema(), other.Y);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Z)) {
        this.Z = data().deepCopy(fields()[5].schema(), other.Z);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'azimuth' field */
    public java.lang.Float getAzimuth() {
      return azimuth;
    }
    
    /** Sets the value of the 'azimuth' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder setAzimuth(java.lang.Float value) {
      validate(fields()[0], value);
      this.azimuth = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'azimuth' field has been set */
    public boolean hasAzimuth() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'azimuth' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder clearAzimuth() {
      azimuth = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'elevation' field */
    public java.lang.Float getElevation() {
      return elevation;
    }
    
    /** Sets the value of the 'elevation' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder setElevation(java.lang.Float value) {
      validate(fields()[1], value);
      this.elevation = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'elevation' field has been set */
    public boolean hasElevation() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'elevation' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder clearElevation() {
      elevation = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'distance' field */
    public java.lang.Float getDistance() {
      return distance;
    }
    
    /** Sets the value of the 'distance' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder setDistance(java.lang.Float value) {
      validate(fields()[2], value);
      this.distance = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'distance' field has been set */
    public boolean hasDistance() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'distance' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder clearDistance() {
      distance = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'X' field */
    public java.lang.Float getX() {
      return X;
    }
    
    /** Sets the value of the 'X' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder setX(java.lang.Float value) {
      validate(fields()[3], value);
      this.X = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'X' field has been set */
    public boolean hasX() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'X' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder clearX() {
      X = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'Y' field */
    public java.lang.Float getY() {
      return Y;
    }
    
    /** Sets the value of the 'Y' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder setY(java.lang.Float value) {
      validate(fields()[4], value);
      this.Y = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'Y' field has been set */
    public boolean hasY() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'Y' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder clearY() {
      Y = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'Z' field */
    public java.lang.Float getZ() {
      return Z;
    }
    
    /** Sets the value of the 'Z' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder setZ(java.lang.Float value) {
      validate(fields()[5], value);
      this.Z = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'Z' field has been set */
    public boolean hasZ() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'Z' field */
    public com.beligum.blocks.schema.ebucore.v2015.avro.screenCentrePositionType.Builder clearZ() {
      Z = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public screenCentrePositionType build() {
      try {
        screenCentrePositionType record = new screenCentrePositionType();
        record.azimuth = fieldSetFlags()[0] ? this.azimuth : (java.lang.Float) defaultValue(fields()[0]);
        record.elevation = fieldSetFlags()[1] ? this.elevation : (java.lang.Float) defaultValue(fields()[1]);
        record.distance = fieldSetFlags()[2] ? this.distance : (java.lang.Float) defaultValue(fields()[2]);
        record.X = fieldSetFlags()[3] ? this.X : (java.lang.Float) defaultValue(fields()[3]);
        record.Y = fieldSetFlags()[4] ? this.Y : (java.lang.Float) defaultValue(fields()[4]);
        record.Z = fieldSetFlags()[5] ? this.Z : (java.lang.Float) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}