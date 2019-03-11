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
    public Item(int id,
        String name,
        int stock,
        int price,
        String category,
        Supplier supplier)
    {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.category = category;
        this.supplier = supplier;
    }
    public int getId()
    /**
     * Accessor for ID
     */
    {
        return id;
    }
    public String getName()
    /**
     * Accessor for name value
     */
    {
        return name;
    }
    public int getStock() 
    /**
     * Accessor for stock value
     */
    {
        return stock;
    }
    public int getPrice()
    /**
     * Accessor for price value
     */
    {
        return price;
    }
    public String getCategory()
    /**
     * Accessor for category value
     */
    {
        return category;
    } 
    public Supplier getSupplier()
    /** 
     * Accessor for supplier value
     */
    {
        return supplier;
    }
    public void setId(int id)
    /** 
     * Mutator for id
     */
    {
        this.id = id;
    }
    public void setName(String name)
    /**
     * Mutator for name
     */
    {
        this.name = name;
    }
    public void setStock(int stock) 
    /**
     * Mutator for stock
     */
    {
        this.stock = stock;
    }
    public void setPrice(int price)
    /**
     * Mutator for price
     */
    {
        this.price = price;
    }
    public void setCategory(String category)
    /** 
     * Mutator for category
     */
    {
        this.category = category;
    }  
    public void setSupplier(Supplier supplier)
    /** 
     * Mutator for supplier
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