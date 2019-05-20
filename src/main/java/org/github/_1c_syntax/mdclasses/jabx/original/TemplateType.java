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
 * <p>Java class for TemplateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TemplateType"&gt;
 *   &lt;restriction base="{http://v8.1c.ru/8.3/xcf/enums}BaseEnumType"&gt;
 *     &lt;enumeration value="SpreadsheetDocument"/&gt;
 *     &lt;enumeration value="BinaryData"/&gt;
 *     &lt;enumeration value="ActiveDocument"/&gt;
 *     &lt;enumeration value="HTMLDocument"/&gt;
 *     &lt;enumeration value="TextDocument"/&gt;
 *     &lt;enumeration value="GeographicalSchema"/&gt;
 *     &lt;enumeration value="GraphicalSchema"/&gt;
 *     &lt;enumeration value="DataCompositionSchema"/&gt;
 *     &lt;enumeration value="DataCompositionAppearanceTemplate"/&gt;
 *     &lt;enumeration value="AddIn"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TemplateType", namespace = "http://v8.1c.ru/8.3/xcf/enums")
@XmlEnum
public enum TemplateType {

    @XmlEnumValue("SpreadsheetDocument")
    SPREADSHEET_DOCUMENT("SpreadsheetDocument"),
    @XmlEnumValue("BinaryData")
    BINARY_DATA("BinaryData"),
    @XmlEnumValue("ActiveDocument")
    ACTIVE_DOCUMENT("ActiveDocument"),
    @XmlEnumValue("HTMLDocument")
    HTML_DOCUMENT("HTMLDocument"),
    @XmlEnumValue("TextDocument")
    TEXT_DOCUMENT("TextDocument"),
    @XmlEnumValue("GeographicalSchema")
    GEOGRAPHICAL_SCHEMA("GeographicalSchema"),
    @XmlEnumValue("GraphicalSchema")
    GRAPHICAL_SCHEMA("GraphicalSchema"),
    @XmlEnumValue("DataCompositionSchema")
    DATA_COMPOSITION_SCHEMA("DataCompositionSchema"),
    @XmlEnumValue("DataCompositionAppearanceTemplate")
    DATA_COMPOSITION_APPEARANCE_TEMPLATE("DataCompositionAppearanceTemplate"),
    @XmlEnumValue("AddIn")
    ADD_IN("AddIn");
    private final String value;

    TemplateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TemplateType fromValue(String v) {
        for (TemplateType c: TemplateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
