/**
 * Databasa Item Class
 *
 * @author Senna Faris
 * @version 28/02/19
 */
public class DatabaseItem
{
    private String[] listItem;
    public static Item itemDB;
    
    /***
     * This method is used to add item 
     */
    public boolean addItem(Item item)
    {
        return true;
    }
    /***
     * This method is used to remove item 
     */
    public boolean removeItem(Item item)
    {
        return true;
    }
    /***
     * This method is used to get item value
     */
    public Item getItem()
    {
        return itemDB;
    }
    /***
     * This method is used to get the list of items in the database 
     */
    public String[] getItemDatabase()
    {
        return listItem;
    }
}