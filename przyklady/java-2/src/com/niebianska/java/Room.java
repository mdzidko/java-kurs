package com.niebianska.java;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", floor=" + floor +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Room room = (Room) o;
        return floor == room.floor &&
                Double.compare(room.width, width) == 0 &&
                Double.compare(room.length, length) == 0 &&
                Objects.equals(name, room.name) &&
                Objects.equals(color, room.color);
    }
}
