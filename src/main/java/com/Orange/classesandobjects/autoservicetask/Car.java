package com.Orange.classesandobjects.autoservicetask;

public class Car {
    String ownerName;
    String plateNumber;
    String producer;
    double price;
    String fuelType;
    String transmission;
    double motorCapacity;
    int mileage;
    String color;

    public Car(String plateNumber){
        this.plateNumber = plateNumber;
    }

    public Car(String ownerName, String producer, String color, int mileage){
        this.ownerName = ownerName;
        this.producer = producer;
        this.color = color;
        this.mileage = mileage;
    }
}
