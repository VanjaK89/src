package com.company;

public class RecursionBeispiel {
    public static void main(String[] args) {

        walk(5,0);


    }
    public static void walk(int countSteps, int currentStep){

        if (countSteps > currentStep){
            System.out.println("Step forward: " + (currentStep + 1));
            walk(countSteps, ++currentStep);
        }
        if (currentStep < countSteps){      //so fünf wurde nicht doppelt gegeben
            System.out.println("Step backward: " + currentStep);

        }
    }
}
