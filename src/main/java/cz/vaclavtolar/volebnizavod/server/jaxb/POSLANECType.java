
package cz.vaclavtolar.volebnizavod.server.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for POSLANECType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POSLANECType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="CIS_KRAJ" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PORADOVE_CISLO" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="JMENO" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PRIJMENI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TITULPRED" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TITULZA" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PREDNOSTNI_HLASY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PREDNOSTNI_HLASY_PROC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POSLANECType", namespace = "http://www.volby.cz/ps/", propOrder = {
    "value"
})
public class POSLANECType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "CIS_KRAJ")
    protected String ciskraj;
    @XmlAttribute(name = "PORADOVE_CISLO")
    protected String poradovecislo;
    @XmlAttribute(name = "JMENO")
    protected String jmeno;
    @XmlAttribute(name = "PRIJMENI")
    protected String prijmeni;
    @XmlAttribute(name = "TITULPRED")
    protected String titulpred;
    @XmlAttribute(name = "TITULZA")
    protected String titulza;
    @XmlAttribute(name = "PREDNOSTNI_HLASY")
    protected String prednostnihlasy;
    @XmlAttribute(name = "PREDNOSTNI_HLASY_PROC")
    protected String prednostnihlasyproc;

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
     * Gets the value of the poradovecislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPORADOVECISLO() {
        return poradovecislo;
    }

    /**
     * Sets the value of the poradovecislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPORADOVECISLO(String value) {
        this.poradovecislo = value;
    }

    /**
     * Gets the value of the jmeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJMENO() {
        return jmeno;
    }

    /**
     * Sets the value of the jmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJMENO(String value) {
        this.jmeno = value;
    }

    /**
     * Gets the value of the prijmeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIJMENI() {
        return prijmeni;
    }

    /**
     * Sets the value of the prijmeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIJMENI(String value) {
        this.prijmeni = value;
    }

    /**
     * Gets the value of the titulpred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULPRED() {
        return titulpred;
    }

    /**
     * Sets the value of the titulpred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULPRED(String value) {
        this.titulpred = value;
    }

    /**
     * Gets the value of the titulza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULZA() {
        return titulza;
    }

    /**
     * Sets the value of the titulza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULZA(String value) {
        this.titulza = value;
    }

    /**
     * Gets the value of the prednostnihlasy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREDNOSTNIHLASY() {
        return prednostnihlasy;
    }

    /**
     * Sets the value of the prednostnihlasy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREDNOSTNIHLASY(String value) {
        this.prednostnihlasy = value;
    }

    /**
     * Gets the value of the prednostnihlasyproc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREDNOSTNIHLASYPROC() {
        return prednostnihlasyproc;
    }

    /**
     * Sets the value of the prednostnihlasyproc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREDNOSTNIHLASYPROC(String value) {
        this.prednostnihlasyproc = value;
    }

}
