package th.ac.kmitl.it.soa.group8.controller

import com.google.gson.Gson
import org.springframework.web.bind.annotation.*
import th.ac.kmitl.it.soa.group8.model.ETaxInvoice
import th.ac.kmitl.it.soa.group8.model.Seller

@RequestMapping("/etax")
@RestController
class ETaxInvoiceInfoController {

    @CrossOrigin(origins = ["http://localhost:8080"])
    @PostMapping("/invoice")
    @ResponseBody
    fun post(@RequestBody data: Seller): Seller {
        System.out.println(data) //Print Frontend data to Backend console
        return data
    }

}
