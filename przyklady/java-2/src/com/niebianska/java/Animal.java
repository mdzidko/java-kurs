package com.niebianska.java;

class Animal {
    final String name;

    Animal(final String name) {
        System.out.println("Animal constructor, name: " + name);
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " eats");
    }
}
