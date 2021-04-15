package com.niebianska.warehouse.ui.operations;

import com.niebianska.warehouse.domain.*;
import com.niebianska.warehouse.ui.Menu;

import java.util.Arrays;
import java.util.Scanner;

public class CreateDocumentOperation extends Operation{
    private final DocumentManager documentManager;

    private final Operation[] operations = {
            new SaveDocumentOperation("Save"),
            new AddItemOperation("Add item")
    };

    private final Menu menu = new Menu(operations);

    private final DocumentBuilder documentBuilder = Document.builder();

    public CreateDocumentOperation(final String label, final DocumentManager documentManager) {
        super(label);
        this.documentManager = documentManager;
    }

    @Override
    public boolean execute() {
        menu.run();
        return true;
    }

    private class SaveDocumentOperation extends Operation {
        public SaveDocumentOperation(final String label) {
            super(label);
        }

        @Override
        public boolean execute() {
            Document newDocument = documentBuilder.buildReceive();
            documentManager.addDocument(newDocument);

            return false;
        }
    }

    private class AddItemOperation extends Operation {
        public AddItemOperation(final String label) {
            super(label);
        }

        @Override
        public boolean execute() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Item name: ");
            String itemName = scanner.next();

            System.out.println("Quantity: ");
            long quantity = scanner.nextInt();

            System.out.println("Package type (" + Arrays.toString(PackageType.values()) + "): ");
            String packageType = scanner.next();

            Item newItem = new Item(itemName, packageType);
            documentBuilder.line(newItem, quantity);

            return true;
        }
    }
}
