//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.03 at 10:57:07 AM IST 
//


package com.codehawk.jaxb.scheduleservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EDIT_AGENCY_SCHEDULE_REQUEST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDIT_AGENCY_SCHEDULE_REQUEST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGENCY_SCHEDULE_DEFINITION_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SCHEDULE_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SCHEDULE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SCHEDULE_START_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SCHEDULE_END_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SCHEDULE_PERIOD" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDIT_AGENCY_SCHEDULE_REQUEST", propOrder = {
    "agencyscheduledefinitionid",
    "schedulename",
    "scheduletype",
    "schedulestartdate",
    "scheduleenddate",
    "scheduleperiod"
})
public class EDITAGENCYSCHEDULEREQUEST {

    @XmlElement(name = "AGENCY_SCHEDULE_DEFINITION_ID", required = true)
    protected BigDecimal agencyscheduledefinitionid;
    @XmlElement(name = "SCHEDULE_NAME", required = true)
    protected String schedulename;
    @XmlElement(name = "SCHEDULE_TYPE", required = true)
    protected String scheduletype;
    @XmlElement(name = "SCHEDULE_START_DATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar schedulestartdate;
    @XmlElement(name = "SCHEDULE_END_DATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleenddate;
    @XmlElement(name = "SCHEDULE_PERIOD", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleperiod;

    /**
     * Gets the value of the agencyscheduledefinitionid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAGENCYSCHEDULEDEFINITIONID() {
        return agencyscheduledefinitionid;
    }

    /**
     * Sets the value of the agencyscheduledefinitionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAGENCYSCHEDULEDEFINITIONID(BigDecimal value) {
        this.agencyscheduledefinitionid = value;
    }

    /**
     * Gets the value of the schedulename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCHEDULENAME() {
        return schedulename;
    }

    /**
     * Sets the value of the schedulename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCHEDULENAME(String value) {
        this.schedulename = value;
    }

    /**
     * Gets the value of the scheduletype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCHEDULETYPE() {
        return scheduletype;
    }

    /**
     * Sets the value of the scheduletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCHEDULETYPE(String value) {
        this.scheduletype = value;
    }

    /**
     * Gets the value of the schedulestartdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSCHEDULESTARTDATE() {
        return schedulestartdate;
    }

    /**
     * Sets the value of the schedulestartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSCHEDULESTARTDATE(XMLGregorianCalendar value) {
        this.schedulestartdate = value;
    }

    /**
     * Gets the value of the scheduleenddate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSCHEDULEENDDATE() {
        return scheduleenddate;
    }

    /**
     * Sets the value of the scheduleenddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSCHEDULEENDDATE(XMLGregorianCalendar value) {
        this.scheduleenddate = value;
    }

    /**
     * Gets the value of the scheduleperiod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSCHEDULEPERIOD() {
        return scheduleperiod;
    }

    /**
     * Sets the value of the scheduleperiod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSCHEDULEPERIOD(XMLGregorianCalendar value) {
        this.scheduleperiod = value;
    }

}