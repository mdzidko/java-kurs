package com.niebianska.warehouse.domain;

import java.util.Objects;

class DocumentLine {
    private final Item item;
    private long quantity;

    public DocumentLine(final Item item, final long quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    Item getItem() {
        return item;
    }

    public long getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return item + ", quantity: " + quantity;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final DocumentLine that = (DocumentLine) o;
        return Objects.equals(item, that.item);
    }
}
