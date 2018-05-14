package th.ac.kmitl.it.soa.group8.controller

import com.google.gson.Gson
import org.springframework.web.bind.annotation.*
import th.ac.kmitl.it.soa.group8.model.Seller

@RequestMapping("/etax")
@RestController
class ETaxInvoiceInfoController {

    @CrossOrigin(origins = ["http://localhost:8080"])
    @PostMapping("/invoice")
    fun post(@RequestBody data: String): String {
        var gson = Gson()
        var invoiceForm = gson.fromJson(data, ETaxInvoice::class.java)
        return gson.toJson(invoiceForm)
    }

}
