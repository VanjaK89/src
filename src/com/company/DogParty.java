package com.company;

import java.util.ArrayList;
import java.util.Collections;

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
        ArrayList<Dog> dogList = new ArrayList<Dog>();
        dogList.add(new Dog("Scooby", "black", 40, true));
        dogList.add(new Dog("Scooby", "blue", 80, false));
        dogList.add(new Dog("Susi", "blue", 24, true));
        dogList.add(new Beagle("Bigi", "blue", 37, true, "chicken"));

        System.out.println(dogList);
        Collections.sort(dogList);

        System.out.println(dogList);




    }




}
