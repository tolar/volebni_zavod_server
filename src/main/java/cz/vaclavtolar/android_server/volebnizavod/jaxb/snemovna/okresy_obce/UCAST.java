
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
 *       &lt;attribute name="OKRSKY_CELKEM" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="5"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="OKRSKY_ZPRAC" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="5"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="OKRSKY_ZPRAC_PROC" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="5"/>
 *             &lt;fractionDigits value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ZAPSANI_VOLICI" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="8"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="VYDANE_OBALKY" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="8"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="UCAST_PROC" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="5"/>
 *             &lt;fractionDigits value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ODEVZDANE_OBALKY" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="8"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PLATNE_HLASY" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="8"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PLATNE_HLASY_PROC" use="required">
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
@XmlRootElement(name = "UCAST", namespace = "http://www.volby.cz/ps/")
public class UCAST {

    @XmlAttribute(name = "OKRSKY_CELKEM", required = true)
    protected BigDecimal okrskycelkem;
    @XmlAttribute(name = "OKRSKY_ZPRAC", required = true)
    protected BigDecimal okrskyzprac;
    @XmlAttribute(name = "OKRSKY_ZPRAC_PROC", required = true)
    protected BigDecimal okrskyzpracproc;
    @XmlAttribute(name = "ZAPSANI_VOLICI", required = true)
    protected BigDecimal zapsanivolici;
    @XmlAttribute(name = "VYDANE_OBALKY", required = true)
    protected BigDecimal vydaneobalky;
    @XmlAttribute(name = "UCAST_PROC", required = true)
    protected BigDecimal ucastproc;
    @XmlAttribute(name = "ODEVZDANE_OBALKY", required = true)
    protected BigDecimal odevzdaneobalky;
    @XmlAttribute(name = "PLATNE_HLASY", required = true)
    protected BigDecimal platnehlasy;
    @XmlAttribute(name = "PLATNE_HLASY_PROC", required = true)
    protected BigDecimal platnehlasyproc;

    /**
     * Gets the value of the okrskycelkem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOKRSKYCELKEM() {
        return okrskycelkem;
    }

    /**
     * Sets the value of the okrskycelkem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOKRSKYCELKEM(BigDecimal value) {
        this.okrskycelkem = value;
    }

    /**
     * Gets the value of the okrskyzprac property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOKRSKYZPRAC() {
        return okrskyzprac;
    }

    /**
     * Sets the value of the okrskyzprac property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOKRSKYZPRAC(BigDecimal value) {
        this.okrskyzprac = value;
    }

    /**
     * Gets the value of the okrskyzpracproc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOKRSKYZPRACPROC() {
        return okrskyzpracproc;
    }

    /**
     * Sets the value of the okrskyzpracproc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOKRSKYZPRACPROC(BigDecimal value) {
        this.okrskyzpracproc = value;
    }

    /**
     * Gets the value of the zapsanivolici property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZAPSANIVOLICI() {
        return zapsanivolici;
    }

    /**
     * Sets the value of the zapsanivolici property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZAPSANIVOLICI(BigDecimal value) {
        this.zapsanivolici = value;
    }

    /**
     * Gets the value of the vydaneobalky property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVYDANEOBALKY() {
        return vydaneobalky;
    }

    /**
     * Sets the value of the vydaneobalky property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVYDANEOBALKY(BigDecimal value) {
        this.vydaneobalky = value;
    }

    /**
     * Gets the value of the ucastproc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUCASTPROC() {
        return ucastproc;
    }

    /**
     * Sets the value of the ucastproc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUCASTPROC(BigDecimal value) {
        this.ucastproc = value;
    }

    /**
     * Gets the value of the odevzdaneobalky property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getODEVZDANEOBALKY() {
        return odevzdaneobalky;
    }

    /**
     * Sets the value of the odevzdaneobalky property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setODEVZDANEOBALKY(BigDecimal value) {
        this.odevzdaneobalky = value;
    }

    /**
     * Gets the value of the platnehlasy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPLATNEHLASY() {
        return platnehlasy;
    }

    /**
     * Sets the value of the platnehlasy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPLATNEHLASY(BigDecimal value) {
        this.platnehlasy = value;
    }

    /**
     * Gets the value of the platnehlasyproc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPLATNEHLASYPROC() {
        return platnehlasyproc;
    }

    /**
     * Sets the value of the platnehlasyproc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPLATNEHLASYPROC(BigDecimal value) {
        this.platnehlasyproc = value;
    }

}
