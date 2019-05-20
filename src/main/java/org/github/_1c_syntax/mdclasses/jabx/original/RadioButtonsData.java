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
 * <p>Java class for RadioButtonsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadioButtonsData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valList" type="{http://v8.1c.ru/8.1/data/core}ValueListType"/&gt;
 *         &lt;element name="txtClr" type="{http://v8.1c.ru/8.1/data/ui}Color" minOccurs="0"/&gt;
 *         &lt;element name="fnt" type="{http://v8.1c.ru/8.1/data/ui}Font" minOccurs="0"/&gt;
 *         &lt;element name="brdClr" type="{http://v8.1c.ru/8.1/data/ui}Color" minOccurs="0"/&gt;
 *         &lt;element name="bkClr" type="{http://v8.1c.ru/8.1/data/ui}Color" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="radioButtonType" type="{http://v8.1c.ru/8.2/managed-application/logform}RadioButtonType" /&gt;
 *       &lt;attribute name="colsCount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="elementTitleHeight" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="elementHeight" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="elementWidth" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="eqWidth" type="{http://v8.1c.ru/8.2/managed-application/logform}BWAValue" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadioButtonsData", namespace = "http://v8.1c.ru/8.2/managed-application/logform", propOrder = {
    "valList",
    "txtClr",
    "fnt",
    "brdClr",
    "bkClr"
})
public class RadioButtonsData {

    @XmlElement(required = true)
    protected ValueListType valList;
    @XmlSchemaType(name = "anySimpleType")
    protected String txtClr;
    protected Font fnt;
    @XmlSchemaType(name = "anySimpleType")
    protected String brdClr;
    @XmlSchemaType(name = "anySimpleType")
    protected String bkClr;
    @XmlAttribute(name = "radioButtonType")
    protected RadioButtonType radioButtonType;
    @XmlAttribute(name = "colsCount")
    protected BigDecimal colsCount;
    @XmlAttribute(name = "elementTitleHeight")
    protected BigDecimal elementTitleHeight;
    @XmlAttribute(name = "elementHeight")
    protected BigDecimal elementHeight;
    @XmlAttribute(name = "elementWidth")
    protected BigDecimal elementWidth;
    @XmlAttribute(name = "eqWidth")
    protected BWAValue eqWidth;

    /**
     * Gets the value of the valList property.
     * 
     * @return
     *     possible object is
     *     {@link ValueListType }
     *     
     */
    public ValueListType getValList() {
        return valList;
    }

    /**
     * Sets the value of the valList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueListType }
     *     
     */
    public void setValList(ValueListType value) {
        this.valList = value;
    }

    /**
     * Gets the value of the txtClr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtClr() {
        return txtClr;
    }

    /**
     * Sets the value of the txtClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtClr(String value) {
        this.txtClr = value;
    }

    /**
     * Gets the value of the fnt property.
     * 
     * @return
     *     possible object is
     *     {@link Font }
     *     
     */
    public Font getFnt() {
        return fnt;
    }

    /**
     * Sets the value of the fnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Font }
     *     
     */
    public void setFnt(Font value) {
        this.fnt = value;
    }

    /**
     * Gets the value of the brdClr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrdClr() {
        return brdClr;
    }

    /**
     * Sets the value of the brdClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrdClr(String value) {
        this.brdClr = value;
    }

    /**
     * Gets the value of the bkClr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkClr() {
        return bkClr;
    }

    /**
     * Sets the value of the bkClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBkClr(String value) {
        this.bkClr = value;
    }

    /**
     * Gets the value of the radioButtonType property.
     * 
     * @return
     *     possible object is
     *     {@link RadioButtonType }
     *     
     */
    public RadioButtonType getRadioButtonType() {
        return radioButtonType;
    }

    /**
     * Sets the value of the radioButtonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioButtonType }
     *     
     */
    public void setRadioButtonType(RadioButtonType value) {
        this.radioButtonType = value;
    }

    /**
     * Gets the value of the colsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getColsCount() {
        return colsCount;
    }

    /**
     * Sets the value of the colsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setColsCount(BigDecimal value) {
        this.colsCount = value;
    }

    /**
     * Gets the value of the elementTitleHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElementTitleHeight() {
        return elementTitleHeight;
    }

    /**
     * Sets the value of the elementTitleHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setElementTitleHeight(BigDecimal value) {
        this.elementTitleHeight = value;
    }

    /**
     * Gets the value of the elementHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElementHeight() {
        return elementHeight;
    }

    /**
     * Sets the value of the elementHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setElementHeight(BigDecimal value) {
        this.elementHeight = value;
    }

    /**
     * Gets the value of the elementWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElementWidth() {
        return elementWidth;
    }

    /**
     * Sets the value of the elementWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setElementWidth(BigDecimal value) {
        this.elementWidth = value;
    }

    /**
     * Gets the value of the eqWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BWAValue }
     *     
     */
    public BWAValue getEqWidth() {
        return eqWidth;
    }

    /**
     * Sets the value of the eqWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BWAValue }
     *     
     */
    public void setEqWidth(BWAValue value) {
        this.eqWidth = value;
    }

}
