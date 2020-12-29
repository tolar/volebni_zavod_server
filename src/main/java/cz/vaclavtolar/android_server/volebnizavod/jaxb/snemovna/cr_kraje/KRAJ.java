
package cz.vaclavtolar.android_server.volebnizavod.jaxb.snemovna.cr_kraje;

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
 *         &lt;element ref="{http://www.volby.cz/ps/}STRANA" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CIS_KRAJ" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;minInclusive value="1"/>
 *             &lt;maxInclusive value="14"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NAZ_KRAJ" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="POCMANDATU">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="2"/>
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
    "strana"
})
@XmlRootElement(name = "KRAJ", namespace = "http://www.volby.cz/ps/")
public class KRAJ {

    @XmlElement(name = "UCAST", namespace = "http://www.volby.cz/ps/", required = true)
    protected UCAST ucast;
    @XmlElement(name = "STRANA", namespace = "http://www.volby.cz/ps/", required = true)
    protected List<STRANA> strana;
    @XmlAttribute(name = "CIS_KRAJ", required = true)
    protected BigDecimal ciskraj;
    @XmlAttribute(name = "NAZ_KRAJ", required = true)
    protected String nazkraj;
    @XmlAttribute(name = "POCMANDATU")
    protected BigDecimal pocmandatu;

    /**
     * VolebnÃ­ ÃºÄ\u008dast
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
     * {@link STRANA }
     * 
     * 
     */
    public List<STRANA> getSTRANA() {
        if (strana == null) {
            strana = new ArrayList<STRANA>();
        }
        return this.strana;
    }

    /**
     * Gets the value of the ciskraj property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCISKRAJ() {
        return ciskraj;
    }

    /**
     * Sets the value of the ciskraj property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCISKRAJ(BigDecimal value) {
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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPOCMANDATU() {
        return pocmandatu;
    }

    /**
     * Sets the value of the pocmandatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPOCMANDATU(BigDecimal value) {
        this.pocmandatu = value;
    }

}
