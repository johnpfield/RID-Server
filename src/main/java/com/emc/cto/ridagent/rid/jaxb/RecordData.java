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
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-1.42}DateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-1.42}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-1.42}Application" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-1.42}RecordPattern" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-1.42}RecordItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HashInformation" type="{urn:ietf:params:xml:ns:iodef-1.42}HashSigDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WindowsRegistryKeysModified" type="{urn:ietf:params:xml:ns:iodef-1.42}RegistryKeyModified" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:iodef-1.42}AdditionalData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="restriction" type="{urn:ietf:params:xml:ns:iodef-1.42}restriction-type" />
 *       &lt;attribute name="indicator-uid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="indicator-set-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dateTime",
    "description",
    "application",
    "recordPattern",
    "recordItem",
    "hashInformation",
    "windowsRegistryKeysModified",
    "additionalData"
})
@XmlRootElement(name = "RecordData")
public class RecordData {

    @XmlElement(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "Description")
    protected List<MLStringType> description;
    @XmlElement(name = "Application")
    protected SoftwareType application;
    @XmlElement(name = "RecordPattern")
    protected List<RecordPattern> recordPattern;
    @XmlElement(name = "RecordItem")
    protected List<ExtensionType> recordItem;
    @XmlElement(name = "HashInformation")
    protected List<HashSigDetails> hashInformation;
    @XmlElement(name = "WindowsRegistryKeysModified")
    protected List<RegistryKeyModified> windowsRegistryKeysModified;
    @XmlElement(name = "AdditionalData")
    protected List<ExtensionType> additionalData;
    @XmlAttribute(name = "restriction")
    protected RestrictionType restriction;
    @XmlAttribute(name = "indicator-uid")
    protected String indicatorUid;
    @XmlAttribute(name = "indicator-set-id")
    protected String indicatorSetId;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

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
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareType }
     *     
     */
    public SoftwareType getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareType }
     *     
     */
    public void setApplication(SoftwareType value) {
        this.application = value;
    }

    /**
     * Gets the value of the recordPattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordPattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordPattern }
     * 
     * 
     */
    public List<RecordPattern> getRecordPattern() {
        if (recordPattern == null) {
            recordPattern = new ArrayList<RecordPattern>();
        }
        return this.recordPattern;
    }

    /**
     * Gets the value of the recordItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getRecordItem() {
        if (recordItem == null) {
            recordItem = new ArrayList<ExtensionType>();
        }
        return this.recordItem;
    }

    /**
     * Gets the value of the hashInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hashInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHashInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HashSigDetails }
     * 
     * 
     */
    public List<HashSigDetails> getHashInformation() {
        if (hashInformation == null) {
            hashInformation = new ArrayList<HashSigDetails>();
        }
        return this.hashInformation;
    }

    /**
     * Gets the value of the windowsRegistryKeysModified property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windowsRegistryKeysModified property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindowsRegistryKeysModified().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistryKeyModified }
     * 
     * 
     */
    public List<RegistryKeyModified> getWindowsRegistryKeysModified() {
        if (windowsRegistryKeysModified == null) {
            windowsRegistryKeysModified = new ArrayList<RegistryKeyModified>();
        }
        return this.windowsRegistryKeysModified;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getAdditionalData() {
        if (additionalData == null) {
            additionalData = new ArrayList<ExtensionType>();
        }
        return this.additionalData;
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
        return restriction;
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

}
