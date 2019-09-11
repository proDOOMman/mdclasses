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
 * <p>Java class for UpdateOnDataChange.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateOnDataChange"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="DontUpdate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UpdateOnDataChange", namespace = "http://v8.1c.ru/8.1/data/enterprise")
@XmlEnum
public enum UpdateOnDataChange {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("DontUpdate")
    DONT_UPDATE("DontUpdate");
    private final String value;

    UpdateOnDataChange(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateOnDataChange fromValue(String v) {
        for (UpdateOnDataChange c: UpdateOnDataChange.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}