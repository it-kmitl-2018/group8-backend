package th.ac.kmitl.it.soa.group8.einvoice.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group8.einvoice.model.TradeProductModel

class TradeProductModelTest {
    val id: String = "01"
    val globalID: String = "ABC123"
    val name: String = "MacBook"
    val description: String = "This is a MacBookPro"
    val tradeProductModel = TradeProductModel(
            this.id,
            this.globalID,
            this.name,
            this.description
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.id, tradeProductModel.id)
        assertEquals(this.globalID, tradeProductModel.globalID)
        assertEquals(this.name, tradeProductModel.name)
        assertEquals(this.description, tradeProductModel.description)

    }
}
