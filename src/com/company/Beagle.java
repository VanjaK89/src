package com.company;

public class Beagle extends Dog {
    public String favoriteFood;

    public Beagle(String name, String eyeColor, int weight, boolean appreciatesOtherDogs, String favoriteFood){

        super(name, eyeColor, weight, appreciatesOtherDogs);

        this.favoriteFood = favoriteFood;


    }
    @Override
    public void bark(){
        super.bark();
        super.bark();
    }

}
