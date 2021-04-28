package com.niebianska.warehouse.inventory;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException(final String name) {
        super("Item " + name + " was not found");
    }
}
