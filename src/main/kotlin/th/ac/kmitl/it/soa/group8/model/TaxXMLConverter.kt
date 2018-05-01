package th.ac.kmitl.it.soa.group8.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement(name = "ram:SpecifiedTaxRegistration")
@XmlAccessorType(XmlAccessType.FIELD)
data class TaxXMLConverter (

        @field:XmlElement(name = "ram:ID")
        val taxID: String = ""

 )
