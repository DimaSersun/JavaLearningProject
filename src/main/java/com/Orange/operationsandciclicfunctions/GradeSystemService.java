package com.Orange.operationsandciclicfunctions;

import java.util.Scanner;

public class GradeSystemService {
    public static void main(String[] args) {
        // Creăm un obiect Scanner pentru a citi datele de la tastatură
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu punctajul acumulat: ");
        int result = scanner.nextInt();

        if (result >= 90){
            System.out.println("Calificativul A");
        } else if (result >= 80){
            System.out.println("Calificativul B");
        } else if (result >+ 70){
            System.out.println("Calificativul C");
        } else if (result >= 60){
            System.out.println("Calificativul D");
        } else {
            System.out.println("Imi pare rau nu ati luat BAC-ul :D");
        }

        // Închidem obiectul Scanner
        scanner.close();
    }
}
