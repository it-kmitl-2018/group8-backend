package th.ac.kmitl.it.soa.group8.prototype.converters

import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import javax.xml.transform.stream.StreamResult
import javax.xml.transform.stream.StreamSource
import org.springframework.oxm.Marshaller
import org.springframework.oxm.Unmarshaller
import th.ac.kmitl.it.soa.group8.prototype.models.ETaxInvoiceFormModel

class XMLConverter (var tax: ETaxInvoiceFormModel){
    fun convertFromObjectToXML(tax: ETaxInvoiceFormModel){
        //
    }

}