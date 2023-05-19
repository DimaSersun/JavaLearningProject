package com.Orange.operationsandciclicfunctions;

import java.util.Scanner;

public class IncrementDecrementExample {
    public static void main(String[] args) {

        // Creăm un obiect Scanner pentru a citi datele de la tastatură
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu un număr întreg: ");
        int a = scanner.nextInt();

        // Incrementare
        a++; // Incrementare
        System.out.println("Valoarea incrementarii simpla: " + a);

        ++a; // Incrementare pre-fixata
        System.out.println("Valoarea pre-fixata: " + a);

        // Decrementare
        a--; // Decrementare
        System.out.println("Valoarea decrimentarii simple: " + a);

        --a; // Decrementare pre-operator
        System.out.println("Valoarea după decrementarea pre-fixata: " + a);

        // Închidem obiectul Scanner
        scanner.close();

    }
}
