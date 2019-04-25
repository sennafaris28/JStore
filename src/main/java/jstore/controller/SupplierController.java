package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class SupplierController {

    @RequestMapping(value = "/suppliers", method = RequestMethod.GET)
    public ArrayList<Supplier> itemsList() {
        ArrayList<Supplier> supplierList = DatabaseSupplier.getSupplierDatabase();
        return supplierList;
    }

    @RequestMapping(value = "/suppliers/{id_supplier}", method = RequestMethod.GET)
    public Supplier getSupplier(@PathVariable int id_supplier) {
        Supplier supplier = DatabaseSupplier.getSupplier(id_supplier);
        return supplier;
    }

}
