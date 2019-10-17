//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package com.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for NumberQualifiers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberQualifiers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Digits" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="FractionDigits" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AllowedSign" type="{http://v8.1c.ru/8.1/data/core}AllowedSign"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberQualifiers", namespace = "http://v8.1c.ru/8.1/data/core", propOrder = {
    "digits",
    "fractionDigits",
    "allowedSign"
})
public class NumberQualifiers {

    @XmlElement(name = "Digits", required = true)
    protected BigDecimal digits;
    @XmlElement(name = "FractionDigits", required = true)
    protected BigDecimal fractionDigits;
    @XmlElement(name = "AllowedSign", required = true)
    @XmlSchemaType(name = "string")
    protected AllowedSign allowedSign;

    /**
     * Gets the value of the digits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDigits() {
        return digits;
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
     * Gets the value of the fractionDigits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFractionDigits() {
        return fractionDigits;
    }

    /**
     * Sets the value of the fractionDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFractionDigits(BigDecimal value) {
        this.fractionDigits = value;
    }

    /**
     * Gets the value of the allowedSign property.
     * 
     * @return
     *     possible object is
     *     {@link AllowedSign }
     *     
     */
    public AllowedSign getAllowedSign() {
        return allowedSign;
    }

    /**
     * Sets the value of the allowedSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedSign }
     *     
     */
    public void setAllowedSign(AllowedSign value) {
        this.allowedSign = value;
    }

}