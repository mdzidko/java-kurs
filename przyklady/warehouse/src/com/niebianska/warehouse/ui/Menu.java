package com.niebianska.warehouse.ui;


import com.niebianska.warehouse.ui.operations.Operation;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final Operation[] operations;

    public Menu(Operation[] operations) {
        this.operations = operations;
    }

    public void run(){
        boolean running = true;

        while(running){
            System.out.println("Choose operation:");

            printOperations();
            int chosenOperation = selectOperation();

            if(!isOperationNumberValid(chosenOperation)){
                System.out.println("Wrong operation number. Select again.");
                continue;
            }

            running = operations[chosenOperation].execute();
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
