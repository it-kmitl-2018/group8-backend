package th.ac.kmitl.it.soa.group8.einvoice.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group8.e_tax_invoice.model.TradePartyModel

class TradePartyModelTest {
    val id: String = "01"
    val globalID: String = "ABC123"
    val name: String = "Montita"
    val tradePartyModel = TradePartyModel(
            this.id,
            this.globalID,
            this.name
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.id, tradePartyModel.id)
        assertEquals(this.globalID, tradePartyModel.globalID)
        assertEquals(this.name, tradePartyModel.name)

    }
}
