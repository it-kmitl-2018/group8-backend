package th.ac.kmitl.it.soa.group8.e_tax_invoice.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement(name = "ram:DefinedTradeContact")
@XmlAccessorType(XmlAccessType.FIELD)
data class TradeContactModel (

    @field:XmlElement(name = "ram:PersonName")
    val personName: String = "",

    @field:XmlElement(name = "ram:DepartmentName")
    val departmentName: String = ""

)
