//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package com.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SettingsStorageProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettingsStorageProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Synonym" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ObjectBelonging" type="{http://v8.1c.ru/8.3/xcf/enums}ObjectBelonging"/&gt;
 *         &lt;element name="DefaultSaveForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="DefaultLoadForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="AuxiliarySaveForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="AuxiliaryLoadForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="ManagerModule" type="{http://v8.1c.ru/8.3/xcf/readable}ExternalProperty"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettingsStorageProperties", propOrder = {
    "name",
    "synonym",
    "comment",
    "objectBelonging",
    "defaultSaveForm",
    "defaultLoadForm",
    "auxiliarySaveForm",
    "auxiliaryLoadForm",
    "managerModule"
})
public class SettingsStorageProperties {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Synonym", required = true)
    protected LocalStringType synonym;
    @XmlElement(name = "Comment", required = true)
    protected String comment;
    @XmlElement(name = "ObjectBelonging", required = true)
    @XmlSchemaType(name = "string")
    protected ObjectBelonging objectBelonging;
    @XmlElement(name = "DefaultSaveForm", required = true)
    protected String defaultSaveForm;
    @XmlElement(name = "DefaultLoadForm", required = true)
    protected String defaultLoadForm;
    @XmlElement(name = "AuxiliarySaveForm", required = true)
    protected String auxiliarySaveForm;
    @XmlElement(name = "AuxiliaryLoadForm", required = true)
    protected String auxiliaryLoadForm;
    @XmlElement(name = "ManagerModule", required = true)
    protected String managerModule;

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
     * Gets the value of the defaultSaveForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultSaveForm() {
        return defaultSaveForm;
    }

    /**
     * Sets the value of the defaultSaveForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSaveForm(String value) {
        this.defaultSaveForm = value;
    }

    /**
     * Gets the value of the defaultLoadForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLoadForm() {
        return defaultLoadForm;
    }

    /**
     * Sets the value of the defaultLoadForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLoadForm(String value) {
        this.defaultLoadForm = value;
    }

    /**
     * Gets the value of the auxiliarySaveForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliarySaveForm() {
        return auxiliarySaveForm;
    }

    /**
     * Sets the value of the auxiliarySaveForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliarySaveForm(String value) {
        this.auxiliarySaveForm = value;
    }

    /**
     * Gets the value of the auxiliaryLoadForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliaryLoadForm() {
        return auxiliaryLoadForm;
    }

    /**
     * Sets the value of the auxiliaryLoadForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliaryLoadForm(String value) {
        this.auxiliaryLoadForm = value;
    }

    /**
     * Gets the value of the managerModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerModule() {
        return managerModule;
    }

    /**
     * Sets the value of the managerModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerModule(String value) {
        this.managerModule = value;
    }

}