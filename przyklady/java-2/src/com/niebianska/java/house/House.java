package com.niebianska.java.house;

import java.util.Arrays;
import java.util.Objects;

public class House implements Cloneable{
    public final static int maxFloors = 2;

    private double width;
    private final double length;
    private Room[] rooms;
    private final int numberOfFloors;
    private final Door door;


    public House(double width, double length, int numberOfFloors, String doorColor){
        this.width = width;
        this.length = length;
        this.numberOfFloors = numberOfFloors;

        this.rooms = new Room[0];

        this.door = new Door(doorColor);
    }

    public House(House house){
        this.width = house.width;
        this. length = house.length;
        this.rooms = house.rooms;
        this.numberOfFloors = house.numberOfFloors;
        this.door = new Door(house.door);
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

    public void changeDoorColor(String color){
        this.door.setColor(color);
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
                ", numberOfFloors=" + numberOfFloors +
                ", door=" + door.getColor() +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final House house = (House) o;
        return Double.compare(house.width, width) == 0 &&
                Double.compare(house.length, length) == 0;// &&
                //numberOfFloors == house.numberOfFloors &&
                //Objects.equals(door, house.door);
    }


    public static class Door{
        private String color;
        public Door(final String color) {
            this.color = color;
        }
        public Door(Door door){
            this.color = door.color;
        }


        String getColor() {
            return color;
        }

        public void setColor(String color){
            this.color = color;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            final Door door = (Door) o;
            return Objects.equals(color, door.color);
        }

    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new House(this.width, this.length, this.numberOfFloors, this.door.getColor());
    }
}
