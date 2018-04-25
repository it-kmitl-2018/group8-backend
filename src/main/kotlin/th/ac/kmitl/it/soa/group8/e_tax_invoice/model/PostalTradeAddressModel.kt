package th.ac.kmitl.it.soa.group8.e_tax_invoice.model

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
        val building: String = "",

        @field:XmlElement(name = "ram:LineOne")
        val addressLineOne: String = "",

        @field:XmlElement(name = "ram:LineTwo")
        val addressLineTwo: String = "",

        @field:XmlElement(name = "ram:LineThree")
        val addressLineThree: String = "",

        @field:XmlElement(name = "ram:LineFour")
        val addressLineFour: String = "",

        @field:XmlElement(name = "ram:LineFive")
        val addressLineFive: String = "",

        @field:XmlElement(name = "ram:StreetName")
        val street: String = "",

        @field:XmlElement(name = "ram:CityName")
        val district: String = "",

        @field:XmlElement(name = "ram:CitySubDivisionName")
        val subDistrict: String = "",

        @field:XmlElement(name = "ram:CountryID")
        val countryID: String = "",

        @field:XmlElement(name = "ram:CountrySubDivisionID")
        val provinceID: String = "",

        @field:XmlElement(name = "ram:BuildingNumber")
        val houseNumber: String = ""

)
