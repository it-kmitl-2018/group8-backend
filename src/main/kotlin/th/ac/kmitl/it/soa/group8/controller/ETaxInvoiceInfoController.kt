package th.ac.kmitl.it.soa.group8.controller

import com.google.gson.Gson
import org.springframework.web.bind.annotation.*
import th.ac.kmitl.it.soa.group8.model.ETaxInvoice

@RestController
class ETaxInvoiceInfoController {

    @GetMapping("/etaxinvoice")
    fun get(): ETaxInvoice {
        var invoiceFormModel = ETaxInvoice("Veronika Ilithyia", "123 New york", "Radhika Seetha", "54345 Thailand", "Car part",
                12345)
        return invoiceFormModel
    }

    @CrossOrigin(origins = ["http://localhost:8080"])
    @PostMapping("/etaxinvoice")
    @ResponseBody
    fun post(@RequestBody data: String): String {
        var gson = Gson()
        var invoiceForm = gson.fromJson(data, ETaxInvoice::class.java)
        System.out.println(data) //Print Frontend data to Backend console
        return gson.toJson(invoiceForm)
    }

}
