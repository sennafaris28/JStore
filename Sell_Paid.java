
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice 
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(
        int id,
        Item item,
        String date,
        int totalItem,
        int totalPrice
        )
    {
        super(id, item, date, totalItem, totalPrice);     
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    public void printData()
    {
        System.out.println("========Invoice========");
        System.out.println("ID = " + getId());
        System.out.println("Item = " + getItem().getName());
        System.out.println("Tanggal = " + getDate());
        System.out.println("Harga = " + totalPrice);
        System.out.println("Jumlah = " + getTotalItem());
        System.out.println("Harga = " + totalPrice);
        System.out.println("Status = " + INVOICE_STATUS);
        System.out.println("Tipe = " + INVOICE_TYPE);
        System.out.println("=========================");
    }
}
