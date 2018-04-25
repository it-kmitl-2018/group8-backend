package th.ac.kmitl.it.soa.group8.einvoice.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test
import th.ac.kmitl.it.soa.group8.e_tax_invoice.model.TaxRegistrationModel
import java.io.StringWriter
import javax.xml.bind.JAXBContext

class TaxRegistrationModelTest {
    val taxID: String = "1234567890123"
    val taxRegistration = TaxRegistrationModel(
            this.taxID
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.taxID, taxRegistration.taxID)

    }

    @Test
    fun testGetXMLString() {
        val context = JAXBContext.newInstance(TaxRegistrationModel::class.java)
        val marshaller = context.createMarshaller()
        val stringWriter = StringWriter()
        marshaller.marshal(taxRegistration, stringWriter)
        val xmlString = stringWriter.toString()
        assertNotNull(xmlString)

    }

}
