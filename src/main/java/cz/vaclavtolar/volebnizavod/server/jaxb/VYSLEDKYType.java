
package cz.vaclavtolar.volebnizavod.server.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for VYSLEDKYType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VYSLEDKYType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KRAJ" type="{http://www.volby.cz/ps/}KRAJType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CR" type="{http://www.volby.cz/ps/}CRType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DATUM_CAS_GENEROVANI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VYSLEDKYType", namespace = "http://www.volby.cz/ps/", propOrder = {
    "kraj",
    "cr"
})
@XmlRootElement
public class VYSLEDKYType {

    @XmlElement(name = "KRAJ", namespace = "http://www.volby.cz/ps/")
    protected List<KRAJType> kraj;
    @XmlElement(name = "CR", namespace = "http://www.volby.cz/ps/", required = true)
    protected CRType cr;
    @XmlAttribute(name = "DATUM_CAS_GENEROVANI")
    protected String datumcasgenerovani;

    /**
     * Gets the value of the kraj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kraj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKRAJ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KRAJType }
     * 
     * 
     */
    public List<KRAJType> getKRAJ() {
        if (kraj == null) {
            kraj = new ArrayList<KRAJType>();
        }
        return this.kraj;
    }

    /**
     * Gets the value of the cr property.
     * 
     * @return
     *     possible object is
     *     {@link CRType }
     *     
     */
    public CRType getCR() {
        return cr;
    }

    /**
     * Sets the value of the cr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRType }
     *     
     */
    public void setCR(CRType value) {
        this.cr = value;
    }

    /**
     * Gets the value of the datumcasgenerovani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATUMCASGENEROVANI() {
        return datumcasgenerovani;
    }

    /**
     * Sets the value of the datumcasgenerovani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATUMCASGENEROVANI(String value) {
        this.datumcasgenerovani = value;
    }

}
