

/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    // Instance variables 
    private InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(
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
        System.out.println("Status = " + INVOICE_STATUS);
        System.out.println("Tipe = " + INVOICE_TYPE);
        System.out.println("=========================");
    }
}
