package com.niebianska.warehouse.document;

import com.niebianska.warehouse.document.exceptions.DocumentCreationException;
import com.niebianska.warehouse.item.Item;

import java.util.ArrayList;
import java.util.List;

public abstract class DocumentBuilder {
    protected List<DocumentLine> lines = new ArrayList<>();
    private final DocumentType documentType;

    protected DocumentBuilder(final DocumentType documentType) {
        this.documentType = documentType;
    }

    public DocumentBuilder line(Item item, long quantity) {
        DocumentLine newLine = new DocumentLine(item, quantity);
        lines.add(newLine);

        return this;
    }

    public Document build(){
        if(lines.isEmpty()){
            throw new DocumentCreationException("Can't create document with no lines");
        }

        return createDocument();
    }

    protected abstract Document createDocument();
}
