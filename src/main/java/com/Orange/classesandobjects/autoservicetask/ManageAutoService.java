package com.Orange.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
        //Object declaration and initialization for all type of constructor

        //New car
        Car hondaAlexandru = new Car("Alexandru Decuseara", "Honda", "Blue", 156000);
        System.out.println("New Car: " + hondaAlexandru.ownerName + "\nProducer: " + hondaAlexandru.producer + "\nColor: " + hondaAlexandru.color + "\nMileage: " + hondaAlexandru.mileage);

        //New Tool
        Tool ciocanNou = new Tool("Ciocan");
        System.out.println("\nNew Tool: " + ciocanNou.toolName);

        //New Worker
        Worker alinCiobanu = new Worker("Alin Ciobanu",25);
        System.out.println("\nNew Worker: " + alinCiobanu.workerName + "\nAge: " + alinCiobanu.age);

        //New Garage
        Garage carFix = new Garage("Car Fix Center", 5);
        System.out.println("\nNew Garage: " + carFix.garageName + "\nGarageID: " + carFix.garageId);

        //Empty tool
        Tool ciocanSuperNou = new Tool();

        //Car only with plate number
        Car bmwNou = new Car("TFJ 564");
        System.out.println("\nNew Car: " + bmwNou.plateNumber);


    }

}
