package th.ac.kmitl.it.soa.group8


import java.io.IOException
import junit.framework.TestCase.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group8.converter.JsonConverter
import th.ac.kmitl.it.soa.group8.model.Seller

class JsonConverterTest {
    @Test
    fun convertJsontoObjectShouldReturnBob() {
        val converter = JsonConverter()
        val inputJson = "tax_invoice.json"
        val taxInvoice = Seller("Bob",
                "5678",
                "Peter",
                "1234",
                "0123",
                "customerService","abc@gmail.com","0111111",
                "a tower","1234 B road","4567 A road","a street",
                "prakanong","prakanong","012","456","123")
        assertEquals("Bob",converter.convertJsontoObject(inputJson ).get("id").toString())
    }

    @Test(expected = IOException::class)
    fun IoExceptionShouldReturnExceptionMessage() {
        val converter = JsonConverter()
        val inputJson = "abc.json"
        converter.convertJsontoObject(inputJson )
    }
}