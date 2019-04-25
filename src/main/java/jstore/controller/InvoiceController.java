package jstore.controller;

import java.util.*;
import jstore.*;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;

@RestController
public class InvoiceController {

    @RequestMapping(value = "/invoicecustomer/{id_customer}", method = RequestMethod.GET)
    public ArrayList<Invoice> invoiceCust(@PathVariable int id_customer) {
        ArrayList<Invoice> invoice = new ArrayList<Invoice>();
        try {
            invoice = DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(id_customer));
        }
        catch (CustomerDoesntHaveActiveInvoiceException x) {
            x.getExMessage();
        }
        return invoice;
    }

    @RequestMapping(value = "/invoice/{id_invoice}", method = RequestMethod.GET)
    public Invoice getInvoice(@PathVariable int id_invoice) {
        Invoice invoice = DatabaseInvoice.getInvoice(id_invoice);
        return invoice;
    }

    @RequestMapping(value = "/createinvoicepaid", method = RequestMethod.POST)
    public Invoice createInvoicePaid(
            @RequestParam(value = "itemList")ArrayList<Integer> itemList,
            @RequestParam(value = "id_customer")int id_customer) {
        Invoice invoiceSellPaid = null;
        try {
            DatabaseInvoice.addInvoice(new Sell_Paid(itemList, DatabaseCustomer.getCustomer(id_customer)));
        }
        catch (InvoiceAlreadyExistsException x) {
            x.getExMessage();
        }
        invoiceSellPaid = DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID());
        return invoiceSellPaid;
    }

    @RequestMapping(value = "/createinvoiceunpaid", method = RequestMethod.POST)
    public Invoice createInvoiceUnpaid(
            @RequestParam(value = "itemList")ArrayList<Integer> itemList,
            @RequestParam(value = "id_customer")int id_customer) {
        Invoice invoicesSellUnpaid = null;
        try {
            DatabaseInvoice.addInvoice(new Sell_Unpaid(itemList, DatabaseCustomer.getCustomer(id_customer)));
        }
        catch (InvoiceAlreadyExistsException x) {
            x.getExMessage();
        }
        invoicesSellUnpaid = DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID());
        return invoicesSellUnpaid;
    }

    @RequestMapping(value = "/createinvoiceinstallment", method = RequestMethod.POST)
    public Invoice createInvoiceInstallment(
            @RequestParam(value = "itemList")ArrayList<Integer> itemList,
            @RequestParam(value = "id_customer") int id_customer,
            @RequestParam(value = "installment_period") int installment_period) {
        Invoice invoicesSellInstallment = null;
        try {
            DatabaseInvoice.addInvoice(new Sell_Installment(itemList, installment_period, DatabaseCustomer.getCustomer(id_customer)));
        }
        catch (InvoiceAlreadyExistsException x) {
            x.getExMessage();
        }
        invoicesSellInstallment = DatabaseInvoice.getInvoice(DatabaseInvoice.getLastInvoiceID());
        return invoicesSellInstallment;
    }

    @RequestMapping(value = "/canceltransaction", method = RequestMethod.POST)
    public Invoice CancelTransaction(@RequestParam(value = "id_invoice") int id_invoice) throws InvoiceNotFoundException {
        Transaction.cancelTransaction(DatabaseInvoice.getInvoice(id_invoice));
            return DatabaseInvoice.getInvoice(id_invoice);
    }

    @RequestMapping(value = "/finishtransaction", method = RequestMethod.POST)
    public Invoice FinishTransaction(@RequestParam(value = "id_invoice") int id_invoice) {
        Transaction.finishTransaction(DatabaseInvoice.getInvoice(id_invoice));
        return DatabaseInvoice.getInvoice(id_invoice);
    }

}
