package th.ac.kmitl.it.soa.group8.converter

import java.io.File
import java.io.IOException
import com.fasterxml.jackson.core.JsonGenerationException
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.ObjectMapper
import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser
import th.ac.kmitl.it.soa.group8.model.Seller
import java.io.FileReader

open class JsonConverter (){
    @Throws(JsonGenerationException::class, JsonMappingException::class, IOException::class)
    fun convertObjectToJson(`object`: Any) {
        val mapper = ObjectMapper()
        mapper.writeValue(System.out, `object`)
        val jsonString = mapper.writeValueAsString(`object`)
        mapper.writeValue(File("tax_invoice.json"), `object`)

    }

    fun convertJsontoObject(text:String): JSONObject {
        val parser =  JSONParser()
        val getJson = parser.parse(FileReader(text))
        val person = getJson as JSONObject
        return person
    }
}