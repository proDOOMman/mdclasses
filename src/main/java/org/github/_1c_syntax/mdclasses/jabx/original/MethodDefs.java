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
 * <p>Java class for MethodDefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodDefs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="proc" type="{http://v8.1c.ru/8.2/managed-application/modules}MethodDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="func" type="{http://v8.1c.ru/8.2/managed-application/modules}MethodDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodDefs", namespace = "http://v8.1c.ru/8.2/managed-application/modules", propOrder = {
    "proc",
    "func"
})
public class MethodDefs {

    protected List<MethodDef> proc;
    protected List<MethodDef> func;

    /**
     * Gets the value of the proc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MethodDef }
     * 
     * 
     */
    public List<MethodDef> getProc() {
        if (proc == null) {
            proc = new ArrayList<MethodDef>();
        }
        return this.proc;
    }

    /**
     * Gets the value of the func property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the func property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MethodDef }
     * 
     * 
     */
    public List<MethodDef> getFunc() {
        if (func == null) {
            func = new ArrayList<MethodDef>();
        }
        return this.func;
    }

}
