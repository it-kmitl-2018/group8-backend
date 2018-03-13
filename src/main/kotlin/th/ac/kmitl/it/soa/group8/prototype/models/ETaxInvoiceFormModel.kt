package th.ac.kmitl.it.soa.group8.prototype.models

data class ETaxInvoiceFormModel(

        var id: Int,
        var name: String,
        var typeCode: String,
        var issueDateTime: String,
        var purpose: String,
        var purposeCode: String,
        var globalID: Int,
        var creationDateTime: String

)
