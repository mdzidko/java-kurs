package com.niebianska.java.house;


public class Room {
    private final String name;
    private final int floor;
    private final double width;
    private final double length;
    private String color;

    public Room(final String name, final int floor, final double width, final double length, final String color) {
        this.name = name;
        this.floor = floor;
        this.width = width;
        this.length = length;
        this.color = color;
    }


    String getName() {
        return name;
    }

    int getFloor() {
        return floor;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public void repaint(String color) {
        this.color = color;
    }
}
