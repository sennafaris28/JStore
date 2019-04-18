
/**
 *
 * Main Class for JStore.java
 *
 * @Senna Faris
 * @version 28/02/19
 *
 */
import java.util.*;

public class JStore {
    public static void main(String args[]) {

        ArrayList<Integer> item_list = new ArrayList<>();
        item_list.add(1);
        item_list.add(2);

        Location location1 = new Location("Papua", "Pedagang Sagu", "Jayapura");

        try {
            DatabaseSupplier.addSupplier(new Supplier("Udin", "udin@carikuli.com", "99999", location1));
            DatabaseSupplier.addSupplier(new Supplier("Udin", "udin@carikuli.com", "99999", location1));
            DatabaseSupplier.addSupplier(new Supplier("Marudin", "marudin@carikuli.com", "88888", location1));

        } catch (SupplierAlreadyExistsException x)  {
            System.out.println(x.getExMessage());
        }

        try {
            DatabaseItem.addItem(new Item("Sabun", ItemStatus.New, 10000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(1)));
            DatabaseItem.addItem(new Item("Sabun", ItemStatus.New, 10000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(1)));
            DatabaseItem.addItem(new Item("Odol", ItemStatus.New, 14000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(1)));
        } catch (ItemAlreadyExistsException x) {
            System.out.println(x.getExMessage());
        }

        try {
            DatabaseCustomer.addCustomer(new Customer("Hasnan", "hasnan@ui.ac.id", "CikguBopung", "kiki6398", 1998, 3, 6));
            DatabaseCustomer.addCustomer(new Customer("Hasnan", "hasnan@ui.ac.id", "CikguBopung", "kiki6398", 1998, 3, 6));
            DatabaseCustomer.addCustomer(new Customer("Adhie", "adhie@ui.ac.id", "Wazowski", "adhiesg", 1997, 4, 20));
        } catch (CustomerAlreadyExistsException x) {
            System.out.println(x.getExMessage());
        }

        try {
            DatabaseInvoice.addInvoice(new Sell_Paid(item_list,DatabaseCustomer.getCustomer(1)));
            DatabaseInvoice.addInvoice(new Sell_Unpaid(item_list, DatabaseCustomer.getCustomer(2)));

        } catch (InvoiceAlreadyExistsException x){System.out.println(x.getExMessage());}

        try {
            DatabaseItem.removeItem(28);
        } catch (ItemNotFoundException x){
            System.out.println(x.getExMessage());
        }

        try {
            DatabaseCustomer.removeCustomer(28);
        } catch (CustomerNotFoundException x){
            System.out.println(x.getExMessage());
        }

        try {
            DatabaseSupplier.removeSupplier(28);
        } catch (SupplierNotFoundException x){
            System.out.println(x.getExMessage());
        }

        try {
            DatabaseInvoice.removeInvoice(28);
        } catch (InvoiceNotFoundException x){
            System.out.println(x.getExMessage());
        }




//        DatabaseSupplier.addSupplier(new Supplier("Udin", "udin@carikuli.com", "9999", location1));
//        DatabaseSupplier.addSupplier(new Supplier("Marudin", "marudin@carikuli.com", "8888", location1));
//        DatabaseSupplier.addSupplier(new Supplier("Kripton", "kripton@carikuli.com", "5555", location1));
//        for (Supplier supplier1 : DatabaseSupplier.getSupplierDatabase()) {
//            System.out.println(supplier1.toString());
//        }
//
//        DatabaseItem.addItem(
//                new Item("Sabun", 4, ItemStatus.New, 10000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(1)));
//        DatabaseItem.addItem(
//                new Item("Sampo", 5, ItemStatus.New, 20000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(2)));
//        DatabaseItem.addItem(
//                new Item("Odol", 3, ItemStatus.New, 14000, ItemCategory.Electronics, DatabaseSupplier.getSupplier(1)));
//        DatabaseItem.addItem(new Item("Sikat gigi", 6, ItemStatus.New, 16000, ItemCategory.Electronics,
//                DatabaseSupplier.getSupplier(3)));
//        for (Item item1 : DatabaseItem.getItemDatabase()) {
//            System.out.println(item1.toString());
//        }
//
//        DatabaseCustomer.addCustomer(new Customer("Hasnan", "hasnan@ui.ac.id", "CikguBopung", "kiki6398", 1998, 3, 6));
//        DatabaseCustomer.addCustomer(new Customer("Adnan", "adnan@ui.ac.id", "Flotilla", "aziraf", 1998, 4, 1));
//        DatabaseCustomer.addCustomer(new Customer("Adhie", "adhie@ui.ac.id", "Wazowski", "adhiesg", 1997, 4, 20));
//        for (Customer customer1 : DatabaseCustomer.getCustomerDatabase()) {
//            System.out.println(customer1.toString());
//        }
//
//        ArrayList<Integer> item1 = new ArrayList<Integer>();
//        item1.add(1);
//        item1.add(2);
//
//        ArrayList<Integer> item2 = new ArrayList<Integer>();
//        item2.add(1);
//        item2.add(3);
//
//        ArrayList<Integer> item3 = new ArrayList<Integer>();
//        item3.add(2);
//        item3.add(3);
//
//        DatabaseInvoice.addInvoice(new Sell_Paid(item1, DatabaseCustomer.getCustomer(1)));
//        DatabaseInvoice.addInvoice(new Sell_Unpaid(item2, DatabaseCustomer.getCustomer(2)));
//        DatabaseInvoice.addInvoice(new Sell_Installment(item3, 10, DatabaseCustomer.getCustomer(3)));
//        for (Invoice invoice1 : DatabaseInvoice.getInvoiceDatabase()) {
//            System.out.println(invoice1.toString());
//        }
//
//        Transaction.finishTransaction(DatabaseInvoice.getInvoice(2));
//        Transaction.finishTransaction(DatabaseInvoice.getInvoice(3));
//        for (Invoice invoice1 : DatabaseInvoice.getInvoiceDatabase()) {
//            System.out.println(invoice1.toString());
//        }
//
//        Transaction.cancelTransaction(DatabaseInvoice.getInvoice(2));
//        for (Invoice invoice1 : DatabaseInvoice.getInvoiceDatabase()) {
//            System.out.println(invoice1.toString());
//        }

        // Supplier supplier1 = new Supplier("Bang Udin", "udin@carikuli.com",
        // "888999");
        // location1);
        // // Supplier supplier2 = new Supplier("Bang Marudin", "marudin@carikuli.com",
        // // "909090", location1);
        // Item item1 = new Item("Tetikus", 100, ItemStatus.New, 200,
        // ItemCategory.Electronics, supplier1);
        // DatabaseItem.addItem(item1);
        // Item item2 = new Item("Burung", 20, ItemStatus.New, 100,
        // ItemCategory.Electronics, supplier1);
        // DatabaseItem.addItem(item2);
        // Item item3 = new Item("Semut", 50, ItemStatus.New, 150,
        // ItemCategory.Stationery, supplier1);
        // DatabaseItem.addItem(item3);

        // System.out.println("\nBy SUPPLIER");
        // for (Item item : DatabaseItem.getItemFromSupplier(supplier1)) {
        // System.out.println(item);
        // }
        // System.out.println("\nBy CATEGORY");
        // for (Item item : DatabaseItem.getItemFromCategory(ItemCategory.Electronics))
        // {
        // System.out.println(item);
        // }
        // System.out.println("\nBy CATEGORY");
        // for (Item item : DatabaseItem.getItemFromStatus(ItemStatus.New)) {
        // System.out.println(item);
        // }
        // System.out.println("\nALL");
        // for (Item item : DatabaseItem.getItemDatabase()) {
        // System.out.println(item);
        // }

        /*
         * Transaction transaction1 = new Transaction();
         *
         * System.out.println("-----Lokasi-----"); location1.printData();
         *
         * System.out.println("-----Supplier-----"); supplier1.printData();
         *
         * System.out.println("-----Order New Item-----");
         * transaction1.orderNewItem(item1);
         *
         * System.out.println("-----Order Second Item-----");
         * transaction1.orderSecondItem(item1);
         *
         * System.out.println("-----Order Refurbished Item-----");
         * transaction1.orderRefurbishedItem(item1);
         *
         * System.out.println("----Sell Item Paid-----");
         * transaction1.sellItemPaid(item1);
         *
         * System.out.println("-----Sell Item Unpaid-----");
         * transaction1.sellItemUnpaid(item1);
         *
         * System.out.println("-----Sell Item Installment-----");
         * transaction1.sellItemInstallment(item1);
         */

    }

    public void transaction() {

    }

    public JStore() {

    }
}
