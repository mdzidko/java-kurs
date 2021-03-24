package com.niebianska.java;

public class App {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------
        //PIERWSZY PROGRAM
        //--------------------------------------------------------------------------------
        System.out.println("Pierwszy program w Javie");


        //--------------------------------------------------------------------------------
        //ZMIENNE, TYPY DANYCH
        //--------------------------------------------------------------------------------
        boolean isJavaGood = true;

        char classId = 'B';

        byte jdkVersion = 16;
        short numberOfStudents = 345;
        int temperatureOutside = -16;
        long largeNumber = 1992333213;

        float myMoney = 34122.32f;
        double billGatesMoney = 99213344433.99;


        //--------------------------------------------------------------------------------
        //WYPISYWANIE NA EKRAN
        //--------------------------------------------------------------------------------
        System.out.print("Is Java in version ");
        System.out.print(jdkVersion);
        System.out.print(" good: ");
        System.out.print(isJavaGood + "\n");
        System.out.println(largeNumber + " is really large number");
        System.out.println("I have " + myMoney + " dollars");

        System.out.format("There is %d degrees outside%n", temperatureOutside);
        System.out.format("Bill Gates has %.2f dollars%n", billGatesMoney);
        System.out.format("There are %d students in class %c%n", numberOfStudents, classId);


        //--------------------------------------------------------------------------------
        //RZUTOWANIE
        //--------------------------------------------------------------------------------
        int numberOfPeople = 38000000;
        byte converted = (byte)numberOfPeople;

        System.out.println("There are " + numberOfPeople + " people in Poland");
        System.out.println("Conversion goes wrong. Now there are " + converted + " people in Poland");

        int a = 5;
        int b = 7;
        float c = 7f;

        System.out.println("a / b is " + a / b + ". REALLY!?");
        System.out.println("a / b is " + (float)a / b);
        System.out.println("a / c is " + a / c);


        //--------------------------------------------------------------------------------
        //STRING I STRING BUILDER
        //--------------------------------------------------------------------------------
        String krakow = "Krakow";
        String warszawa = new String("Warszawa");

        System.out.println(krakow + " is former capital of Poland");
        System.out.format("%s is capital of Poland%n", warszawa);

        int wordLength = warszawa.length();
        System.out.format("Word %s has %d letters%n", warszawa, wordLength);

        String krakowInUppercase = krakow.toUpperCase();
        System.out.println(krakowInUppercase);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(krakow);
        stringBuilder.append(" is former capital of Poland, ");
        stringBuilder.append(" but now ");
        stringBuilder.append(warszawa);
        stringBuilder.append(" is capital");

        System.out.println(stringBuilder.toString());
    }
}
