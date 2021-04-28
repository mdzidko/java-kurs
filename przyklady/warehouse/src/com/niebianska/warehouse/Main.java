package com.niebianska.warehouse;

import com.niebianska.warehouse.document.DocumentManager;
import com.niebianska.warehouse.inventory.Inventory;
import com.niebianska.warehouse.ui.operations.*;
import com.niebianska.warehouse.ui.Menu;

public class Main {

    public static void main(String[] args) {
        Inventory inventory = initInventory();
        DocumentManager documentManager = new DocumentManager();

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
    }
}
