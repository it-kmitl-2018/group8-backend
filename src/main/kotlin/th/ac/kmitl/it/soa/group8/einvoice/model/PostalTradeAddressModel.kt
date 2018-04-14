package th.ac.kmitl.it.soa.group8.einvoice.model

data class PostalTradeAddressModel(
        val postCode: String = "",
        val building: String = "",
        val addressLineOne: String = "",
        val addressLineTwo: String = "",
        val addressLineThree: String = "",
        val addressLineFour: String = "",
        val addressLineFive: String = "",
        val street: String = "",
        val district: String = "",
        val subDistrict: String = "",
        val countryID: String = "",
        val provinceID: String = "",
        val houseNumber: String = ""

)
