package th.ac.kmitl.it.soa.group8.einvoice.controller

import com.google.gson.Gson
import org.springframework.web.bind.annotation.*
import th.ac.kmitl.it.soa.group8.einvoice.model.ETaxInvoice

@RestController
@RequestMapping("/etaxinvoice")
class ETaxInvoiceInfoController {

    @GetMapping("/")
    fun get(): ETaxInvoice {
        var invoiceFormModel = ETaxInvoice("0", "0", "Example", "Unknown", "05/03/2661 12:30",
                "Unknown", "0", "0", "06/03/2661 12:00", "", "")
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