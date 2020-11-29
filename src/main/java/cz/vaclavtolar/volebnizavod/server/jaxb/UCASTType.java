
package cz.vaclavtolar.volebnizavod.server.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for UCASTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UCASTType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="OKRSKY_CELKEM" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OKRSKY_ZPRAC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OKRSKY_ZPRAC_PROC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ZAPSANI_VOLICI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VYDANE_OBALKY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UCAST_PROC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ODEVZDANE_OBALKY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PLATNE_HLASY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PLATNE_HLASY_PROC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UCASTType", namespace = "http://www.volby.cz/ps/", propOrder = {
    "value"
})
public class UCASTType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "OKRSKY_CELKEM")
    protected String okrskycelkem;
    @XmlAttribute(name = "OKRSKY_ZPRAC")
    protected String okrskyzprac;
    @XmlAttribute(name = "OKRSKY_ZPRAC_PROC")
    protected String okrskyzpracproc;
    @XmlAttribute(name = "ZAPSANI_VOLICI")
    protected String zapsanivolici;
    @XmlAttribute(name = "VYDANE_OBALKY")
    protected String vydaneobalky;
    @XmlAttribute(name = "UCAST_PROC")
    protected String ucastproc;
    @XmlAttribute(name = "ODEVZDANE_OBALKY")
    protected String odevzdaneobalky;
    @XmlAttribute(name = "PLATNE_HLASY")
    protected String platnehlasy;
    @XmlAttribute(name = "PLATNE_HLASY_PROC")
    protected String platnehlasyproc;

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
     * Gets the value of the okrskycelkem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKRSKYCELKEM() {
        return okrskycelkem;
    }

    /**
     * Sets the value of the okrskycelkem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKRSKYCELKEM(String value) {
        this.okrskycelkem = value;
    }

    /**
     * Gets the value of the okrskyzprac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKRSKYZPRAC() {
        return okrskyzprac;
    }

    /**
     * Sets the value of the okrskyzprac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKRSKYZPRAC(String value) {
        this.okrskyzprac = value;
    }

    /**
     * Gets the value of the okrskyzpracproc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKRSKYZPRACPROC() {
        return okrskyzpracproc;
    }

    /**
     * Sets the value of the okrskyzpracproc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKRSKYZPRACPROC(String value) {
        this.okrskyzpracproc = value;
    }

    /**
     * Gets the value of the zapsanivolici property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZAPSANIVOLICI() {
        return zapsanivolici;
    }

    /**
     * Sets the value of the zapsanivolici property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZAPSANIVOLICI(String value) {
        this.zapsanivolici = value;
    }

    /**
     * Gets the value of the vydaneobalky property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVYDANEOBALKY() {
        return vydaneobalky;
    }

    /**
     * Sets the value of the vydaneobalky property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVYDANEOBALKY(String value) {
        this.vydaneobalky = value;
    }

    /**
     * Gets the value of the ucastproc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCASTPROC() {
        return ucastproc;
    }

    /**
     * Sets the value of the ucastproc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCASTPROC(String value) {
        this.ucastproc = value;
    }

    /**
     * Gets the value of the odevzdaneobalky property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getODEVZDANEOBALKY() {
        return odevzdaneobalky;
    }

    /**
     * Sets the value of the odevzdaneobalky property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setODEVZDANEOBALKY(String value) {
        this.odevzdaneobalky = value;
    }

    /**
     * Gets the value of the platnehlasy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNEHLASY() {
        return platnehlasy;
    }

    /**
     * Sets the value of the platnehlasy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNEHLASY(String value) {
        this.platnehlasy = value;
    }

    /**
     * Gets the value of the platnehlasyproc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNEHLASYPROC() {
        return platnehlasyproc;
    }

    /**
     * Sets the value of the platnehlasyproc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNEHLASYPROC(String value) {
        this.platnehlasyproc = value;
    }

}
