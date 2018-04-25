package th.ac.kmitl.it.soa.group8.e_tax_invoice.controller

import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import javax.xml.transform.stream.StreamResult
import javax.xml.transform.stream.StreamSource
import org.springframework.oxm.Marshaller
import org.springframework.oxm.Unmarshaller

open class XMLConverter {
    private var marshaller: Marshaller? = null
    private var unmarshaller: Unmarshaller? = null

    fun getMarshaller(): Marshaller? {
        return marshaller
    }

    fun setMarshaller(marshaller: Marshaller) {
        this.marshaller = marshaller
    }

    fun getUnmarshaller(): Unmarshaller? {
        return unmarshaller
    }

    fun setUnmarshaller(unmarshaller: Unmarshaller) {
        this.unmarshaller = unmarshaller
    }

    @Throws(IOException::class)
    fun convertFromObjectToXML(`object`: Any, filepath: String) {

        var os: FileOutputStream? = null
        try {
            os = FileOutputStream(filepath)
            getMarshaller()!!.marshal(`object`, StreamResult(os))
        } finally {
            if (os != null) {
                os.close()
            }
        }
    }

    @Throws(IOException::class)
    fun convertFromXMLToObject(xmlfile: String): Any {

        var `is`: FileInputStream? = null
        try {
            `is` = FileInputStream(xmlfile)
            return getUnmarshaller()!!.unmarshal(StreamSource(`is`))
        } finally {
            if (`is` != null) {
                `is`.close()
            }
        }
    }
}

