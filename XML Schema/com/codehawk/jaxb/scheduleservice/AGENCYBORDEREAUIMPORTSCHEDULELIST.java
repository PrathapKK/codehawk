//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.03 at 10:57:07 AM IST 
//


package com.codehawk.jaxb.scheduleservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AGENCY_BORDEREAU_IMPORT_SCHEDULE_LIST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGENCY_BORDEREAU_IMPORT_SCHEDULE_LIST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGENCY_BORDEREAU_IMPORT_SCHEDULE" type="{}AGENCY_BORDEREAU_IMPORT_SCHEDULE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGENCY_BORDEREAU_IMPORT_SCHEDULE_LIST", propOrder = {
    "agencybordereauimportschedule"
})
public class AGENCYBORDEREAUIMPORTSCHEDULELIST {

    @XmlElement(name = "AGENCY_BORDEREAU_IMPORT_SCHEDULE")
    protected List<AGENCYBORDEREAUIMPORTSCHEDULE> agencybordereauimportschedule;

    /**
     * Gets the value of the agencybordereauimportschedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agencybordereauimportschedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAGENCYBORDEREAUIMPORTSCHEDULE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AGENCYBORDEREAUIMPORTSCHEDULE }
     * 
     * 
     */
    public List<AGENCYBORDEREAUIMPORTSCHEDULE> getAGENCYBORDEREAUIMPORTSCHEDULE() {
        if (agencybordereauimportschedule == null) {
            agencybordereauimportschedule = new ArrayList<AGENCYBORDEREAUIMPORTSCHEDULE>();
        }
        return this.agencybordereauimportschedule;
    }

}