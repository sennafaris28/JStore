
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Transaction {
    public void orderNewItem(Item item) {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice = new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
        /*
         * item.setStatus(ItemStatus.New); Invoice buy_paid1 = new Buy_Paid(1, item,
         * "17-8-2020", item.getPrice(), 10); if (buy_paid1 instanceof Sell_Paid) {
         * System.out.println("Benar Invoice Type adalah Sell_Paid"); } else {
         * System.out.println("Salah, Invoice Type bukan Sell_Paid"); }
         * buy_paid1.printData(); item.printData();
         */
    }

    public void orderSecondItem(Item item) {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice = new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
        /*
         * item.setStatus(ItemStatus.Second); Invoice buy_paid1 = new Buy_Paid(1, item,
         * "17-8-2020", item.getPrice(), 10); buy_paid1.printData(); item.printData();
         */
    }

    public void orderRefurbishedItem(Item item) {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice = new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
        /*
         * item.setStatus(ItemStatus.Refurbished); Invoice buy_paid1 = new Buy_Paid(1,
         * item, "17-8-2020", item.getPrice(), 10); buy_paid1.printData();
         * item.printData();
         */
    }

    public void sellItemPaid(Item item, Customer customer) {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice = new Sell_Paid(itemID, customer);
        DatabaseInvoice.addInvoice(invoice);
        /*
         * item.setStatus(ItemStatus.Sold); Invoice sell_paid1 = new Sell_Paid(1, item,
         * "17-8-2020", item.getPrice(), 10); sell_paid1.printData(); item.printData();
         */
    }

    public void sellItemUnpaid(Item item, Customer customer) {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice = new Sell_Unpaid(itemID, customer);
        DatabaseInvoice.addInvoice(invoice);
        /*
         * item.setStatus(ItemStatus.Sold); Invoice sell_unpaid1 = new Sell_Unpaid(1,
         * item, "17-8-2020", 10, item.getPrice(), "18-8-2020");
         * sell_unpaid1.printData(); item.printData();
         */
    }

    public void sellItemInstallment(Item item, Customer customer, int installmentPeriod) {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice = new Sell_Installment(itemID, installmentPeriod, customer);
        DatabaseInvoice.addInvoice(invoice);
        /*
         * item.setStatus(ItemStatus.Sold); Invoice sell_installment1 = new
         * Sell_Installment(1, item, "17-8-2020", 10, item.getPrice(), 10, 0);
         * sell_installment1.printData(); item.printData();
         */
    }

    public boolean finishTransaction(Invoice invoice) {
        boolean temp = false;
        for (Invoice invoiceDB : DatabaseInvoice.getInvoiceDatabase()) {
            if (invoiceDB.getId() == invoice.getId()) {
                invoice.setIsActive(false);
                System.out.println(invoice.getIsActive());
                temp = true;
            }
        }
        return temp;
    }

    public boolean cancelTransaction(Invoice invoice) {
        boolean temp = false;
        for (Invoice invoiceDB : DatabaseInvoice.getInvoiceDatabase()) {
            if (invoiceDB.getId() == invoice.getId()) {
                DatabaseInvoice.removeInvoice(invoice.getId());
                temp = true;
            }
        }
        return temp;
    }

}
