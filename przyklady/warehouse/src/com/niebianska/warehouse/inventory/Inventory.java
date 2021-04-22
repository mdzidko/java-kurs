package com.niebianska.warehouse.inventory;


import com.niebianska.warehouse.item.Item;
import com.niebianska.warehouse.util.SearchPredicate;
import com.niebianska.warehouse.util.TableSearch;

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
        return TableSearch.find(items, new SearchPredicate() {
            @Override
            public boolean evaluate(Object obj) {
                return inventoryItem.equals(obj);
            }
        });
    }

    public InventoryItem[] getInventory(){
        return items;
    }
}
