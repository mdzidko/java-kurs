package com.niebianska.java.animals;

public class Animal {
    public final String name;

    public Animal(final String name) {
        //System.out.println("Animal constructor, name: " + name);
        this.name = name;
    }

    public void eat(){
        System.out.println("Animal " + name + " eats");
    }

    public void eat(String food){
        System.out.println("Animal " + name + " eats " + food);
    }


}
