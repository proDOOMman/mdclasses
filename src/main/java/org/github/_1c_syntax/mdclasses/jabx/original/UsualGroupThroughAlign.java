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
 * <p>Java class for UsualGroupThroughAlign.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UsualGroupThroughAlign"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Use"/&gt;
 *     &lt;enumeration value="DontUse"/&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UsualGroupThroughAlign", namespace = "http://v8.1c.ru/8.2/managed-application/logform")
@XmlEnum
public enum UsualGroupThroughAlign {

    @XmlEnumValue("Use")
    USE("Use"),
    @XmlEnumValue("DontUse")
    DONT_USE("DontUse"),
    @XmlEnumValue("Auto")
    AUTO("Auto");
    private final String value;

    UsualGroupThroughAlign(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UsualGroupThroughAlign fromValue(String v) {
        for (UsualGroupThroughAlign c: UsualGroupThroughAlign.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
