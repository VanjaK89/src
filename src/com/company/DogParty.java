package com.company;

public class DogParty {
    public static void main(String[] args) {
        Dog scooby = new Dog("ScoobyDoo", "black", 40, true);
        System.out.println(scooby);
        scooby.bark();
        Dog hund = new Dog();
        hund.bark();
        System.out.println(hund);

        Beagle Max = new Beagle("Hansi", "blue", 80, false, "everything");
        System.out.println(Max);
    }



}
