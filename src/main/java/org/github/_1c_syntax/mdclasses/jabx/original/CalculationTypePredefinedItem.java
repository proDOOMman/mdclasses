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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CalculationTypePredefinedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculationTypePredefinedItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://v8.1c.ru/8.3/xcf/predef}PredefinedItemBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionPeriodIsBase" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Displaced" type="{http://v8.1c.ru/8.3/xcf/predef}CalculationTypeList" minOccurs="0"/&gt;
 *         &lt;element name="Base" type="{http://v8.1c.ru/8.3/xcf/predef}CalculationTypeList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Leading" type="{http://v8.1c.ru/8.3/xcf/predef}CalculationTypeList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationTypePredefinedItem", namespace = "http://v8.1c.ru/8.3/xcf/predef", propOrder = {
    "actionPeriodIsBase",
    "displaced",
    "base",
    "leading"
})
public class CalculationTypePredefinedItem
    extends PredefinedItemBase
{

    @XmlElement(name = "ActionPeriodIsBase")
    protected boolean actionPeriodIsBase;
    @XmlElement(name = "Displaced")
    protected CalculationTypeList displaced;
    @XmlElement(name = "Base")
    protected List<CalculationTypeList> base;
    @XmlElement(name = "Leading")
    protected List<CalculationTypeList> leading;

    /**
     * Gets the value of the actionPeriodIsBase property.
     * 
     */
    public boolean isActionPeriodIsBase() {
        return actionPeriodIsBase;
    }

    /**
     * Sets the value of the actionPeriodIsBase property.
     * 
     */
    public void setActionPeriodIsBase(boolean value) {
        this.actionPeriodIsBase = value;
    }

    /**
     * Gets the value of the displaced property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationTypeList }
     *     
     */
    public CalculationTypeList getDisplaced() {
        return displaced;
    }

    /**
     * Sets the value of the displaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationTypeList }
     *     
     */
    public void setDisplaced(CalculationTypeList value) {
        this.displaced = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the base property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalculationTypeList }
     * 
     * 
     */
    public List<CalculationTypeList> getBase() {
        if (base == null) {
            base = new ArrayList<CalculationTypeList>();
        }
        return this.base;
    }

    /**
     * Gets the value of the leading property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leading property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeading().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalculationTypeList }
     * 
     * 
     */
    public List<CalculationTypeList> getLeading() {
        if (leading == null) {
            leading = new ArrayList<CalculationTypeList>();
        }
        return this.leading;
    }

}
