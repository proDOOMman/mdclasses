//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for FormDataTypeDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormDataTypeDescription"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://v8.1c.ru/8.2/uobjects&gt;TypeList"&gt;
 *       &lt;attribute name="object" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="digits" type="{http://www.w3.org/2001/XMLSchema}decimal" default="10" /&gt;
 *       &lt;attribute name="precision" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" /&gt;
 *       &lt;attribute name="unsigned" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}decimal" default="10" /&gt;
 *       &lt;attribute name="fixed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="dateFraction" type="{http://v8.1c.ru/8.1/data/core}DateFractions" default="DateTime" /&gt;
 *       &lt;attribute name="binaryLength" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" /&gt;
 *       &lt;attribute name="binaryFixed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormDataTypeDescription", namespace = "http://v8.1c.ru/8.2/uobjects", propOrder = {
    "value"
})
public class FormDataTypeDescription {

    @XmlValue
    protected List<String> value;
    @XmlAttribute(name = "object")
    protected Boolean object;
    @XmlAttribute(name = "digits")
    protected BigDecimal digits;
    @XmlAttribute(name = "precision")
    protected BigDecimal precision;
    @XmlAttribute(name = "unsigned")
    protected Boolean unsigned;
    @XmlAttribute(name = "length")
    protected BigDecimal length;
    @XmlAttribute(name = "fixed")
    protected Boolean fixed;
    @XmlAttribute(name = "dateFraction")
    protected DateFractions dateFraction;
    @XmlAttribute(name = "binaryLength")
    protected BigDecimal binaryLength;
    @XmlAttribute(name = "binaryFixed")
    protected Boolean binaryFixed;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
    }

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isObject() {
        if (object == null) {
            return false;
        } else {
            return object;
        }
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObject(Boolean value) {
        this.object = value;
    }

    /**
     * Gets the value of the digits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDigits() {
        if (digits == null) {
            return new BigDecimal("10");
        } else {
            return digits;
        }
    }

    /**
     * Sets the value of the digits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDigits(BigDecimal value) {
        this.digits = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecision() {
        if (precision == null) {
            return new BigDecimal("0");
        } else {
            return precision;
        }
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecision(BigDecimal value) {
        this.precision = value;
    }

    /**
     * Gets the value of the unsigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUnsigned() {
        if (unsigned == null) {
            return false;
        } else {
            return unsigned;
        }
    }

    /**
     * Sets the value of the unsigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnsigned(Boolean value) {
        this.unsigned = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        if (length == null) {
            return new BigDecimal("10");
        } else {
            return length;
        }
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Gets the value of the fixed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFixed() {
        if (fixed == null) {
            return false;
        } else {
            return fixed;
        }
    }

    /**
     * Sets the value of the fixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixed(Boolean value) {
        this.fixed = value;
    }

    /**
     * Gets the value of the dateFraction property.
     * 
     * @return
     *     possible object is
     *     {@link DateFractions }
     *     
     */
    public DateFractions getDateFraction() {
        if (dateFraction == null) {
            return DateFractions.DATE_TIME;
        } else {
            return dateFraction;
        }
    }

    /**
     * Sets the value of the dateFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFractions }
     *     
     */
    public void setDateFraction(DateFractions value) {
        this.dateFraction = value;
    }

    /**
     * Gets the value of the binaryLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBinaryLength() {
        if (binaryLength == null) {
            return new BigDecimal("0");
        } else {
            return binaryLength;
        }
    }

    /**
     * Sets the value of the binaryLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBinaryLength(BigDecimal value) {
        this.binaryLength = value;
    }

    /**
     * Gets the value of the binaryFixed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBinaryFixed() {
        if (binaryFixed == null) {
            return false;
        } else {
            return binaryFixed;
        }
    }

    /**
     * Sets the value of the binaryFixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBinaryFixed(Boolean value) {
        this.binaryFixed = value;
    }

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

}
