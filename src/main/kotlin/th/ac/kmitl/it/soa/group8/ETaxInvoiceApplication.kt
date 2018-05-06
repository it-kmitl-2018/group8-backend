//Spring boot example, Will not use this file
package th.ac.kmitl.it.soa.group8

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
class ETaxInvoiceApplication

    fun main(args: Array<String>) {
        SpringApplication.run(ETaxInvoiceApplication::class.java, *args)
    }

    @Bean
    fun corsConfigurer(): Any {
        return object: WebMvcConfigurerAdapter() {
            override fun addCorsMappings(registry: CorsRegistry) {
                registry.addMapping("/api").allowedOrigins("http://localhost:8080")
            }
        }
    }
