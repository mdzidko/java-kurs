package com.niebianska.java;

import java.util.Arrays;

public class House {
    public final static int maxFloors = 2;

    private double width;
    private final double length;
    private Room[] rooms;
    private final int numberOfFloors;
    private final Door door;
    //private final int numberOfRooms;


//    static {
//        System.out.println("Statyczny: " + maxFloors);
//    }
//
//    {
//        System.out.println("Normalny: " + width);
//    }

//    public House(int numberOfFloors, int numberOfRooms){
//        this.numberOfFloors = numberOfFloors;
//        this.numberOfRooms = numberOfRooms;
//    }


    public House(double width, double length, int numberOfFloors, String doorColor){
        this.width = width;
        this.length = length;
        this.numberOfFloors = numberOfFloors;

        this.rooms = new Room[0];

        this.door = new Door(doorColor);
    }

    public static House buildHouse(double width, double length, int numberOfFloors, String doorColor){
        if(numberOfFloors > maxFloors){
            return null;
        }

        return new House(width, length, numberOfFloors, doorColor);
    }

    public void addRoom(String name, final int floor, int width, int length,  String color){
        if(floor > numberOfFloors || floor <= 0){
            return;
        }

        Room newRoom = new Room(name, floor, width, length, color);
        this.rooms = Arrays.copyOf(this.rooms, this.rooms.length + 1);
        this.rooms[this.rooms.length - 1] = newRoom;
    }

    double getWidth() {
        return width;
    }

    double getLength() {
        return length;
    }

    int getNumberOfFloors() {
        return numberOfFloors;
    }

    int getNumberOfRooms() {
        return rooms.length;
    }

    public double getLivingArea(){
        double livingArea = 0.0;

        for (final Room room : rooms) {
            livingArea += room.getArea();
        }

        return livingArea;
    }

    @Override
    public String toString() {
        return "House{" +
                "width=" + width +
                ", length=" + length +
                ", rooms=" + Arrays.toString(rooms) +
                ", numberOfFloors=" + numberOfFloors +
                "}";
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final House house = (House) o;
        return Double.compare(house.width, width) == 0 &&
                Double.compare(house.length, length) == 0 &&
                numberOfFloors == house.numberOfFloors &&
                Arrays.equals(rooms, house.rooms);
    }

    public static class Door{
        private final String color;


        public Door(final String color) {
            this.color = color;
        }

        String getColor() {
            return color;
        }
    }

}
