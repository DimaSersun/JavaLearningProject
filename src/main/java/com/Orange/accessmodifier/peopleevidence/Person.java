package com.Orange.accessmodifier.peopleevidence;

public class Person {
    //Public info
    public String name;
    public String gender;
    public  String address;
    public boolean isRetired;

    //Private info
    private int age;
    private String id;

    //Protected info
    protected int phone;
    String education;
    String nationality;
    String email;

    public Person (String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("Un obiect de tipe Persoana cu 3 parametri a fost creat: ");
    }

    public Person(String name, int phone, String education, String id){
        this.name = name;
        this.phone = phone;
        this.education = education;
        this.id = id;
        System.out.println("Un obiect de tip Persoana cu 4 parametri a fost creat: ");
    }

}
