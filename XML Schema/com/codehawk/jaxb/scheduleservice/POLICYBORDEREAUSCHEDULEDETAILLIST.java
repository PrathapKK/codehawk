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
 * <p>Java class for POLICY_BORDEREAU_SCHEDULE_DETAIL_LIST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POLICY_BORDEREAU_SCHEDULE_DETAIL_LIST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POLICY_BORDEREAU_SCHEDULE_DETAIL" type="{}POLICY_BORDEREAU_SCHEDULE_DETAIL" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POLICY_BORDEREAU_SCHEDULE_DETAIL_LIST", propOrder = {
    "policybordereauscheduledetail"
})
public class POLICYBORDEREAUSCHEDULEDETAILLIST {

    @XmlElement(name = "POLICY_BORDEREAU_SCHEDULE_DETAIL")
    protected List<POLICYBORDEREAUSCHEDULEDETAIL> policybordereauscheduledetail;

    /**
     * Gets the value of the policybordereauscheduledetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policybordereauscheduledetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOLICYBORDEREAUSCHEDULEDETAIL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POLICYBORDEREAUSCHEDULEDETAIL }
     * 
     * 
     */
    public List<POLICYBORDEREAUSCHEDULEDETAIL> getPOLICYBORDEREAUSCHEDULEDETAIL() {
        if (policybordereauscheduledetail == null) {
            policybordereauscheduledetail = new ArrayList<POLICYBORDEREAUSCHEDULEDETAIL>();
        }
        return this.policybordereauscheduledetail;
    }

}
