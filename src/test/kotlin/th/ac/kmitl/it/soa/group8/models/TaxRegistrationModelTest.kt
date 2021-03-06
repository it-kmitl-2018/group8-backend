package th.ac.kmitl.it.soa.group8.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group8.model.TaxRegistrationModel

class TaxRegistrationModelTest {
    val taxID: String = "1234567890123"
    val taxRegistration = TaxRegistrationModel(
            this.taxID
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.taxID, taxRegistration.taxID)

    }
}
