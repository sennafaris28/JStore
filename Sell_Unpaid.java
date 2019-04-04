import java.util.*;

/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice {
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;

    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(int id, Item item, int totalItem, Customer customer) {
        super(id, item, totalItem);
        this.customer = customer;
    }

    public InvoiceStatus getInvoiceStatus() {
        return INVOICE_STATUS;
    }

    public InvoiceType getInvoiceType() {
        return INVOICE_TYPE;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Calendar getDueDate() {
        return dueDate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }

    public String toString() {
        return toString();
    }

    // public void printData()
    // {
    // System.out.println("========Invoice========");
    // System.out.println("ID = " + getId());
    // System.out.println("Item = " + getItem().getName());
    // System.out.println("Tanggal = " + getDate());
    // //System.out.println("Harga = " + totalPrice);
    // System.out.println("Jumlah = " + getTotalItem());
    // System.out.println("Status = " + INVOICE_STATUS);
    // System.out.println("Tipe = " + INVOICE_TYPE);
    // System.out.println("Jatuh Tempo = " + dueDate);
    // System.out.println("=========================");
    // }
    public String toString() {
        return "===== Invoice =====" + "ID: " + this.getId() + "Item: " + this.getItem().getName() + "Amount:"
                + this.getTotalItem() + "Buy Date: " + this.getDate() + "Price: " + this.getItem().getPrice()
                + "Price total: " + this.getTotalPrice() + "Supplier ID: " + this.getItem().getSupplier().getId()
                + "Supplier name: " + this.getItem().getSupplier().getName() + "Customer ID: "
                + this.getCustomer().getId() + "Customer name: " + this.getCustomer().getName() + "Status: "
                + this.INVOICE_STATUS + "Due date: " + this.dueDate
                + "If payment is not received by due date, transcation will be canceled";
    }
}
