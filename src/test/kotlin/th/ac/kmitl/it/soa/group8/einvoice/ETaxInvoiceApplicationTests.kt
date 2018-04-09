package th.ac.kmitl.it.soa.group8.einvoice

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*

@RunWith(SpringJUnit4ClassRunner::class)
class ETaxInvoiceApplicationTests {
    val mockMvc: MockMvc? = null

    @Test
    @Throws(Exception::class)
    fun getETaxInvoice() {
        mockMvc?.perform(get("/etaxinvoice/"))?.andExpect(status().isOk)
    }
    @Test
    @Throws(Exception::class)
    fun postETaxInvoice() {
        mockMvc?.perform(post("/etaxinvoice/"))?.andExpect(status().isOk)
    }

}
