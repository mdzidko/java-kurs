package com.niebianska.warehouse.domain;

import java.util.Arrays;
import java.util.UUID;

public class DocumentManager {
    private Document[] documents = new Document[0];

    public Document[] getDocuments() {
        return documents;
    }

    public void addDocument(Document document){
        documents = Arrays.copyOf(documents, documents.length + 1);
        documents[documents.length - 1] = document;
    }

    public void acceptDocument(UUID number, Inventory inventory){
        int index = searchDocument(number);

        if(index < 0){
            System.out.println("Document with number: " + number.toString() + " not found");
            return;
        }

        documents[index].accept(inventory);
    }

    private int searchDocument(UUID number) {
        for (int i = 0; i < documents.length; i++) {
            if(documents[i].getNumber().equals(number)){
                return i;
            }
        }
        return -1;
    }
}
