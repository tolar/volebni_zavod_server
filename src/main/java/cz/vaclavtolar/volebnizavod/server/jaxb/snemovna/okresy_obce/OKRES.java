
package cz.vaclavtolar.volebnizavod.server.jaxb.snemovna.okresy_obce;

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
 *         &lt;element ref="{http://www.volby.cz/ps/}UCAST"/>
 *         &lt;element ref="{http://www.volby.cz/ps/}HLASY_STRANA" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NUTS_OKRES" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="6"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NAZ_OKRES" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="20"/>
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
    "ucast",
    "hlasystrana"
})
@XmlRootElement(name = "OKRES", namespace = "http://www.volby.cz/ps/")
public class OKRES {

    @XmlElement(name = "UCAST", namespace = "http://www.volby.cz/ps/", required = true)
    protected UCAST ucast;
    @XmlElement(name = "HLASY_STRANA", namespace = "http://www.volby.cz/ps/")
    protected List<HLASYSTRANA> hlasystrana;
    @XmlAttribute(name = "NUTS_OKRES", required = true)
    protected String nutsokres;
    @XmlAttribute(name = "NAZ_OKRES", required = true)
    protected String nazokres;

    /**
     * Gets the value of the ucast property.
     * 
     * @return
     *     possible object is
     *     {@link UCAST }
     *     
     */
    public UCAST getUCAST() {
        return ucast;
    }

    /**
     * Sets the value of the ucast property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCAST }
     *     
     */
    public void setUCAST(UCAST value) {
        this.ucast = value;
    }

    /**
     * Gets the value of the hlasystrana property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hlasystrana property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHLASYSTRANA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HLASYSTRANA }
     * 
     * 
     */
    public List<HLASYSTRANA> getHLASYSTRANA() {
        if (hlasystrana == null) {
            hlasystrana = new ArrayList<HLASYSTRANA>();
        }
        return this.hlasystrana;
    }

    /**
     * Gets the value of the nutsokres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUTSOKRES() {
        return nutsokres;
    }

    /**
     * Sets the value of the nutsokres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUTSOKRES(String value) {
        this.nutsokres = value;
    }

    /**
     * Gets the value of the nazokres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAZOKRES() {
        return nazokres;
    }

    /**
     * Sets the value of the nazokres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAZOKRES(String value) {
        this.nazokres = value;
    }

}
