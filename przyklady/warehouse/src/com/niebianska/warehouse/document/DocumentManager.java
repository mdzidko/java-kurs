package com.niebianska.warehouse.document;

import com.niebianska.warehouse.document.exceptions.DocumentNotFoundException;
import com.niebianska.warehouse.inventory.Inventory;
import com.niebianska.warehouse.util.TableSearch;

import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

public class DocumentManager {
    private Map<UUID, Document> documents = new Document[0];

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
            throw new DocumentNotFoundException(number);
        }

        documents[index].accept(inventory);
    }

    private int searchDocument(UUID number) {
        return TableSearch.find(documents, document -> document.getNumber().equals(number));
    }
}
