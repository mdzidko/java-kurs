package com.niebianska.warehouse.domain;


public class Receive extends Document {
    public Receive(final DocumentLine[] lines) {
        super(lines);
    }

    @Override
    public void accept(final Inventory inventory) {
        for (final DocumentLine line : lines) {
            inventory.addItem(line.getItem(), line.getQuantity());
        }

        this.status = DocumentStatus.ACCEPTED;
    }
}
