package th.ac.kmitl.it.soa.group8.controller

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.web.servlet.MockMvc
import th.ac.kmitl.it.soa.group8.model.ETaxInvoice
import com.google.gson.Gson
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@RunWith(SpringJUnit4ClassRunner::class)
class ETaxInvoiceApplicationTests {
    private val mockMvc: MockMvc? = null

    @Test
    @Throws(Exception::class)
    fun postETaxInvoice() {
        val buyer = "Clyde"
        val buyerAddress = "Chiang mai"
        val seller = "Isaac"
        val sellerAddress = "Bangkok"
        val productList = "Chess"
        val totalBalance = 15000
        val eTaxInvoice = ETaxInvoice(
                buyer,
                buyerAddress,
                seller,
                sellerAddress,
                productList,
                totalBalance
        )
        val gson = Gson()
        val eTaxInvoiceForm = gson.toJson(eTaxInvoice) //Create json to sent to controller
        mockMvc?.perform(MockMvcRequestBuilders.post("/etaxinvoice/").contentType(MediaType.APPLICATION_JSON)
                .content(eTaxInvoiceForm))?.andExpect(MockMvcResultMatchers.status().isOk)?.andExpect(MockMvcResultMatchers.
                jsonPath("$.data").value(eTaxInvoiceForm))
    }

    @Test
    @Throws(Exception::class)
    fun getETaxInvoice() {
        mockMvc?.perform(MockMvcRequestBuilders.get("/etaxinvoice/"))?.andExpect(MockMvcResultMatchers.
                status().isOk)
    }

}
