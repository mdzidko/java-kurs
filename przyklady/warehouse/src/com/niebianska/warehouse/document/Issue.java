package com.niebianska.warehouse.document;


import com.niebianska.warehouse.document.exceptions.WrongDocumentStatusException;
import com.niebianska.warehouse.inventory.Inventory;

public class Issue extends Document {
    public Issue(final DocumentLine[] lines) {
        super(DocumentType.ISSUE, lines);
    }

    @Override
    public void accept(final Inventory inventory) {
        if(this.status == DocumentStatus.ACCEPTED){
            throw new WrongDocumentStatusException(DocumentStatus.ACCEPTED, this.number);
        }

        for (final DocumentLine line : lines) {
            inventory.removeItem(line.getItem(), line.getQuantity());
        }

        this.status = DocumentStatus.ACCEPTED;
    }
}
