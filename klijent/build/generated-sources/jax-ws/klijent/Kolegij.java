
package klijent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Kolegij complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Kolegij">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDKolegij" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Naziv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nositelj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ECTS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kolegij", propOrder = {
    "idKolegij",
    "naziv",
    "nositelj",
    "ects"
})
public class Kolegij {

    @XmlElement(name = "IDKolegij")
    protected int idKolegij;
    @XmlElement(name = "Naziv")
    protected String naziv;
    @XmlElement(name = "Nositelj")
    protected String nositelj;
    @XmlElement(name = "ECTS")
    protected int ects;

    /**
     * Gets the value of the idKolegij property.
     * 
     */
    public int getIDKolegij() {
        return idKolegij;
    }

    /**
     * Sets the value of the idKolegij property.
     * 
     */
    public void setIDKolegij(int value) {
        this.idKolegij = value;
    }

    /**
     * Gets the value of the naziv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Sets the value of the naziv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaziv(String value) {
        this.naziv = value;
    }

    /**
     * Gets the value of the nositelj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNositelj() {
        return nositelj;
    }

    /**
     * Sets the value of the nositelj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNositelj(String value) {
        this.nositelj = value;
    }

    /**
     * Gets the value of the ects property.
     * 
     */
    public int getECTS() {
        return ects;
    }

    /**
     * Sets the value of the ects property.
     * 
     */
    public void setECTS(int value) {
        this.ects = value;
    }

    public String toString(){
        return this.getNaziv();
    }
}
