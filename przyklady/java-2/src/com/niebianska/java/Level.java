package com.niebianska.java;

public enum Level {
    LOW(10),
    MEDIUM(20),
    HIGH(30);

    int value;

    int getValue() {
        return value;
    }

    Level(final int value) {
        this.value = value;
    }
}
