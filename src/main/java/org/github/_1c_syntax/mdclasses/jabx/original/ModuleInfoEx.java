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


/**
 * <p>Java class for ModuleInfoEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModuleInfoEx"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clnModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mtd" type="{http://v8.1c.ru/8.2/managed-application/modules}MethodDefs" minOccurs="0"/&gt;
 *         &lt;element name="moduleImage" type="{http://v8.1c.ru/8.2/data/bsl}BSLModuleImage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleInfoEx", namespace = "http://v8.1c.ru/8.2/managed-application/cmi", propOrder = {
    "clnModule",
    "mtd",
    "moduleImage"
})
public class ModuleInfoEx {

    protected String clnModule;
    protected MethodDefs mtd;
    protected BSLModuleImage moduleImage;

    /**
     * Gets the value of the clnModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClnModule() {
        return clnModule;
    }

    /**
     * Sets the value of the clnModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClnModule(String value) {
        this.clnModule = value;
    }

    /**
     * Gets the value of the mtd property.
     * 
     * @return
     *     possible object is
     *     {@link MethodDefs }
     *     
     */
    public MethodDefs getMtd() {
        return mtd;
    }

    /**
     * Sets the value of the mtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodDefs }
     *     
     */
    public void setMtd(MethodDefs value) {
        this.mtd = value;
    }

    /**
     * Gets the value of the moduleImage property.
     * 
     * @return
     *     possible object is
     *     {@link BSLModuleImage }
     *     
     */
    public BSLModuleImage getModuleImage() {
        return moduleImage;
    }

    /**
     * Sets the value of the moduleImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BSLModuleImage }
     *     
     */
    public void setModuleImage(BSLModuleImage value) {
        this.moduleImage = value;
    }

}
