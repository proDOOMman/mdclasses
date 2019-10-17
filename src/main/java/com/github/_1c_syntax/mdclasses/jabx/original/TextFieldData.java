//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package com.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TextFieldData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextFieldData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="txtClr" type="{http://v8.1c.ru/8.1/data/ui}Color" minOccurs="0"/&gt;
 *         &lt;element name="bkClr" type="{http://v8.1c.ru/8.1/data/ui}Color" minOccurs="0"/&gt;
 *         &lt;element name="brdClr" type="{http://v8.1c.ru/8.1/data/ui}Color" minOccurs="0"/&gt;
 *         &lt;element name="brd" type="{http://v8.1c.ru/8.1/data/ui}Border" minOccurs="0"/&gt;
 *         &lt;element name="fnt" type="{http://v8.1c.ru/8.1/data/ui}Font" minOccurs="0"/&gt;
 *         &lt;element name="event" type="{http://v8.1c.ru/8.2/managed-application/logform}Event" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="rowsCount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="horStretch" type="{http://v8.1c.ru/8.2/managed-application/logform}BWAValue" /&gt;
 *       &lt;attribute name="verStretch" type="{http://v8.1c.ru/8.2/managed-application/logform}BWAValue" /&gt;
 *       &lt;attribute name="autoMaxWidth" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="maxWidth" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="minWidth" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="autoMaxHeight" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="maxHeight" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="markNeg" type="{http://v8.1c.ru/8.2/managed-application/logform}BWAValue" /&gt;
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="hyper" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="psw" type="{http://v8.1c.ru/8.2/managed-application/logform}BWAValue" /&gt;
 *       &lt;attribute name="clearEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextFieldData", namespace = "http://v8.1c.ru/8.2/managed-application/logform", propOrder = {
    "txtClr",
    "bkClr",
    "brdClr",
    "brd",
    "fnt",
    "event"
})
public class TextFieldData {

    @XmlSchemaType(name = "anySimpleType")
    protected String txtClr;
    @XmlSchemaType(name = "anySimpleType")
    protected String bkClr;
    @XmlSchemaType(name = "anySimpleType")
    protected String brdClr;
    protected Border brd;
    protected Font fnt;
    protected List<Event> event;
    @XmlAttribute(name = "width")
    protected BigDecimal width;
    @XmlAttribute(name = "rowsCount")
    protected BigDecimal rowsCount;
    @XmlAttribute(name = "horStretch")
    protected BWAValue horStretch;
    @XmlAttribute(name = "verStretch")
    protected BWAValue verStretch;
    @XmlAttribute(name = "autoMaxWidth")
    protected Boolean autoMaxWidth;
    @XmlAttribute(name = "maxWidth")
    protected BigDecimal maxWidth;
    @XmlAttribute(name = "minWidth")
    protected BigDecimal minWidth;
    @XmlAttribute(name = "autoMaxHeight")
    protected Boolean autoMaxHeight;
    @XmlAttribute(name = "maxHeight")
    protected BigDecimal maxHeight;
    @XmlAttribute(name = "markNeg")
    protected BWAValue markNeg;
    @XmlAttribute(name = "format")
    protected String format;
    @XmlAttribute(name = "hyper")
    protected Boolean hyper;
    @XmlAttribute(name = "psw")
    protected BWAValue psw;
    @XmlAttribute(name = "clearEvents")
    protected Boolean clearEvents;

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
     * Gets the value of the brd property.
     * 
     * @return
     *     possible object is
     *     {@link Border }
     *     
     */
    public Border getBrd() {
        return brd;
    }

    /**
     * Sets the value of the brd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Border }
     *     
     */
    public void setBrd(Border value) {
        this.brd = value;
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
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEvent() {
        if (event == null) {
            event = new ArrayList<Event>();
        }
        return this.event;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

    /**
     * Gets the value of the rowsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRowsCount() {
        return rowsCount;
    }

    /**
     * Sets the value of the rowsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRowsCount(BigDecimal value) {
        this.rowsCount = value;
    }

    /**
     * Gets the value of the horStretch property.
     * 
     * @return
     *     possible object is
     *     {@link BWAValue }
     *     
     */
    public BWAValue getHorStretch() {
        return horStretch;
    }

    /**
     * Sets the value of the horStretch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BWAValue }
     *     
     */
    public void setHorStretch(BWAValue value) {
        this.horStretch = value;
    }

    /**
     * Gets the value of the verStretch property.
     * 
     * @return
     *     possible object is
     *     {@link BWAValue }
     *     
     */
    public BWAValue getVerStretch() {
        return verStretch;
    }

    /**
     * Sets the value of the verStretch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BWAValue }
     *     
     */
    public void setVerStretch(BWAValue value) {
        this.verStretch = value;
    }

    /**
     * Gets the value of the autoMaxWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoMaxWidth() {
        return autoMaxWidth;
    }

    /**
     * Sets the value of the autoMaxWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoMaxWidth(Boolean value) {
        this.autoMaxWidth = value;
    }

    /**
     * Gets the value of the maxWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxWidth() {
        return maxWidth;
    }

    /**
     * Sets the value of the maxWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxWidth(BigDecimal value) {
        this.maxWidth = value;
    }

    /**
     * Gets the value of the minWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinWidth() {
        return minWidth;
    }

    /**
     * Sets the value of the minWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinWidth(BigDecimal value) {
        this.minWidth = value;
    }

    /**
     * Gets the value of the autoMaxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoMaxHeight() {
        return autoMaxHeight;
    }

    /**
     * Sets the value of the autoMaxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoMaxHeight(Boolean value) {
        this.autoMaxHeight = value;
    }

    /**
     * Gets the value of the maxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxHeight() {
        return maxHeight;
    }

    /**
     * Sets the value of the maxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxHeight(BigDecimal value) {
        this.maxHeight = value;
    }

    /**
     * Gets the value of the markNeg property.
     * 
     * @return
     *     possible object is
     *     {@link BWAValue }
     *     
     */
    public BWAValue getMarkNeg() {
        return markNeg;
    }

    /**
     * Sets the value of the markNeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BWAValue }
     *     
     */
    public void setMarkNeg(BWAValue value) {
        this.markNeg = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the hyper property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHyper() {
        return hyper;
    }

    /**
     * Sets the value of the hyper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHyper(Boolean value) {
        this.hyper = value;
    }

    /**
     * Gets the value of the psw property.
     * 
     * @return
     *     possible object is
     *     {@link BWAValue }
     *     
     */
    public BWAValue getPsw() {
        return psw;
    }

    /**
     * Sets the value of the psw property.
     * 
     * @param value
     *     allowed object is
     *     {@link BWAValue }
     *     
     */
    public void setPsw(BWAValue value) {
        this.psw = value;
    }

    /**
     * Gets the value of the clearEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClearEvents() {
        return clearEvents;
    }

    /**
     * Sets the value of the clearEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClearEvents(Boolean value) {
        this.clearEvents = value;
    }

}