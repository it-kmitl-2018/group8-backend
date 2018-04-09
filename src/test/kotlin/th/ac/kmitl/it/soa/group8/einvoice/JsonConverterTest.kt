package th.ac.kmitl.it.soa.group8.einvoice

import junit.framework.Assert.assertEquals
import sun.plugin2.util.PojoUtil.toJson
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder.json
import org.assertj.core.api.Assertions
import org.junit.Test
import th.ac.kmitl.it.soa.group8.einvoice.converter.JsonConverter
import th.ac.kmitl.it.soa.group8.einvoice.model.ETaxInvoice


class JsonConverterTest {
    @Test
    fun jsonConverterTest() {
        val converter = JsonConverter()
        val taxInvoice = ETaxInvoice("Bob",
                "123 a road",
                "Peter",
                "456 rama 9 road",
                "product1",
                1200)
        converter.convertObjectToJson(taxInvoice)
        assertEquals(taxInvoice, converter.convertJsontoObject(taxInvoice))
    }
}