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
 * <p>Java class for ChartType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChartType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Line"/&gt;
 *     &lt;enumeration value="Step"/&gt;
 *     &lt;enumeration value="StackedLine"/&gt;
 *     &lt;enumeration value="Area"/&gt;
 *     &lt;enumeration value="StackedArea"/&gt;
 *     &lt;enumeration value="NormalizedArea"/&gt;
 *     &lt;enumeration value="Column"/&gt;
 *     &lt;enumeration value="StackedColumn"/&gt;
 *     &lt;enumeration value="NormalizedColumn"/&gt;
 *     &lt;enumeration value="Column3D"/&gt;
 *     &lt;enumeration value="StackedColumn3D"/&gt;
 *     &lt;enumeration value="NormalizedColumn3D"/&gt;
 *     &lt;enumeration value="Bar"/&gt;
 *     &lt;enumeration value="StackedBar"/&gt;
 *     &lt;enumeration value="NormalizedBar"/&gt;
 *     &lt;enumeration value="Bar3D"/&gt;
 *     &lt;enumeration value="StackedBar3D"/&gt;
 *     &lt;enumeration value="NormalizedBar3D"/&gt;
 *     &lt;enumeration value="Pie"/&gt;
 *     &lt;enumeration value="Pie3D"/&gt;
 *     &lt;enumeration value="Stock"/&gt;
 *     &lt;enumeration value="OpenHighLowClose"/&gt;
 *     &lt;enumeration value="BarGraph"/&gt;
 *     &lt;enumeration value="CeilGraph"/&gt;
 *     &lt;enumeration value="TapeGraph"/&gt;
 *     &lt;enumeration value="PyramidGraph"/&gt;
 *     &lt;enumeration value="Waterfall"/&gt;
 *     &lt;enumeration value="WireframeSurface"/&gt;
 *     &lt;enumeration value="Honeycomb"/&gt;
 *     &lt;enumeration value="Surface"/&gt;
 *     &lt;enumeration value="ConvexSurface"/&gt;
 *     &lt;enumeration value="ConcaveSurface"/&gt;
 *     &lt;enumeration value="ShadedSurface"/&gt;
 *     &lt;enumeration value="RadarLine"/&gt;
 *     &lt;enumeration value="RadarArea"/&gt;
 *     &lt;enumeration value="RadarStackedLine"/&gt;
 *     &lt;enumeration value="RadarStackedArea"/&gt;
 *     &lt;enumeration value="RadarNormalizedArea"/&gt;
 *     &lt;enumeration value="Gauge"/&gt;
 *     &lt;enumeration value="Funnel"/&gt;
 *     &lt;enumeration value="Funnel3D"/&gt;
 *     &lt;enumeration value="NormalizedFunnel"/&gt;
 *     &lt;enumeration value="NormalizedFunnel3D"/&gt;
 *     &lt;enumeration value="Scatter"/&gt;
 *     &lt;enumeration value="Bubble"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChartType", namespace = "http://v8.1c.ru/8.1/data/ui")
@XmlEnum
public enum ChartType {

    @XmlEnumValue("Line")
    LINE("Line"),
    @XmlEnumValue("Step")
    STEP("Step"),
    @XmlEnumValue("StackedLine")
    STACKED_LINE("StackedLine"),
    @XmlEnumValue("Area")
    AREA("Area"),
    @XmlEnumValue("StackedArea")
    STACKED_AREA("StackedArea"),
    @XmlEnumValue("NormalizedArea")
    NORMALIZED_AREA("NormalizedArea"),
    @XmlEnumValue("Column")
    COLUMN("Column"),
    @XmlEnumValue("StackedColumn")
    STACKED_COLUMN("StackedColumn"),
    @XmlEnumValue("NormalizedColumn")
    NORMALIZED_COLUMN("NormalizedColumn"),
    @XmlEnumValue("Column3D")
    COLUMN_3_D("Column3D"),
    @XmlEnumValue("StackedColumn3D")
    STACKED_COLUMN_3_D("StackedColumn3D"),
    @XmlEnumValue("NormalizedColumn3D")
    NORMALIZED_COLUMN_3_D("NormalizedColumn3D"),
    @XmlEnumValue("Bar")
    BAR("Bar"),
    @XmlEnumValue("StackedBar")
    STACKED_BAR("StackedBar"),
    @XmlEnumValue("NormalizedBar")
    NORMALIZED_BAR("NormalizedBar"),
    @XmlEnumValue("Bar3D")
    BAR_3_D("Bar3D"),
    @XmlEnumValue("StackedBar3D")
    STACKED_BAR_3_D("StackedBar3D"),
    @XmlEnumValue("NormalizedBar3D")
    NORMALIZED_BAR_3_D("NormalizedBar3D"),
    @XmlEnumValue("Pie")
    PIE("Pie"),
    @XmlEnumValue("Pie3D")
    PIE_3_D("Pie3D"),
    @XmlEnumValue("Stock")
    STOCK("Stock"),
    @XmlEnumValue("OpenHighLowClose")
    OPEN_HIGH_LOW_CLOSE("OpenHighLowClose"),
    @XmlEnumValue("BarGraph")
    BAR_GRAPH("BarGraph"),
    @XmlEnumValue("CeilGraph")
    CEIL_GRAPH("CeilGraph"),
    @XmlEnumValue("TapeGraph")
    TAPE_GRAPH("TapeGraph"),
    @XmlEnumValue("PyramidGraph")
    PYRAMID_GRAPH("PyramidGraph"),
    @XmlEnumValue("Waterfall")
    WATERFALL("Waterfall"),
    @XmlEnumValue("WireframeSurface")
    WIREFRAME_SURFACE("WireframeSurface"),
    @XmlEnumValue("Honeycomb")
    HONEYCOMB("Honeycomb"),
    @XmlEnumValue("Surface")
    SURFACE("Surface"),
    @XmlEnumValue("ConvexSurface")
    CONVEX_SURFACE("ConvexSurface"),
    @XmlEnumValue("ConcaveSurface")
    CONCAVE_SURFACE("ConcaveSurface"),
    @XmlEnumValue("ShadedSurface")
    SHADED_SURFACE("ShadedSurface"),
    @XmlEnumValue("RadarLine")
    RADAR_LINE("RadarLine"),
    @XmlEnumValue("RadarArea")
    RADAR_AREA("RadarArea"),
    @XmlEnumValue("RadarStackedLine")
    RADAR_STACKED_LINE("RadarStackedLine"),
    @XmlEnumValue("RadarStackedArea")
    RADAR_STACKED_AREA("RadarStackedArea"),
    @XmlEnumValue("RadarNormalizedArea")
    RADAR_NORMALIZED_AREA("RadarNormalizedArea"),
    @XmlEnumValue("Gauge")
    GAUGE("Gauge"),
    @XmlEnumValue("Funnel")
    FUNNEL("Funnel"),
    @XmlEnumValue("Funnel3D")
    FUNNEL_3_D("Funnel3D"),
    @XmlEnumValue("NormalizedFunnel")
    NORMALIZED_FUNNEL("NormalizedFunnel"),
    @XmlEnumValue("NormalizedFunnel3D")
    NORMALIZED_FUNNEL_3_D("NormalizedFunnel3D"),
    @XmlEnumValue("Scatter")
    SCATTER("Scatter"),
    @XmlEnumValue("Bubble")
    BUBBLE("Bubble");
    private final String value;

    ChartType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChartType fromValue(String v) {
        for (ChartType c: ChartType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
