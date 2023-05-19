package com.Orange.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        //While
        int i = 1;
        while (i <= 5) {
            System.out.println("Numarul: " + i);
            i++;
        }

        System.out.println();

        //Do-While
        int b = 1;
        do {
            System.out.println("Numarul: " + b);
            b++;
        } while (b <= 5);

        System.out.println();


        //For
        for (int a = 1; a <= 5; a++) {
            System.out.println("Numarul: " + a);
        }


    }
}
