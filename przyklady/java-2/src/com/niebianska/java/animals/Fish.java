package com.niebianska.java.animals;

public class Fish extends Animal{
    public Fish(String name) {
        super(name);
        //System.out.println("Fish constructor, name: " + name);
    }

    @Override
    public void eat() {
        System.out.println("Fish " + this.name + " eats");
    }

    public void swim(){
        System.out.println(this.name + " is swimming");
    }
}
