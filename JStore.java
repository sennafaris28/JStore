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
        Location location = new Location("Jakarta", "Cipayung", "Jakarta Timur");
        Supplier supplier = new Supplier(1, "Senna Faris", "sennafaris28@gmail.com", "087889246728", location);
        Item item = new Item(1, "Kaleng", 2, 10, "Minuman", supplier);
        Invoice invoice = new Invoice(1, item, "20-2-2002", 10);
        supplier.printData();
        supplier.setName("Haekal");
        supplier.printData();
        item.printData();
        
    }

    public JStore()
    {

    }
}