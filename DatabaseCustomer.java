
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class DatabaseCustomer {
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    public static ArrayList<Customer> getCustomerDatabase() {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }

    public static boolean addCustomer(Customer customer) {
        for (Customer customerDB : CUSTOMER_DATABASE) {
            if (customerDB.getName() == customer.getName() && customerDB.getEmail() == customer.getEmail()) {
                return false;
            }
        }
        CUSTOMER_DATABASE.add(customer);
        LAST_CUSTOMER_ID = customer.getId();
        return true;
    }

    public static Customer getCustomer(int id) {
        for (Customer customer : CUSTOMER_DATABASE) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    public static boolean removeCustomer(int id) {
        for (Customer customerDB : CUSTOMER_DATABASE) {
            if (customerDB.getId() == id) {
                CUSTOMER_DATABASE.remove(customerDB);
                return true;
            }
        }
        return false;
    }

}
