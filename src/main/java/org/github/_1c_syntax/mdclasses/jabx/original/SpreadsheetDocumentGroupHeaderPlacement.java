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
 * <p>Java class for SpreadsheetDocumentGroupHeaderPlacement.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpreadsheetDocumentGroupHeaderPlacement"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="Begin"/&gt;
 *     &lt;enumeration value="End"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpreadsheetDocumentGroupHeaderPlacement", namespace = "http://v8.1c.ru/8.2/data/spreadsheet")
@XmlEnum
public enum SpreadsheetDocumentGroupHeaderPlacement {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Begin")
    BEGIN("Begin"),
    @XmlEnumValue("End")
    END("End");
    private final String value;

    SpreadsheetDocumentGroupHeaderPlacement(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpreadsheetDocumentGroupHeaderPlacement fromValue(String v) {
        for (SpreadsheetDocumentGroupHeaderPlacement c: SpreadsheetDocumentGroupHeaderPlacement.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
