
package cz.vaclavtolar.volebnizavod.server.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.volby.cz/ps/}STRANA" maxOccurs="unbounded"/>
 *       &lt;/sequence>
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
    "strana"
})
@XmlRootElement(name = "CR", namespace = "http://www.volby.cz/ps/")
public class CR {

    @XmlElement(name = "UCAST", namespace = "http://www.volby.cz/ps/", required = true)
    protected UCAST ucast;
    @XmlElement(name = "STRANA", namespace = "http://www.volby.cz/ps/", required = true)
    protected List<STRANA> strana;

    /**
     * VolebnÃ­ ÃºÄ\u008dast
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
     * {@link STRANA }
     * 
     * 
     */
    public List<STRANA> getSTRANA() {
        if (strana == null) {
            strana = new ArrayList<STRANA>();
        }
        return this.strana;
    }

}
