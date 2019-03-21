
/**
 * Invoice Class
 *
 * @Senna Faris
 * @version 28/02/19
 */
public abstract class Invoice
{
    //Instance Variables
    private int id;
    private Item item;
    private String date;
    protected int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    private InvoiceType type;
    /**
     * Constructor
     */
    public Invoice(
        int id,
        Item item,
        String date,
        int totalPrice,
        int totalItem
        )
    {
        this.id = id;
        this.item = item;
        this.date = date;
        this.totalPrice = totalPrice;
        this.totalItem = totalItem;
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
    public InvoiceType getInvoiceType()
    {
        return type;
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
    public abstract void printData();
}