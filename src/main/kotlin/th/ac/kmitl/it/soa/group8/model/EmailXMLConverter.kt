package th.ac.kmitl.it.soa.group8.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement(name = "ram:EmailURIUniversalCommunication")
@XmlAccessorType(XmlAccessType.FIELD)
data class EmailXMLConverter (

    @field:XmlElement(name = "ram:URIID")
    val uriID: String = ""
)
