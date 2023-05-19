package com.Orange.operationsandciclicfunctions;

import java.util.Scanner;

public class AssignmentOperationsExample {
    public static void main(String[] args) {

        // Creăm un obiect Scanner pentru a citi datele de la tastatură
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu primul număr întreg: ");
        int a = scanner.nextInt();

        System.out.print("Introdu al doilea număr întreg: ");
        int b = scanner.nextInt();

        //Atribuire simpla
        int result = a;
        System.out.println("Atribuire simpla:  " + result);

        //Atribuire cu adunare
         result += b;
        System.out.println("Atribuire cu adunare: " + result);

        //Atribuire cu scadere
         result -= b;
        System.out.println("Atribuire cu scadere: " + result);

        //Atribuire cu inmultire
         result *= b;
        System.out.println("Atribuire cu inmultire: " + result);

        //Atribuire cu inpartire
         result /= b;
        System.out.println("Atribuire cu inpartire: " + result);

        //Atribuire cu restul inpartiirii
         result %= b;
        System.out.println("Atribuire cu restul inpartire: " + result);

        // Închidem obiectul Scanner
        scanner.close();
    }
}
