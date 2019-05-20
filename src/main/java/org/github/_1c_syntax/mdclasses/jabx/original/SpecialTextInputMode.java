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
 * <p>Java class for SpecialTextInputMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialTextInputMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="DigitsAndPunctuation"/&gt;
 *     &lt;enumeration value="URL"/&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="PhoneNumber"/&gt;
 *     &lt;enumeration value="Digits"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpecialTextInputMode", namespace = "http://v8.1c.ru/8.2/managed-application/logform")
@XmlEnum
public enum SpecialTextInputMode {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("DigitsAndPunctuation")
    DIGITS_AND_PUNCTUATION("DigitsAndPunctuation"),
    URL("URL"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("PhoneNumber")
    PHONE_NUMBER("PhoneNumber"),
    @XmlEnumValue("Digits")
    DIGITS("Digits");
    private final String value;

    SpecialTextInputMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialTextInputMode fromValue(String v) {
        for (SpecialTextInputMode c: SpecialTextInputMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
