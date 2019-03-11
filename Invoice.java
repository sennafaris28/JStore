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
    /**
     * Constructor
     */
    public Invoice(int id,
        Item item,
        String date,
        int totalPrice)
    {
        this.id = id;
        this.item = item;
        this.date = date;
        this.totalPrice = totalPrice;
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
    public void printData()
    /***
     * This method is used to print the total price
     */
    {
        System.out.println(totalPrice);
    }
}