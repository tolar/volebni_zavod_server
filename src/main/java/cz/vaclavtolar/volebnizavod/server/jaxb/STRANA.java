
package cz.vaclavtolar.volebnizavod.server.jaxb;

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
 *         &lt;element ref="{http://www.volby.cz/ps/}HODNOTY_STRANA"/>
 *         &lt;element ref="{http://www.volby.cz/ps/}POSLANEC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="KSTRANA" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NAZ_STR" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
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
    "hodnotystrana",
    "poslanec"
})
@XmlRootElement(name = "STRANA", namespace = "http://www.volby.cz/ps/")
public class STRANA {

    @XmlElement(name = "HODNOTY_STRANA", namespace = "http://www.volby.cz/ps/", required = true)
    protected HODNOTYSTRANA hodnotystrana;
    @XmlElement(name = "POSLANEC", namespace = "http://www.volby.cz/ps/")
    protected List<POSLANEC> poslanec;
    @XmlAttribute(name = "KSTRANA", required = true)
    protected BigDecimal kstrana;
    @XmlAttribute(name = "NAZ_STR", required = true)
    protected String nazstr;

    /**
     * Gets the value of the hodnotystrana property.
     * 
     * @return
     *     possible object is
     *     {@link HODNOTYSTRANA }
     *     
     */
    public HODNOTYSTRANA getHODNOTYSTRANA() {
        return hodnotystrana;
    }

    /**
     * Sets the value of the hodnotystrana property.
     * 
     * @param value
     *     allowed object is
     *     {@link HODNOTYSTRANA }
     *     
     */
    public void setHODNOTYSTRANA(HODNOTYSTRANA value) {
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
     * {@link POSLANEC }
     * 
     * 
     */
    public List<POSLANEC> getPOSLANEC() {
        if (poslanec == null) {
            poslanec = new ArrayList<POSLANEC>();
        }
        return this.poslanec;
    }

    /**
     * Gets the value of the kstrana property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKSTRANA() {
        return kstrana;
    }

    /**
     * Sets the value of the kstrana property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKSTRANA(BigDecimal value) {
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
