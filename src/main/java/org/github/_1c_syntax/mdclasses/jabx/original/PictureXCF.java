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


/**
 * <p>Java class for PictureXCF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictureXCF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Ref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Abs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LoadTransparent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TransparentPixel" type="{http://v8.1c.ru/8.3/xcf/readable}Point" minOccurs="0"/&gt;
 *         &lt;element name="GlyphPoint" type="{http://v8.1c.ru/8.3/xcf/readable}Point" minOccurs="0"/&gt;
 *         &lt;element name="ZipEntryParams" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PictureXCF", namespace = "http://v8.1c.ru/8.3/xcf/readable", propOrder = {
    "ref",
    "url",
    "abs",
    "loadTransparent",
    "transparentPixel",
    "glyphPoint",
    "zipEntryParams"
})
public class PictureXCF {

    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "Url")
    protected String url;
    @XmlElement(name = "Abs")
    protected String abs;
    @XmlElement(name = "LoadTransparent")
    protected Boolean loadTransparent;
    @XmlElement(name = "TransparentPixel")
    protected Point transparentPixel;
    @XmlElement(name = "GlyphPoint")
    protected Point glyphPoint;
    @XmlElement(name = "ZipEntryParams")
    protected String zipEntryParams;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the abs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbs() {
        return abs;
    }

    /**
     * Sets the value of the abs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbs(String value) {
        this.abs = value;
    }

    /**
     * Gets the value of the loadTransparent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoadTransparent() {
        return loadTransparent;
    }

    /**
     * Sets the value of the loadTransparent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoadTransparent(Boolean value) {
        this.loadTransparent = value;
    }

    /**
     * Gets the value of the transparentPixel property.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getTransparentPixel() {
        return transparentPixel;
    }

    /**
     * Sets the value of the transparentPixel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setTransparentPixel(Point value) {
        this.transparentPixel = value;
    }

    /**
     * Gets the value of the glyphPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getGlyphPoint() {
        return glyphPoint;
    }

    /**
     * Sets the value of the glyphPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setGlyphPoint(Point value) {
        this.glyphPoint = value;
    }

    /**
     * Gets the value of the zipEntryParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipEntryParams() {
        return zipEntryParams;
    }

    /**
     * Sets the value of the zipEntryParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipEntryParams(String value) {
        this.zipEntryParams = value;
    }

}
