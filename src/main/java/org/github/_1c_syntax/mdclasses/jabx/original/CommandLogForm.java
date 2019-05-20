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
 * <p>Java class for CommandLogForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommandLogForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="handlers" type="{http://v8.1c.ru/8.2/managed-application/logform}EventHandlers" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://v8.1c.ru/8.1/data/core}CompositeID" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="modifiesData" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="currentRowUse" type="{http://v8.1c.ru/8.2/managed-application/logform}CurrentRowUse" /&gt;
 *       &lt;attribute name="associatedTableElementId" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommandLogForm", namespace = "http://v8.1c.ru/8.2/managed-application/logform", propOrder = {
    "handlers"
})
public class CommandLogForm {

    @XmlElement(required = true)
    protected List<EventHandlers> handlers;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "modifiesData")
    protected Boolean modifiesData;
    @XmlAttribute(name = "currentRowUse")
    protected CurrentRowUse currentRowUse;
    @XmlAttribute(name = "associatedTableElementId")
    protected BigDecimal associatedTableElementId;

    /**
     * Gets the value of the handlers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventHandlers }
     * 
     * 
     */
    public List<EventHandlers> getHandlers() {
        if (handlers == null) {
            handlers = new ArrayList<EventHandlers>();
        }
        return this.handlers;
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
     * Gets the value of the modifiesData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModifiesData() {
        return modifiesData;
    }

    /**
     * Sets the value of the modifiesData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModifiesData(Boolean value) {
        this.modifiesData = value;
    }

    /**
     * Gets the value of the currentRowUse property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentRowUse }
     *     
     */
    public CurrentRowUse getCurrentRowUse() {
        return currentRowUse;
    }

    /**
     * Sets the value of the currentRowUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentRowUse }
     *     
     */
    public void setCurrentRowUse(CurrentRowUse value) {
        this.currentRowUse = value;
    }

    /**
     * Gets the value of the associatedTableElementId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAssociatedTableElementId() {
        return associatedTableElementId;
    }

    /**
     * Sets the value of the associatedTableElementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAssociatedTableElementId(BigDecimal value) {
        this.associatedTableElementId = value;
    }

}
