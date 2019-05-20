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
 * <p>Java class for CreateOnInput.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreateOnInput"&gt;
 *   &lt;restriction base="{http://v8.1c.ru/8.3/xcf/enums}BaseEnumType"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="DontUse"/&gt;
 *     &lt;enumeration value="Use"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreateOnInput", namespace = "http://v8.1c.ru/8.3/xcf/enums")
@XmlEnum
public enum CreateOnInput {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("DontUse")
    DONT_USE("DontUse"),
    @XmlEnumValue("Use")
    USE("Use");
    private final String value;

    CreateOnInput(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreateOnInput fromValue(String v) {
        for (CreateOnInput c: CreateOnInput.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
