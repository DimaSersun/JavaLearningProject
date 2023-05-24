package com.Orange.methodstask;

public class Customer {

    public Customer(String firstName, String lastName, String email, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = email;
        if(age < 18 || age > 65){
            System.out.println("You entered wrong age number, please check the input data.");
            this.age = 0;
        }
        else{
            this.age = age;
        }

    }

    private int age;
    private String mail;
    private String firstName;
    private String lastName;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18 || age > 65){
            System.out.println("You entered wrong age number, please check the input data. Now age will be set to 0.");
        }
        else{
            this.age = age;
        }
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String toString(){
        return "Customer's details are next: "+
                "\n First name - " + firstName +
                "\n Last name - " + lastName +
                "\n Age - " + age +
                "\n Mail - " + mail ;
    }
}
