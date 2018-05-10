package th.ac.kmitl.it.soa.group8.converter

import java.io.File
import java.io.IOException
import com.fasterxml.jackson.core.JsonGenerationException
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.ObjectMapper
import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser

import java.io.FileReader

open class JsonConverter (){
    @Throws(JsonGenerationException::class, JsonMappingException::class, IOException::class)
    fun convertObjectToJson(`object`: Any) {
        val mapper = ObjectMapper()
        mapper.writeValue(System.out, `object`)
        val jsonString = mapper.writeValueAsString(`object`)
        mapper.writeValue(File("tax_invoice.json"), `object`)

    }

    fun convertJsontoObject(text:String): String {
        val parser =  JSONParser()
        val ob = parser.parse(FileReader(text))
        val jsonObject = ob as JSONObject
        val person = ob.get("id").toString()
        return person
    }
}
