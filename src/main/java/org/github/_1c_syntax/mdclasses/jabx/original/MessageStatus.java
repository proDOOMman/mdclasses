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
 * <p>Java class for MessageStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WithoutStatus"/&gt;
 *     &lt;enumeration value="Ordinary"/&gt;
 *     &lt;enumeration value="Information"/&gt;
 *     &lt;enumeration value="Attention"/&gt;
 *     &lt;enumeration value="Important"/&gt;
 *     &lt;enumeration value="VeryImportant"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageStatus", namespace = "http://v8.1c.ru/8.1/data/enterprise")
@XmlEnum
public enum MessageStatus {

    @XmlEnumValue("WithoutStatus")
    WITHOUT_STATUS("WithoutStatus"),
    @XmlEnumValue("Ordinary")
    ORDINARY("Ordinary"),
    @XmlEnumValue("Information")
    INFORMATION("Information"),
    @XmlEnumValue("Attention")
    ATTENTION("Attention"),
    @XmlEnumValue("Important")
    IMPORTANT("Important"),
    @XmlEnumValue("VeryImportant")
    VERY_IMPORTANT("VeryImportant");
    private final String value;

    MessageStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageStatus fromValue(String v) {
        for (MessageStatus c: MessageStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
