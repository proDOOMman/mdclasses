//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for DataProcessorProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataProcessorProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Synonym" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ObjectBelonging" type="{http://v8.1c.ru/8.3/xcf/enums}ObjectBelonging"/&gt;
 *         &lt;element name="UseStandardCommands" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DefaultForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="AuxiliaryForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="ObjectModule" type="{http://v8.1c.ru/8.3/xcf/readable}ExternalProperty"/&gt;
 *         &lt;element name="ManagerModule" type="{http://v8.1c.ru/8.3/xcf/readable}ExternalProperty"/&gt;
 *         &lt;element name="IncludeHelpInContents" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Help" type="{http://v8.1c.ru/8.3/xcf/readable}ExternalProperty"/&gt;
 *         &lt;element name="ExtendedPresentation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="Explanation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataProcessorProperties", propOrder = {
    "name",
    "synonym",
    "comment",
    "objectBelonging",
    "useStandardCommands",
    "defaultForm",
    "auxiliaryForm",
    "objectModule",
    "managerModule",
    "includeHelpInContents",
    "help",
    "extendedPresentation",
    "explanation"
})
public class DataProcessorProperties {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Synonym", required = true)
    protected LocalStringType synonym;
    @XmlElement(name = "Comment", required = true)
    protected String comment;
    @XmlElement(name = "ObjectBelonging", required = true)
    @XmlSchemaType(name = "string")
    protected ObjectBelonging objectBelonging;
    @XmlElement(name = "UseStandardCommands")
    protected boolean useStandardCommands;
    @XmlElement(name = "DefaultForm", required = true)
    protected String defaultForm;
    @XmlElement(name = "AuxiliaryForm", required = true)
    protected String auxiliaryForm;
    @XmlElement(name = "ObjectModule", required = true)
    protected String objectModule;
    @XmlElement(name = "ManagerModule", required = true)
    protected String managerModule;
    @XmlElement(name = "IncludeHelpInContents")
    protected boolean includeHelpInContents;
    @XmlElement(name = "Help", required = true)
    protected String help;
    @XmlElement(name = "ExtendedPresentation", required = true)
    protected LocalStringType extendedPresentation;
    @XmlElement(name = "Explanation", required = true)
    protected LocalStringType explanation;

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
     * Gets the value of the useStandardCommands property.
     * 
     */
    public boolean isUseStandardCommands() {
        return useStandardCommands;
    }

    /**
     * Sets the value of the useStandardCommands property.
     * 
     */
    public void setUseStandardCommands(boolean value) {
        this.useStandardCommands = value;
    }

    /**
     * Gets the value of the defaultForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultForm() {
        return defaultForm;
    }

    /**
     * Sets the value of the defaultForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultForm(String value) {
        this.defaultForm = value;
    }

    /**
     * Gets the value of the auxiliaryForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliaryForm() {
        return auxiliaryForm;
    }

    /**
     * Sets the value of the auxiliaryForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliaryForm(String value) {
        this.auxiliaryForm = value;
    }

    /**
     * Gets the value of the objectModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectModule() {
        return objectModule;
    }

    /**
     * Sets the value of the objectModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectModule(String value) {
        this.objectModule = value;
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

    /**
     * Gets the value of the includeHelpInContents property.
     * 
     */
    public boolean isIncludeHelpInContents() {
        return includeHelpInContents;
    }

    /**
     * Sets the value of the includeHelpInContents property.
     * 
     */
    public void setIncludeHelpInContents(boolean value) {
        this.includeHelpInContents = value;
    }

    /**
     * Gets the value of the help property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelp() {
        return help;
    }

    /**
     * Sets the value of the help property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelp(String value) {
        this.help = value;
    }

    /**
     * Gets the value of the extendedPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getExtendedPresentation() {
        return extendedPresentation;
    }

    /**
     * Sets the value of the extendedPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setExtendedPresentation(LocalStringType value) {
        this.extendedPresentation = value;
    }

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setExplanation(LocalStringType value) {
        this.explanation = value;
    }

}
