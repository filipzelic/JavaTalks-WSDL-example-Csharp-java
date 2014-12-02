
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
 *         &lt;element name="ListaUpisanihKolegijaZaStudentaResult" type="{http://tempuri.org/}ArrayOfKolegij" minOccurs="0"/>
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
    "listaUpisanihKolegijaZaStudentaResult"
})
@XmlRootElement(name = "ListaUpisanihKolegijaZaStudentaResponse")
public class ListaUpisanihKolegijaZaStudentaResponse {

    @XmlElement(name = "ListaUpisanihKolegijaZaStudentaResult")
    protected ArrayOfKolegij listaUpisanihKolegijaZaStudentaResult;

    /**
     * Gets the value of the listaUpisanihKolegijaZaStudentaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKolegij }
     *     
     */
    public ArrayOfKolegij getListaUpisanihKolegijaZaStudentaResult() {
        return listaUpisanihKolegijaZaStudentaResult;
    }

    /**
     * Sets the value of the listaUpisanihKolegijaZaStudentaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKolegij }
     *     
     */
    public void setListaUpisanihKolegijaZaStudentaResult(ArrayOfKolegij value) {
        this.listaUpisanihKolegijaZaStudentaResult = value;
    }

}
