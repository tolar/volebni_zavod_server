
package cz.vaclavtolar.volebnizavod.server.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KRAJType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KRAJType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UCAST" type="{http://www.volby.cz/ps/}UCASTType"/>
 *         &lt;element name="STRANA" type="{http://www.volby.cz/ps/}STRANAType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CIS_KRAJ" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NAZ_KRAJ" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="POCMANDATU" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KRAJType", namespace = "http://www.volby.cz/ps/", propOrder = {
    "ucast",
    "strana"
})
public class KRAJType {

    @XmlElement(name = "UCAST", namespace = "http://www.volby.cz/ps/", required = true)
    protected UCASTType ucast;
    @XmlElement(name = "STRANA", namespace = "http://www.volby.cz/ps/")
    protected List<STRANAType> strana;
    @XmlAttribute(name = "CIS_KRAJ")
    protected String ciskraj;
    @XmlAttribute(name = "NAZ_KRAJ")
    protected String nazkraj;
    @XmlAttribute(name = "POCMANDATU")
    protected String pocmandatu;

    /**
     * Gets the value of the ucast property.
     * 
     * @return
     *     possible object is
     *     {@link UCASTType }
     *     
     */
    public UCASTType getUCAST() {
        return ucast;
    }

    /**
     * Sets the value of the ucast property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCASTType }
     *     
     */
    public void setUCAST(UCASTType value) {
        this.ucast = value;
    }

    /**
     * Gets the value of the strana property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strana property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTRANA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STRANAType }
     * 
     * 
     */
    public List<STRANAType> getSTRANA() {
        if (strana == null) {
            strana = new ArrayList<STRANAType>();
        }
        return this.strana;
    }

    /**
     * Gets the value of the ciskraj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCISKRAJ() {
        return ciskraj;
    }

    /**
     * Sets the value of the ciskraj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCISKRAJ(String value) {
        this.ciskraj = value;
    }

    /**
     * Gets the value of the nazkraj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAZKRAJ() {
        return nazkraj;
    }

    /**
     * Sets the value of the nazkraj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAZKRAJ(String value) {
        this.nazkraj = value;
    }

    /**
     * Gets the value of the pocmandatu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOCMANDATU() {
        return pocmandatu;
    }

    /**
     * Sets the value of the pocmandatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOCMANDATU(String value) {
        this.pocmandatu = value;
    }

}
