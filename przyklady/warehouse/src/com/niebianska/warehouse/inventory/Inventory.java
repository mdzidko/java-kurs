package com.niebianska.warehouse.inventory;


import com.niebianska.warehouse.item.Item;
import com.niebianska.warehouse.util.TableSearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Item, Long> items = new HashMap<>();


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

        if(itemIndex < 0){
            throw new ItemNotFoundException(item.getName());
        }

        items[itemIndex].decreaseQuantityBy(quantity);

        return this;
    }

    private int searchItem(InventoryItem inventoryItem) {
        return TableSearch.find(items, item -> item.equals(inventoryItem));
    }

    public InventoryItem[] getInventory(){
        return items;
    }
}
