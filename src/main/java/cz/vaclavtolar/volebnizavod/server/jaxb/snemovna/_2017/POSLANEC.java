
package cz.vaclavtolar.volebnizavod.server.jaxb.snemovna._2017;

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
 *       &lt;attribute name="CIS_KRAJ" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;minInclusive value="1"/>
 *             &lt;maxInclusive value="14"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PORADOVE_CISLO" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;minInclusive value="1"/>
 *             &lt;maxInclusive value="70"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="JMENO" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="40"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PRIJMENI" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="30"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TITULPRED" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TITULZA" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PREDNOSTNI_HLASY" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PREDNOSTNI_HLASY_PROC" use="required">
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
@XmlRootElement(name = "POSLANEC", namespace = "http://www.volby.cz/ps/")
public class POSLANEC {

    @XmlAttribute(name = "CIS_KRAJ", required = true)
    protected BigDecimal ciskraj;
    @XmlAttribute(name = "PORADOVE_CISLO", required = true)
    protected BigDecimal poradovecislo;
    @XmlAttribute(name = "JMENO", required = true)
    protected String jmeno;
    @XmlAttribute(name = "PRIJMENI", required = true)
    protected String prijmeni;
    @XmlAttribute(name = "TITULPRED", required = true)
    protected String titulpred;
    @XmlAttribute(name = "TITULZA", required = true)
    protected String titulza;
    @XmlAttribute(name = "PREDNOSTNI_HLASY", required = true)
    protected BigDecimal prednostnihlasy;
    @XmlAttribute(name = "PREDNOSTNI_HLASY_PROC", required = true)
    protected BigDecimal prednostnihlasyproc;

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
     * Gets the value of the poradovecislo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPORADOVECISLO() {
        return poradovecislo;
    }

    /**
     * Sets the value of the poradovecislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPORADOVECISLO(BigDecimal value) {
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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPREDNOSTNIHLASY() {
        return prednostnihlasy;
    }

    /**
     * Sets the value of the prednostnihlasy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPREDNOSTNIHLASY(BigDecimal value) {
        this.prednostnihlasy = value;
    }

    /**
     * Gets the value of the prednostnihlasyproc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPREDNOSTNIHLASYPROC() {
        return prednostnihlasyproc;
    }

    /**
     * Sets the value of the prednostnihlasyproc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPREDNOSTNIHLASYPROC(BigDecimal value) {
        this.prednostnihlasyproc = value;
    }

}
