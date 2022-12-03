//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.04 at 02:17:53 AM EET 
//


package com.e_booking.client.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reservationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pickupTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pickupLocation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dropoffTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dropoffLocation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reservation", propOrder = {
    "reservationId",
    "pickupTime",
    "pickupLocation",
    "dropoffTime",
    "dropoffLocation",
    "brand",
    "model"
})
public class Reservation {

    protected int reservationId;
    @XmlElement(required = true)
    protected String pickupTime;
    @XmlElement(required = true)
    protected String pickupLocation;
    @XmlElement(required = true)
    protected String dropoffTime;
    @XmlElement(required = true)
    protected String dropoffLocation;
    @XmlElement(required = true)
    protected String brand;
    @XmlElement(required = true)
    protected String model;

    /**
     * Gets the value of the reservationId property.
     * 
     */
    public int getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     */
    public void setReservationId(int value) {
        this.reservationId = value;
    }

    /**
     * Gets the value of the pickupTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupTime() {
        return pickupTime;
    }

    /**
     * Sets the value of the pickupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupTime(String value) {
        this.pickupTime = value;
    }

    /**
     * Gets the value of the pickupLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupLocation() {
        return pickupLocation;
    }

    /**
     * Sets the value of the pickupLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupLocation(String value) {
        this.pickupLocation = value;
    }

    /**
     * Gets the value of the dropoffTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropoffTime() {
        return dropoffTime;
    }

    /**
     * Sets the value of the dropoffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropoffTime(String value) {
        this.dropoffTime = value;
    }

    /**
     * Gets the value of the dropoffLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropoffLocation() {
        return dropoffLocation;
    }

    /**
     * Sets the value of the dropoffLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropoffLocation(String value) {
        this.dropoffLocation = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

}
