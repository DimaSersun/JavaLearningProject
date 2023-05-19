package com.Orange.operationsandciclicfunctions;

import java.util.Scanner;

public class ComparisonOperationsExample {
    public static void main(String[] args) {

        // Creăm un obiect Scanner pentru a citi datele de la tastatură
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu primul număr întreg: ");
        int a = scanner.nextInt();

        System.out.print("Introdu al doilea număr întreg: ");
        int b = scanner.nextInt();

        //Egal cu
        boolean eEgal = a == b;
        System.out.println("Egal cu:  " + eEgal);

        //Diferit de
        boolean diferitDe = a != b;
        System.out.println("Diferit de: " + diferitDe);

        //Mai mare decat
        boolean maiMareDecat = a > b;
        System.out.println("Mai mare decat: " + maiMareDecat);

        //Mai mic decat
        boolean maiMicDecat = a < b;
        System.out.println("Mai mic decat: " + maiMicDecat);

        //Mai mare sau egal cu
        boolean maiMareEgal = a >= b;
        System.out.println("Mai mare sau egal cu: " + maiMareEgal);

        //Mai mic sau egal cu
        boolean maiMicEgal = a <= b;
        System.out.println("Mai mic sau egal cu: " + maiMicEgal);

        // Închidem obiectul Scanner
        scanner.close();
    }
}
