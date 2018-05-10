package th.ac.kmitl.it.soa.group8.einvoice


import java.io.IOException
import junit.framework.TestCase.assertEquals
import sun.plugin2.util.PojoUtil.toJson
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder.json
import org.assertj.core.api.Assertions
import org.junit.Test
import th.ac.kmitl.it.soa.group8.einvoice.converter.JsonConverter
import th.ac.kmitl.it.soa.group8.einvoice.model.ETaxInvoice
import java.util.ArrayList




class JsonConverterTest {
    @Test
    fun convertJsontoObject_ShouldReturnBob() {
        val converter = JsonConverter()
        val input_json = "tax_invoice.json"
        val taxInvoice = ETaxInvoice("Bob",
                "123 a road",
                "Peter",
                "456 rama 9 road",
                "product1",
                1200)
        assertEquals("Bob",converter.convertJsontoObject(input_json ))
    }

    @Test(expected = IOException::class)
    fun IoException_ShouldReturnExceptionMessage() {
        val converter = JsonConverter()
        val input_json = "abc.json"
        converter.convertJsontoObject(input_json )
    }


}