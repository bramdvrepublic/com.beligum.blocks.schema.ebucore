//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.15 at 12:05:49 AM CET 
//


package com.beligum.blocks.schema.ebucore.v2015;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.beligum.blocks.schema.dublincore.v2002.ElementType;


/**
 * Recommended best practice is to reference the resource by means of a
 *                 string or number conforming to a formal identification system. Relation is used to
 *                 show the relation in content to another resource. For example, "IsPartOf" is used to
 *                 show the relation between a part of a radio programme and the whole programme, or
 *                 between a track and a record album. A resource can be identified by its title, or
 *                 preferably by an identifier. Relation is used to provide a name, locator, accession,
 *                 identification number or ID where the related item can be obtained or found.
 *             
 * 
 * <p>Java class for relationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="relationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}relation"/&gt;
 *         &lt;element name="relationIdentifier" type="{urn:ebu:metadata-schema:ebuCore_2015}identifierType"/&gt;
 *         &lt;element name="relationLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{urn:ebu:metadata-schema:ebuCore_2015}typeGroup"/&gt;
 *       &lt;attribute name="runningOrderNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="totalNumberOfGroupMembers" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="orderedGroupFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="note" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relationType", propOrder = {
    "relation",
    "relationIdentifier",
    "relationLink"
})
@XmlSeeAlso({
    CoreMetadataType.HasTrackPart.class
})
public class RelationType {

    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/")
    protected ElementType relation;
    protected IdentifierType relationIdentifier;
    @XmlSchemaType(name = "anyURI")
    protected java.lang.String relationLink;
    @XmlAttribute(name = "runningOrderNumber")
    protected BigInteger runningOrderNumber;
    @XmlAttribute(name = "totalNumberOfGroupMembers")
    protected BigInteger totalNumberOfGroupMembers;
    @XmlAttribute(name = "orderedGroupFlag")
    protected java.lang.Boolean orderedGroupFlag;
    @XmlAttribute(name = "note")
    protected java.lang.String note;
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
     * The EBU core metadata set is built as a refinement of the Dublin
     *                         Core. A title would be given using this element.
     *                     
     * 
     * @return
     *     possible object is
     *     {@link ElementType }
     *     
     */
    public ElementType getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementType }
     *     
     */
    public void setRelation(ElementType value) {
        this.relation = value;
    }

    /**
     * Gets the value of the relationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getRelationIdentifier() {
        return relationIdentifier;
    }

    /**
     * Sets the value of the relationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setRelationIdentifier(IdentifierType value) {
        this.relationIdentifier = value;
    }

    /**
     * Gets the value of the relationLink property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRelationLink() {
        return relationLink;
    }

    /**
     * Sets the value of the relationLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRelationLink(java.lang.String value) {
        this.relationLink = value;
    }

    /**
     * Gets the value of the runningOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRunningOrderNumber() {
        return runningOrderNumber;
    }

    /**
     * Sets the value of the runningOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRunningOrderNumber(BigInteger value) {
        this.runningOrderNumber = value;
    }

    /**
     * Gets the value of the totalNumberOfGroupMembers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfGroupMembers() {
        return totalNumberOfGroupMembers;
    }

    /**
     * Sets the value of the totalNumberOfGroupMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfGroupMembers(BigInteger value) {
        this.totalNumberOfGroupMembers = value;
    }

    /**
     * Gets the value of the orderedGroupFlag property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isOrderedGroupFlag() {
        return orderedGroupFlag;
    }

    /**
     * Sets the value of the orderedGroupFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOrderedGroupFlag(java.lang.Boolean value) {
        this.orderedGroupFlag = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNote(java.lang.String value) {
        this.note = value;
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

}
