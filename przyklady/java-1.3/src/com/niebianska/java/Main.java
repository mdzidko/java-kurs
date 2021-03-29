package com.niebianska.java;

import java.util.Scanner;

public class Main {

    static String[] operations = {"Wyjscie", "Dodawanie", "Odejmowanie", "Mnozenie", "Dzielenie", "Potegowanie",
            "Pierwiastkowanie"};
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chosenOperation;

        while(true) {
            printOperationsList();

            chosenOperation = scanner.nextInt();

            if (chosenOperation == 0){
                break;
            }

            if (chosenOperation > 6) {
                System.out.println("Niepoprawny numer operacji");
                continue;
            }

            System.out.println(operations[chosenOperation].toUpperCase());

            double result = 0;
            double[] arguments;

            switch(chosenOperation){
                case 1:
                    arguments = readTwoArguments();
                    result = arguments[0] + arguments[1];
                    break;
                case 2:
                    arguments = readTwoArguments();
                    result = arguments[0] - arguments[1];
                    break;
                case 3:
                    arguments = readTwoArguments();
                    result = arguments[0] * arguments[1];
                    break;
                case 4:
                    arguments = readTwoArguments();
                    result = arguments[0] / arguments[1];
                    break;
                case 5:
                    arguments = readTwoArguments();
                    result = Math.pow(arguments[0], arguments[1]);
                    break;
                case 6:
                    double argument = readArgument();
                    result = Math.sqrt(argument);
            }

            System.out.format("WYNIK: %.2f%n", result);
        }
    }

    private static double readArgument() {
        System.out.println("Podaj argument a:");
        double a = scanner.nextDouble();

        return a;
    }

    private static double[] readTwoArguments() {
        System.out.println("Podaj argument a:");
        double a = scanner.nextDouble();

        System.out.println("Podaj argument b:");
        double b = scanner.nextDouble();

        return new double[]{a, b};
    }

    static void printOperationsList(){
        System.out.println("Wybierz operacje: ");

        for (int i = 0; i < operations.length; i++) {
            System.out.println(i + ". " + operations[i]);
        }
    }
}
