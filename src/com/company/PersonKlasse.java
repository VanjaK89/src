package com.company;

public class PersonKlasse {

    public String firstName;
    public String lastName;


    public PersonKlasse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
     public void doSomething(){
         System.out.println(firstName + " " + lastName + " eats chocolate. ");
     }

}
