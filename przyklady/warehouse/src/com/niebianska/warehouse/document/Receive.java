package com.niebianska.warehouse.document;


import com.niebianska.warehouse.document.exceptions.WrongDocumentStatusException;
import com.niebianska.warehouse.inventory.Inventory;


public class Receive extends Document {
    public Receive(final Iterable<DocumentLine> lines) {
        super(DocumentType.RECEIVE, lines);
    }

    @Override
    public void accept(final Inventory inventory) {
        if(this.status == DocumentStatus.ACCEPTED){
            throw new WrongDocumentStatusException(DocumentStatus.ACCEPTED, this.number);
        }

        for (final DocumentLine line : lines) {
            inventory.addItem(line.getItem(), line.getQuantity());
        }

        this.status = DocumentStatus.ACCEPTED;
    }
}
