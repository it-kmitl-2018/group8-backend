package th.ac.kmitl.it.soa.group8.einvoice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import th.ac.kmitl.it.soa.group8.einvoice.service.ExampleService

@RestController
@RequestMapping("ExampleService")
class ExampleController {

    lateinit var demoService: ExampleService
    @GetMapping("/string")
    fun helloString() = "Hello world"
    @GetMapping("/service")
    fun demoService() = demoService.getHello()
}
