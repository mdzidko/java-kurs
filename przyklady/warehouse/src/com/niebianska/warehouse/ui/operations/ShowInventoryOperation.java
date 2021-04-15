package com.niebianska.warehouse.ui.operations;

import com.niebianska.warehouse.domain.Inventory;
import com.niebianska.warehouse.domain.InventoryItem;


public class ShowInventoryOperation extends Operation{
    private final Inventory inventory;

    public ShowInventoryOperation(final String label, final Inventory inventory) {
        super(label);
        this.inventory = inventory;
    }

    @Override
    public boolean execute() {
        System.out.println();

        for (final InventoryItem inventoryItem : inventory.getInventory()) {
            System.out.println(inventoryItem);
        }

        System.out.println();

        return true;
    }
}
