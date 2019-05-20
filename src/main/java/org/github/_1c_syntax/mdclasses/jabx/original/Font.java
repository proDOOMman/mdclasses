//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for Font complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Font"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ref" type="{http://v8.1c.ru/8.1/data/ui}StyleRef" /&gt;
 *       &lt;attribute name="faceName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="bold" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="italic" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="underline" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="strikeout" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="kind" type="{http://v8.1c.ru/8.1/data/ui}FontType" /&gt;
 *       &lt;attribute name="scale" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Font", namespace = "http://v8.1c.ru/8.1/data/ui")
public class Font {

    @XmlAttribute(name = "ref")
    protected String ref;
    @XmlAttribute(name = "faceName")
    protected String faceName;
    @XmlAttribute(name = "height")
    protected BigDecimal height;
    @XmlAttribute(name = "bold")
    protected Boolean bold;
    @XmlAttribute(name = "italic")
    protected Boolean italic;
    @XmlAttribute(name = "underline")
    protected Boolean underline;
    @XmlAttribute(name = "strikeout")
    protected Boolean strikeout;
    @XmlAttribute(name = "kind")
    protected FontType kind;
    @XmlAttribute(name = "scale")
    protected BigDecimal scale;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the faceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceName() {
        return faceName;
    }

    /**
     * Sets the value of the faceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceName(String value) {
        this.faceName = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeight(BigDecimal value) {
        this.height = value;
    }

    /**
     * Gets the value of the bold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBold() {
        if (bold == null) {
            return false;
        } else {
            return bold;
        }
    }

    /**
     * Sets the value of the bold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBold(Boolean value) {
        this.bold = value;
    }

    /**
     * Gets the value of the italic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isItalic() {
        if (italic == null) {
            return false;
        } else {
            return italic;
        }
    }

    /**
     * Sets the value of the italic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItalic(Boolean value) {
        this.italic = value;
    }

    /**
     * Gets the value of the underline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUnderline() {
        if (underline == null) {
            return false;
        } else {
            return underline;
        }
    }

    /**
     * Sets the value of the underline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnderline(Boolean value) {
        this.underline = value;
    }

    /**
     * Gets the value of the strikeout property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStrikeout() {
        if (strikeout == null) {
            return false;
        } else {
            return strikeout;
        }
    }

    /**
     * Sets the value of the strikeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrikeout(Boolean value) {
        this.strikeout = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link FontType }
     *     
     */
    public FontType getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontType }
     *     
     */
    public void setKind(FontType value) {
        this.kind = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScale(BigDecimal value) {
        this.scale = value;
    }

}
