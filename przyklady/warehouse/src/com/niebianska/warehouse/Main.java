package com.niebianska.warehouse;

import com.niebianska.warehouse.domain.Inventory;
import com.niebianska.warehouse.domain.Item;
import com.niebianska.warehouse.domain.PackageType;
import com.niebianska.warehouse.ui.operations.*;
import com.niebianska.warehouse.ui.UserInterface;

public class Main {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory
                .addItem(new Item("Plytki", "BOX"), 10)
                .addItem(new Item("Wanna", "PALLET"), 6)
                .addItem(new Item("Plytki", "BOX"), 10)
                .addItem(new Item("Umywalka", "CASE"), 7)
                .removeItem(new Item("Wanna", "PALLET"), 4);

        Operation[] operations = {
                new ExitOperation("Exit"),
                new ShowInventoryOperation("Show inventory", inventory),
                new ListDocumentsOperation("List documents"),
                new CreateDocumentOperation("Create document"),
                new AcceptDocumentOperation("Accept document")
        };

        UserInterface userInterface = new UserInterface(operations);
        userInterface.run();
    }
}
