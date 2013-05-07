//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.26 at 05:36:33 PM IST 
//


package com.emc.cto.ridagent.rid.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-1.42}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-1.42}StartTime" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-1.42}EndTime" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-1.42}Contact" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="restriction" type="{urn:ietf:params:xml:ns:iodef-1.42}restriction-type" default="default" />
 *       &lt;attribute name="severity" type="{urn:ietf:params:xml:ns:iodef-1.42}severity-type" />
 *       &lt;attribute name="action" type="{urn:ietf:params:xml:ns:iodef-1.42}action-type" default="other" />
 *       &lt;attribute name="ext-action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="indicator-set-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="indicator-uid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "startTime",
    "endTime",
    "contact"
})
@XmlRootElement(name = "Expectation")
public class Expectation {

    @XmlElement(name = "Description")
    protected List<MLStringType> description;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "Contact")
    protected Contact contact;
    @XmlAttribute(name = "restriction")
    protected RestrictionType restriction;
    @XmlAttribute(name = "severity")
    protected SeverityType severity;
    @XmlAttribute(name = "action")
    protected ActionType action;
    @XmlAttribute(name = "ext-action")
    protected String extAction;
    @XmlAttribute(name = "indicator-set-id")
    protected String indicatorSetId;
    @XmlAttribute(name = "indicator-uid")
    protected String indicatorUid;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MLStringType }
     * 
     * 
     */
    public List<MLStringType> getDescription() {
        if (description == null) {
            description = new ArrayList<MLStringType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
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
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionType }
     *     
     */
    public RestrictionType getRestriction() {
        if (restriction == null) {
            return RestrictionType.DEFAULT;
        } else {
            return restriction;
        }
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionType }
     *     
     */
    public void setRestriction(RestrictionType value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityType }
     *     
     */
    public SeverityType getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityType }
     *     
     */
    public void setSeverity(SeverityType value) {
        this.severity = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getAction() {
        if (action == null) {
            return ActionType.OTHER;
        } else {
            return action;
        }
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setAction(ActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the extAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtAction() {
        return extAction;
    }

    /**
     * Sets the value of the extAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtAction(String value) {
        this.extAction = value;
    }

    /**
     * Gets the value of the indicatorSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicatorSetId() {
        return indicatorSetId;
    }

    /**
     * Sets the value of the indicatorSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatorSetId(String value) {
        this.indicatorSetId = value;
    }

    /**
     * Gets the value of the indicatorUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicatorUid() {
        return indicatorUid;
    }

    /**
     * Sets the value of the indicatorUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatorUid(String value) {
        this.indicatorUid = value;
    }

}