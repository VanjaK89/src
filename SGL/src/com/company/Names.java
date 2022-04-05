package com.company;

public class Names {
    public static void main(String[] args) {
        String firstName = "Jane";
        String lastName = "Doe";
        System.out.println("The full name is " + firstName + " " + lastName + ".");

        int length = 5;
        int width = 3;
        int circumference = 2 * (length + width);
        int area = length * width;
        System.out.println("Circumference is: "+ circumference);
        System.out.println(" Area is: " + area);
        boolean isSenior = true;
        boolean isDog = false;
        boolean isStudent = false;
        System.out.println("On this bus you receive a discount: " + (isDog || isStudent || isSenior));

        int nonFiction = 2;
        int fiction = 1;
        System.out.println("In this library you get a discount." + (nonFiction >= 2 && fiction > 0 ));

        int nonAlcoholic = 1;
        int alcoholic = 1;
        System.out.println("You get a discount: " + (nonAlcoholic >= 1 && alcoholic == 0));




    }
}
