
package com.rose.domain.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.rose.domain.publicservice.InvokeResult;


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
 *         &lt;element name="AddRoomTypesResult" type="{http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service}InvokeResult" minOccurs="0"/>
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
    "addRoomTypesResult"
})
@XmlRootElement(name = "AddRoomTypesResponse")
public class AddRoomTypesResponse {

    @XmlElementRef(name = "AddRoomTypesResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<InvokeResult> addRoomTypesResult;

    /**
     * Gets the value of the addRoomTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvokeResult }{@code >}
     *     
     */
    public JAXBElement<InvokeResult> getAddRoomTypesResult() {
        return addRoomTypesResult;
    }

    /**
     * Sets the value of the addRoomTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvokeResult }{@code >}
     *     
     */
    public void setAddRoomTypesResult(JAXBElement<InvokeResult> value) {
        this.addRoomTypesResult = ((JAXBElement<InvokeResult> ) value);
    }

}
