package th.ac.kmitl.it.soa.group8.einvoice.models

import junit.framework.TestCase.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group8.e_tax_invoice.model.Seller

class SellerTest {
    @Test
    fun sellerTest(){
        val seller = Seller("3456", "1234", "Peter", "5678",
                "Bob", "customerService", "abc@gmail.co.th",
                "022222222", "A building", "123 b road",
                "234 bangkok", "rama 4", "Prakanong", "Prakanong",
                "234", "112", "890")
        assertEquals("3456",seller.id)
        assertEquals("1234",seller.globalID)
        assertEquals("Peter",seller.name)
        assertEquals("5678",seller.taxID)
        assertEquals("Bob",seller.contactName)
        assertEquals("customerService",seller.departmentName)
        assertEquals("abc@gmail.co.th",seller.email)
        assertEquals("022222222",seller.phoneNumber)
        assertEquals("A building",seller.building)
        assertEquals("123 b road",seller.addressOne)
        assertEquals("234 bangkok",seller.addressTwo)
        assertEquals("rama 4",seller.street)
        assertEquals("Prakanong",seller.district)
        assertEquals("Prakanong",seller.subDistrict)
        assertEquals("234",seller.countryID)
        assertEquals("112",seller.provinceID)
        assertEquals("890",seller.houseNumber)
    }
}