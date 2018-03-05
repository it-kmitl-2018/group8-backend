//Spring boot example, Will not use this file
package th.ac.kmitl.it.soa.group8.einvoice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
class EInvoiceApp

    fun main(args: Array<String>) {
        SpringApplication.run(EInvoiceApp::class.java, *args)
    }
