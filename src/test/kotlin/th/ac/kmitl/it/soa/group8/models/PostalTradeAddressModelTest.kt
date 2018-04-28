package th.ac.kmitl.it.soa.group8.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test
import th.ac.kmitl.it.soa.group8.model.PostalTradeAddressModel
import java.io.StringWriter
import javax.xml.bind.JAXBContext

class PostalTradeAddressModelTest {

    private val postCode: String = "10310"
    private val building: String = "Chaiyaporn1"
    private val addressLineOne: String = "99/2546"
    private val addressLineTwo: String = "Room 602 6th Floor"
    private val addressLineThree: String = "Kekki Ngam1"
    private val addressLineFour: String = "Kekki"
    private val addressLineFive: String = "3"
    private val street: String = "Chalongkung"
    private val district: String = "1017"
    private val subDistrict: String = "Latkrabang"
    private val countryID: String = "TH"
    private val provinceID: String = "10"
    private val houseNumber: String = "3/34"
    private val postalTradeAddressModel = PostalTradeAddressModel(
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
        assertEquals(this.provinceID, postalTradeAddressModel.provinceID)
        assertEquals(this.houseNumber, postalTradeAddressModel.houseNumber)
    }

    @Test
    fun testGetXMLString() {
        val context = JAXBContext.newInstance(PostalTradeAddressModel::class.java)
        val marshaller = context.createMarshaller()
        val stringWriter = StringWriter()
        marshaller.marshal(postalTradeAddressModel, stringWriter)
        val xmlString = stringWriter.toString()
        assertNotNull(xmlString)
    }

}
