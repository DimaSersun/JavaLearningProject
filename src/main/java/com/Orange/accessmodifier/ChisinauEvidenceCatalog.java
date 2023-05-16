package com.Orange.accessmodifier;

import com.Orange.accessmodifier.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person vladPerson = new Person("Vlad Olaru","M",25);

        vladPerson.isRetired = false;
        if (vladPerson.isRetired)
        {
            System.out.println("Vlad este pensionat");
        } else {
            System.out.println("Vlad nu este pensionat");
        }

        Person ionPerson = new Person("Ion Dumeniuc","M",77);

        ionPerson.isRetired = true;
        if (ionPerson.isRetired){
            System.out.println("Ion este pensionat");
        } else{
            System.out.println("Ion nu este pensionat");
        }

        Person elenaPerson = new Person("Elena Panfil", "F", 34);

        elenaPerson.isRetired = false;
        if (elenaPerson.isRetired){
            System.out.println("Elena este pensionata");
        } else {
            System.out.println("Elena nu este pensionata");
        }

        Person eugenPerson = new Person("Eugen Varzar", 68210156,"Medie", "20033004455545");

        eugenPerson.isRetired = false;
        if (eugenPerson.isRetired){
            System.out.println("Eugen este pensionat");
        } else {
            System.out.println("Eugen nu este pensionat");
        }

        Person dumitruPerson = new Person("Dumitru Vlah", 69234543,"Medie Speciala","2004333054030434");

        dumitruPerson.isRetired = true;
        if (dumitruPerson.isRetired){
            System.out.println("Dumitru este pensionat");
        } else {
            System.out.println("Dumitru nu este pensionat");
        }

    }
}
