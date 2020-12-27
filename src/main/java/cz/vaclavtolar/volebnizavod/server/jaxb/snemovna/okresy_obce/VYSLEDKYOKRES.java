
package cz.vaclavtolar.volebnizavod.server.jaxb.snemovna.okresy_obce;

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
 *       &lt;choice>
 *         &lt;element ref="{http://www.volby.cz/ps/}CHYBA"/>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.volby.cz/ps/}OKRES"/>
 *           &lt;element ref="{http://www.volby.cz/ps/}OBEC" maxOccurs="unbounded"/>
 *         &lt;/sequence>
 *       &lt;/choice>
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
    "chyba",
    "okres",
    "obec"
})
@XmlRootElement(name = "VYSLEDKY_OKRES", namespace = "http://www.volby.cz/ps/")
public class VYSLEDKYOKRES {

    @XmlElement(name = "CHYBA", namespace = "http://www.volby.cz/ps/")
    protected String chyba;
    @XmlElement(name = "OKRES", namespace = "http://www.volby.cz/ps/")
    protected OKRES okres;
    @XmlElement(name = "OBEC", namespace = "http://www.volby.cz/ps/")
    protected List<OBEC> obec;
    @XmlAttribute(name = "DATUM_CAS_GENEROVANI", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datumcasgenerovani;

    /**
     * Informace o chyb\u011b p\u0159i získávání výsledk\u016f
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHYBA() {
        return chyba;
    }

    /**
     * Sets the value of the chyba property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHYBA(String value) {
        this.chyba = value;
    }

    /**
     * Výsledky za okres
     * 
     * @return
     *     possible object is
     *     {@link OKRES }
     *     
     */
    public OKRES getOKRES() {
        return okres;
    }

    /**
     * Sets the value of the okres property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKRES }
     *     
     */
    public void setOKRES(OKRES value) {
        this.okres = value;
    }

    /**
     * Výsledky za obec Gets the value of the obec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOBEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OBEC }
     * 
     * 
     */
    public List<OBEC> getOBEC() {
        if (obec == null) {
            obec = new ArrayList<OBEC>();
        }
        return this.obec;
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
