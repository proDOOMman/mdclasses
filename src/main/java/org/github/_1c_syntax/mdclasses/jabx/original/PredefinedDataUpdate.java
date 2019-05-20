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
 * <p>Java class for PredefinedDataUpdate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PredefinedDataUpdate"&gt;
 *   &lt;restriction base="{http://v8.1c.ru/8.3/xcf/enums}BaseEnumType"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="AutoUpdate"/&gt;
 *     &lt;enumeration value="DontAutoUpdate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PredefinedDataUpdate", namespace = "http://v8.1c.ru/8.3/xcf/enums")
@XmlEnum
public enum PredefinedDataUpdate {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("AutoUpdate")
    AUTO_UPDATE("AutoUpdate"),
    @XmlEnumValue("DontAutoUpdate")
    DONT_AUTO_UPDATE("DontAutoUpdate");
    private final String value;

    PredefinedDataUpdate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PredefinedDataUpdate fromValue(String v) {
        for (PredefinedDataUpdate c: PredefinedDataUpdate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
