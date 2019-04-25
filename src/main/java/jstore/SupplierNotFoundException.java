package jstore;

import java.util.*;

public class SupplierNotFoundException extends Exception {

    private int supplier_error;

    public SupplierNotFoundException(int supplier_input) {
        super("Supplier ID : ");
        this.supplier_error = supplier_input;
    }

    public String getExMessage() {
        return super.getMessage() + supplier_error + " not found. ";
    }

}
