//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ChangesDS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangesDS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commonPart" type="{http://v8.1c.ru/8.2/data/spreadsheet}SpreadsheetDocument" minOccurs="0"/&gt;
 *         &lt;element name="fullDocument" type="{http://v8.1c.ru/8.2/data/spreadsheet}SpreadsheetDocument" minOccurs="0"/&gt;
 *         &lt;element name="fullDocumentWithoutContent" type="{http://v8.1c.ru/8.2/data/spreadsheet}SpreadsheetDocument" minOccurs="0"/&gt;
 *         &lt;element name="row" type="{http://v8.1c.ru/8.2/data/spreadsheet}ChangedRowItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vg" type="{http://v8.1c.ru/8.2/data/spreadsheet}GroupDS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangesDS", namespace = "http://v8.1c.ru/8.2/data/spreadsheet", propOrder = {
    "commonPart",
    "fullDocument",
    "fullDocumentWithoutContent",
    "row",
    "vg"
})
public class ChangesDS {

    protected SpreadsheetDocument commonPart;
    protected SpreadsheetDocument fullDocument;
    protected SpreadsheetDocument fullDocumentWithoutContent;
    protected List<ChangedRowItem> row;
    protected List<GroupDS> vg;

    /**
     * Gets the value of the commonPart property.
     * 
     * @return
     *     possible object is
     *     {@link SpreadsheetDocument }
     *     
     */
    public SpreadsheetDocument getCommonPart() {
        return commonPart;
    }

    /**
     * Sets the value of the commonPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpreadsheetDocument }
     *     
     */
    public void setCommonPart(SpreadsheetDocument value) {
        this.commonPart = value;
    }

    /**
     * Gets the value of the fullDocument property.
     * 
     * @return
     *     possible object is
     *     {@link SpreadsheetDocument }
     *     
     */
    public SpreadsheetDocument getFullDocument() {
        return fullDocument;
    }

    /**
     * Sets the value of the fullDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpreadsheetDocument }
     *     
     */
    public void setFullDocument(SpreadsheetDocument value) {
        this.fullDocument = value;
    }

    /**
     * Gets the value of the fullDocumentWithoutContent property.
     * 
     * @return
     *     possible object is
     *     {@link SpreadsheetDocument }
     *     
     */
    public SpreadsheetDocument getFullDocumentWithoutContent() {
        return fullDocumentWithoutContent;
    }

    /**
     * Sets the value of the fullDocumentWithoutContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpreadsheetDocument }
     *     
     */
    public void setFullDocumentWithoutContent(SpreadsheetDocument value) {
        this.fullDocumentWithoutContent = value;
    }

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangedRowItem }
     * 
     * 
     */
    public List<ChangedRowItem> getRow() {
        if (row == null) {
            row = new ArrayList<ChangedRowItem>();
        }
        return this.row;
    }

    /**
     * Gets the value of the vg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupDS }
     * 
     * 
     */
    public List<GroupDS> getVg() {
        if (vg == null) {
            vg = new ArrayList<GroupDS>();
        }
        return this.vg;
    }

}
