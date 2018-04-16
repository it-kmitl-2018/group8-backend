package th.ac.kmitl.it.soa.group8.einvoice.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import th.ac.kmitl.it.soa.group8.einvoice.model.IncludedNoteModel

@RunWith(SpringJUnit4ClassRunner::class)
class IncludedNoteModelTest {
    val subject: String = "หัวข้อ"
    val content: String = "เนื้อหา"
    val includedNoteModel = IncludedNoteModel(
            this.subject,
            this.content
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.subject, includedNoteModel.subject)
        assertEquals(this.content, includedNoteModel.content)

    }
}
