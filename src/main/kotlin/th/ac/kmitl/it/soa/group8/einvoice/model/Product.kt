package th.ac.kmitl.it.soa.group8.einvoice.model

data class Product (val id: String,
                    val globalId: String,
                    val name: String,
                    val description: String,
                    val batchID: String,
                    val expiryDateTime: String,
                    val classCode: String,
                    val className: String,
                    val originCountryId: String,
                    val noteSubject: String,
                    val noteContent: String
)