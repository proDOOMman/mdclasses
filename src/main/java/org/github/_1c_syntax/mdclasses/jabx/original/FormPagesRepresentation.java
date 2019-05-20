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
 * <p>Java class for FormPagesRepresentation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FormPagesRepresentation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="TabsOnTop"/&gt;
 *     &lt;enumeration value="TabsOnBottom"/&gt;
 *     &lt;enumeration value="TabsOnLeftHorizontal"/&gt;
 *     &lt;enumeration value="TabsOnRightHorizontal"/&gt;
 *     &lt;enumeration value="Swipe"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FormPagesRepresentation", namespace = "http://v8.1c.ru/8.2/managed-application/logform")
@XmlEnum
public enum FormPagesRepresentation {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("TabsOnTop")
    TABS_ON_TOP("TabsOnTop"),
    @XmlEnumValue("TabsOnBottom")
    TABS_ON_BOTTOM("TabsOnBottom"),
    @XmlEnumValue("TabsOnLeftHorizontal")
    TABS_ON_LEFT_HORIZONTAL("TabsOnLeftHorizontal"),
    @XmlEnumValue("TabsOnRightHorizontal")
    TABS_ON_RIGHT_HORIZONTAL("TabsOnRightHorizontal"),
    @XmlEnumValue("Swipe")
    SWIPE("Swipe");
    private final String value;

    FormPagesRepresentation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormPagesRepresentation fromValue(String v) {
        for (FormPagesRepresentation c: FormPagesRepresentation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
