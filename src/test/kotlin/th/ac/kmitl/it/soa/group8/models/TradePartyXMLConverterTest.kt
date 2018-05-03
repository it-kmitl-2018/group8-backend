package th.ac.kmitl.it.soa.group8.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test
import th.ac.kmitl.it.soa.group8.model.TradePartyXMLConverter
import java.io.StringWriter
import javax.xml.bind.JAXBContext

class TradePartyXMLConverterTest {
    val id: String = "01"
    val globalID: String = "ABC123"
    val name: String = "Montita"
    val tradeParty = TradePartyXMLConverter(
            this.id,
            this.globalID,
            this.name
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.id, tradeParty.id)
        assertEquals(this.globalID, tradeParty.globalID)
        assertEquals(this.name, tradeParty.name)

    }

    @Test
    fun testGetXMLString() {
        val context = JAXBContext.newInstance(TradePartyXMLConverter::class.java)
        val marshaller = context.createMarshaller()
        val stringWriter = StringWriter()
        marshaller.marshal(tradeParty, stringWriter)
        val xmlString = stringWriter.toString()
        assertNotNull(xmlString)

    }

}
