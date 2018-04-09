package th.ac.kmitl.it.soa.group8.einvoice.converter

import java.io.File
import java.io.IOException
import com.fasterxml.jackson.core.JsonGenerationException
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.ObjectMapper
import th.ac.kmitl.it.soa.group8.einvoice.model.ETaxInvoice

open class JsonConverter (){
    @Throws(JsonGenerationException::class, JsonMappingException::class, IOException::class)
    fun convertObjectToJson(`object`: Any) {
        val mapper = ObjectMapper()
        mapper.writeValue(System.out, `object`)
        val jsonString = mapper.writeValueAsString(`object`)
        mapper.writeValue(File("tax_invoice.json"), `object`)
    }

    fun convertJsontoObject(): ETaxInvoice {
        val mapper = ObjectMapper()
        val tax = mapper.readValue(File("tax_invoice.json"), ETaxInvoice::class.java)
        return tax
    }
}