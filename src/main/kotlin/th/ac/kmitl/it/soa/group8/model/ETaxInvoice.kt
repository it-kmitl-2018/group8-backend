package th.ac.kmitl.it.soa.group8.model

data class ETaxInvoice(val buyer: String,
                       val buyerAddress: String,
                       val seller: String,
                       val sellerAddress: String,
                       val productList: String,
                       val totalBalance: Int
                       )
