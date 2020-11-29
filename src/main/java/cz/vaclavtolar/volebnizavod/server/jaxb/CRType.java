
package cz.vaclavtolar.volebnizavod.server.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UCAST" type="{http://www.volby.cz/ps/}UCASTType"/>
 *         &lt;element name="STRANA" type="{http://www.volby.cz/ps/}STRANAType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRType", namespace = "http://www.volby.cz/ps/", propOrder = {
    "ucast",
    "strana"
})
public class CRType {

    @XmlElement(name = "UCAST", namespace = "http://www.volby.cz/ps/", required = true)
    protected UCASTType ucast;
    @XmlElement(name = "STRANA", namespace = "http://www.volby.cz/ps/")
    protected List<STRANAType> strana;

    /**
     * Gets the value of the ucast property.
     * 
     * @return
     *     possible object is
     *     {@link UCASTType }
     *     
     */
    public UCASTType getUCAST() {
        return ucast;
    }

    /**
     * Sets the value of the ucast property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCASTType }
     *     
     */
    public void setUCAST(UCASTType value) {
        this.ucast = value;
    }

    /**
     * Gets the value of the strana property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strana property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTRANA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STRANAType }
     * 
     * 
     */
    public List<STRANAType> getSTRANA() {
        if (strana == null) {
            strana = new ArrayList<STRANAType>();
        }
        return this.strana;
    }

}
