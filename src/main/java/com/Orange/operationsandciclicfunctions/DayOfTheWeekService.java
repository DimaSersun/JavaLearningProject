package com.Orange.operationsandciclicfunctions;

import java.util.Scanner;

public class DayOfTheWeekService {
    public static void main(String[] args) {

        // Creăm un obiect Scanner pentru a citi datele de la tastatură
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu numarul zilei: ");
        int zi = scanner.nextInt();

        String Zi;

        switch (zi) {
            case 1:
                Zi = "Luni";
                break;
            case 2:
                Zi = "Marti";
                break;
            case 3:
                Zi = "Miercuri";
                break;
            case 4:
                Zi = "Joi";
                break;
            case 5:
                Zi = "Vineri";
                break;
            case 6:
                Zi = "Sambata";
                break;
            case 7:
                Zi = "Duminica";
                break;
            default:
                Zi = "Ati introdus un numa incorect";
                break;
            // Închidem obiectul Scanner
        }

        System.out.println("Ziua corespunzatoare numarului " + zi + " este: " + Zi);

        // Închidem obiectul Scanner
        scanner.close();
    }
}
