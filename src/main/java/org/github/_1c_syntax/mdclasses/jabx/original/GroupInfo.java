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
 * <p>Java class for GroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tooltip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pic" type="{http://v8.1c.ru/8.1/data/ui}Picture" minOccurs="0"/&gt;
 *         &lt;element name="picSizeCX" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="picSizeCY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" use="required" type="{http://v8.1c.ru/8.1/data/core}UUID" /&gt;
 *       &lt;attribute name="cat" type="{http://v8.1c.ru/8.2/managed-application/cmi}GroupCategory" /&gt;
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="kind" type="{http://v8.1c.ru/8.2/managed-application/logform}ButtonRepresentation" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupInfo", namespace = "http://v8.1c.ru/8.2/managed-application/cmi", propOrder = {
    "text",
    "tooltip",
    "pic",
    "picSizeCX",
    "picSizeCY"
})
@XmlSeeAlso({
    Group.class
})
public class GroupInfo {

    protected String text;
    protected String tooltip;
    protected Picture pic;
    protected BigDecimal picSizeCX;
    protected BigDecimal picSizeCY;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "cat")
    protected GroupCategory cat;
    @XmlAttribute(name = "order")
    protected BigDecimal order;
    @XmlAttribute(name = "kind")
    protected ButtonRepresentation kind;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the tooltip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTooltip() {
        return tooltip;
    }

    /**
     * Sets the value of the tooltip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTooltip(String value) {
        this.tooltip = value;
    }

    /**
     * Gets the value of the pic property.
     * 
     * @return
     *     possible object is
     *     {@link Picture }
     *     
     */
    public Picture getPic() {
        return pic;
    }

    /**
     * Sets the value of the pic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Picture }
     *     
     */
    public void setPic(Picture value) {
        this.pic = value;
    }

    /**
     * Gets the value of the picSizeCX property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPicSizeCX() {
        return picSizeCX;
    }

    /**
     * Sets the value of the picSizeCX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPicSizeCX(BigDecimal value) {
        this.picSizeCX = value;
    }

    /**
     * Gets the value of the picSizeCY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPicSizeCY() {
        return picSizeCY;
    }

    /**
     * Sets the value of the picSizeCY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPicSizeCY(BigDecimal value) {
        this.picSizeCY = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the cat property.
     * 
     * @return
     *     possible object is
     *     {@link GroupCategory }
     *     
     */
    public GroupCategory getCat() {
        return cat;
    }

    /**
     * Sets the value of the cat property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupCategory }
     *     
     */
    public void setCat(GroupCategory value) {
        this.cat = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrder(BigDecimal value) {
        this.order = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link ButtonRepresentation }
     *     
     */
    public ButtonRepresentation getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link ButtonRepresentation }
     *     
     */
    public void setKind(ButtonRepresentation value) {
        this.kind = value;
    }

}
