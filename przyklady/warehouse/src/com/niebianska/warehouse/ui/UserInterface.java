package com.niebianska.warehouse.ui;


import com.niebianska.warehouse.ui.operations.Operation;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner = new Scanner(System.in);
    private final Operation[] operations;

    public UserInterface(Operation[] operations) {
        this.operations = operations;
    }

    public void run(){
        while(true){
            System.out.println("Choose operation:");

            printOperations();
            int chosenOperation = selectOperation();

            if(!isOperationNumberValid(chosenOperation)){
                System.out.println("Wrong operation number. Select again.");
                continue;
            }

            operations[chosenOperation].execute();
        }
    }

    private void printOperations() {
        for (int i = 0; i < operations.length; i++) {
            System.out.println(i + ". " + operations[i].toString());
        }
    }

    private int selectOperation() {
        return scanner.nextInt();
    }

    private boolean isOperationNumberValid(int choosenOperation) {
        return choosenOperation >= 0 && choosenOperation < operations.length;
    }


}
