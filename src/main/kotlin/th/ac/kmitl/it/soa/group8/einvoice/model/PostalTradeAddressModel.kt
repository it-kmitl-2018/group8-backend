package th.ac.kmitl.it.soa.group8.einvoice.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement
import com.google.gson.annotations.SerializedName

@XmlRootElement(name = "ram:PostalTradeAddress")
@XmlAccessorType(XmlAccessType.FIELD)
data class PostalTradeAddressModel(

        @field:XmlElement(name = "ram:PostcodeCode")
        @SerializedName("Postcode")
        val postCode: String = "",

        @field:XmlElement(name = "ram:BuildingName")
        @SerializedName("BuildingName")
        val building: String = "",

        @field:XmlElement(name = "ram:LineOne")
        @SerializedName("LineOne")
        val addressLineOne: String = "",

        @field:XmlElement(name = "ram:LineTwo")
        @SerializedName("LineTwo")
        val addressLineTwo: String = "",

        @field:XmlElement(name = "ram:LineThree")
        @SerializedName("LineThree")
        val addressLineThree: String = "",

        @field:XmlElement(name = "ram:LineFour")
        @SerializedName("LineFour")
        val addressLineFour: String = "",

        @field:XmlElement(name = "ram:LineFive")
        @SerializedName("LineFive")
        val addressLineFive: String = "",

        @field:XmlElement(name = "ram:StreetName")
        @SerializedName("StreetName")
        val street: String = "",

        @field:XmlElement(name = "ram:CityName")
        @SerializedName("CityName")
        val district: String = "",

        @field:XmlElement(name = "ram:CitySubDivisionName")
        @SerializedName("CitySubDivisionName")
        val subDistrict: String = "",

        @field:XmlElement(name = "ram:CountryID")
        @SerializedName("CountryID")
        val countryID: String = "",

        @field:XmlElement(name = "ram:CountrySubDivisionID")
        @SerializedName("CountrySubDivisionID")
        val provinceID: String = "",

        @field:XmlElement(name = "ram:BuildingNumber")
        @SerializedName("BuildingNumber")
        val houseNumber: String = ""

)
