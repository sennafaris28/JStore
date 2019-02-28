/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    private int id;
    private Item item;
    private String date;
    private int totalPrice;
    /**
     * Constructor
     */
    public Invoice()
    {
        int id;
        Item item;
        String date;
        int totalPrice;
    }
    /** 
     * List of accessors to access the value of an instance
     */
    public int getId()
    {
        return id;
    }
    public Item getItem()
    {
        return item;
    }
    public String getDate()
    {
        return date;
    }
    public int getTotalPrice()
    {
        return totalPrice;
    }
    /**
     * List of mutators to modify the value of an instance
     */
    public void setId(int id) 
    {
        this.id = id;
    }
    public void setItem(Item item)
    {
        this.item = item;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    public void printData()
    {
        System.out.println(totalPrice);
    }
}