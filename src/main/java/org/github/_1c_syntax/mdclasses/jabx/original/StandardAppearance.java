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
 * <p>Java class for StandardAppearance.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StandardAppearance"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Stone"/&gt;
 *     &lt;enumeration value="Classic"/&gt;
 *     &lt;enumeration value="Classic2"/&gt;
 *     &lt;enumeration value="Classic3"/&gt;
 *     &lt;enumeration value="Spring"/&gt;
 *     &lt;enumeration value="Summer"/&gt;
 *     &lt;enumeration value="Autumn"/&gt;
 *     &lt;enumeration value="Winter"/&gt;
 *     &lt;enumeration value="Asphalt"/&gt;
 *     &lt;enumeration value="Copper"/&gt;
 *     &lt;enumeration value="Bronze"/&gt;
 *     &lt;enumeration value="Platinum"/&gt;
 *     &lt;enumeration value="Silver"/&gt;
 *     &lt;enumeration value="Turquoise"/&gt;
 *     &lt;enumeration value="Sand"/&gt;
 *     &lt;enumeration value="Grass"/&gt;
 *     &lt;enumeration value="Ice"/&gt;
 *     &lt;enumeration value="Orange"/&gt;
 *     &lt;enumeration value="Textile"/&gt;
 *     &lt;enumeration value="Wood"/&gt;
 *     &lt;enumeration value="Interface"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StandardAppearance", namespace = "http://v8.1c.ru/8.2/data/spreadsheet")
@XmlEnum
public enum StandardAppearance {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Stone")
    STONE("Stone"),
    @XmlEnumValue("Classic")
    CLASSIC("Classic"),
    @XmlEnumValue("Classic2")
    CLASSIC_2("Classic2"),
    @XmlEnumValue("Classic3")
    CLASSIC_3("Classic3"),
    @XmlEnumValue("Spring")
    SPRING("Spring"),
    @XmlEnumValue("Summer")
    SUMMER("Summer"),
    @XmlEnumValue("Autumn")
    AUTUMN("Autumn"),
    @XmlEnumValue("Winter")
    WINTER("Winter"),
    @XmlEnumValue("Asphalt")
    ASPHALT("Asphalt"),
    @XmlEnumValue("Copper")
    COPPER("Copper"),
    @XmlEnumValue("Bronze")
    BRONZE("Bronze"),
    @XmlEnumValue("Platinum")
    PLATINUM("Platinum"),
    @XmlEnumValue("Silver")
    SILVER("Silver"),
    @XmlEnumValue("Turquoise")
    TURQUOISE("Turquoise"),
    @XmlEnumValue("Sand")
    SAND("Sand"),
    @XmlEnumValue("Grass")
    GRASS("Grass"),
    @XmlEnumValue("Ice")
    ICE("Ice"),
    @XmlEnumValue("Orange")
    ORANGE("Orange"),
    @XmlEnumValue("Textile")
    TEXTILE("Textile"),
    @XmlEnumValue("Wood")
    WOOD("Wood"),
    @XmlEnumValue("Interface")
    INTERFACE("Interface");
    private final String value;

    StandardAppearance(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StandardAppearance fromValue(String v) {
        for (StandardAppearance c: StandardAppearance.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
