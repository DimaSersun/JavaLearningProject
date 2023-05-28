package com.Orange.zooclubservice;

public class Dog extends Animal implements AnimalInterface{
    public Dog(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("Dog: " + getName() + " is eating bones.");
    }

    @Override
    public void makeSound(){
        System.out.println("Dog " + getName() + " says auf.");
    }
}
