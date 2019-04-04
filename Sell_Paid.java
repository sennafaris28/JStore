import java.util.Calendar;

/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice {
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(int id, Item item, int totalItem, Customer customer) {
        super(id, item, totalItem);
        //this.totalPrice = totalItem * item.getPrice();
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
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setInvoiceStatus(InvoiceStatus status){
    }


    // public void printData()
    // {
    // System.out.println("========Invoice========");
    // System.out.println("ID = " + getId());
    // System.out.println("Item = " + getItem().getName());
    // System.out.println("Tanggal = " + getDate());
    // System.out.println("Harga = " + totalPrice);
    // System.out.println("Jumlah = " + getTotalItem());
    // System.out.println("Harga = " + totalPrice);
    // System.out.println("Status = " + INVOICE_STATUS);
    // System.out.println("Tipe = " + INVOICE_TYPE);
    // System.out.println("=========================");
    // }
    public String toString() {
        return "===== Invoice =====" + "ID: " + this.getId() + "Item: " + this.getItem().getName() + "Amount:"
                + this.getTotalItem() + "Buy Date: " + this.getDate() + "Price: " + this.getItem().getPrice()
                + "Price total: " + this.getTotalPrice() + "Supplier ID: " + this.getItem().getSupplier().getId()
                + "Supplier name: " + this.getItem().getSupplier().getName() + "Customer ID: "
                + this.getCustomer().getId() + "Customer name: " + this.getCustomer().getName() + "status: "
                + this.INVOICE_STATUS + "Sell success";
    }
}
