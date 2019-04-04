import java.util.Calendar;
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
    private Calendar date = Calendar.getInstance();
    private int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    private InvoiceType type;
    /**
     * Constructor
     */
    public Invoice(
        int id,
        Item item,
        int totalItem
        )
    {
        this.id = id;
        this.item = item;
        this.totalItem = totalItem;
        this.totalPrice = totalItem * item.getPrice();
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
    public Calendar getDate()
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
    public abstract InvoiceStatus getInvoiceStatus();
    
    public abstract InvoiceType getInvoiceType();
    
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
    public void setDate(Calendar date)
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
        this.totalPrice = totalItem * item.getPrice();
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
    public String toString() {
        return toString();
    }
}