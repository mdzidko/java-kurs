package com.niebianska.warehouse.document;

import com.niebianska.warehouse.item.Item;

import java.util.Arrays;

public abstract class DocumentBuilder {
    protected DocumentLine[] lines = new DocumentLine[0];
    private final DocumentType documentType;

    protected DocumentBuilder(final DocumentType documentType) {
        this.documentType = documentType;
    }

    public DocumentBuilder line(Item item, long quantity) {
        DocumentLine newLine = new DocumentLine(item, quantity);

        lines = Arrays.copyOf(lines, lines.length + 1);
        lines[lines.length - 1] = newLine;

        return this;
    }

    public Document build(){
        if(lines.length == 0){
            System.out.println("Can't create document with no lines");
            return null;
        }

        return createDocument();
    }

    protected abstract Document createDocument();
}
