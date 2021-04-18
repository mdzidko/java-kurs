package com.niebianska.warehouse.document;

import com.niebianska.warehouse.item.Item;

import java.util.Arrays;

public class DocumentBuilder {
    private DocumentLine[] lines = new DocumentLine[0];
    private DocumentType documentType;

    public DocumentBuilder line(Item item, long quantity) {
        DocumentLine newLine = new DocumentLine(item, quantity);

        lines = Arrays.copyOf(lines, lines.length + 1);
        lines[lines.length - 1] = newLine;

        return this;
    }

    public DocumentBuilder type(DocumentType documentType){
        this.documentType = documentType;

        return this;
    }

    public Document build(){
        if(documentType == null){
            System.out.println("Can't create document with no type");
            return null;
        }

        if(lines.length == 0){
            System.out.println("Can't create document with no lines");
            return null;
        }

        if(documentType == DocumentType.ISSUE){
            return new Issue(lines);
        }

        return new Receive(lines);
    }
}
