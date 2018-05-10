package th.ac.kmitl.it.soa.group8.einvoice


import java.io.IOException
import junit.framework.TestCase.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group8.einvoice.converter.JsonConverter
import th.ac.kmitl.it.soa.group8.model.Seller




class JsonConverterTest {
    @Test
    fun convertJsontoObject_ShouldReturnBob() {
        val converter = JsonConverter()
        val input_json = "tax_invoice.json"
        val taxInvoice = Seller("Bob",
                "5678",
                "Peter",
                "1234",
                "0123",
                "customerService","abc@gmail.com","0111111",
                "a tower","1234 B road","4567 A road","a street",
                "prakanong","prakanong","012","456","123")
        assertEquals("Bob",converter.convertJsontoObject(input_json ))
    }

    @Test(expected = IOException::class)
    fun IoException_ShouldReturnExceptionMessage() {
        val converter = JsonConverter()
        val input_json = "abc.json"
        converter.convertJsontoObject(input_json )
    }


}