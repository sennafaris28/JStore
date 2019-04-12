import java.util.ArrayList;

/**
 * Databasa Item Class
 *
 * @author Senna Faris
 * @version 28/02/19
 */
public class DatabaseItem {
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<Item>();
    private static int LAST_ITEM_ID = 0;

    public static ArrayList<Item> getItemDatabase() {
        return ITEM_DATABASE;
    }

    public static int getLastItemID() {
        return LAST_ITEM_ID;
    }

    public static boolean addItem(Item item) {
        boolean temp = false;
        for (Item itemDB : ITEM_DATABASE) {
            if ((item.getName() != itemDB.getName()) && (item.getStatus() != itemDB.getStatus())
                    && (item.getSupplier() != itemDB.getSupplier())) {
                ITEM_DATABASE.add(item);
                LAST_ITEM_ID = item.getId();
                temp = true;
            } else {
                temp = false;
            }
        }
        return temp;
    }

    public static Item getItemFromID(int id) {
        Item temp = null;
        for (Item itemDB : ITEM_DATABASE) {
            if (itemDB.getId() == id) {
                temp = itemDB;
            }
        }
        return temp;
    }

    public static ArrayList<Item> getItemFromSupplier(Supplier supplier) {
        ArrayList<Item> temp = new ArrayList<>();
        for (Item itemDB : ITEM_DATABASE) {
            if (itemDB.getSupplier() == supplier) {
                temp.add(itemDB);
            } else {
                temp = null;
            }
        }
        return temp;
    }

    public static ArrayList<Item> getItemFromCategory(ItemCategory category) {
        ArrayList<Item> temp = new ArrayList<>();
        for (Item itemDB : ITEM_DATABASE) {
            if (itemDB.getCategory() == category) {
                temp.add(itemDB);
            }
        }
        if (temp.size() > 0) {
            return temp;
        } else {
            return null;
        }
    }

    public static ArrayList<Item> getItemFromStatus(ItemStatus status) {
        ArrayList<Item> temp = new ArrayList<>();
        for (Item itemDB : ITEM_DATABASE) {
            if (itemDB.getStatus() == status) {
                temp.add(itemDB);
            } else {
                temp = null;
            }
        }
        return temp;
    }

    public static boolean removeItem(int id) {
        boolean temp = false;
        for (Item itemDB : ITEM_DATABASE) {
            if (itemDB.getId() == id) {
                ITEM_DATABASE.remove(id);
                temp = true;
            }
        }
        return temp;
    }
}
