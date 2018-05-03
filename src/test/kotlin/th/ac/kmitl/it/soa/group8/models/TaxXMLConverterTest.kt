package th.ac.kmitl.it.soa.group8.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test
import th.ac.kmitl.it.soa.group8.model.TaxXMLConverter
import java.io.StringWriter
import javax.xml.bind.JAXBContext

class TaxXMLConverterTest {
    val taxID: String = "1234567890123"
    val taxXMLConverter = TaxXMLConverter(
            this.taxID
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.taxID, taxXMLConverter.taxID)

    }

    @Test
    fun testGetXMLString() {
        val context = JAXBContext.newInstance(TaxXMLConverter::class.java)
        val marshaller = context.createMarshaller()
        val stringWriter = StringWriter()
        marshaller.marshal(taxXMLConverter, stringWriter)
        val xmlString = stringWriter.toString()
        assertNotNull(xmlString)

    }

}
