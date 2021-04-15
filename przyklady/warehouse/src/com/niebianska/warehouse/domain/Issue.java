package com.niebianska.warehouse.domain;


public class Issue extends Document{
    public Issue(final DocumentLine[] lines) {
        super(lines);
    }

    @Override
    public void accept(final Inventory inventory) {
        for (final DocumentLine line : lines) {
            inventory.removeItem(line.getItem(), line.getQuantity());
        }

        this.status = DocumentStatus.ACCEPTED;
    }
}
