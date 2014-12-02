
package klijent;

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
 *         &lt;element name="ListaUpisanihStudenataZaKolegijResult" type="{http://tempuri.org/}ArrayOfStudent" minOccurs="0"/>
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
    "listaUpisanihStudenataZaKolegijResult"
})
@XmlRootElement(name = "ListaUpisanihStudenataZaKolegijResponse")
public class ListaUpisanihStudenataZaKolegijResponse {

    @XmlElement(name = "ListaUpisanihStudenataZaKolegijResult")
    protected ArrayOfStudent listaUpisanihStudenataZaKolegijResult;

    /**
     * Gets the value of the listaUpisanihStudenataZaKolegijResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStudent }
     *     
     */
    public ArrayOfStudent getListaUpisanihStudenataZaKolegijResult() {
        return listaUpisanihStudenataZaKolegijResult;
    }

    /**
     * Sets the value of the listaUpisanihStudenataZaKolegijResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStudent }
     *     
     */
    public void setListaUpisanihStudenataZaKolegijResult(ArrayOfStudent value) {
        this.listaUpisanihStudenataZaKolegijResult = value;
    }

}