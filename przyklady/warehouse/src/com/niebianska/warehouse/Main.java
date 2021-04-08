package com.niebianska.warehouse;

import com.niebianska.warehouse.ui.operations.*;
import com.niebianska.warehouse.ui.UserInterface;

public class Main {

    public static void main(String[] args) {
        Operation[] operations = {
                new ExitOperation("Exit"),
                new ShowInventoryOperation("Show inventory"),
                new ListDocumentsOperation("List documents"),
                new CreateDocumentOperation("Create document"),
                new AcceptDocumentOperation("Accept document")
        };

        UserInterface userInterface = new UserInterface(operations);
        userInterface.run();
    }
}
