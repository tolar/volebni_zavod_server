
package cz.vaclavtolar.android_server.volebnizavod.jaxb.snemovna.cr_kraje;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="HLASY" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="9"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PROC_HLASU" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="5"/>
 *             &lt;fractionDigits value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="MANDATY">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PROC_MANDATU">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="5"/>
 *             &lt;fractionDigits value="2"/>
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
@XmlType(name = "")
@XmlRootElement(name = "HODNOTY_STRANA", namespace = "http://www.volby.cz/ps/")
public class HODNOTYSTRANA {

    @XmlAttribute(name = "HLASY", required = true)
    protected BigDecimal hlasy;
    @XmlAttribute(name = "PROC_HLASU", required = true)
    protected BigDecimal prochlasu;
    @XmlAttribute(name = "MANDATY")
    protected BigDecimal mandaty;
    @XmlAttribute(name = "PROC_MANDATU")
    protected BigDecimal procmandatu;

    /**
     * Gets the value of the hlasy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHLASY() {
        return hlasy;
    }

    /**
     * Sets the value of the hlasy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHLASY(BigDecimal value) {
        this.hlasy = value;
    }

    /**
     * Gets the value of the prochlasu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPROCHLASU() {
        return prochlasu;
    }

    /**
     * Sets the value of the prochlasu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPROCHLASU(BigDecimal value) {
        this.prochlasu = value;
    }

    /**
     * Gets the value of the mandaty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMANDATY() {
        return mandaty;
    }

    /**
     * Sets the value of the mandaty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMANDATY(BigDecimal value) {
        this.mandaty = value;
    }

    /**
     * Gets the value of the procmandatu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPROCMANDATU() {
        return procmandatu;
    }

    /**
     * Sets the value of the procmandatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPROCMANDATU(BigDecimal value) {
        this.procmandatu = value;
    }

}
