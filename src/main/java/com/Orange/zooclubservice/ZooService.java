package com.Orange.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Dog dog = new Dog("Tuzic");
        Cat cat  = new Cat("Barsic");

        cat.eat();
        cat.makeSound();

        dog.eat();
        dog.makeSound();
    }
}
