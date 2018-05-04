package th.ac.kmitl.it.soa.group8.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group8.model.TelephoneUniversalModel

class TelephoneUniversalModelTest {
    val phoneNumber: String = "0888888888"
    val telephoneUniversalModel = TelephoneUniversalModel(
            this.phoneNumber
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.phoneNumber, telephoneUniversalModel.phoneNumber)

    }
}
