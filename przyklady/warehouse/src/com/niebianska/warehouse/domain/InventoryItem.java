package com.niebianska.warehouse.domain;

public class InventoryItem {
    private final Item item;
    private long quantity;

    public InventoryItem(final Item item) {
        this.item = item;
        this.quantity = 0;
    }

    public long getQuantity() {
        return quantity;
    }

    public long increaseQuantityBy(long quantity){
        if(quantity > 0) {
            this.quantity += quantity;
        }

        return this.quantity;
    }

    public long decreaseQuantityBy(long quantity){
        if(quantity > 0 && this.quantity - quantity >= 0) {
            this.quantity += quantity;
        }

        return this.quantity;
    }
}
