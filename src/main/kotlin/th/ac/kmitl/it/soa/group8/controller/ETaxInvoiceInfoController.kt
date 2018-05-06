package th.ac.kmitl.it.soa.group8.controller

import com.google.gson.Gson
import org.springframework.web.bind.annotation.*
import th.ac.kmitl.it.soa.group8.model.ETaxInvoice

@RestController
@RequestMapping("/etaxinvoice")
class ETaxInvoiceInfoController {

    @GetMapping("/")
    fun get(): ETaxInvoice {
        var invoiceFormModel = ETaxInvoice("Veronika Ilithyia", "123 New york", "Radhika Seetha", "54345 Thailand", "Car part",
                12345)
        return invoiceFormModel
    }

    @PostMapping("/")
    @ResponseBody
    fun post(@RequestBody data: String): String {
        var gson = Gson()
        var invoiceForm = gson.fromJson(data, ETaxInvoice::class.java)
        return gson.toJson(invoiceForm)
    }

}
