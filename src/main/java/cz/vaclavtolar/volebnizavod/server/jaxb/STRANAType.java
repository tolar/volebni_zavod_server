
package cz.vaclavtolar.volebnizavod.server.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STRANAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STRANAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HODNOTY_STRANA" type="{http://www.volby.cz/ps/}HODNOTY_STRANAType"/>
 *         &lt;element name="POSLANEC" type="{http://www.volby.cz/ps/}POSLANECType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="KSTRANA" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NAZ_STR" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STRANAType", namespace = "http://www.volby.cz/ps/", propOrder = {
    "hodnotystrana",
    "poslanec"
})
public class STRANAType {

    @XmlElement(name = "HODNOTY_STRANA", namespace = "http://www.volby.cz/ps/", required = true)
    protected HODNOTYSTRANAType hodnotystrana;
    @XmlElement(name = "POSLANEC", namespace = "http://www.volby.cz/ps/")
    protected List<POSLANECType> poslanec;
    @XmlAttribute(name = "KSTRANA")
    protected String kstrana;
    @XmlAttribute(name = "NAZ_STR")
    protected String nazstr;

    /**
     * Gets the value of the hodnotystrana property.
     * 
     * @return
     *     possible object is
     *     {@link HODNOTYSTRANAType }
     *     
     */
    public HODNOTYSTRANAType getHODNOTYSTRANA() {
        return hodnotystrana;
    }

    /**
     * Sets the value of the hodnotystrana property.
     * 
     * @param value
     *     allowed object is
     *     {@link HODNOTYSTRANAType }
     *     
     */
    public void setHODNOTYSTRANA(HODNOTYSTRANAType value) {
        this.hodnotystrana = value;
    }

    /**
     * Gets the value of the poslanec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poslanec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOSLANEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POSLANECType }
     * 
     * 
     */
    public List<POSLANECType> getPOSLANEC() {
        if (poslanec == null) {
            poslanec = new ArrayList<POSLANECType>();
        }
        return this.poslanec;
    }

    /**
     * Gets the value of the kstrana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKSTRANA() {
        return kstrana;
    }

    /**
     * Sets the value of the kstrana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKSTRANA(String value) {
        this.kstrana = value;
    }

    /**
     * Gets the value of the nazstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAZSTR() {
        return nazstr;
    }

    /**
     * Sets the value of the nazstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAZSTR(String value) {
        this.nazstr = value;
    }

}
