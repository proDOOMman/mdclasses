//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceString"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceString", namespace = "http://v8.1c.ru/8.2/managed-application/core", propOrder = {
    "resName",
    "resString"
})
public class ResourceString {

    @XmlElement(required = true)
    protected String resName;
    @XmlElement(required = true)
    protected String resString;

    /**
     * Gets the value of the resName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResName() {
        return resName;
    }

    /**
     * Sets the value of the resName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResName(String value) {
        this.resName = value;
    }

    /**
     * Gets the value of the resString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResString() {
        return resString;
    }

    /**
     * Sets the value of the resString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResString(String value) {
        this.resString = value;
    }

}
