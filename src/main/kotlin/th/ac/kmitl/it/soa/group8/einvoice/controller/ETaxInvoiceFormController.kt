package th.ac.kmitl.it.soa.group8.einvoice.controller

import com.google.gson.Gson
import org.springframework.web.bind.annotation.*
import th.ac.kmitl.it.soa.group8.einvoice.model.ETaxInvoiceFormModel

@RestController
@RequestMapping("/etaxinvoiceform")
class ETaxInvoiceFormController {

    @GetMapping("/")
    fun getETaxInvoiceForm(): ETaxInvoiceFormModel {
        var invoiceFormModel = ETaxInvoiceFormModel(1, "Montita", "ABC", "05/03/2661 16:48", "For test project",
                "PP001", 123, "05/03/2561 16:48")
        return invoiceFormModel
    }

    @PostMapping("/")
    @ResponseBody
    fun postETaxInvoiceForm(@RequestBody data: String): String {
        var gson = Gson()
        var invoiceForm = gson.fromJson(data, ETaxInvoiceFormModel::class.java)
        return gson.toJson(invoiceForm)
    }

}