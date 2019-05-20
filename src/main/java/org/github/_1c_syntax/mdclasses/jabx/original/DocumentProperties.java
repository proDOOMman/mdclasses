//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for DocumentProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Synonym" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ObjectBelonging" type="{http://v8.1c.ru/8.3/xcf/enums}ObjectBelonging"/&gt;
 *         &lt;element name="UseStandardCommands" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Numerator" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="NumberType" type="{http://v8.1c.ru/8.3/xcf/enums}DocumentNumberType"/&gt;
 *         &lt;element name="NumberLength" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="NumberAllowedLength" type="{http://v8.1c.ru/8.1/data/core}AllowedLength"/&gt;
 *         &lt;element name="NumberPeriodicity" type="{http://v8.1c.ru/8.3/xcf/enums}DocumentNumberPeriodicity"/&gt;
 *         &lt;element name="CheckUnique" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Autonumbering" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StandardAttributes" type="{http://v8.1c.ru/8.3/xcf/readable}StandardAttributeDescriptions"/&gt;
 *         &lt;element name="Characteristics" type="{http://v8.1c.ru/8.3/xcf/readable}CharacteristicsDescriptions"/&gt;
 *         &lt;element name="BasedOn" type="{http://v8.1c.ru/8.3/xcf/readable}MDListType"/&gt;
 *         &lt;element name="InputByString" type="{http://v8.1c.ru/8.3/xcf/readable}FieldList"/&gt;
 *         &lt;element name="CreateOnInput" type="{http://v8.1c.ru/8.3/xcf/enums}CreateOnInput"/&gt;
 *         &lt;element name="SearchStringModeOnInputByString" type="{http://v8.1c.ru/8.2/managed-application/logform}SearchStringModeOnInputByString"/&gt;
 *         &lt;element name="FullTextSearchOnInputByString" type="{http://v8.1c.ru/8.2/managed-application/logform}FullTextSearchOnInputByString"/&gt;
 *         &lt;element name="ChoiceDataGetModeOnInputByString" type="{http://v8.1c.ru/8.2/managed-application/logform}ChoiceDataGetModeOnInputByString"/&gt;
 *         &lt;element name="DefaultObjectForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="DefaultListForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="DefaultChoiceForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="AuxiliaryObjectForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="AuxiliaryListForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="AuxiliaryChoiceForm" type="{http://v8.1c.ru/8.3/xcf/readable}MDObjectRef"/&gt;
 *         &lt;element name="ObjectModule" type="{http://v8.1c.ru/8.3/xcf/readable}ExternalProperty"/&gt;
 *         &lt;element name="ManagerModule" type="{http://v8.1c.ru/8.3/xcf/readable}ExternalProperty"/&gt;
 *         &lt;element name="Posting" type="{http://v8.1c.ru/8.3/xcf/enums}Posting"/&gt;
 *         &lt;element name="RealTimePosting" type="{http://v8.1c.ru/8.3/xcf/enums}RealTimePosting"/&gt;
 *         &lt;element name="RegisterRecordsDeletion" type="{http://v8.1c.ru/8.3/xcf/enums}RegisterRecordsDeletion"/&gt;
 *         &lt;element name="RegisterRecordsWritingOnPost" type="{http://v8.1c.ru/8.3/xcf/enums}RegisterRecordsWritingOnPost"/&gt;
 *         &lt;element name="SequenceFilling" type="{http://v8.1c.ru/8.3/xcf/enums}SequenceFilling"/&gt;
 *         &lt;element name="RegisterRecords" type="{http://v8.1c.ru/8.3/xcf/readable}MDListType"/&gt;
 *         &lt;element name="PostInPrivilegedMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UnpostInPrivilegedMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IncludeHelpInContents" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Help" type="{http://v8.1c.ru/8.3/xcf/readable}ExternalProperty"/&gt;
 *         &lt;element name="DataLockFields" type="{http://v8.1c.ru/8.3/xcf/readable}FieldList"/&gt;
 *         &lt;element name="DataLockControlMode" type="{http://v8.1c.ru/8.3/xcf/enums}DefaultDataLockControlMode"/&gt;
 *         &lt;element name="FullTextSearch" type="{http://v8.1c.ru/8.3/xcf/enums}FullTextSearchUsing"/&gt;
 *         &lt;element name="ObjectPresentation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="ExtendedObjectPresentation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="ListPresentation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="ExtendedListPresentation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="Explanation" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="ChoiceHistoryOnInput" type="{http://v8.1c.ru/8.2/managed-application/logform}ChoiceHistoryOnInput"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentProperties", propOrder = {
    "name",
    "synonym",
    "comment",
    "objectBelonging",
    "useStandardCommands",
    "numerator",
    "numberType",
    "numberLength",
    "numberAllowedLength",
    "numberPeriodicity",
    "checkUnique",
    "autonumbering",
    "standardAttributes",
    "characteristics",
    "basedOn",
    "inputByString",
    "createOnInput",
    "searchStringModeOnInputByString",
    "fullTextSearchOnInputByString",
    "choiceDataGetModeOnInputByString",
    "defaultObjectForm",
    "defaultListForm",
    "defaultChoiceForm",
    "auxiliaryObjectForm",
    "auxiliaryListForm",
    "auxiliaryChoiceForm",
    "objectModule",
    "managerModule",
    "posting",
    "realTimePosting",
    "registerRecordsDeletion",
    "registerRecordsWritingOnPost",
    "sequenceFilling",
    "registerRecords",
    "postInPrivilegedMode",
    "unpostInPrivilegedMode",
    "includeHelpInContents",
    "help",
    "dataLockFields",
    "dataLockControlMode",
    "fullTextSearch",
    "objectPresentation",
    "extendedObjectPresentation",
    "listPresentation",
    "extendedListPresentation",
    "explanation",
    "choiceHistoryOnInput"
})
public class DocumentProperties {

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
    @XmlElement(name = "Numerator", required = true)
    protected String numerator;
    @XmlElement(name = "NumberType", required = true)
    @XmlSchemaType(name = "string")
    protected DocumentNumberType numberType;
    @XmlElement(name = "NumberLength", required = true)
    protected BigDecimal numberLength;
    @XmlElement(name = "NumberAllowedLength", required = true)
    @XmlSchemaType(name = "string")
    protected AllowedLength numberAllowedLength;
    @XmlElement(name = "NumberPeriodicity", required = true)
    @XmlSchemaType(name = "string")
    protected DocumentNumberPeriodicity numberPeriodicity;
    @XmlElement(name = "CheckUnique")
    protected boolean checkUnique;
    @XmlElement(name = "Autonumbering")
    protected boolean autonumbering;
    @XmlElement(name = "StandardAttributes", required = true)
    protected StandardAttributeDescriptions standardAttributes;
    @XmlElement(name = "Characteristics", required = true)
    protected CharacteristicsDescriptions characteristics;
    @XmlElement(name = "BasedOn", required = true)
    protected MDListType basedOn;
    @XmlElement(name = "InputByString", required = true)
    protected FieldList inputByString;
    @XmlElement(name = "CreateOnInput", required = true)
    @XmlSchemaType(name = "string")
    protected CreateOnInput createOnInput;
    @XmlElement(name = "SearchStringModeOnInputByString", required = true)
    @XmlSchemaType(name = "string")
    protected SearchStringModeOnInputByString searchStringModeOnInputByString;
    @XmlElement(name = "FullTextSearchOnInputByString", required = true)
    @XmlSchemaType(name = "string")
    protected FullTextSearchOnInputByString fullTextSearchOnInputByString;
    @XmlElement(name = "ChoiceDataGetModeOnInputByString", required = true)
    @XmlSchemaType(name = "string")
    protected ChoiceDataGetModeOnInputByString choiceDataGetModeOnInputByString;
    @XmlElement(name = "DefaultObjectForm", required = true)
    protected String defaultObjectForm;
    @XmlElement(name = "DefaultListForm", required = true)
    protected String defaultListForm;
    @XmlElement(name = "DefaultChoiceForm", required = true)
    protected String defaultChoiceForm;
    @XmlElement(name = "AuxiliaryObjectForm", required = true)
    protected String auxiliaryObjectForm;
    @XmlElement(name = "AuxiliaryListForm", required = true)
    protected String auxiliaryListForm;
    @XmlElement(name = "AuxiliaryChoiceForm", required = true)
    protected String auxiliaryChoiceForm;
    @XmlElement(name = "ObjectModule", required = true)
    protected String objectModule;
    @XmlElement(name = "ManagerModule", required = true)
    protected String managerModule;
    @XmlElement(name = "Posting", required = true)
    @XmlSchemaType(name = "string")
    protected Posting posting;
    @XmlElement(name = "RealTimePosting", required = true)
    @XmlSchemaType(name = "string")
    protected RealTimePosting realTimePosting;
    @XmlElement(name = "RegisterRecordsDeletion", required = true)
    @XmlSchemaType(name = "string")
    protected RegisterRecordsDeletion registerRecordsDeletion;
    @XmlElement(name = "RegisterRecordsWritingOnPost", required = true)
    @XmlSchemaType(name = "string")
    protected RegisterRecordsWritingOnPost registerRecordsWritingOnPost;
    @XmlElement(name = "SequenceFilling", required = true)
    @XmlSchemaType(name = "string")
    protected SequenceFilling sequenceFilling;
    @XmlElement(name = "RegisterRecords", required = true)
    protected MDListType registerRecords;
    @XmlElement(name = "PostInPrivilegedMode")
    protected boolean postInPrivilegedMode;
    @XmlElement(name = "UnpostInPrivilegedMode")
    protected boolean unpostInPrivilegedMode;
    @XmlElement(name = "IncludeHelpInContents")
    protected boolean includeHelpInContents;
    @XmlElement(name = "Help", required = true)
    protected String help;
    @XmlElement(name = "DataLockFields", required = true)
    protected FieldList dataLockFields;
    @XmlElement(name = "DataLockControlMode", required = true)
    @XmlSchemaType(name = "string")
    protected DefaultDataLockControlMode dataLockControlMode;
    @XmlElement(name = "FullTextSearch", required = true)
    @XmlSchemaType(name = "string")
    protected FullTextSearchUsing fullTextSearch;
    @XmlElement(name = "ObjectPresentation", required = true)
    protected LocalStringType objectPresentation;
    @XmlElement(name = "ExtendedObjectPresentation", required = true)
    protected LocalStringType extendedObjectPresentation;
    @XmlElement(name = "ListPresentation", required = true)
    protected LocalStringType listPresentation;
    @XmlElement(name = "ExtendedListPresentation", required = true)
    protected LocalStringType extendedListPresentation;
    @XmlElement(name = "Explanation", required = true)
    protected LocalStringType explanation;
    @XmlElement(name = "ChoiceHistoryOnInput", required = true)
    @XmlSchemaType(name = "string")
    protected ChoiceHistoryOnInput choiceHistoryOnInput;

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
     * Gets the value of the numerator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerator() {
        return numerator;
    }

    /**
     * Sets the value of the numerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerator(String value) {
        this.numerator = value;
    }

    /**
     * Gets the value of the numberType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumberType }
     *     
     */
    public DocumentNumberType getNumberType() {
        return numberType;
    }

    /**
     * Sets the value of the numberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumberType }
     *     
     */
    public void setNumberType(DocumentNumberType value) {
        this.numberType = value;
    }

    /**
     * Gets the value of the numberLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberLength() {
        return numberLength;
    }

    /**
     * Sets the value of the numberLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberLength(BigDecimal value) {
        this.numberLength = value;
    }

    /**
     * Gets the value of the numberAllowedLength property.
     * 
     * @return
     *     possible object is
     *     {@link AllowedLength }
     *     
     */
    public AllowedLength getNumberAllowedLength() {
        return numberAllowedLength;
    }

    /**
     * Sets the value of the numberAllowedLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedLength }
     *     
     */
    public void setNumberAllowedLength(AllowedLength value) {
        this.numberAllowedLength = value;
    }

    /**
     * Gets the value of the numberPeriodicity property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumberPeriodicity }
     *     
     */
    public DocumentNumberPeriodicity getNumberPeriodicity() {
        return numberPeriodicity;
    }

    /**
     * Sets the value of the numberPeriodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumberPeriodicity }
     *     
     */
    public void setNumberPeriodicity(DocumentNumberPeriodicity value) {
        this.numberPeriodicity = value;
    }

    /**
     * Gets the value of the checkUnique property.
     * 
     */
    public boolean isCheckUnique() {
        return checkUnique;
    }

    /**
     * Sets the value of the checkUnique property.
     * 
     */
    public void setCheckUnique(boolean value) {
        this.checkUnique = value;
    }

    /**
     * Gets the value of the autonumbering property.
     * 
     */
    public boolean isAutonumbering() {
        return autonumbering;
    }

    /**
     * Sets the value of the autonumbering property.
     * 
     */
    public void setAutonumbering(boolean value) {
        this.autonumbering = value;
    }

    /**
     * Gets the value of the standardAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link StandardAttributeDescriptions }
     *     
     */
    public StandardAttributeDescriptions getStandardAttributes() {
        return standardAttributes;
    }

    /**
     * Sets the value of the standardAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardAttributeDescriptions }
     *     
     */
    public void setStandardAttributes(StandardAttributeDescriptions value) {
        this.standardAttributes = value;
    }

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicsDescriptions }
     *     
     */
    public CharacteristicsDescriptions getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicsDescriptions }
     *     
     */
    public void setCharacteristics(CharacteristicsDescriptions value) {
        this.characteristics = value;
    }

    /**
     * Gets the value of the basedOn property.
     * 
     * @return
     *     possible object is
     *     {@link MDListType }
     *     
     */
    public MDListType getBasedOn() {
        return basedOn;
    }

    /**
     * Sets the value of the basedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDListType }
     *     
     */
    public void setBasedOn(MDListType value) {
        this.basedOn = value;
    }

    /**
     * Gets the value of the inputByString property.
     * 
     * @return
     *     possible object is
     *     {@link FieldList }
     *     
     */
    public FieldList getInputByString() {
        return inputByString;
    }

    /**
     * Sets the value of the inputByString property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldList }
     *     
     */
    public void setInputByString(FieldList value) {
        this.inputByString = value;
    }

    /**
     * Gets the value of the createOnInput property.
     * 
     * @return
     *     possible object is
     *     {@link CreateOnInput }
     *     
     */
    public CreateOnInput getCreateOnInput() {
        return createOnInput;
    }

    /**
     * Sets the value of the createOnInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOnInput }
     *     
     */
    public void setCreateOnInput(CreateOnInput value) {
        this.createOnInput = value;
    }

    /**
     * Gets the value of the searchStringModeOnInputByString property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringModeOnInputByString }
     *     
     */
    public SearchStringModeOnInputByString getSearchStringModeOnInputByString() {
        return searchStringModeOnInputByString;
    }

    /**
     * Sets the value of the searchStringModeOnInputByString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringModeOnInputByString }
     *     
     */
    public void setSearchStringModeOnInputByString(SearchStringModeOnInputByString value) {
        this.searchStringModeOnInputByString = value;
    }

    /**
     * Gets the value of the fullTextSearchOnInputByString property.
     * 
     * @return
     *     possible object is
     *     {@link FullTextSearchOnInputByString }
     *     
     */
    public FullTextSearchOnInputByString getFullTextSearchOnInputByString() {
        return fullTextSearchOnInputByString;
    }

    /**
     * Sets the value of the fullTextSearchOnInputByString property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullTextSearchOnInputByString }
     *     
     */
    public void setFullTextSearchOnInputByString(FullTextSearchOnInputByString value) {
        this.fullTextSearchOnInputByString = value;
    }

    /**
     * Gets the value of the choiceDataGetModeOnInputByString property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceDataGetModeOnInputByString }
     *     
     */
    public ChoiceDataGetModeOnInputByString getChoiceDataGetModeOnInputByString() {
        return choiceDataGetModeOnInputByString;
    }

    /**
     * Sets the value of the choiceDataGetModeOnInputByString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceDataGetModeOnInputByString }
     *     
     */
    public void setChoiceDataGetModeOnInputByString(ChoiceDataGetModeOnInputByString value) {
        this.choiceDataGetModeOnInputByString = value;
    }

    /**
     * Gets the value of the defaultObjectForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultObjectForm() {
        return defaultObjectForm;
    }

    /**
     * Sets the value of the defaultObjectForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultObjectForm(String value) {
        this.defaultObjectForm = value;
    }

    /**
     * Gets the value of the defaultListForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultListForm() {
        return defaultListForm;
    }

    /**
     * Sets the value of the defaultListForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultListForm(String value) {
        this.defaultListForm = value;
    }

    /**
     * Gets the value of the defaultChoiceForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultChoiceForm() {
        return defaultChoiceForm;
    }

    /**
     * Sets the value of the defaultChoiceForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultChoiceForm(String value) {
        this.defaultChoiceForm = value;
    }

    /**
     * Gets the value of the auxiliaryObjectForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliaryObjectForm() {
        return auxiliaryObjectForm;
    }

    /**
     * Sets the value of the auxiliaryObjectForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliaryObjectForm(String value) {
        this.auxiliaryObjectForm = value;
    }

    /**
     * Gets the value of the auxiliaryListForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliaryListForm() {
        return auxiliaryListForm;
    }

    /**
     * Sets the value of the auxiliaryListForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliaryListForm(String value) {
        this.auxiliaryListForm = value;
    }

    /**
     * Gets the value of the auxiliaryChoiceForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxiliaryChoiceForm() {
        return auxiliaryChoiceForm;
    }

    /**
     * Sets the value of the auxiliaryChoiceForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxiliaryChoiceForm(String value) {
        this.auxiliaryChoiceForm = value;
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
     * Gets the value of the posting property.
     * 
     * @return
     *     possible object is
     *     {@link Posting }
     *     
     */
    public Posting getPosting() {
        return posting;
    }

    /**
     * Sets the value of the posting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Posting }
     *     
     */
    public void setPosting(Posting value) {
        this.posting = value;
    }

    /**
     * Gets the value of the realTimePosting property.
     * 
     * @return
     *     possible object is
     *     {@link RealTimePosting }
     *     
     */
    public RealTimePosting getRealTimePosting() {
        return realTimePosting;
    }

    /**
     * Sets the value of the realTimePosting property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealTimePosting }
     *     
     */
    public void setRealTimePosting(RealTimePosting value) {
        this.realTimePosting = value;
    }

    /**
     * Gets the value of the registerRecordsDeletion property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterRecordsDeletion }
     *     
     */
    public RegisterRecordsDeletion getRegisterRecordsDeletion() {
        return registerRecordsDeletion;
    }

    /**
     * Sets the value of the registerRecordsDeletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterRecordsDeletion }
     *     
     */
    public void setRegisterRecordsDeletion(RegisterRecordsDeletion value) {
        this.registerRecordsDeletion = value;
    }

    /**
     * Gets the value of the registerRecordsWritingOnPost property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterRecordsWritingOnPost }
     *     
     */
    public RegisterRecordsWritingOnPost getRegisterRecordsWritingOnPost() {
        return registerRecordsWritingOnPost;
    }

    /**
     * Sets the value of the registerRecordsWritingOnPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterRecordsWritingOnPost }
     *     
     */
    public void setRegisterRecordsWritingOnPost(RegisterRecordsWritingOnPost value) {
        this.registerRecordsWritingOnPost = value;
    }

    /**
     * Gets the value of the sequenceFilling property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceFilling }
     *     
     */
    public SequenceFilling getSequenceFilling() {
        return sequenceFilling;
    }

    /**
     * Sets the value of the sequenceFilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceFilling }
     *     
     */
    public void setSequenceFilling(SequenceFilling value) {
        this.sequenceFilling = value;
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
     * Gets the value of the postInPrivilegedMode property.
     * 
     */
    public boolean isPostInPrivilegedMode() {
        return postInPrivilegedMode;
    }

    /**
     * Sets the value of the postInPrivilegedMode property.
     * 
     */
    public void setPostInPrivilegedMode(boolean value) {
        this.postInPrivilegedMode = value;
    }

    /**
     * Gets the value of the unpostInPrivilegedMode property.
     * 
     */
    public boolean isUnpostInPrivilegedMode() {
        return unpostInPrivilegedMode;
    }

    /**
     * Sets the value of the unpostInPrivilegedMode property.
     * 
     */
    public void setUnpostInPrivilegedMode(boolean value) {
        this.unpostInPrivilegedMode = value;
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
     * Gets the value of the dataLockFields property.
     * 
     * @return
     *     possible object is
     *     {@link FieldList }
     *     
     */
    public FieldList getDataLockFields() {
        return dataLockFields;
    }

    /**
     * Sets the value of the dataLockFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldList }
     *     
     */
    public void setDataLockFields(FieldList value) {
        this.dataLockFields = value;
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

    /**
     * Gets the value of the fullTextSearch property.
     * 
     * @return
     *     possible object is
     *     {@link FullTextSearchUsing }
     *     
     */
    public FullTextSearchUsing getFullTextSearch() {
        return fullTextSearch;
    }

    /**
     * Sets the value of the fullTextSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullTextSearchUsing }
     *     
     */
    public void setFullTextSearch(FullTextSearchUsing value) {
        this.fullTextSearch = value;
    }

    /**
     * Gets the value of the objectPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getObjectPresentation() {
        return objectPresentation;
    }

    /**
     * Sets the value of the objectPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setObjectPresentation(LocalStringType value) {
        this.objectPresentation = value;
    }

    /**
     * Gets the value of the extendedObjectPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getExtendedObjectPresentation() {
        return extendedObjectPresentation;
    }

    /**
     * Sets the value of the extendedObjectPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setExtendedObjectPresentation(LocalStringType value) {
        this.extendedObjectPresentation = value;
    }

    /**
     * Gets the value of the listPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getListPresentation() {
        return listPresentation;
    }

    /**
     * Sets the value of the listPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setListPresentation(LocalStringType value) {
        this.listPresentation = value;
    }

    /**
     * Gets the value of the extendedListPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getExtendedListPresentation() {
        return extendedListPresentation;
    }

    /**
     * Sets the value of the extendedListPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setExtendedListPresentation(LocalStringType value) {
        this.extendedListPresentation = value;
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

    /**
     * Gets the value of the choiceHistoryOnInput property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceHistoryOnInput }
     *     
     */
    public ChoiceHistoryOnInput getChoiceHistoryOnInput() {
        return choiceHistoryOnInput;
    }

    /**
     * Sets the value of the choiceHistoryOnInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceHistoryOnInput }
     *     
     */
    public void setChoiceHistoryOnInput(ChoiceHistoryOnInput value) {
        this.choiceHistoryOnInput = value;
    }

}
