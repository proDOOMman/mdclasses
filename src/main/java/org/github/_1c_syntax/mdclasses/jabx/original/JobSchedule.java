//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for JobSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobSchedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WeekDays" type="{http://v8.1c.ru/8.1/data/enterprise}JobScheduleWeekDays"/&gt;
 *         &lt;element name="Months" type="{http://v8.1c.ru/8.1/data/enterprise}JobScheduleMonths"/&gt;
 *         &lt;element name="DetailedDailySchedules" type="{http://v8.1c.ru/8.1/data/enterprise}JobSchedule" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="EndTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="CompletionTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="CompletionInterval" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="RepeatPeriodInDay" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="RepeatPause" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="WeekDayInMonth" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="DayInMonth" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="WeeksPeriod" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="DaysRepeatPeriod" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobSchedule", namespace = "http://v8.1c.ru/8.1/data/enterprise", propOrder = {
    "weekDays",
    "months",
    "detailedDailySchedules"
})
public class JobSchedule {

    @XmlList
    @XmlElement(name = "WeekDays", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<BigDecimal> weekDays;
    @XmlList
    @XmlElement(name = "Months", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<BigDecimal> months;
    @XmlElement(name = "DetailedDailySchedules")
    protected List<JobSchedule> detailedDailySchedules;
    @XmlAttribute(name = "BeginDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlAttribute(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "BeginTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar beginTime;
    @XmlAttribute(name = "EndTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTime;
    @XmlAttribute(name = "CompletionTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar completionTime;
    @XmlAttribute(name = "CompletionInterval")
    protected BigDecimal completionInterval;
    @XmlAttribute(name = "RepeatPeriodInDay")
    protected BigDecimal repeatPeriodInDay;
    @XmlAttribute(name = "RepeatPause")
    protected BigDecimal repeatPause;
    @XmlAttribute(name = "WeekDayInMonth")
    protected BigDecimal weekDayInMonth;
    @XmlAttribute(name = "DayInMonth")
    protected BigDecimal dayInMonth;
    @XmlAttribute(name = "WeeksPeriod")
    protected BigDecimal weeksPeriod;
    @XmlAttribute(name = "DaysRepeatPeriod")
    protected BigDecimal daysRepeatPeriod;

    /**
     * Gets the value of the weekDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weekDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeekDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getWeekDays() {
        if (weekDays == null) {
            weekDays = new ArrayList<BigDecimal>();
        }
        return this.weekDays;
    }

    /**
     * Gets the value of the months property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the months property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getMonths() {
        if (months == null) {
            months = new ArrayList<BigDecimal>();
        }
        return this.months;
    }

    /**
     * Gets the value of the detailedDailySchedules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailedDailySchedules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailedDailySchedules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobSchedule }
     * 
     * 
     */
    public List<JobSchedule> getDetailedDailySchedules() {
        if (detailedDailySchedules == null) {
            detailedDailySchedules = new ArrayList<JobSchedule>();
        }
        return this.detailedDailySchedules;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the beginTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginTime() {
        return beginTime;
    }

    /**
     * Sets the value of the beginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginTime(XMLGregorianCalendar value) {
        this.beginTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the completionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionTime() {
        return completionTime;
    }

    /**
     * Sets the value of the completionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionTime(XMLGregorianCalendar value) {
        this.completionTime = value;
    }

    /**
     * Gets the value of the completionInterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompletionInterval() {
        return completionInterval;
    }

    /**
     * Sets the value of the completionInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompletionInterval(BigDecimal value) {
        this.completionInterval = value;
    }

    /**
     * Gets the value of the repeatPeriodInDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepeatPeriodInDay() {
        return repeatPeriodInDay;
    }

    /**
     * Sets the value of the repeatPeriodInDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepeatPeriodInDay(BigDecimal value) {
        this.repeatPeriodInDay = value;
    }

    /**
     * Gets the value of the repeatPause property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepeatPause() {
        return repeatPause;
    }

    /**
     * Sets the value of the repeatPause property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepeatPause(BigDecimal value) {
        this.repeatPause = value;
    }

    /**
     * Gets the value of the weekDayInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeekDayInMonth() {
        return weekDayInMonth;
    }

    /**
     * Sets the value of the weekDayInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeekDayInMonth(BigDecimal value) {
        this.weekDayInMonth = value;
    }

    /**
     * Gets the value of the dayInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDayInMonth() {
        return dayInMonth;
    }

    /**
     * Sets the value of the dayInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDayInMonth(BigDecimal value) {
        this.dayInMonth = value;
    }

    /**
     * Gets the value of the weeksPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeeksPeriod() {
        return weeksPeriod;
    }

    /**
     * Sets the value of the weeksPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeeksPeriod(BigDecimal value) {
        this.weeksPeriod = value;
    }

    /**
     * Gets the value of the daysRepeatPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysRepeatPeriod() {
        return daysRepeatPeriod;
    }

    /**
     * Sets the value of the daysRepeatPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysRepeatPeriod(BigDecimal value) {
        this.daysRepeatPeriod = value;
    }

}
