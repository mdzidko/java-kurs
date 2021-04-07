package com.niebianska.java;

public class Main {

    public static void main(String[] args) {

        //************************************************************************************************
        //WRAPPER CLASSES
        //************************************************************************************************
//        Integer wrappedDec = Integer.decode("34");
//        Integer wrappedIntFromHex = Integer.decode("0x0001A");
//
//        System.out.println("Integer from decimal string: " + wrappedDec);
//        System.out.println("Integer from hexadecimal string: " + wrappedIntFromHex);
//
//        Double a = Double.valueOf(1);
//        Double b = (0.3 * 3.0 + 0.1);
//
//        System.out.println("(==) Is a == b: " + (a == b));
//        System.out.println("(compareTo()) Is a == b: " + (a.compareTo(b)));
//        System.out.println("(compare) Is a == b: " + (Double.compare(a, b)));

        //************************************************************************************************
        //INICJALIZACJA
        //************************************************************************************************
        //House house = new House();
        //System.out.println(house.toString());
        //House smallHouse = new House(1, 3);
        //System.out.println(smallHouse.toString());

        //House mediumHouse = new House(10, 10, 2, 6, numberOfRooms1);
        //System.out.print(mediumHouse.toString());


        //************************************************************************************************
        //STATIC
        //************************************************************************************************
        //System.out.println(House.maxFloors);

        //House bigHouse = House.buildHouse(10, 12, 2, 8);
        //System.out.print(bigHouse.toString());


        //************************************************************************************************
        //FINAL
        //************************************************************************************************
        //System.out.println(House.maxFloors);
        //House.maxFloors = 4;
        //System.out.println(House.maxFloors);


        //************************************************************************************************
        //KLASY WEWNETRZNE
        //************************************************************************************************
        //House house = House.buildHouse(5, 5, 1, "red");
        //House.Door door = house.new Door("white");
        //House.Door door = new House.Door("red");


        //************************************************************************************************
        //DZIEDZICZENIE
        //************************************************************************************************
        Bird bird = new Bird("duck");
        Animal shark = new Fish("shark");


        //************************************************************************************************
        //POROWNYWANIE OBIEKTOW
        //************************************************************************************************

        String city = "Krakow";
        String city2 = "Krakow";
        String city3 = new String("Krakow");

        System.out.println("city == city2: " + (city == city2));
        System.out.println("city == city3: " + (city == city3));
        System.out.println("city equals city3: " + (city.equals(city3)));


        House houseOne = House.buildHouse(5, 5, 1, "red");
        houseOne.addRoom("living room", 1, 3, 5, "white");
        houseOne.addRoom("bedroom", 1, 2, 3, "pink");

        System.out.println(houseOne.toString());
        System.out.println("House number of rooms: " + houseOne.getNumberOfRooms());
        System.out.println("House living area: " + houseOne.getLivingArea());

        House houseTwo = House.buildHouse(5, 5, 1, "white");
        houseTwo.addRoom("living room", 1, 3, 5, "white");
        houseTwo.addRoom("bedroom", 1, 2, 3, "pink");

        System.out.println("HouseOne == HouseTwo: " + (houseOne == houseTwo));
        System.out.println("HouseOne equals HouseTwo: " + (houseOne.equals(houseTwo)));
    }
}
