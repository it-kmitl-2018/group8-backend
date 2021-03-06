package th.ac.kmitl.it.soa.group8.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group8.model.AssociatedDocumentModel

class AssociatedDocumentModelTest {
    val lineID: String = "1"
    val associatedDocumentModel = AssociatedDocumentModel(
            this.lineID
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.lineID, associatedDocumentModel.lineID)

    }

}
