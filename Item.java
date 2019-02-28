/**
 * 
 * Item Class
 * 
 * @Senna Faris
 * @version 28/02/19
 *  
 */

public class Item
{
    private int id;
    private String name;
    private int stock;
    private int price;
    private String category;
    private Supplier supplier; 
    
    /**
     * Constructor of Item
     */
    public Item()
    {
        int id;
        String name;
        int stock;
        int price;
        String category;
        Supplier supplier;
    }
    public int getId()
    /**
     * This method is used to get the id value
     */
    {
        return id;
    }
    public String getName()
    /**
     * This method is used to get the name value
     */
    {
        return name;
    }
    public int getStock() 
    /**
     * This method is used to get the stock value
     */
    {
        return stock;
    }
    public int getPrice()
    /**
     * This method is used to get the price value
     */
    {
        return price;
    }
    public String getCategory()
    /**
     * This method is used to get the category value
     */
    {
        return category;
    } 
    public Supplier getSupplier()
    /** 
     * This method is used to get the supplier value
     */
    {
        return supplier;
    }
    public void setId(int id)
    /** 
     * This is a mutator for id
     */
    {
        this.id = id;
    }
    public void setName(String name)
    /**
     * This is a mutator for name
     */
    {
        this.name = name;
    }
    public void setStock(int stock) 
    /**
     * This is a mutator for stock
     */
    {
        this.stock = stock;
    }
    public void setPrice(int price)
    /**
     * This is a mutator for price
     */
    {
        this.price = price;
    }
    public void setCategory(String category)
    /** 
     * This is a mutator for category
     */
    {
        this.category = category;
    }  
    public void setSupplier(Supplier supplier)
    /** 
     * This is a mutator for supplier
     */
    {
        this.supplier = supplier;
    }
    public void printData()
    /**
     * This method will print the name value of the instance
     */
    {
        System.out.println(name);
    }
}