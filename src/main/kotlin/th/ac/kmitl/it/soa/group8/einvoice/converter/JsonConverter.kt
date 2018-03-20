package th.ac.kmitl.it.soa.group8.einvoice.converter

import java.io.File
import java.io.IOException
import com.fasterxml.jackson.core.JsonGenerationException
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.ObjectMapper

open class JsonConverter (mapper:ObjectMapper){
    @Throws(JsonGenerationException::class, JsonMappingException::class, IOException::class)
    fun convertObjectToJson(`object`: Any) {
        val mapper = ObjectMapper()
        mapper.writeValue(System.out, `object`)
        val jsonString = mapper.writeValueAsString(`object`)
        mapper.writeValue(File("tax_invoice.json"), `object`)
    }
}