package th.ac.kmitl.it.soa.group8.einvoice.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test
import th.ac.kmitl.it.soa.group8.einvoice.model.TradeContactModel
import java.io.StringWriter
import javax.xml.bind.JAXBContext

class TradeContactModelTest {
    val personName: String = "Montita"
    val departmentName: String = "Backend"
    val tradeContactModel = TradeContactModel(
            this.personName,
            this.departmentName
    )

    @Test
    fun testGetAllInfo() {
        assertEquals(this.personName, tradeContactModel.personName)
        assertEquals(this.departmentName, tradeContactModel.departmentName)

    }

    @Test
    fun testGetXMLString() {
        val context = JAXBContext.newInstance(TradeContactModel::class.java)
        val marshaller = context.createMarshaller()
        val stringWriter = StringWriter()
        marshaller.marshal(tradeContactModel, stringWriter)
        val xmlString = stringWriter.toString()
        assertNotNull(xmlString)

    }
}
