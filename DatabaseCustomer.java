
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private Customer[] listCustomer;
    private Customer customer;
    
    /**
     * Constructor for objects of class DatabaseCustomer
     */
    public boolean addCustomer(Customer customer)
    {
        return true;
    }
    public void removeCustomer(Customer customer) 
    {
        
    }
    public Customer getCustomer() {
        return customer;
    }
    public Customer[] getListCustomer() {
        return listCustomer;
    }
}
