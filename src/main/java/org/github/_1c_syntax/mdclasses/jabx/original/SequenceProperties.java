//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SequenceProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequenceProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Synonym" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ObjectBelonging" type="{http://v8.1c.ru/8.3/xcf/enums}ObjectBelonging"/&gt;
 *         &lt;element name="MoveBoundaryOnPosting" type="{http://v8.1c.ru/8.3/xcf/enums}MoveBoundaryOnPosting"/&gt;
 *         &lt;element name="Documents" type="{http://v8.1c.ru/8.3/xcf/readable}MDListType"/&gt;
 *         &lt;element name="RegisterRecords" type="{http://v8.1c.ru/8.3/xcf/readable}MDListType"/&gt;
 *         &lt;element name="RecordSetModule" type="{http://v8.1c.ru/8.3/xcf/readable}ExternalProperty"/&gt;
 *         &lt;element name="DataLockControlMode" type="{http://v8.1c.ru/8.3/xcf/enums}DefaultDataLockControlMode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceProperties", propOrder = {
    "name",
    "synonym",
    "comment",
    "objectBelonging",
    "moveBoundaryOnPosting",
    "documents",
    "registerRecords",
    "recordSetModule",
    "dataLockControlMode"
})
public class SequenceProperties {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Synonym", required = true)
    protected LocalStringType synonym;
    @XmlElement(name = "Comment", required = true)
    protected String comment;
    @XmlElement(name = "ObjectBelonging", required = true)
    @XmlSchemaType(name = "string")
    protected ObjectBelonging objectBelonging;
    @XmlElement(name = "MoveBoundaryOnPosting", required = true)
    @XmlSchemaType(name = "string")
    protected MoveBoundaryOnPosting moveBoundaryOnPosting;
    @XmlElement(name = "Documents", required = true)
    protected MDListType documents;
    @XmlElement(name = "RegisterRecords", required = true)
    protected MDListType registerRecords;
    @XmlElement(name = "RecordSetModule", required = true)
    protected String recordSetModule;
    @XmlElement(name = "DataLockControlMode", required = true)
    @XmlSchemaType(name = "string")
    protected DefaultDataLockControlMode dataLockControlMode;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the synonym property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getSynonym() {
        return synonym;
    }

    /**
     * Sets the value of the synonym property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setSynonym(LocalStringType value) {
        this.synonym = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the objectBelonging property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectBelonging }
     *     
     */
    public ObjectBelonging getObjectBelonging() {
        return objectBelonging;
    }

    /**
     * Sets the value of the objectBelonging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectBelonging }
     *     
     */
    public void setObjectBelonging(ObjectBelonging value) {
        this.objectBelonging = value;
    }

    /**
     * Gets the value of the moveBoundaryOnPosting property.
     * 
     * @return
     *     possible object is
     *     {@link MoveBoundaryOnPosting }
     *     
     */
    public MoveBoundaryOnPosting getMoveBoundaryOnPosting() {
        return moveBoundaryOnPosting;
    }

    /**
     * Sets the value of the moveBoundaryOnPosting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoveBoundaryOnPosting }
     *     
     */
    public void setMoveBoundaryOnPosting(MoveBoundaryOnPosting value) {
        this.moveBoundaryOnPosting = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link MDListType }
     *     
     */
    public MDListType getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDListType }
     *     
     */
    public void setDocuments(MDListType value) {
        this.documents = value;
    }

    /**
     * Gets the value of the registerRecords property.
     * 
     * @return
     *     possible object is
     *     {@link MDListType }
     *     
     */
    public MDListType getRegisterRecords() {
        return registerRecords;
    }

    /**
     * Sets the value of the registerRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDListType }
     *     
     */
    public void setRegisterRecords(MDListType value) {
        this.registerRecords = value;
    }

    /**
     * Gets the value of the recordSetModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordSetModule() {
        return recordSetModule;
    }

    /**
     * Sets the value of the recordSetModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordSetModule(String value) {
        this.recordSetModule = value;
    }

    /**
     * Gets the value of the dataLockControlMode property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultDataLockControlMode }
     *     
     */
    public DefaultDataLockControlMode getDataLockControlMode() {
        return dataLockControlMode;
    }

    /**
     * Sets the value of the dataLockControlMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultDataLockControlMode }
     *     
     */
    public void setDataLockControlMode(DefaultDataLockControlMode value) {
        this.dataLockControlMode = value;
    }

}
