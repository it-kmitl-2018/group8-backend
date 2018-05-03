package th.ac.kmitl.it.soa.group8.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test
import th.ac.kmitl.it.soa.group8.model.TradeContactXMLConverter
import java.io.StringWriter
import javax.xml.bind.JAXBContext

class TradeContactXMLConverterTest {
    val personName: String = "Montita"
    val departmentName: String = "Backend"
    val tradeContact = TradeContactXMLConverter(
            this.personName,
            this.departmentName
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.personName, tradeContact.personName)
        assertEquals(this.departmentName, tradeContact.departmentName)

    }

    @Test
    fun testGetXMLString() {
        val context = JAXBContext.newInstance(TradeContactXMLConverter::class.java)
        val marshaller = context.createMarshaller()
        val stringWriter = StringWriter()
        marshaller.marshal(tradeContact, stringWriter)
        val xmlString = stringWriter.toString()
        assertNotNull(xmlString)

    }
}
