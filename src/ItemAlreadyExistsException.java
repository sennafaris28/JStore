public class ItemAlreadyExistsException extends Exception {

    private Item item_error;

    public ItemAlreadyExistsException(Item item_input) {
        super();
        this.item_error = item_input;
    }

    @Override
    public String getMessage() {
        return "Item Name : ";
    }

    public String getExMessage() {
        return super.getMessage() + item_error.getName() + ", Category : " + item_error.getCategory() + ", Status : " + item_error.getStatus() + " from : " + item_error.getSupplier().getName() + " already exists. ";
    }
}
