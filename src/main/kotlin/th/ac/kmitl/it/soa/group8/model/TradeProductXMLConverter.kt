package th.ac.kmitl.it.soa.group8.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement(name = "ram:TradeProduct")
@XmlAccessorType(XmlAccessType.FIELD)
data class TradeProductXMLConverter (

        @field:XmlElement(name = "ram:ID")
        val id: String = "",

        @field:XmlElement(name = "ram:GlobalID")
        val globalID: String = "",

        @field:XmlElement(name = "ram:Name")
        val name: String = "",

        @field:XmlElement(name = "ram:Description")
        val description: String = ""

)