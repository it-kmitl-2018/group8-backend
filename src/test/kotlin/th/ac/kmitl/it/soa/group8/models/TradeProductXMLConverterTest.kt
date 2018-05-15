package th.ac.kmitl.it.soa.group8.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import junit.framework.Assert
import org.junit.Test
import th.ac.kmitl.it.soa.group8.model.TradePartyXMLConverter
import th.ac.kmitl.it.soa.group8.model.TradeProductXMLConverter
import java.io.StringWriter
import javax.xml.bind.JAXBContext

class TradeProductXMLConverterTest {
    val id: String = "00"
    val globalID: String = "P101"
    val name: String = "Rice"
    val description: String = "Main thai export product"
    val tradeProduct = TradeProductXMLConverter(
            this.id,
            this.globalID,
            this.name,
            this.description
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.id, tradeProduct.id)
        assertEquals(this.globalID, tradeProduct.globalID)
        assertEquals(this.name, tradeProduct.name)
        assertEquals(this.description, tradeProduct.description)

    }

    @Test
    fun testGetXMLString() {
        val context = JAXBContext.newInstance(TradeProductXMLConverter::class.java)
        val marshaller = context.createMarshaller()
        val stringWriter = StringWriter()
        marshaller.marshal(tradeProduct, stringWriter)
        val xmlString = stringWriter.toString()
        Assert.assertNotNull(xmlString)

    }

}