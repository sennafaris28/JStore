/**
 * Databasa Item Class
 *
 * @author Senna Faris
 * @version 28/02/19
 */
public class DatabaseItem
{
    private String[] listItem;
    private Item item;
    
    public boolean addItem(Item item)
    {
        return true;
    }

    public boolean removeItem(Item item)
    {
        return true;
    }

    public Item getItem()
    {
        return item;
    }
    public String[] getItemDatabase()
    {
        return listItem;
    }
}