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
 * <p>Java class for ChartLabelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChartLabelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Series"/&gt;
 *     &lt;enumeration value="Value"/&gt;
 *     &lt;enumeration value="Percent"/&gt;
 *     &lt;enumeration value="SeriesPercent"/&gt;
 *     &lt;enumeration value="SeriesValue"/&gt;
 *     &lt;enumeration value="SeriesValuePercent"/&gt;
 *     &lt;enumeration value="ValuePercent"/&gt;
 *     &lt;enumeration value="Point"/&gt;
 *     &lt;enumeration value="PointPercent"/&gt;
 *     &lt;enumeration value="PointValue"/&gt;
 *     &lt;enumeration value="PointValuePercent"/&gt;
 *     &lt;enumeration value="SeriesPoint"/&gt;
 *     &lt;enumeration value="SeriesPointPercent"/&gt;
 *     &lt;enumeration value="SeriesPointValue"/&gt;
 *     &lt;enumeration value="SeriesPointValuePercent"/&gt;
 *     &lt;enumeration value="ValueSize"/&gt;
 *     &lt;enumeration value="SeriesSize"/&gt;
 *     &lt;enumeration value="SeriesValueSize"/&gt;
 *     &lt;enumeration value="SeriesPointSize"/&gt;
 *     &lt;enumeration value="SeriesPointValueSize"/&gt;
 *     &lt;enumeration value="PointSize"/&gt;
 *     &lt;enumeration value="PointValueSize"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChartLabelType", namespace = "http://v8.1c.ru/8.1/data/ui")
@XmlEnum
public enum ChartLabelType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Series")
    SERIES("Series"),
    @XmlEnumValue("Value")
    VALUE("Value"),
    @XmlEnumValue("Percent")
    PERCENT("Percent"),
    @XmlEnumValue("SeriesPercent")
    SERIES_PERCENT("SeriesPercent"),
    @XmlEnumValue("SeriesValue")
    SERIES_VALUE("SeriesValue"),
    @XmlEnumValue("SeriesValuePercent")
    SERIES_VALUE_PERCENT("SeriesValuePercent"),
    @XmlEnumValue("ValuePercent")
    VALUE_PERCENT("ValuePercent"),
    @XmlEnumValue("Point")
    POINT("Point"),
    @XmlEnumValue("PointPercent")
    POINT_PERCENT("PointPercent"),
    @XmlEnumValue("PointValue")
    POINT_VALUE("PointValue"),
    @XmlEnumValue("PointValuePercent")
    POINT_VALUE_PERCENT("PointValuePercent"),
    @XmlEnumValue("SeriesPoint")
    SERIES_POINT("SeriesPoint"),
    @XmlEnumValue("SeriesPointPercent")
    SERIES_POINT_PERCENT("SeriesPointPercent"),
    @XmlEnumValue("SeriesPointValue")
    SERIES_POINT_VALUE("SeriesPointValue"),
    @XmlEnumValue("SeriesPointValuePercent")
    SERIES_POINT_VALUE_PERCENT("SeriesPointValuePercent"),
    @XmlEnumValue("ValueSize")
    VALUE_SIZE("ValueSize"),
    @XmlEnumValue("SeriesSize")
    SERIES_SIZE("SeriesSize"),
    @XmlEnumValue("SeriesValueSize")
    SERIES_VALUE_SIZE("SeriesValueSize"),
    @XmlEnumValue("SeriesPointSize")
    SERIES_POINT_SIZE("SeriesPointSize"),
    @XmlEnumValue("SeriesPointValueSize")
    SERIES_POINT_VALUE_SIZE("SeriesPointValueSize"),
    @XmlEnumValue("PointSize")
    POINT_SIZE("PointSize"),
    @XmlEnumValue("PointValueSize")
    POINT_VALUE_SIZE("PointValueSize");
    private final String value;

    ChartLabelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChartLabelType fromValue(String v) {
        for (ChartLabelType c: ChartLabelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
