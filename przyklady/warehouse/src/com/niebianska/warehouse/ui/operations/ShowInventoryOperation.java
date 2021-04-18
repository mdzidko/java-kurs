package com.niebianska.warehouse.ui.operations;

import com.niebianska.warehouse.inventory.Inventory;
import com.niebianska.warehouse.ui.InventoryPrinter;
import com.niebianska.warehouse.ui.TablePrinter;


public class ShowInventoryOperation extends Operation{
    private final Inventory inventory;
    private final TablePrinter printer = new InventoryPrinter();

    public ShowInventoryOperation(final String label, final Inventory inventory) {
        super(label);
        this.inventory = inventory;
    }

    @Override
    public boolean execute() {
        System.out.println();
        printer.print(inventory.getInventory());
        System.out.println();

        return true;
    }
}
