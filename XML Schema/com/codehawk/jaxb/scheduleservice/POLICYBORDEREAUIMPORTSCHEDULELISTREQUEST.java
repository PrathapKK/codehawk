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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POLICY_BORDEREAU_IMPORT_SCHEDULE_LIST_REQUEST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POLICY_BORDEREAU_IMPORT_SCHEDULE_LIST_REQUEST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POLICY_BORDEREAU_SCHEDULE_DEFINITION_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POLICY_BORDEREAU_IMPORT_SCHEDULE_LIST_REQUEST", propOrder = {
    "policybordereauscheduledefinitionid"
})
public class POLICYBORDEREAUIMPORTSCHEDULELISTREQUEST {

    @XmlElement(name = "POLICY_BORDEREAU_SCHEDULE_DEFINITION_ID", required = true)
    protected BigDecimal policybordereauscheduledefinitionid;

    /**
     * Gets the value of the policybordereauscheduledefinitionid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPOLICYBORDEREAUSCHEDULEDEFINITIONID() {
        return policybordereauscheduledefinitionid;
    }

    /**
     * Sets the value of the policybordereauscheduledefinitionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPOLICYBORDEREAUSCHEDULEDEFINITIONID(BigDecimal value) {
        this.policybordereauscheduledefinitionid = value;
    }

}