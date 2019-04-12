import java.util.ArrayList;

/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseInvoice {
    // instance variables - replace the example below with your own
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID = 0;

    public static ArrayList<Invoice> getInvoiceDatabase() {
        return INVOICE_DATABASE;
    }

    public static int getLastInvoiceID() {
        return LAST_INVOICE_ID;
    }

    public static boolean addInvoice(Invoice invoice) {
        INVOICE_DATABASE.add(invoice);
        return true;
    }

    public static Invoice getInvoice(int id) {
        Invoice temp = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                temp = invoice;
            }
        }
        return temp;
    }

    public static Invoice getActiveOrder(Customer customer) {
        Invoice temp = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if ((invoice.getInvoiceStatus() == InvoiceStatus.Unpaid
                    || invoice.getInvoiceStatus() == InvoiceStatus.Installment) && invoice.getIsActive() == true) {
                temp = invoice;
            } else {
                temp = null;
            }
        }
        return temp;
    }

    public static boolean removeInvoice(int id) {
        boolean temp = false;
        for (Invoice invoice : INVOICE_DATABASE) {
            if ((invoice.getId() == id) && (invoice.getIsActive() == true)) {
                invoice.setIsActive(false);
                INVOICE_DATABASE.remove(invoice);
                temp = true;
            }
        }
        return temp;
    }
}
