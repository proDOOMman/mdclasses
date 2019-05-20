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
 * <p>Java class for CompatibilityMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompatibilityMode"&gt;
 *   &lt;restriction base="{http://v8.1c.ru/8.3/xcf/enums}BaseEnumType"&gt;
 *     &lt;enumeration value="DontUse"/&gt;
 *     &lt;enumeration value="Version8_3_10"/&gt;
 *     &lt;enumeration value="Version8_3_9"/&gt;
 *     &lt;enumeration value="Version8_3_8"/&gt;
 *     &lt;enumeration value="Version8_3_7"/&gt;
 *     &lt;enumeration value="Version8_3_6"/&gt;
 *     &lt;enumeration value="Version8_3_5"/&gt;
 *     &lt;enumeration value="Version8_3_4"/&gt;
 *     &lt;enumeration value="Version8_3_3"/&gt;
 *     &lt;enumeration value="Version8_3_2"/&gt;
 *     &lt;enumeration value="Version8_3_1"/&gt;
 *     &lt;enumeration value="Version8_2_16"/&gt;
 *     &lt;enumeration value="Version8_2_13"/&gt;
 *     &lt;enumeration value="Version8_1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompatibilityMode", namespace = "http://v8.1c.ru/8.3/xcf/enums")
@XmlEnum
public enum CompatibilityMode {

    @XmlEnumValue("DontUse")
    DONT_USE("DontUse"),
    @XmlEnumValue("Version8_3_10")
    VERSION_8_3_10("Version8_3_10"),
    @XmlEnumValue("Version8_3_9")
    VERSION_8_3_9("Version8_3_9"),
    @XmlEnumValue("Version8_3_8")
    VERSION_8_3_8("Version8_3_8"),
    @XmlEnumValue("Version8_3_7")
    VERSION_8_3_7("Version8_3_7"),
    @XmlEnumValue("Version8_3_6")
    VERSION_8_3_6("Version8_3_6"),
    @XmlEnumValue("Version8_3_5")
    VERSION_8_3_5("Version8_3_5"),
    @XmlEnumValue("Version8_3_4")
    VERSION_8_3_4("Version8_3_4"),
    @XmlEnumValue("Version8_3_3")
    VERSION_8_3_3("Version8_3_3"),
    @XmlEnumValue("Version8_3_2")
    VERSION_8_3_2("Version8_3_2"),
    @XmlEnumValue("Version8_3_1")
    VERSION_8_3_1("Version8_3_1"),
    @XmlEnumValue("Version8_2_16")
    VERSION_8_2_16("Version8_2_16"),
    @XmlEnumValue("Version8_2_13")
    VERSION_8_2_13("Version8_2_13"),
    @XmlEnumValue("Version8_1")
    VERSION_8_1("Version8_1");
    private final String value;

    CompatibilityMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompatibilityMode fromValue(String v) {
        for (CompatibilityMode c: CompatibilityMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
