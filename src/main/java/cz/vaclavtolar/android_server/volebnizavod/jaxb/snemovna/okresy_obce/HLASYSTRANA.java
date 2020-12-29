
package cz.vaclavtolar.android_server.volebnizavod.jaxb.snemovna.okresy_obce;

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
 *       &lt;attribute name="KSTRANA" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "HLASY_STRANA", namespace = "http://www.volby.cz/ps/")
public class HLASYSTRANA {

    @XmlAttribute(name = "KSTRANA", required = true)
    protected BigDecimal kstrana;
    @XmlAttribute(name = "HLASY", required = true)
    protected BigDecimal hlasy;
    @XmlAttribute(name = "PROC_HLASU", required = true)
    protected BigDecimal prochlasu;

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

}
