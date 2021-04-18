package com.niebianska.java.animals;

import com.niebianska.java.animals.Animal;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
        //System.out.println("Bird constructor, name: " + name);
    }

    @Override
    public void eat() {
        System.out.println("Bird " + this.name + " eats");
    }

    public void fly(){
        System.out.println(this.name + " is flying");
    }
}
