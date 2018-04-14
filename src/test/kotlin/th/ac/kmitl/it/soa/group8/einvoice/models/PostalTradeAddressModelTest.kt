package th.ac.kmitl.it.soa.group8.einvoice.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group8.einvoice.model.PostalTradeAddressModel

class PostalTradeAddressModelTest {
    val postCode: String = "10310"
    val building: String = "Chaiyaporn1"
    val addressLineOne: String = "99/2546"
    val addressLineTwo: String = "Room 602 6th Floor"
    val addressLineThree: String = "Kekki Ngam1"
    val addressLineFour: String = "Kekki"
    val addressLineFive: String = "3"
    val street: String = "Chalongkung"
    val district: String = "1017"
    val subDistrict: String = "Latkrabang"
    val countryID: String = "TH"
    val provinceID: String = "10"
    val houseNumber: String = "3/34"
    val postalTradeAddressModel = PostalTradeAddressModel(
            this.postCode,
            this.building,
            this.addressLineOne,
            this.addressLineTwo,
            this.addressLineThree,
            this.addressLineFour,
            this.addressLineFive,
            this.street,
            this.district,
            this.subDistrict,
            this.countryID,
            this.provinceID,
            this.houseNumber
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.postCode, postalTradeAddressModel.postCode)
        assertEquals(this.building, postalTradeAddressModel.building)
        assertEquals(this.addressLineOne, postalTradeAddressModel.addressLineOne)
        assertEquals(this.addressLineTwo, postalTradeAddressModel.addressLineTwo)
        assertEquals(this.addressLineThree, postalTradeAddressModel.addressLineThree)
        assertEquals(this.addressLineFour, postalTradeAddressModel.addressLineFour)
        assertEquals(this.addressLineFive, postalTradeAddressModel.addressLineFive)
        assertEquals(this.street, postalTradeAddressModel.street)
        assertEquals(this.district, postalTradeAddressModel.district)
        assertEquals(this.subDistrict, postalTradeAddressModel.subDistrict)
        assertEquals(this.countryID, postalTradeAddressModel.countryID)
        assertEquals(this.provinceID, postalTradeAddressModel.provinceID);
        assertEquals(this.houseNumber, postalTradeAddressModel.houseNumber);
    }

}
