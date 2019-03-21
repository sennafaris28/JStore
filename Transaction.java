/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    public void orderNewItem(Item item)
    {
        item.setStatus(ItemStatus.New);
        Invoice buy_paid1 = new Buy_Paid(1, item, "17-8-2020", item.getPrice(), 10);
        if (buy_paid1 instanceof Sell_Paid) {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else {
            System.out.println("Salah, Invoice Type bukan Sell_Paid");
        }
        buy_paid1.printData();
        item.printData();
    }
    
    public void orderSecondItem(Item item)
    {
        item.setStatus(ItemStatus.Second);
        Invoice buy_paid1 = new Buy_Paid(1, item, "17-8-2020", item.getPrice(), 10);
        buy_paid1.printData();
        item.printData();
    }
    
    public void orderRefurbishedItem(Item item)
    {
        item.setStatus(ItemStatus.Refurbished);
        Invoice buy_paid1 = new Buy_Paid(1, item, "17-8-2020", item.getPrice(), 10);
        buy_paid1.printData();
        item.printData();
    }
    
    public void sellItemPaid(Item item)
    {
        item.setStatus(ItemStatus.Sold);
        Invoice sell_paid1 = new Sell_Paid(1, item, "17-8-2020", item.getPrice(), 10);
        sell_paid1.printData();
        item.printData();
    }
    
    public void sellItemUnpaid(Item item)
    {
        item.setStatus(ItemStatus.Sold);
        Invoice sell_unpaid1 = new Sell_Unpaid(1, item, "17-8-2020", 10, item.getPrice(), "18-8-2020");
        sell_unpaid1.printData();
        item.printData();
    }
    
    public void sellItemInstallment(Item item)
    {
        item.setStatus(ItemStatus.Sold);
        Invoice sell_installment1 = new Sell_Installment(1, item, "17-8-2020", 10, item.getPrice(), 10, 0);
        sell_installment1.printData();
        item.printData();
    }
    
    
}
