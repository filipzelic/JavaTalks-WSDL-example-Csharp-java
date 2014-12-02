
package org.tempuri;

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
 *         &lt;element name="ListaSvihKolegijaResult" type="{http://tempuri.org/}ArrayOfKolegij" minOccurs="0"/>
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
    "listaSvihKolegijaResult"
})
@XmlRootElement(name = "ListaSvihKolegijaResponse")
public class ListaSvihKolegijaResponse {

    @XmlElement(name = "ListaSvihKolegijaResult")
    protected ArrayOfKolegij listaSvihKolegijaResult;

    /**
     * Gets the value of the listaSvihKolegijaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKolegij }
     *     
     */
    public ArrayOfKolegij getListaSvihKolegijaResult() {
        return listaSvihKolegijaResult;
    }

    /**
     * Sets the value of the listaSvihKolegijaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKolegij }
     *     
     */
    public void setListaSvihKolegijaResult(ArrayOfKolegij value) {
        this.listaSvihKolegijaResult = value;
    }

}
