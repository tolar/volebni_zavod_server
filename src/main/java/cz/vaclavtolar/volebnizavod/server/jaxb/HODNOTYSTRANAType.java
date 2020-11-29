
package cz.vaclavtolar.volebnizavod.server.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for HODNOTY_STRANAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HODNOTY_STRANAType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="HLASY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PROC_HLASU" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MANDATY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PROC_MANDATU" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HODNOTY_STRANAType", namespace = "http://www.volby.cz/ps/", propOrder = {
    "value"
})
public class HODNOTYSTRANAType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "HLASY")
    protected String hlasy;
    @XmlAttribute(name = "PROC_HLASU")
    protected String prochlasu;
    @XmlAttribute(name = "MANDATY")
    protected String mandaty;
    @XmlAttribute(name = "PROC_MANDATU")
    protected String procmandatu;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the hlasy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHLASY() {
        return hlasy;
    }

    /**
     * Sets the value of the hlasy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHLASY(String value) {
        this.hlasy = value;
    }

    /**
     * Gets the value of the prochlasu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCHLASU() {
        return prochlasu;
    }

    /**
     * Sets the value of the prochlasu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCHLASU(String value) {
        this.prochlasu = value;
    }

    /**
     * Gets the value of the mandaty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANDATY() {
        return mandaty;
    }

    /**
     * Sets the value of the mandaty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANDATY(String value) {
        this.mandaty = value;
    }

    /**
     * Gets the value of the procmandatu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCMANDATU() {
        return procmandatu;
    }

    /**
     * Sets the value of the procmandatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCMANDATU(String value) {
        this.procmandatu = value;
    }

}
