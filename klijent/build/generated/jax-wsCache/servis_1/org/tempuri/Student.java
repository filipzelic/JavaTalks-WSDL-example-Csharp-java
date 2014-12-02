
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Student complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Student">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDStudent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prezime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JMBG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="godStudija" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student", propOrder = {
    "idStudent",
    "ime",
    "prezime",
    "jmbg",
    "godStudija"
})
public class Student {

    @XmlElement(name = "IDStudent")
    protected int idStudent;
    @XmlElement(name = "Ime")
    protected String ime;
    @XmlElement(name = "Prezime")
    protected String prezime;
    @XmlElement(name = "JMBG")
    protected String jmbg;
    protected int godStudija;

    /**
     * Gets the value of the idStudent property.
     * 
     */
    public int getIDStudent() {
        return idStudent;
    }

    /**
     * Sets the value of the idStudent property.
     * 
     */
    public void setIDStudent(int value) {
        this.idStudent = value;
    }

    /**
     * Gets the value of the ime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIme() {
        return ime;
    }

    /**
     * Sets the value of the ime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIme(String value) {
        this.ime = value;
    }

    /**
     * Gets the value of the prezime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * Sets the value of the prezime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrezime(String value) {
        this.prezime = value;
    }

    /**
     * Gets the value of the jmbg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJMBG() {
        return jmbg;
    }

    /**
     * Sets the value of the jmbg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJMBG(String value) {
        this.jmbg = value;
    }

    /**
     * Gets the value of the godStudija property.
     * 
     */
    public int getGodStudija() {
        return godStudija;
    }

    /**
     * Sets the value of the godStudija property.
     * 
     */
    public void setGodStudija(int value) {
        this.godStudija = value;
    }

}
