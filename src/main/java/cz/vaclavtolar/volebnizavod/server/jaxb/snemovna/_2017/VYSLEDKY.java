
package cz.vaclavtolar.volebnizavod.server.jaxb.snemovna._2017;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://www.volby.cz/ps/}KRAJ" maxOccurs="14"/>
 *         &lt;element ref="{http://www.volby.cz/ps/}CR"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DATUM_CAS_GENEROVANI" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kraj",
    "cr"
})
@XmlRootElement(name = "VYSLEDKY", namespace = "http://www.volby.cz/ps/")
public class VYSLEDKY {

    @XmlElement(name = "KRAJ", namespace = "http://www.volby.cz/ps/", required = true)
    protected List<KRAJ> kraj;
    @XmlElement(name = "CR", namespace = "http://www.volby.cz/ps/", required = true)
    protected CR cr;
    @XmlAttribute(name = "DATUM_CAS_GENEROVANI", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datumcasgenerovani;

    /**
     * VÃ½sledky za volebnÃ­ kraj Gets the value of the kraj property.
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
     * {@link KRAJ }
     * 
     * 
     */
    public List<KRAJ> getKRAJ() {
        if (kraj == null) {
            kraj = new ArrayList<KRAJ>();
        }
        return this.kraj;
    }

    /**
     * Gets the value of the cr property.
     * 
     * @return
     *     possible object is
     *     {@link CR }
     *     
     */
    public CR getCR() {
        return cr;
    }

    /**
     * Sets the value of the cr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CR }
     *     
     */
    public void setCR(CR value) {
        this.cr = value;
    }

    /**
     * Gets the value of the datumcasgenerovani property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATUMCASGENEROVANI() {
        return datumcasgenerovani;
    }

    /**
     * Sets the value of the datumcasgenerovani property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATUMCASGENEROVANI(XMLGregorianCalendar value) {
        this.datumcasgenerovani = value;
    }

}
