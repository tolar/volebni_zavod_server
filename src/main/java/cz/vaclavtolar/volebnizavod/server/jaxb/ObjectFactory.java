
package cz.vaclavtolar.volebnizavod.server.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.vaclavtolar.volebnizavod.server.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VYSLEDKY_QNAME = new QName("http://www.volby.cz/ps/", "VYSLEDKY");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.vaclavtolar.volebnizavod.server.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VYSLEDKYType }
     * 
     */
    public VYSLEDKYType createVYSLEDKYType() {
        return new VYSLEDKYType();
    }

    /**
     * Create an instance of {@link STRANAType }
     * 
     */
    public STRANAType createSTRANAType() {
        return new STRANAType();
    }

    /**
     * Create an instance of {@link HODNOTYSTRANAType }
     * 
     */
    public HODNOTYSTRANAType createHODNOTYSTRANAType() {
        return new HODNOTYSTRANAType();
    }

    /**
     * Create an instance of {@link KRAJType }
     * 
     */
    public KRAJType createKRAJType() {
        return new KRAJType();
    }

    /**
     * Create an instance of {@link UCASTType }
     * 
     */
    public UCASTType createUCASTType() {
        return new UCASTType();
    }

    /**
     * Create an instance of {@link CRType }
     * 
     */
    public CRType createCRType() {
        return new CRType();
    }

    /**
     * Create an instance of {@link POSLANECType }
     * 
     */
    public POSLANECType createPOSLANECType() {
        return new POSLANECType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VYSLEDKYType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.volby.cz/ps/", name = "VYSLEDKY")
    public JAXBElement<VYSLEDKYType> createVYSLEDKY(VYSLEDKYType value) {
        return new JAXBElement<VYSLEDKYType>(_VYSLEDKY_QNAME, VYSLEDKYType.class, null, value);
    }

}
