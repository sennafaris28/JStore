package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ItemController {

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public ArrayList<Item> itemsList() {
        ArrayList<Item> itemList = DatabaseItem.getItemDatabase();
        return itemList;
    }

    @RequestMapping(value = "/items/{id_item}", method = RequestMethod.GET)
    public Item getItem(@PathVariable int id_item) {
        Item item = DatabaseItem.getItemFromID(id_item);
        return item;
    }

}
