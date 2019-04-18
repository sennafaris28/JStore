public class CustomerDoesntHaveActiveInvoiceException extends Exception {

    private Customer customer_error;

    public CustomerDoesntHaveActiveInvoiceException(Customer customer_input) {
        super();
        this.customer_error = customer_input;
    }

    @Override
    public String getMessage() {
        return "Customer : ";
    }

    public String getExMessage() {
        return super.getMessage() + customer_error + " does not have active invoice. ";
    }

}
