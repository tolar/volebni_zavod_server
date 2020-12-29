
package cz.vaclavtolar.android_server.volebnizavod.jaxb.snemovna.okresy_obce;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.volby.cz/ps/}UCAST"/>
 *         &lt;element ref="{http://www.volby.cz/ps/}HLASY_STRANA" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CIS_OBEC" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="6"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NAZ_OBEC" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="40"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TYP_OBEC" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="OBEC_BEZ_MCMO"/>
 *             &lt;enumeration value="OBEC_S_MCMO"/>
 *             &lt;enumeration value="MCMO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ucast",
    "hlasystrana"
})
@XmlRootElement(name = "OBEC", namespace = "http://www.volby.cz/ps/")
public class OBEC {

    @XmlElement(name = "UCAST", namespace = "http://www.volby.cz/ps/", required = true)
    protected UCAST ucast;
    @XmlElement(name = "HLASY_STRANA", namespace = "http://www.volby.cz/ps/")
    protected List<HLASYSTRANA> hlasystrana;
    @XmlAttribute(name = "CIS_OBEC", required = true)
    protected BigDecimal cisobec;
    @XmlAttribute(name = "NAZ_OBEC", required = true)
    protected String nazobec;
    @XmlAttribute(name = "TYP_OBEC", required = true)
    protected String typobec;

    /**
     * Gets the value of the ucast property.
     * 
     * @return
     *     possible object is
     *     {@link UCAST }
     *     
     */
    public UCAST getUCAST() {
        return ucast;
    }

    /**
     * Sets the value of the ucast property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCAST }
     *     
     */
    public void setUCAST(UCAST value) {
        this.ucast = value;
    }

    /**
     * Gets the value of the hlasystrana property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hlasystrana property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHLASYSTRANA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HLASYSTRANA }
     * 
     * 
     */
    public List<HLASYSTRANA> getHLASYSTRANA() {
        if (hlasystrana == null) {
            hlasystrana = new ArrayList<HLASYSTRANA>();
        }
        return this.hlasystrana;
    }

    /**
     * Gets the value of the cisobec property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCISOBEC() {
        return cisobec;
    }

    /**
     * Sets the value of the cisobec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCISOBEC(BigDecimal value) {
        this.cisobec = value;
    }

    /**
     * Gets the value of the nazobec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAZOBEC() {
        return nazobec;
    }

    /**
     * Sets the value of the nazobec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAZOBEC(String value) {
        this.nazobec = value;
    }

    /**
     * Gets the value of the typobec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPOBEC() {
        return typobec;
    }

    /**
     * Sets the value of the typobec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPOBEC(String value) {
        this.typobec = value;
    }

}
