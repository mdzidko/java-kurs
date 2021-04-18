package com.niebianska.warehouse.ui.operations;

import com.niebianska.warehouse.document.DocumentManager;
import com.niebianska.warehouse.ui.DocumentPrinter;
import com.niebianska.warehouse.ui.TablePrinter;

public class ListDocumentsOperation extends Operation{
    private final DocumentManager documentManager;
    private final TablePrinter printer = new DocumentPrinter();

    public ListDocumentsOperation(final String label, final DocumentManager documentManager) {
        super(label);
        this.documentManager = documentManager;
    }

    @Override
    public boolean execute() {
        System.out.println();
        printer.print(documentManager.getDocuments());
        System.out.println();

        return true;
    }
}
