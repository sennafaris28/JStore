
/**
 * Write a description of class DatabaseSupplier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseSupplier
{
    private String[] listSupplier;
    private Supplier supplier;
    
    public boolean addSupplier(Supplier supplier)
    {
        return true;
    }
    public void removeSupplier(Supplier supplier)
    {
        this.supplier = supplier;
    }
    public Supplier getSupplier()
    {
        return supplier;
    }
    public String[] getListSupplier()
    {
        return listSupplier;
    }
}
