package com.niebianska.warehouse.ui.operations;

import com.niebianska.warehouse.document.*;
import com.niebianska.warehouse.item.Item;
import com.niebianska.warehouse.item.PackageType;
import com.niebianska.warehouse.ui.Menu;

import java.util.Arrays;
import java.util.Scanner;

public class CreateDocumentOperation extends LabeledOperation{
    private final DocumentManager documentManager;

    private final Operation[] operations = {
            new SaveDocumentOperation("Save"),
            new AddItemOperation("Add item")
    };

    private final Menu menu = new Menu(operations);

    private DocumentBuilder documentBuilder;

    public CreateDocumentOperation(final String label, final DocumentManager documentManager) {
        super(label);
        this.documentManager = documentManager;
    }

    @Override
    public boolean execute() {
        System.out.println("What document you want to create (1: Receive, 2: Issue)?");

        Scanner scanner = new Scanner(System.in);
        int documentType = scanner.nextInt();

        if(documentType == 1){
            documentBuilder = new DocumentBuilder(DocumentType.RECEIVE) {
                @Override
                protected Document createDocument() {
                    return new Receive(this.lines);
                }
            };
        }
        else if(documentType == 2){
            documentBuilder = new DocumentBuilder(DocumentType.ISSUE) {
                @Override
                protected Document createDocument() {
                    return new Issue(this.lines);
                }
            };
        }
        else{
            System.out.println("Wrong document type");
            return true;
        }

        menu.run();
        return true;
    }

    private class SaveDocumentOperation extends LabeledOperation {
        public SaveDocumentOperation(final String label) {
            super(label);
        }

        @Override
        public boolean execute() {
            Document newDocument = documentBuilder.build();
            documentManager.addDocument(newDocument);

            return false;
        }
    }

    private class AddItemOperation extends LabeledOperation {
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
