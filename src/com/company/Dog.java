package com.company;

public class Dog implements Comparable<Dog> {
    public String name;
    public String eyeColor;
    public int weight;
    public boolean appreciatesOtherDogs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isAppreciatesOtherDogs() {
        return appreciatesOtherDogs;
    }

    public void setAppreciatesOtherDogs(boolean appreciatesOtherDogs) {
        this.appreciatesOtherDogs = appreciatesOtherDogs;
    }

    public Dog(String name, String eyeColor, int weight, boolean appreciatesOtherDogs) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.appreciatesOtherDogs = appreciatesOtherDogs;
    }

    public Dog(){
        this.name = "Hund";
        this.eyeColor = "black";
        this.weight = 17;
        this.appreciatesOtherDogs = true;
    }

   public void bark(){
       System.out.println(name + " barks ");
   }
   public void eat(){
       System.out.println(name + " eats");

   }

    @Override
    public String toString() {
        String text = null;
        if (appreciatesOtherDogs){
            text = name + " admires other dogs with their sparkling " + eyeColor + "eyes";
        }
        else{
            text = name + " barks until all other dogs leave the party";
        }
        return text;
    }
     //sort with two criteria, first name, second is weight
    @Override
    public int compareTo(Dog o) {

        int ergFirst = this.name.compareTo(o.name); //-1 this.name, 1 o.name, 0 ist gleich
        if(ergFirst != 0){
            return ergFirst;
        }

        //second: weight
        if(this.weight < o.weight){
            return -1;
        }
        if(this.weight > o.weight){
            return 1;
        }
        return 0;
    }
}
