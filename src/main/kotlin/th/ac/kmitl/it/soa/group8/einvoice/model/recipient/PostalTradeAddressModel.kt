package th.ac.kmitl.it.soa.group8.einvoice.model.recipient

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement(name = "ram:PostalTradeAddress")
@XmlAccessorType(XmlAccessType.FIELD)
data class PostalTradeAddressModel(
    @field:XmlElement(name = "ram:PostcodeCode")
    val postCode: String = "",
    @field:XmlElement(name = "ram:BuildingName")
    val buildingName: String = "",
    @field:XmlElement(name = "ram:LineOne")
    val houseNumber: String = "",
    @field:XmlElement(name = "ram:LineTwo")
    val suiteNumber: String = "",
    @field:XmlElement(name = "ram:LineThree")
    val soi: String = "",
    @field:XmlElement(name = "ram:LineFour")
    val village: String = "",
    @field:XmlElement(name = "ram:LineFive")
    val moo: String = "",
    @field:XmlElement(name = "ram:StreetName")
    val streetName: String = "",
    @field:XmlElement(name = "ram:CityName")
    val cityName: String = "",
    @field:XmlElement(name = "ram:CitySubDivisionName")
    val citySubDivisionName: String = "",
    @field:XmlElement(name = "ram:CountryID")
    val countryID: String = "",
    @field:XmlElement(name = "ram:CountrySubDivisionID")
    val countrySubDivisionID: String = "",
    @field:XmlElement(name = "ram:BuildingNumber")
    val buildingNumber: String = ""
)
