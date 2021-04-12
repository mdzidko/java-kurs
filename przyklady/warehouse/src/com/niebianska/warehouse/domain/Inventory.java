package com.niebianska.warehouse.domain;


import java.util.Arrays;

public class Inventory {
    private InventoryItem[] items = new InventoryItem[0];

    public Inventory addItem(Item item, long quantity){
        InventoryItem inventoryItem = new InventoryItem(item);
        int itemIndex = searchItem(inventoryItem);

        if(itemIndex >= 0){
            items[itemIndex].increaseQuantityBy(quantity);
        }
        else{
            items = Arrays.copyOf(items, items.length + 1);
            items[items.length - 1] = inventoryItem.increaseQuantityBy(quantity);
        }

        return this;
    }

    public Inventory removeItem(Item item, long quantity){
        InventoryItem inventoryItem = new InventoryItem(item);
        int itemIndex = searchItem(inventoryItem);

        if(itemIndex >= 0){
            items[itemIndex].decreaseQuantityBy(quantity);
        }

        return this;
    }

    private int searchItem(InventoryItem inventoryItem) {
        for (int i = 0; i < items.length; i++) {
            if(items[i].equals(inventoryItem)){
                return i;
            }
        }
        return -1;
    }

    public InventoryItem[] getInventory(){
        return items;
    }
}
