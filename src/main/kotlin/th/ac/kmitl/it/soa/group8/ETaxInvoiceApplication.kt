//Spring boot example, Will not use this file
package th.ac.kmitl.it.soa.group8

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
class ETaxInvoiceApplication

    fun main(args: Array<String>) {
        SpringApplication.run(ETaxInvoiceApplication::class.java, *args)
    }
