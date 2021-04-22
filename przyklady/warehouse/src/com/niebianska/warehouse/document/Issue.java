package com.niebianska.warehouse.document;


import com.niebianska.warehouse.inventory.Inventory;

public class Issue extends Document {
    public Issue(final DocumentLine[] lines) {
        super(DocumentType.ISSUE, lines);
    }

    @Override
    public void accept(final Inventory inventory) {
        if(this.status == DocumentStatus.ACCEPTED){
            System.out.println("Wrong document status: accepted");
            return;
        }

        for (final DocumentLine line : lines) {
            inventory.removeItem(line.getItem(), line.getQuantity());
        }

        this.status = DocumentStatus.ACCEPTED;
    }
}
