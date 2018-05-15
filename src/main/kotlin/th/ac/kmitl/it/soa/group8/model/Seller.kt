package th.ac.kmitl.it.soa.group8.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Seller @JsonCreator constructor(
        @JsonProperty("id") val id: String,
        @JsonProperty("globalID") val globalID: String,
        @JsonProperty("name") val name: String,
        @JsonProperty("taxID") val taxID: String,
        @JsonProperty("personName") val personName: String,
        @JsonProperty("departmentName") val departmentName: String,
        @JsonProperty("email") val email: String,
        @JsonProperty("phoneNumber") val phoneNumber: String,
        @JsonProperty("postalCode") val postalCode: String,
        @JsonProperty("building") val building: String,
        @JsonProperty("addressLineOne") val addressLineOne: String,
        @JsonProperty("addressLineTwo") val addressLineTwo: String,
        @JsonProperty("addressLineThree") val addressLineThree: String,
        @JsonProperty("addressLineFour") val addressLineFour: String,
        @JsonProperty("addressLineFive") val addressLineFive: String,
        @JsonProperty("street") val street: String,
        @JsonProperty("district") val district: String,
        @JsonProperty("subDistrict") val subDistrict: String,
        @JsonProperty("countryID") val countryID: String,
        @JsonProperty("provinceID") val provinceID: String,
        @JsonProperty("houseNumber") val houseNumber: String
)