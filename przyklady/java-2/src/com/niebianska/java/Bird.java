package com.niebianska.java;

class Bird extends Animal{
    Bird(String name) {
        super(name);
        System.out.println("Bird constructor, name: " + name);
    }
}
