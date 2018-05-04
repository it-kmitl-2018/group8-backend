package th.ac.kmitl.it.soa.group8.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import th.ac.kmitl.it.soa.group8.model.IncludedNoteXMLConverter
import java.io.StringWriter
import javax.xml.bind.JAXBContext

@RunWith(SpringJUnit4ClassRunner::class)
class IncludedNoteXMLConverterTest {
    private val subject: String = "หัวข้อ"
    private val content: String = "เนื้อหา"
    private val includedNote = IncludedNoteXMLConverter(
            this.subject,
            this.content
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.subject, includedNote.subject)
        assertEquals(this.content, includedNote.content)

    }
    @Test
    fun testGetXMLString() {
        val context = JAXBContext.newInstance(IncludedNoteXMLConverter::class.java)
        val marshaller = context.createMarshaller()
        val stringWriter = StringWriter()
        marshaller.marshal(includedNote, stringWriter)
        val xmlString = stringWriter.toString()
        assertNotNull(xmlString)

    }
}
