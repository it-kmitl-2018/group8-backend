package th.ac.kmitl.it.soa.group8.einvoice.model

data class PostalTradeAddressModel(
        val postCode: String = "",
        val buildingName: String = "",
        val houseNumber: String = "",
        val suiteNumber: String = "",
        val soi: String = "",
        val village: String = "",
        val moo: String = "",
        val streetName: String = "",
        val cityName: String = "",
        val citySubDivisionName: String = "",
        val countryID: String = "",
        val countrySubDivisionID: String = "",
        val buildingNumber: String = ""

)
