package com.niebianska.warehouse.ui.operations;

import com.niebianska.warehouse.domain.Document;
import com.niebianska.warehouse.domain.DocumentManager;

public class ListDocumentsOperation extends Operation{
    private final DocumentManager documentManager;

    public ListDocumentsOperation(final String label, final DocumentManager documentManager) {
        super(label);
        this.documentManager = documentManager;
    }

    @Override
    public boolean execute() {
        System.out.println();

        for (final Document document : documentManager.getDocuments()) {
            System.out.println(document);
        }

        System.out.println();

        return true;
    }
}
