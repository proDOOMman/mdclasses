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
 * <p>Java class for ExternalDataSourceTableType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExternalDataSourceTableType"&gt;
 *   &lt;restriction base="{http://v8.1c.ru/8.3/xcf/enums}BaseEnumType"&gt;
 *     &lt;enumeration value="Table"/&gt;
 *     &lt;enumeration value="Expression"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExternalDataSourceTableType", namespace = "http://v8.1c.ru/8.3/xcf/enums")
@XmlEnum
public enum ExternalDataSourceTableType {

    @XmlEnumValue("Table")
    TABLE("Table"),
    @XmlEnumValue("Expression")
    EXPRESSION("Expression");
    private final String value;

    ExternalDataSourceTableType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalDataSourceTableType fromValue(String v) {
        for (ExternalDataSourceTableType c: ExternalDataSourceTableType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
