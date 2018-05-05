package th.ac.kmitl.it.soa.group8.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement(name = "ram:IncludedNote")
@XmlAccessorType(XmlAccessType.FIELD)
data class IncludedNoteXMLConverter (

    @field:XmlElement(name = "ram:Subject")
    val subject: String = "",

    @field:XmlElement(name = "ram:Content")
    val content: String = ""

)
