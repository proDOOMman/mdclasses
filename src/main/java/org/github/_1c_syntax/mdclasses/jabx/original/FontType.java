//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FontType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FontType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Absolute"/&gt;
 *     &lt;enumeration value="WindowsFont"/&gt;
 *     &lt;enumeration value="StyleItem"/&gt;
 *     &lt;enumeration value="AutoFont"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FontType", namespace = "http://v8.1c.ru/8.1/data/ui")
@XmlEnum
public enum FontType {

    @XmlEnumValue("Absolute")
    ABSOLUTE("Absolute"),
    @XmlEnumValue("WindowsFont")
    WINDOWS_FONT("WindowsFont"),
    @XmlEnumValue("StyleItem")
    STYLE_ITEM("StyleItem"),
    @XmlEnumValue("AutoFont")
    AUTO_FONT("AutoFont");
    private final String value;

    FontType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FontType fromValue(String v) {
        for (FontType c: FontType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
