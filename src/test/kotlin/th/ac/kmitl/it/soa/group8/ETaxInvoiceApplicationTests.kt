package th.ac.kmitl.it.soa.group8

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import th.ac.kmitl.it.soa.group8.model.ETaxInvoice
import com.google.gson.Gson
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath

@RunWith(SpringJUnit4ClassRunner::class)
class ETaxInvoiceApplicationTests {
    private val mockMvc: MockMvc? = null

    @Test
    @Throws(Exception::class)
    fun getETaxInvoice() {
        mockMvc?.perform(get("/etaxinvoice/"))?.andExpect(status().isOk)
    }

    @Test
    @Throws(Exception::class)
    fun postETaxInvoice() {
        val buyer = "Montita"
        val buyerAddress = "Bangkok"
        val seller = "Beam"
        val sellerAddress = "Bangkok"
        val productList = "Milk"
        val totalBalance = 1000
        val eTaxInvoice = ETaxInvoice(
                buyer,
                buyerAddress,
                seller,
                sellerAddress,
                productList,
                totalBalance
        )
        val gson = Gson()
        val eTaxInvoiceForm = gson.toJson(eTaxInvoice)
        mockMvc?.perform(post("/etaxinvoice/").contentType(APPLICATION_JSON)
                .content(eTaxInvoiceForm))?.andExpect(status().isOk)?.andExpect(jsonPath("$.data").value(eTaxInvoiceForm))
    }

}
