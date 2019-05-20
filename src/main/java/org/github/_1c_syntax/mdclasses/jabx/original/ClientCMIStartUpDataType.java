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
 * <p>Java class for ClientCMIStartUpDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientCMIStartUpDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultNPHandleInfo" type="{http://v8.1c.ru/8.2/managed-application/cmi}HandlerInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="toplevelSubsystems" type="{http://v8.1c.ru/8.2/managed-application/cmi}FragmentCMI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="urls" type="{http://v8.1c.ru/8.2/managed-application/cmi}URLsByNavigationPoints" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="panels" type="{http://v8.1c.ru/8.2/managed-application/cmi}FragmentCMI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="commandsWithShortCuts" type="{http://v8.1c.ru/8.2/managed-application/cmi}CommansShortCutInfoVector" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientCMIStartUpDataType", namespace = "http://v8.1c.ru/8.2/managed-application/cmi", propOrder = {
    "defaultNPHandleInfo",
    "toplevelSubsystems",
    "urls",
    "panels",
    "commandsWithShortCuts"
})
public class ClientCMIStartUpDataType {

    protected List<HandlerInfo> defaultNPHandleInfo;
    protected List<FragmentCMI> toplevelSubsystems;
    protected List<URLsByNavigationPoints> urls;
    protected List<FragmentCMI> panels;
    protected List<CommansShortCutInfoVector> commandsWithShortCuts;

    /**
     * Gets the value of the defaultNPHandleInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultNPHandleInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultNPHandleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HandlerInfo }
     * 
     * 
     */
    public List<HandlerInfo> getDefaultNPHandleInfo() {
        if (defaultNPHandleInfo == null) {
            defaultNPHandleInfo = new ArrayList<HandlerInfo>();
        }
        return this.defaultNPHandleInfo;
    }

    /**
     * Gets the value of the toplevelSubsystems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toplevelSubsystems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToplevelSubsystems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FragmentCMI }
     * 
     * 
     */
    public List<FragmentCMI> getToplevelSubsystems() {
        if (toplevelSubsystems == null) {
            toplevelSubsystems = new ArrayList<FragmentCMI>();
        }
        return this.toplevelSubsystems;
    }

    /**
     * Gets the value of the urls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link URLsByNavigationPoints }
     * 
     * 
     */
    public List<URLsByNavigationPoints> getUrls() {
        if (urls == null) {
            urls = new ArrayList<URLsByNavigationPoints>();
        }
        return this.urls;
    }

    /**
     * Gets the value of the panels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the panels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPanels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FragmentCMI }
     * 
     * 
     */
    public List<FragmentCMI> getPanels() {
        if (panels == null) {
            panels = new ArrayList<FragmentCMI>();
        }
        return this.panels;
    }

    /**
     * Gets the value of the commandsWithShortCuts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commandsWithShortCuts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommandsWithShortCuts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommansShortCutInfoVector }
     * 
     * 
     */
    public List<CommansShortCutInfoVector> getCommandsWithShortCuts() {
        if (commandsWithShortCuts == null) {
            commandsWithShortCuts = new ArrayList<CommansShortCutInfoVector>();
        }
        return this.commandsWithShortCuts;
    }

}
