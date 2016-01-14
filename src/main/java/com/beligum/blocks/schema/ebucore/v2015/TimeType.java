//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.14 at 11:54:25 PM CET 
//


package com.beligum.blocks.schema.ebucore.v2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for timeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="timecode" type="{urn:ebu:metadata-schema:ebuCore_2015}timecodeType"/&gt;
 *         &lt;element name="normalPlayTime" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="editUnitNumber" type="{urn:ebu:metadata-schema:ebuCore_2015}editUnitNumberType"/&gt;
 *         &lt;element name="time"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}formatGroup"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeType", propOrder = {
    "timecode",
    "normalPlayTime",
    "editUnitNumber",
    "time"
})
public class TimeType {

    protected java.lang.String timecode;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar normalPlayTime;
    protected EditUnitNumberType editUnitNumber;
    protected TimeType.Time time;
    @XmlAttribute(name = "typeLabel")
    protected java.lang.String typeLabel;
    @XmlAttribute(name = "typeDefinition")
    protected java.lang.String typeDefinition;
    @XmlAttribute(name = "typeLink")
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String typeLink;
    @XmlAttribute(name = "typeSource")
    protected java.lang.String typeSource;
    @XmlAttribute(name = "typeNamespace")
    protected java.lang.String typeNamespace;
    @XmlAttribute(name = "typeLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected java.lang.String typeLanguage;

    /**
     * Gets the value of the timecode property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTimecode() {
        return timecode;
    }

    /**
     * Sets the value of the timecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTimecode(java.lang.String value) {
        this.timecode = value;
    }

    /**
     * Gets the value of the normalPlayTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNormalPlayTime() {
        return normalPlayTime;
    }

    /**
     * Sets the value of the normalPlayTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNormalPlayTime(XMLGregorianCalendar value) {
        this.normalPlayTime = value;
    }

    /**
     * Gets the value of the editUnitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EditUnitNumberType }
     *     
     */
    public EditUnitNumberType getEditUnitNumber() {
        return editUnitNumber;
    }

    /**
     * Sets the value of the editUnitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditUnitNumberType }
     *     
     */
    public void setEditUnitNumber(EditUnitNumberType value) {
        this.editUnitNumber = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link TimeType.Time }
     *     
     */
    public TimeType.Time getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType.Time }
     *     
     */
    public void setTime(TimeType.Time value) {
        this.time = value;
    }

    /**
     * Gets the value of the typeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeLabel() {
        return typeLabel;
    }

    /**
     * Sets the value of the typeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLabel(java.lang.String value) {
        this.typeLabel = value;
    }

    /**
     * Gets the value of the typeDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeDefinition() {
        return typeDefinition;
    }

    /**
     * Sets the value of the typeDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeDefinition(java.lang.String value) {
        this.typeDefinition = value;
    }

    /**
     * Gets the value of the typeLink property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeLink() {
        return typeLink;
    }

    /**
     * Sets the value of the typeLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLink(java.lang.String value) {
        this.typeLink = value;
    }

    /**
     * Gets the value of the typeSource property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeSource() {
        return typeSource;
    }

    /**
     * Sets the value of the typeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeSource(java.lang.String value) {
        this.typeSource = value;
    }

    /**
     * Gets the value of the typeNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeNamespace() {
        return typeNamespace;
    }

    /**
     * Sets the value of the typeNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeNamespace(java.lang.String value) {
        this.typeNamespace = value;
    }

    /**
     * Gets the value of the typeLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTypeLanguage() {
        return typeLanguage;
    }

    /**
     * Sets the value of the typeLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTypeLanguage(java.lang.String value) {
        this.typeLanguage = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}formatGroup"/&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Time {

        @XmlValue
        protected java.lang.String value;
        @XmlAttribute(name = "formatLabel")
        protected java.lang.String formatLabel;
        @XmlAttribute(name = "formatDefinition")
        protected java.lang.String formatDefinition;
        @XmlAttribute(name = "formatLink")
        @XmlSchemaType(name = "anyURI")
        protected java.lang.String formatLink;
        @XmlAttribute(name = "formatSource")
        protected java.lang.String formatSource;
        @XmlAttribute(name = "formatNamespace")
        protected java.lang.String formatNamespace;
        @XmlAttribute(name = "formatLanguage")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected java.lang.String formatLanguage;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setValue(java.lang.String value) {
            this.value = value;
        }

        /**
         * Gets the value of the formatLabel property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getFormatLabel() {
            return formatLabel;
        }

        /**
         * Sets the value of the formatLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setFormatLabel(java.lang.String value) {
            this.formatLabel = value;
        }

        /**
         * Gets the value of the formatDefinition property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getFormatDefinition() {
            return formatDefinition;
        }

        /**
         * Sets the value of the formatDefinition property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setFormatDefinition(java.lang.String value) {
            this.formatDefinition = value;
        }

        /**
         * Gets the value of the formatLink property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getFormatLink() {
            return formatLink;
        }

        /**
         * Sets the value of the formatLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setFormatLink(java.lang.String value) {
            this.formatLink = value;
        }

        /**
         * Gets the value of the formatSource property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getFormatSource() {
            return formatSource;
        }

        /**
         * Sets the value of the formatSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setFormatSource(java.lang.String value) {
            this.formatSource = value;
        }

        /**
         * Gets the value of the formatNamespace property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getFormatNamespace() {
            return formatNamespace;
        }

        /**
         * Sets the value of the formatNamespace property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setFormatNamespace(java.lang.String value) {
            this.formatNamespace = value;
        }

        /**
         * Gets the value of the formatLanguage property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String }
         *     
         */
        public java.lang.String getFormatLanguage() {
            return formatLanguage;
        }

        /**
         * Sets the value of the formatLanguage property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String }
         *     
         */
        public void setFormatLanguage(java.lang.String value) {
            this.formatLanguage = value;
        }

    }

}
