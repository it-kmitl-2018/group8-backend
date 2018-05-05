package th.ac.kmitl.it.soa.group8.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group8.model.EmailXMLConverter

class EmailXMLConverterTest {
    val uriID: String = "58070114@kmitl.ac.th"
    val emailURIUniversal = EmailXMLConverter(
            this.uriID
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.uriID, emailURIUniversal.uriID)

    }

}
