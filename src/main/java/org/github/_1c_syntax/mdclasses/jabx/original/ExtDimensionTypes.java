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
 * <p>Java class for ExtDimensionTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtDimensionTypes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtDimensionType" type="{http://v8.1c.ru/8.3/xcf/predef}ExtDimensionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtDimensionTypes", namespace = "http://v8.1c.ru/8.3/xcf/predef", propOrder = {
    "extDimensionType"
})
public class ExtDimensionTypes {

    @XmlElement(name = "ExtDimensionType", required = true)
    protected List<ExtDimensionType> extDimensionType;

    /**
     * Gets the value of the extDimensionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extDimensionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtDimensionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtDimensionType }
     * 
     * 
     */
    public List<ExtDimensionType> getExtDimensionType() {
        if (extDimensionType == null) {
            extDimensionType = new ArrayList<ExtDimensionType>();
        }
        return this.extDimensionType;
    }

}
