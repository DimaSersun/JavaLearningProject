package com.Orange.methodstask;

import static com.Orange.methodstask.DataGeneratorUtil.getRandomString;

public class ExecutionService {
    public static void main(String[] args) {

        System.out.println("Random values.");

        System.out.println("\nRandom int between two values - " + DataGeneratorUtil.getRandomInt(2, 10));
        System.out.println("Random int with max value - " + DataGeneratorUtil.getRandomInt(20));
        System.out.println("Random mail - " + DataGeneratorUtil.getRandomMail(10));
        System.out.println("Random string - " + getRandomString(15));

        System.out.println("\nCustomers:");

        System.out.println("\nCustomer Number:1.");

        Customer cust1 = new Customer("Alexandru", "Eremenko", "AE@gmail.com", 38);
        System.out.println("New customer.");
        System.out.println(cust1);
        cust1.setAge(DataGeneratorUtil.getRandomInt(50));
        cust1.setLastName(getRandomString(10));
        System.out.println("\nSame customer after name changing.");
        System.out.println(cust1);

        System.out.println("\nCustomer Number:2.");
        Customer cust2 = new Customer(DataGeneratorUtil.getRandomString(10),
                DataGeneratorUtil.getRandomString(15),
                DataGeneratorUtil.getRandomMail(10),
                DataGeneratorUtil.getRandomInt(100));
        System.out.println(cust2);

    }
}
