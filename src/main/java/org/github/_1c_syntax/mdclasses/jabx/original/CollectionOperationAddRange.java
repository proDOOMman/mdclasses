//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CollectionOperationAddRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectionOperationAddRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="index1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;attribute name="index2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;attribute name="startId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionOperationAddRange", namespace = "http://v8.1c.ru/8.2/uobjects")
public class CollectionOperationAddRange {

    @XmlAttribute(name = "index1", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long index1;
    @XmlAttribute(name = "index2", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long index2;
    @XmlAttribute(name = "startId", required = true)
    protected long startId;

    /**
     * Gets the value of the index1 property.
     * 
     */
    public long getIndex1() {
        return index1;
    }

    /**
     * Sets the value of the index1 property.
     * 
     */
    public void setIndex1(long value) {
        this.index1 = value;
    }

    /**
     * Gets the value of the index2 property.
     * 
     */
    public long getIndex2() {
        return index2;
    }

    /**
     * Sets the value of the index2 property.
     * 
     */
    public void setIndex2(long value) {
        this.index2 = value;
    }

    /**
     * Gets the value of the startId property.
     * 
     */
    public long getStartId() {
        return startId;
    }

    /**
     * Sets the value of the startId property.
     * 
     */
    public void setStartId(long value) {
        this.startId = value;
    }

}
