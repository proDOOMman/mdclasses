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
 * <p>Java class for SynchronousPlatformExtensionAndAddInCallUseMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SynchronousPlatformExtensionAndAddInCallUseMode"&gt;
 *   &lt;restriction base="{http://v8.1c.ru/8.3/xcf/enums}BaseEnumType"&gt;
 *     &lt;enumeration value="Use"/&gt;
 *     &lt;enumeration value="UseWithWarnings"/&gt;
 *     &lt;enumeration value="DontUse"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SynchronousPlatformExtensionAndAddInCallUseMode", namespace = "http://v8.1c.ru/8.3/xcf/enums")
@XmlEnum
public enum SynchronousPlatformExtensionAndAddInCallUseMode {

    @XmlEnumValue("Use")
    USE("Use"),
    @XmlEnumValue("UseWithWarnings")
    USE_WITH_WARNINGS("UseWithWarnings"),
    @XmlEnumValue("DontUse")
    DONT_USE("DontUse");
    private final String value;

    SynchronousPlatformExtensionAndAddInCallUseMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SynchronousPlatformExtensionAndAddInCallUseMode fromValue(String v) {
        for (SynchronousPlatformExtensionAndAddInCallUseMode c: SynchronousPlatformExtensionAndAddInCallUseMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
