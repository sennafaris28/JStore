/**
 * 
 * Main Class for JStore.java
 * 
 * @Senna Faris
 * @version 28/02/19
 * 
 */
public class JStore
{
    public static void main(String args[]) 
    {
        Location location1 = new Location("Papua", "Pedagang Sagu", "Jayapura");
        Supplier supplier1 = new Supplier(8, "Bang Udin", "udin@carikuli.com", "888999", location1);
        Transaction transaction1 = new Transaction();
        
        System.out.println("-----Lokasi-----");
        location1.printData();
        
        System.out.println("-----Supplier-----");
        supplier1.printData();
        
        System.out.println("-----Order New Item-----");
        transaction1.orderNewItem(supplier1);
        
        System.out.println("-----Order Second Item-----");
        transaction1.orderSecondItem(supplier1);
        
        System.out.println("-----Order Refurbished Item-----");
        transaction1.orderRefurbishedItem(supplier1);
        
        System.out.println("----Sell Item Paid-----");
        transaction1.sellItemPaid(DatabaseItem.itemDB);
        
        System.out.println("-----Sell Item Unpaid-----");
        transaction1.sellItemUnpaid(DatabaseItem.itemDB);
        
        System.out.println("-----Sell Item Installment-----");
        transaction1.sellItemInstallment(DatabaseItem.itemDB);
        
    }
    
    public void transaction() 
    {
        
    }
    
    public JStore()
    {

    }
}