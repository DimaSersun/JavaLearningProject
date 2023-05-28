package com.Orange.zooclubservice;

public class Cat extends Animal implements AnimalInterface{
    public Cat(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("Cat: " + getName() + " is eating expensive food.");
    }

    @Override
    public void makeSound(){
        System.out.println("Cat: " + getName() + " says Meaaaauuu.");
    }
}
