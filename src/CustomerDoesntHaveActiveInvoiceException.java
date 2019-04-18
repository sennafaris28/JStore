public class CustomerDoesntHaveActiveInvoiceException extends Exception {

    private Customer customer_error;

    public CustomerDoesntHaveActiveInvoiceException(Customer customer_input) {
        super("Customer : ");
        this.customer_error = customer_input;
    }

    public String getExMessage() {
        return super.getMessage() + customer_error + " does not have active invoice. ";
    }

}
