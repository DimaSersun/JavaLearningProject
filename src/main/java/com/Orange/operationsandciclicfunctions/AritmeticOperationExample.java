package com.Orange.operationsandciclicfunctions;

import java.util.Scanner;

public class AritmeticOperationExample {
    public static void main(String[] args) {
        // Creăm un obiect Scanner pentru a citi datele de la tastatură
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu primul număr întreg: ");
        int a = scanner.nextInt();

        System.out.print("Introdu al doilea număr întreg: ");
        int b = scanner.nextInt();

        //Sum
        int sum = a + b;
        System.out.println("Sum: " + sum);

        //Subtractions
        int sub = a - b;
        System.out.println("Result of Subtractions: " + sub);

        //Multiplication
        int mult = a * b;
        System.out.println("Result of Multiplication: " + mult);

        //Deviation
        int div = a / b;
        System.out.println("Result of Deviation: " + div);

        //The Rest of the deviation
        int rest = a % b;
        System.out.println("The Rest of the deviation: " + rest);

        // Închidem obiectul Scanner
        scanner.close();
    }
}
