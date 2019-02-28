/**
 * Write a description of class DatabaseItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
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