package com.niebianska.warehouse.domain;

import java.util.Objects;

public class InventoryItem{
    private final Item item;
    private long quantity;

    public InventoryItem(final Item item) {
        this.item = item;
        this.quantity = 0;
    }

    public long getQuantity() {
        return quantity;
    }

    public InventoryItem increaseQuantityBy(long quantity){
        if(quantity > 0) {
            this.quantity += quantity;
        }

        return this;
    }

    public InventoryItem decreaseQuantityBy(long quantity){
        if(quantity > 0 && this.quantity - quantity >= 0) {
            this.quantity -= quantity;
        }

        return this;
    }

    @Override
    public String toString() {
        return item + ", quantity: " + quantity;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final InventoryItem that = (InventoryItem) o;
        return Objects.equals(item, that.item);
    }
}
