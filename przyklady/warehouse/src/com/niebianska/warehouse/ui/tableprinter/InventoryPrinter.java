package com.niebianska.warehouse.ui.tableprinter;

import com.niebianska.warehouse.inventory.InventoryItem;

public class InventoryPrinter extends HeaderTablePrinter {
    @Override
    protected void printHeaders() {
        System.out.printf("%-6s%-20s%-20s%-20s\n", "Lp", "Item name", "Package type", "Quantity");
    }

    @Override
    protected void printTable(final Object[] table) {
        for (int i = 0; i < table.length; i++) {
            InventoryItem item = (InventoryItem)table[i];
            System.out.printf("%-6s%-20s%-20s%d\n", i, item.getItem().getName(), item.getItem().getPackageType(), item.getQuantity());
        }
    }
}
