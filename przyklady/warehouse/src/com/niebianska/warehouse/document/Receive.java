package com.niebianska.warehouse.document;


import com.niebianska.warehouse.inventory.Inventory;

public class Receive extends Document {
    public Receive(final DocumentLine[] lines) {
        super(DocumentType.RECEIVE, lines);
    }

    @Override
    public void accept(final Inventory inventory) {
        if(this.status == DocumentStatus.ACCEPTED){
            System.out.println("Wrong document status: accepted");
            return;
        }

        for (final DocumentLine line : lines) {
            inventory.addItem(line.getItem(), line.getQuantity());
        }

        this.status = DocumentStatus.ACCEPTED;
    }
}
