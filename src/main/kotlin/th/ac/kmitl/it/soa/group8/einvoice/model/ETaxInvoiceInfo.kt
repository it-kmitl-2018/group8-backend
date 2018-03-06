package th.ac.kmitl.it.soa.group8.einvoice.model

data class ETaxInvoiceInfo(val guidelineSpecifiedID: String,
                           val documentId: String,
                           val documentName: String,
                           val documentType: String,
                           val issueDateTime: String,
                           val purpose: String,
                           val purposeId: String,
                           val documentGlobalId: String,
                           val documentCreateDate: String,
                           val remarkSubject: String,
                           val remarkContent: String)
