package com.niebianska.warehouse.ui.operations;

import java.util.Scanner;

public class ExitOperation extends Operation{
    public ExitOperation(final String label) {
        super(label);
    }

    @Override
    public boolean execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to exit? y/n");

        String scanned = scanner.next();

        if(scanned.equals("y")){
            return false;
        }

        return true;
    }
}
