package com.niebianska.warehouse.ui.operations;

import com.niebianska.warehouse.document.DocumentManager;
import com.niebianska.warehouse.inventory.Inventory;

import java.util.Scanner;
import java.util.UUID;

public class AcceptDocumentOperation extends LabeledOperation{
    private final DocumentManager documentManager;
    private final Inventory inventory;

    public AcceptDocumentOperation(final String label, final DocumentManager documentManager, final Inventory inventory) {
        super(label);
        this.documentManager = documentManager;
        this.inventory = inventory;
    }

    @Override
    public boolean execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Document number:");
        UUID number = UUID.fromString(scanner.next());

        documentManager.acceptDocument(number, inventory);

        return true;
    }
}
