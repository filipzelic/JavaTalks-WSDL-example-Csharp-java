
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="kolegijID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "kolegijID"
})
@XmlRootElement(name = "ListaUpisanihStudenataZaKolegij")
public class ListaUpisanihStudenataZaKolegij {

    protected int kolegijID;

    /**
     * Gets the value of the kolegijID property.
     * 
     */
    public int getKolegijID() {
        return kolegijID;
    }

    /**
     * Sets the value of the kolegijID property.
     * 
     */
    public void setKolegijID(int value) {
        this.kolegijID = value;
    }

}
