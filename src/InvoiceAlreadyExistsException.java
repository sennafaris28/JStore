public class InvoiceAlreadyExistsException extends Exception {

    private Invoice invoice_error;

    public InvoiceAlreadyExistsException (Invoice invoice_input) {
        super();
        this.invoice_error = invoice_input;
    }

    @Override
    public String getMessage() {
        return "Invoice with Item list ";
    }

    public String getExMessage() {
        return super.getMessage() + invoice_error.getItem() + " already ordered by " + invoice_error.getCustomer().getUsername();
    }
}
