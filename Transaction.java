/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    public void orderNewItem(Supplier supplier)
    {
        Item item1 = new Item(1, "Meja", 2, ItemStatus.New, 10, ItemCategory.Furniture, supplier);
        DatabaseItem.itemDB = item1;
        Invoice invoice1 = new Invoice(1, item1, "2-3-19", item1.getPrice(),1, InvoiceStatus.Unpaid);
        item1.setStatus(ItemStatus.New);
        invoice1.setInvoiceStatus(InvoiceStatus.Paid);
        item1.printData();
        invoice1.printData();
    }
    
    public void orderSecondItem(Supplier supplier)
    {
        Item item1 = new Item(2, "Bangku", 2, ItemStatus.Second, 1, ItemCategory.Furniture, supplier);
        DatabaseItem.itemDB = item1;
        Invoice invoice1 = new Invoice(1, item1, "2-3-19", item1.getPrice(),1, InvoiceStatus.Unpaid);
        item1.setStatus(ItemStatus.New);
        invoice1.setInvoiceStatus(InvoiceStatus.Paid);
        item1.printData();
        invoice1.printData();
    }
    
    public void orderRefurbishedItem(Supplier supplier)
    {
        Item item1 = new Item(3, "Kursi", 2, ItemStatus.Refurbished, 1, ItemCategory.Furniture, supplier);
        DatabaseItem.itemDB = item1;
        Invoice invoice1 = new Invoice(1, item1, "2-3-19", item1.getPrice(),1, InvoiceStatus.Unpaid);
        item1.setStatus(ItemStatus.New);
        invoice1.setInvoiceStatus(InvoiceStatus.Paid);
        item1.printData();
        invoice1.printData();
    }
    
    public void sellItemPaid(Item item)
    {
        Invoice invoice1 = new Invoice(4, item, "2-3-19", item.getPrice(), 1, InvoiceStatus.Unpaid);
        invoice1.setInvoiceStatus(InvoiceStatus.Paid);
        item.setStatus(ItemStatus.Sold);
        invoice1.printData();        
    }
    
    public void sellItemUnpaid(Item item)
    {
        Invoice invoice1 = new Invoice(4, item, "2-3-19", item.getPrice(), 1, InvoiceStatus.Unpaid);
        invoice1.setInvoiceStatus(InvoiceStatus.Unpaid);
        item.setStatus(ItemStatus.Sold);
        invoice1.printData(); 
    }
    
    public void sellItemInstallment(Item item)
    {
        Invoice invoice1 = new Invoice(4, item, "2-3-19", item.getPrice(), 1, InvoiceStatus.Unpaid);
        invoice1.setInvoiceStatus(InvoiceStatus.Installment);
        item.setStatus(ItemStatus.Sold);
        invoice1.printData(); 
    }
    
    
}
