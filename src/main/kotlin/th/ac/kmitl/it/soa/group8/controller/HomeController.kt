package th.ac.kmitl.it.soa.group8.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeController {

    @GetMapping("/hello")
    fun home(): String {
        return "Hello, world"
    }

}