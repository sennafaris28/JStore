
/**
 * 
 * Database Supplier Class
 * 
 * @Senna Faris
 * @version 28/02/19
 *  
 */
public class DatabaseSupplier
{
    private String[] listSupplier;
    private Supplier supplier;
    
    public boolean addSupplier(Supplier supplier)
    /***
     * This method is used to add Supplier
     */
    {
        return true;
    }
    public void removeSupplier(Supplier supplier)
    /***
     * This method is used to remove Supplier
     */
    {
        this.supplier = supplier;
    }
    public Supplier getSupplier()
    /***
     * Accessor for Supplier
     */
    {
        return supplier;
    }
    public String[] getListSupplier()    
    /***
     * Accessor for Supplier List
     */
    {
        return listSupplier;
    }
}
