package th.ac.kmitl.it.soa.group8.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test
import th.ac.kmitl.it.soa.group8.model.EmailXMLConverter
import java.io.StringWriter
import javax.xml.bind.JAXBContext

class EmailXMLConverterTest {
    val uriID: String = "58070114@kmitl.ac.th"
    val email = EmailXMLConverter(
            this.uriID
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.uriID, email.uriID)

    }

    @Test
    fun testGetXMLString() {
        val context = JAXBContext.newInstance(EmailXMLConverter::class.java)
        val marshaller = context.createMarshaller()
        val stringWriter = StringWriter()
        marshaller.marshal(email, stringWriter)
        val xmlString = stringWriter.toString()
        assertNotNull(xmlString)

    }

}
