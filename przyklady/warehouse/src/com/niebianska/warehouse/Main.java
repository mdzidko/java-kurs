package com.niebianska.warehouse;

import com.niebianska.warehouse.document.Document;
import com.niebianska.warehouse.document.DocumentManager;
import com.niebianska.warehouse.document.DocumentType;
import com.niebianska.warehouse.inventory.Inventory;
import com.niebianska.warehouse.item.Item;
import com.niebianska.warehouse.ui.operations.*;
import com.niebianska.warehouse.ui.Menu;

public class Main {

    public static void main(String[] args) {
        Inventory inventory = initInventory();
        DocumentManager documentManager = new DocumentManager();

//        Document document = Document
//                .builder()
//                .type(DocumentType.RECEIVE)
//                .line(new Item("Plytki", "BOX"), 10)
//                .line(new Item("Wanna", "PALLET"), 6)
//                .line(new Item("Umywalka", "CASE"), 7)
//                .line(new Item("Plytki", "BOX"), 10)
//                .build();
//
//        documentManager.addDocument(document);
//
//        documentManager.acceptDocument(document.getNumber(), inventory);

        Operation[] operations = {
                new ExitOperation("Exit"),
                new ShowInventoryOperation("Show inventory", inventory),
                new ListDocumentsOperation("List documents", documentManager),
                new CreateDocumentOperation("Create document", documentManager),
                new AcceptDocumentOperation("Accept document", documentManager, inventory)
        };

        Menu menu = new Menu(operations);
        menu.run();
    }

    private static Inventory initInventory() {
        return new Inventory();
//                .addItem(new Item("Plytki", "BOX"), 10)
//                .addItem(new Item("Wanna", "PALLET"), 6)
//                .addItem(new Item("Plytki", "BOX"), 10)
//                .addItem(new Item("Umywalka", "CASE"), 7)
//                .removeItem(new Item("Wanna", "PALLET"), 4);
    }
}
