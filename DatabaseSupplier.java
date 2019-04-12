import java.util.*;

/**
 *
 * Database Supplier Class
 *
 * @Senna Faris
 * @version 28/02/19
 *
 */
public class DatabaseSupplier {
    // instance variables - replace the example below with your own
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID = 0;

    public static ArrayList<Supplier> getSupplierDatabase() {
        return SUPPLIER_DATABASE;
    }

    public static int getLastSupplierID() {
        return LAST_SUPPLIER_ID;
    }

    public static boolean addSupplier(Supplier supplier) {
        for (Supplier supplierDB : SUPPLIER_DATABASE) {
            if ((supplierDB.getName() == supplier.getName()) && (supplierDB.getEmail() == supplier.getEmail())
                    && (supplierDB.getPhoneNumber() == supplier.getPhoneNumber())) {
                return false;
            }
        }
        SUPPLIER_DATABASE.add(supplier);
        LAST_SUPPLIER_ID = supplier.getId();
        return true;
    }

    public static Supplier getSupplier(int id) {
        for (Supplier supplierDB : SUPPLIER_DATABASE) {
            if (supplierDB.getId() == id) {
                return supplierDB;
            }
        }
        return null;
    }

    public static boolean removeSupplier(int id) {
        for (Supplier supplierDB : SUPPLIER_DATABASE) {
            if (supplierDB.getId() == id) {
                DatabaseItem.getItemFromSupplier(supplierDB).clear();
                return true;
            }
        }
        return false;
    }
}
