//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for FuncMenuGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FuncMenuGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://v8.1c.ru/8.2/managed-application/cmi}FuncMenuGroupType" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://v8.1c.ru/8.1/data/core}CompositeID" minOccurs="0"/&gt;
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="picture" type="{http://v8.1c.ru/8.1/data/ui}Picture" minOccurs="0"/&gt;
 *         &lt;element name="newColumn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="command" type="{http://v8.1c.ru/8.2/managed-application/cmi}FuncMenuCommand" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="group" type="{http://v8.1c.ru/8.2/managed-application/cmi}FuncMenuGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="highlight" type="{http://v8.1c.ru/8.2/managed-application/cmi}FuncMenuHighlight"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FuncMenuGroup", namespace = "http://v8.1c.ru/8.2/managed-application/cmi", propOrder = {
    "type",
    "id",
    "text",
    "picture",
    "newColumn",
    "command",
    "group",
    "highlight"
})
public class FuncMenuGroup {

    @XmlSchemaType(name = "string")
    protected FuncMenuGroupType type;
    protected String id;
    protected String text;
    protected Picture picture;
    protected Boolean newColumn;
    protected List<FuncMenuCommand> command;
    protected List<FuncMenuGroup> group;
    @XmlElement(required = true)
    protected FuncMenuHighlight highlight;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FuncMenuGroupType }
     *     
     */
    public FuncMenuGroupType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncMenuGroupType }
     *     
     */
    public void setType(FuncMenuGroupType value) {
        this.type = value;
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
     * Gets the value of the picture property.
     * 
     * @return
     *     possible object is
     *     {@link Picture }
     *     
     */
    public Picture getPicture() {
        return picture;
    }

    /**
     * Sets the value of the picture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Picture }
     *     
     */
    public void setPicture(Picture value) {
        this.picture = value;
    }

    /**
     * Gets the value of the newColumn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewColumn() {
        return newColumn;
    }

    /**
     * Sets the value of the newColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewColumn(Boolean value) {
        this.newColumn = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the command property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FuncMenuCommand }
     * 
     * 
     */
    public List<FuncMenuCommand> getCommand() {
        if (command == null) {
            command = new ArrayList<FuncMenuCommand>();
        }
        return this.command;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FuncMenuGroup }
     * 
     * 
     */
    public List<FuncMenuGroup> getGroup() {
        if (group == null) {
            group = new ArrayList<FuncMenuGroup>();
        }
        return this.group;
    }

    /**
     * Gets the value of the highlight property.
     * 
     * @return
     *     possible object is
     *     {@link FuncMenuHighlight }
     *     
     */
    public FuncMenuHighlight getHighlight() {
        return highlight;
    }

    /**
     * Sets the value of the highlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncMenuHighlight }
     *     
     */
    public void setHighlight(FuncMenuHighlight value) {
        this.highlight = value;
    }

}
