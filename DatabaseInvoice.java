
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseInvoice
{
    // instance variables - replace the example below with your own
    private Invoice[] listInvoice;
    private Invoice invoice;
    
    public boolean addInvoice(Invoice invoice)
    {
        return true;
    }
    public void removeInvoice(Invoice invoice) 
    {
        
    }
    public Invoice getInvoice() {
        return invoice;
    }
    public Invoice[] getListInvoice() {
        return listInvoice;
    }
}
