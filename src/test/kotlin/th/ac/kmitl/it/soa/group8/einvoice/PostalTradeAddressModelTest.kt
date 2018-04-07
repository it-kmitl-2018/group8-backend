package th.ac.kmitl.it.soa.group8.einvoice

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test
import th.ac.kmitl.it.soa.group8.einvoice.model.recipient.PostalTradeAddressModel
import java.io.StringWriter
import javax.xml.bind.JAXBContext

class PostalTradeAddressModelTest {

    val postCode: String = "10310"
    val buildingName: String = "Chaiyaporn1"
    val houseNumber: String = "99/2546"
    val suiteNumber: String = "Room 602 6th Floor"
    val soi: String = "Kekki Ngam1"
    val village: String = "Kekki"
    val moo: String = "3"
    val streetName: String = "Chalongkung"
    val cityName: String = "1017"
    val citySubDivisionName: String = "Latkrabang"
    val countryID: String = "TH"
    val countrySubDivisionID: String = "10"
    val buildingNumber: String = "3/34"
    val postalTradeAddressModel = PostalTradeAddressModel(
        this.postCode,
        this.buildingName,
        this.houseNumber,
        this.suiteNumber,
        this.soi,
        this.village,
        this.moo,
        this.streetName,
        this.cityName,
        this.citySubDivisionName,
        this.countryID,
        this.countrySubDivisionID,
        this.buildingNumber
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.postCode, postalTradeAddressModel.postCode)
        assertEquals(this.buildingName, postalTradeAddressModel.buildingName)
        assertEquals(this.houseNumber, postalTradeAddressModel.houseNumber)
        assertEquals(this.suiteNumber, postalTradeAddressModel.suiteNumber)
        assertEquals(this.soi, postalTradeAddressModel.soi)
        assertEquals(this.village, postalTradeAddressModel.village)
        assertEquals(this.moo, postalTradeAddressModel.moo)
        assertEquals(this.streetName, postalTradeAddressModel.streetName)
        assertEquals(this.cityName, postalTradeAddressModel.cityName)
        assertEquals(this.citySubDivisionName, postalTradeAddressModel.citySubDivisionName)
        assertEquals(this.countryID, postalTradeAddressModel.countryID)
        assertEquals(this.countrySubDivisionID, postalTradeAddressModel.countrySubDivisionID);
        assertEquals(this.buildingNumber, postalTradeAddressModel.buildingNumber);
    }

    @Test
    fun testGetXMLString(){
        val context = JAXBContext.newInstance(PostalTradeAddressModel::class.java!!)
        val marshaller = context.createMarshaller()
        val sw = StringWriter()
        marshaller.marshal(postalTradeAddressModel, sw)
        val xmlString = sw.toString()
        assertNotNull(xmlString)
    }

}
