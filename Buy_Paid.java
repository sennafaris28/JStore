
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice {
    // Instance variables
    private InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(int id, Item item, int totalItem) {
        super(id, item, totalItem);
        //this.totalPrice = totalItem * item.getPrice();
    }

    public InvoiceStatus getInvoiceStatus() {
        return INVOICE_STATUS;
    }

    public InvoiceType getInvoiceType() {
        return INVOICE_TYPE;
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
    // System.out.println("Status = " + INVOICE_STATUS);
    // System.out.println("Tipe = " + INVOICE_TYPE);
    // System.out.println("=========================");
    // }

    public String toString() {
        return "===== Invoice =====" + "ID: " + this.getId() + "Item: " + this.getItem().getName() + "Amount:"
                + this.getTotalItem() + "Buy Date: " + this.getDate() + "Price: " + this.getItem().getPrice()
                + "Price total: " + this.getTotalPrice() + "Supplier ID: " + this.getItem().getSupplier().getId()
                + "Supplier name: " + this.getItem().getSupplier().getName() + "status: " + this.INVOICE_STATUS
                + "Buy success";
    }
}
