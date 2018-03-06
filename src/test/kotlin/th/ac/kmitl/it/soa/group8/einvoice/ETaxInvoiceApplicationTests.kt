package th.ac.kmitl.it.soa.group8.einvoice

import org.junit.Test
import org.junit.runner.RunWith
import org.openqa.selenium.chrome.ChromeDriver
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import java.net.URL

@RunWith(SpringJUnit4ClassRunner::class)
class ETaxInvoiceApplicationTests {
    @Test
    fun testHomeController() {
        val webDriver = ChromeDriver()
        webDriver.navigate().to(URL("http://localhost:8888/home/hello"))
        Thread.sleep(5000)
        webDriver.quit()
    }

}
