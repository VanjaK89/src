package com.company;

public class WinterTires {
    public static void main(String[] args) {
        int temperature = 23;
        boolean slipperyRoad = true;


        if (temperature < 10 || temperature < 4  && slipperyRoad){
            System.out.println("Please use winter tires!");}
        else
        { System.out.println("Winter tires are not required!");}


    }
    public static boolean needWinterTires(int temperature, boolean slipperyRoad){
        if (temperature < 10 || temperature < 4 && slipperyRoad){
            return true; }
        else
        {return false;
        }

    }
}
