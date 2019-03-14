
/**
 * Invoice Class
 *
 * @Senna Faris
 * @version 28/02/19
 */
public class Invoice
{
    private int id;
    private Item item;
    private String date;
    private int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    /**
     * Constructor
     */
    public Invoice(
        int id,
        Item item,
        String date,
        int totalPrice,
        int totalItem,
        InvoiceStatus status)
    {
        this.id = id;
        this.item = item;
        this.date = date;
        this.totalPrice = totalPrice;
        this.totalItem = totalItem;
        this.status = status;
    }
    
    public int getId()
    /***
     * Accessor for Invoice ID
     */
    {
        return id;
    }
    public Item getItem()
    /***
     * Accessor for Item
     */
    {
        return item;
    }
    public String getDate()
    /***
     * Accessor for Date
     */
    {
        return date;
    }
    public int getTotalPrice()
    /***
     * Accessor for Total Price
     */
    {
        return totalPrice;
    }
    public int getTotalItem()
    {
        return totalItem;
    }
    public InvoiceStatus getInvoiceStatus()
    {
        return status;
    }
    public void setId(int id) 
    /***
     * Mutator for ID
     */
    {
        this.id = id;
    }
    public void setItem(Item item)
    /***
     * Mutator for Item
     */
    {
        this.item = item;
    }
    public void setDate(String date)
    /***
     * Mutator for Date 
     */
    {
        this.date = date;
    }
    public void setTotalPrice(int totalPrice)
    /***
     * Mutator for Total Price
     */
    {
        this.totalPrice = totalPrice;
    }
    public void setTotalItem(int totalItem)
    {
        this.totalItem = totalItem;
    }
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status;
    }
    public void printData()
    /***
     * This method is used to print the total price
     */
    {
        System.out.println("Invoice dan ID");
        System.out.println("ID = " + id);
        System.out.println("Item = " + item);
        System.out.println("Tanggal = " + date);
        System.out.println("Harga = " + totalPrice);
        System.out.println("Jumlah = " + totalItem);
        System.out.println("Status = " + status);
    }
}