package th.ac.kmitl.it.soa.group8.models

import com.thoughtworks.selenium.SeleneseTestBase.assertEquals
import org.junit.Test
import th.ac.kmitl.it.soa.group8.model.TypeCode

class TypeCodeTest {

    @Test
    fun testGetDescription() {
        val debitNote = "ใบเพิ่มหนี้ (Debit note)"
        val creditNote = "ใบลดหนี้ (Credit note)"
        val invoice = "ใบแจ้งหนี้ (Invoice)"
        val taxInvoice = "ใบกำกับภาษี (Tax Invoice)"
        val receipt = "ใบรับ (Receipt)"
        val invoiceAndTaxInvoice = "ใบแจ้งหนี้/ใบกํากับภําษี (Invoice/ Tax Invoice)"
        val receiptTaxInvoice = "ใบเสร็จรับเงิน/ใบกํากับภาษี (Receipt/ Tax Invoice)"
        val deliveryAndTaxInvoice = "ใบส่งของ/ใบกํากับภําษี (Delivery order/ Tax Invoice)"
        val abbreviatedTaxInvoice = "ใบกํากับภําษีอย่ํางย่อ (Abbreviated Tax Invoice)"
        val receiptAndAbbreviatedTaxInvoice = "ใบเสร็จรับเงิน/ใบกํากับภําษีอย่างย่อ (Receipt/Abbreviated Tax Invoice)"
        val cancellationNote = "ใบแจ้งยกเลิก (Cancellation note)"

        assertEquals(TypeCode.DEBIT_NOTE.description, debitNote)
        assertEquals(TypeCode.CREDIT_NOTE.description, creditNote)
        assertEquals(TypeCode.INVOICE.description, invoice)
        assertEquals(TypeCode.TAX_INVOICE.description, taxInvoice)
        assertEquals(TypeCode.RECEIPT.description, receipt)
        assertEquals(TypeCode.INVOICE_AND_TAX_INVOICE.description, invoiceAndTaxInvoice)
        assertEquals(TypeCode.RECEIPT_TAX_INVOICE.description, receiptTaxInvoice)
        assertEquals(TypeCode.DELIVERY_AND_TAX_INVOICE.description, deliveryAndTaxInvoice)
        assertEquals(TypeCode.ABBREVIATED_TAX_INVOICE.description, abbreviatedTaxInvoice)
        assertEquals(TypeCode.RECEIPT_AND_ABBREVIATED_TAX_INVOICE.description, receiptAndAbbreviatedTaxInvoice)
        assertEquals(TypeCode.CANCELLATION_NOTE.description, cancellationNote)

    }

    @Test
    fun testGetTypeCode() {
        val debitNote = "80"
        val creditNote = "81"
        val invoice = "380"
        val taxInvoice = "388"
        val receipt = "T01"
        val invoiceAndTaxInvoice = "T02"
        val receiptTaxInvoice = "T03"
        val deliveryAndTaxInvoice = "T04"
        val abbreviatedTaxInvoice = "T05"
        val receiptAndAbbreviatedTaxInvoice = "T06"
        val cancellationNote = "T07"

        assertEquals(TypeCode.DEBIT_NOTE.typeCode, debitNote)
        assertEquals(TypeCode.CREDIT_NOTE.typeCode, creditNote)
        assertEquals(TypeCode.INVOICE.typeCode, invoice)
        assertEquals(TypeCode.TAX_INVOICE.typeCode, taxInvoice)
        assertEquals(TypeCode.RECEIPT.typeCode, receipt)
        assertEquals(TypeCode.INVOICE_AND_TAX_INVOICE.typeCode, invoiceAndTaxInvoice)
        assertEquals(TypeCode.RECEIPT_TAX_INVOICE.typeCode, receiptTaxInvoice)
        assertEquals(TypeCode.DELIVERY_AND_TAX_INVOICE.typeCode, deliveryAndTaxInvoice)
        assertEquals(TypeCode.ABBREVIATED_TAX_INVOICE.typeCode, abbreviatedTaxInvoice)
        assertEquals(TypeCode.RECEIPT_AND_ABBREVIATED_TAX_INVOICE.typeCode, receiptAndAbbreviatedTaxInvoice)
        assertEquals(TypeCode.CANCELLATION_NOTE.typeCode, cancellationNote)

    }


}
