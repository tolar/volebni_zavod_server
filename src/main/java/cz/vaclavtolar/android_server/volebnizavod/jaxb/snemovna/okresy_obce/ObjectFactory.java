
package cz.vaclavtolar.android_server.volebnizavod.jaxb.snemovna.okresy_obce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xxx package. 
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

    private final static QName _CHYBA_QNAME = new QName("http://www.volby.cz/ps/", "CHYBA");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xxx
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OBEC }
     * 
     */
    public OBEC createOBEC() {
        return new OBEC();
    }

    /**
     * Create an instance of {@link UCAST }
     * 
     */
    public UCAST createUCAST() {
        return new UCAST();
    }

    /**
     * Create an instance of {@link HLASYSTRANA }
     * 
     */
    public HLASYSTRANA createHLASYSTRANA() {
        return new HLASYSTRANA();
    }

    /**
     * Create an instance of {@link OKRES }
     * 
     */
    public OKRES createOKRES() {
        return new OKRES();
    }

    /**
     * Create an instance of {@link VYSLEDKYOKRES }
     * 
     */
    public VYSLEDKYOKRES createVYSLEDKYOKRES() {
        return new VYSLEDKYOKRES();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.volby.cz/ps/", name = "CHYBA")
    public JAXBElement<String> createCHYBA(String value) {
        return new JAXBElement<String>(_CHYBA_QNAME, String.class, null, value);
    }

}
