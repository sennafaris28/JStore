package jstore;

import java.util.*;

public class Transaction {
    public static void orderNewItem(ArrayList<Integer> item_list) throws InvoiceAlreadyExistsException {
        DatabaseInvoice.addInvoice(new Buy_Paid(item_list));

//        ArrayList<Integer> itemID = new ArrayList<Integer>();
//        itemID.add(item_list.getId());
//        Invoice invoice = new Buy_Paid(itemID);
//        DatabaseInvoice.addInvoice(invoice);
        /*
         * item.setStatus(ItemStatus.New); Invoice buy_paid1 = new Buy_Paid(1, item,
         * "17-8-2020", item.getPrice(), 10); if (buy_paid1 instanceof Sell_Paid) {
         * System.out.println("Benar Invoice Type adalah Sell_Paid"); } else {
         * System.out.println("Salah, Invoice Type bukan Sell_Paid"); }
         * buy_paid1.printData(); item.printData();
         */
    }

    public static void orderSecondItem(ArrayList<Integer> item_list) throws InvoiceAlreadyExistsException {
        DatabaseInvoice.addInvoice(new Buy_Paid(item_list));
//        ArrayList<Integer> itemID = new ArrayList<Integer>();
//        itemID.add(item_list.getId());
//        Invoice invoice = new Buy_Paid(itemID);
//        DatabaseInvoice.addInvoice(invoice);
        /*
         * item.setStatus(ItemStatus.Second); Invoice buy_paid1 = new Buy_Paid(1, item,
         * "17-8-2020", item.getPrice(), 10); buy_paid1.printData(); item.printData();
         */
    }

    public static void orderRefurbishedItem(ArrayList<Integer> item_list) throws InvoiceAlreadyExistsException {
        DatabaseInvoice.addInvoice(new Buy_Paid(item_list));
//        ArrayList<Integer> itemID = new ArrayList<Integer>();
//        itemID.add(item_list);
//        Invoice invoice = new Buy_Paid(itemID);
//        DatabaseInvoice.addInvoice(invoice);
        /*
         * item.setStatus(ItemStatus.Refurbished); Invoice buy_paid1 = new Buy_Paid(1,
         * item, "17-8-2020", item.getPrice(), 10); buy_paid1.printData();
         * item.printData();
         */
    }

    public static void sellItemPaid(ArrayList<Integer> item_list, Customer customer) throws InvoiceAlreadyExistsException {
        DatabaseInvoice.addInvoice(new Sell_Paid(item_list, customer));
//        ArrayList<Integer> itemID = new ArrayList<Integer>();
//        itemID.add(item_list.getId());
//        Invoice invoice = new Sell_Paid(itemID, customer);
//        DatabaseInvoice.addInvoice(invoice);
        /*
         * item.setStatus(ItemStatus.Sold); Invoice sell_paid1 = new Sell_Paid(1, item,
         * "17-8-2020", item.getPrice(), 10); sell_paid1.printData(); item.printData();
         */
    }

    public static void sellItemUnpaid(ArrayList<Integer> item_list, Customer customer) throws InvoiceAlreadyExistsException {
        DatabaseInvoice.addInvoice(new Sell_Unpaid(item_list, customer));
//        ArrayList<Integer> itemID = new ArrayList<Integer>();
//        itemID.add(item_list.getId());
//        Invoice invoice = new Sell_Unpaid(itemID, customer);
//        DatabaseInvoice.addInvoice(invoice);
        /*
         * item.setStatus(ItemStatus.Sold); Invoice sell_unpaid1 = new Sell_Unpaid(1,
         * item, "17-8-2020", 10, item.getPrice(), "18-8-2020");
         * sell_unpaid1.printData(); item.printData();
         */
    }

    public static void sellItemInstallment(ArrayList<Integer> item_list, Customer customer, int installmentPeriod) throws InvoiceAlreadyExistsException {
        DatabaseInvoice.addInvoice(new Sell_Installment(item_list, installmentPeriod, customer));
//        ArrayList<Integer> itemID = new ArrayList<Integer>();
//        itemID.add(item_list.getId());
//        Invoice invoice = new Sell_Installment(itemID, installmentPeriod, customer);
//        DatabaseInvoice.addInvoice(invoice);
        /*
         * item.setStatus(ItemStatus.Sold); Invoice sell_installment1 = new
         * Sell_Installment(1, item, "17-8-2020", 10, item.getPrice(), 10, 0);
         * sell_installment1.printData(); item.printData();
         */
    }

    public static boolean finishTransaction(Invoice invoice)
    {
        if(invoice.getInvoiceStatus().equals(InvoiceStatus.Installment) && invoice.getInvoiceStatus().equals(InvoiceStatus.Unpaid)){
            for (Invoice invoiceDB : DatabaseInvoice.getInvoiceDatabase()){
                if (invoiceDB.getId() == invoice.getId()) {
                    invoice.setIsActive(false);
                    System.out.println("Invoice Status : " + invoice.getIsActive());
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean cancelTransaction(Invoice invoice) throws InvoiceNotFoundException {
        if(invoice.getInvoiceStatus().equals(InvoiceStatus.Installment) && invoice.getInvoiceStatus().equals(InvoiceStatus.Unpaid)){
            for (Invoice invoiceDB : DatabaseInvoice.getInvoiceDatabase()) {
                if (invoiceDB.getId() == invoice.getId()) {
                    DatabaseInvoice.removeInvoice(invoice.getId());
                    return true;
                }
            }
        }
        return false;
    }

}
