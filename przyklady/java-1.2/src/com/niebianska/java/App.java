package com.niebianska.java;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------
        //OPERATORY
        //--------------------------------------------------------------------------------
        int a = 18;
        int b = 12;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a / b = " + ((float) a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("a++ = " + a++);
        System.out.println("++b = " + ++b);
        System.out.println("a-- = " + a--);
        System.out.println("--b = " + --b);

        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("isTrue || isFalse = " + (isTrue || isFalse));
        System.out.println("isTrue && isFalse = " + (isTrue && isFalse));
        System.out.println("!isTrue = " + !isTrue);
        System.out.println("isTrue ^ isFalse = " + (isTrue ^ isFalse));

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a <= b : " + (a <= b));


        //--------------------------------------------------------------------------------
        //FUNKCJE
        //--------------------------------------------------------------------------------
        printAddress("Krakow", "Zakopianska", "30-600", 46);
        System.out.println(createAddress("Krakow", "Zakopianska", "30-600", 46));

        int sumOfTwo = add(12, 18);
        System.out.println("sum of two integers is " + sumOfTwo);

        int sumOfThree = add(12, 18, 10);
        System.out.println("sum of three integers is " + sumOfThree);


        //--------------------------------------------------------------------------------
        //INSTRUKCJE STERUJACE LOGIKA: IF
        //--------------------------------------------------------------------------------
        int numberOfStudents = 25;
        int numberOfChairs = 20;

        if (numberOfStudents > numberOfChairs) {
            System.out.println("Not enough chairs for all students");
        } else {
            System.out.println("Enough chairs for all students");
        }


        int mark;
        boolean isHomeworkDone = true;
        int homeworkLength = 100;

        if (isHomeworkDone && homeworkLength > 90) {
            mark = 5;
        } else if (isHomeworkDone) {
            mark = 3;
        } else {
            mark = 1;
        }

        System.out.println("Your mark is: " + mark);


        //--------------------------------------------------------------------------------
        //INSTRUKCJE STERUJACE LOGIKA: SWITCH CASE
        //--------------------------------------------------------------------------------
        String animal = "bird";

        switch (animal) {
            case "dog":
                System.out.println("Animal is dog");
                break;
            case "cat":
                System.out.println("Animal is cat");
                break;
            default:
                System.out.println("Unknown animal");
        }

        //--------------------------------------------------------------------------------
        //INSTRUKCJE STERUJACE LOGIKA: TERNARY
        //--------------------------------------------------------------------------------
        String upperCaseAnimal = animal.length() > 3 ? animal.toUpperCase() : animal;
        System.out.println(upperCaseAnimal);


        //--------------------------------------------------------------------------------
        //PETLE: WHILE, DO WHILE
        //--------------------------------------------------------------------------------
        int i = 10;

        while(i > 10){
            System.out.println("WHILE: Value is greater than 10");
        };

        do{
            System.out.println("DO WHILE: Value is greater than 10");
        }while(i > 10);


        //--------------------------------------------------------------------------------
        //PETLE: FOR
        //--------------------------------------------------------------------------------
        for (int j = 0; j <= 10; j++) {
            System.out.print(j + ".");
        }

        System.out.println();

        //--------------------------------------------------------------------------------
        //TABLICE
        //--------------------------------------------------------------------------------
        int[] numbers = {1, 6, 2, 3, 8, 32, -1, 54, -23, 3, 1, 0, -1};
        String[] cities = {"Krakow", "Wroclaw", "Warszawa", "Gdansk", "Poznan", "Szczecin"};

        System.out.println(numbers);
        System.out.println(cities);

        System.out.println(cities[0] + ", " + cities[3]);
        System.out.println("There are " + cities.length + " cities");

        for (int j = 0; j < cities.length; j++) {
            System.out.println(j + ". " + cities[j]);
        }

        for (String city : cities) {
            System.out.println(city.toUpperCase());
        }

        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + ".");
        }

        System.out.println();

        Arrays.sort(cities);
        int cityPosition = Arrays.binarySearch(cities, "Poznan");
        System.out.println(Arrays.toString(cities));
        System.out.println("City is at position: " + cityPosition);

        //--------------------------------------------------------------------------------
        //PARAMETRY PROGRAMU
        //--------------------------------------------------------------------------------
        System.out.println("Application started with parameters: ");
        for (String arg : args) {
            System.out.println(arg);
        }

        if(args.length > 0) {
            int intParam = Integer.parseInt(args[0]);
        }

        //--------------------------------------------------------------------------------
        //WPROWADZANIE DANYCH Z KLAWIATURY
        //--------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string:");
        String scannedString = scanner.next();
        System.out.println("You entered: " + scannedString);

        System.out.println("Enter integer number:");
        int scannedInt = scanner.nextInt();
        System.out.println("You entered: " + scannedInt);

    }

    public static void printAddress(String city, String street, String postal, int local) {
        System.out.println(street + " " + local + ", " + postal + " " + city);
    }

    public static String createAddress(String city, String street, String postal, int local) {
        return street + " " + local + ", " + postal + " " + city;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
