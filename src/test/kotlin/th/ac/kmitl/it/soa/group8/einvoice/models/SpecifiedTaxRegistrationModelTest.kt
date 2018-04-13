package th.ac.kmitl.it.soa.group8.einvoice.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group8.einvoice.model.SpecifiedTaxRegistrationModel

class SpecifiedTaxRegistrationModelTest {
    val taxID: String = "1234567890123"
    val specifiedTaxRegistration = SpecifiedTaxRegistrationModel(
            this.taxID
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.taxID, specifiedTaxRegistration.taxID)

    }
}
