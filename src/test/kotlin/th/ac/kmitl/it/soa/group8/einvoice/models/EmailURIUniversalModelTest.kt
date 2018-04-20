package th.ac.kmitl.it.soa.group8.einvoice.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group8.einvoice.model.EmailURIUniversalModel

class EmailURIUniversalModelTest {
    val uriID: String = "58070114@kmitl.ac.th"
    val emailURIUniversal = EmailURIUniversalModel(
            this.uriID
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.uriID, emailURIUniversal.uriID)

    }

}
