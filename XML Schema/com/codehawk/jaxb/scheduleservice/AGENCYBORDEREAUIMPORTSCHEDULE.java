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
 * <p>Java class for AGENCY_BORDEREAU_IMPORT_SCHEDULE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGENCY_BORDEREAU_IMPORT_SCHEDULE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGENCY_BORDEREAU_IMPORT_SCHEDULE_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SCHEDULE_START_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SCHEDULE_END_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SCHEDULE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGENCY_BORDEREAU_IMPORT_SCHEDULE", propOrder = {
    "agencybordereauimportscheduleid",
    "schedulestartdate",
    "scheduleenddate",
    "scheduletype"
})
public class AGENCYBORDEREAUIMPORTSCHEDULE {

    @XmlElement(name = "AGENCY_BORDEREAU_IMPORT_SCHEDULE_ID", required = true)
    protected BigDecimal agencybordereauimportscheduleid;
    @XmlElement(name = "SCHEDULE_START_DATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar schedulestartdate;
    @XmlElement(name = "SCHEDULE_END_DATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleenddate;
    @XmlElement(name = "SCHEDULE_TYPE", required = true)
    protected String scheduletype;

    /**
     * Gets the value of the agencybordereauimportscheduleid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAGENCYBORDEREAUIMPORTSCHEDULEID() {
        return agencybordereauimportscheduleid;
    }

    /**
     * Sets the value of the agencybordereauimportscheduleid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAGENCYBORDEREAUIMPORTSCHEDULEID(BigDecimal value) {
        this.agencybordereauimportscheduleid = value;
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

}
