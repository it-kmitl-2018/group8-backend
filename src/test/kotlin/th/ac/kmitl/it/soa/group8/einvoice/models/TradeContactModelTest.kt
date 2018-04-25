package th.ac.kmitl.it.soa.group8.einvoice.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group8.model.TradeContactModel

class TradeContactModelTest {
    val personName: String = "Montita"
    val departmentName: String = "Backend"
    val tradeContactModel = TradeContactModel(
            this.personName,
            this.departmentName
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.personName, tradeContactModel.personName)
        assertEquals(this.departmentName, tradeContactModel.departmentName)

    }
}
