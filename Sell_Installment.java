
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice {
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;

    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(int id, Item item, int totalItem, int installmentPeriod, Customer customer) {
        super(id, item, totalItem);
        this.installmentPeriod = installmentPeriod;
        this.installmentPrice = installmentPrice;
        this.customer = customer;
    }

    public InvoiceStatus getInvoiceStatus() {
        return INVOICE_STATUS;
    }

    public InvoiceType getInvoiceType() {
        return INVOICE_TYPE;
    }

    public int getInstallmentPeriod() {
        return installmentPeriod;
    }

    public int getInstallmentPrice() {
        return installmentPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setInstallmentPrice() {
        // this.installmentPrice = totalPrice / installmentPeriod * 102 / 100;
    }

    public void setTotalPrice() {
        // this.totalPrice = installmentPrice * installmentPeriod;
    }
    public void setInvoiceStatus(InvoiceStatus status){
    }

    public void setCustomer() {
        this.customer = customer;
    }

    // public void printData()
    // {
    // System.out.println("========Invoice========");
    // System.out.println("ID = " + getId());
    // System.out.println("Item = " + getItem().getName());
    // System.out.println("Tanggal = " + getDate());
    // System.out.println("Jumlah = " + getTotalItem());
    // System.out.println("Status = " + INVOICE_STATUS);
    // System.out.println("Tipe = " + INVOICE_TYPE);
    // System.out.println("Periode Pemasangan = " + installmentPeriod);
    // System.out.println("Harga Pemasangan = " + installmentPrice);
    // //System.out.println("Total Harga = " + totalPrice);
    // System.out.println("=========================");
    // }
    public String toString() {
        return "===== Invoice =====" + "ID: " + this.getId() + "Item: " + this.getItem().getName() + "Amount:"
                + this.getTotalItem() + "Buy Date: " + this.getDate() + "Price: " + this.getItem().getPrice()
                + "Price total: " + this.getTotalPrice() + "Supplier ID: " + this.getItem().getSupplier().getId()
                + "Supplier name: " + this.getItem().getSupplier().getName() + "Customer ID: "
                + this.getCustomer().getId() + "Customer name: " + this.getCustomer().getName() + "status: "
                + this.INVOICE_STATUS + "Installment Period: " + this.installmentPeriod + "Sell success";
    }
}
