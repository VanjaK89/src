package com.company;

public class IfDiscount {
    public static void main(String[] args) {
        boolean isDog = true;
        boolean isSenior = true;
        boolean isStudent = true;

        double ticketPrice = 2.5;
        double busDiscount = ifDiscount (ticketPrice, isDog, isSenior, isStudent);

        System.out.println("I saved" + " " + busDiscount + " " + "euro for my" + " " + ticketPrice);

        int nonAlcoholic = 3;
        int alcoholic = 1;
        boolean aDiscount;

        aDiscount = getDiscount(nonAlcoholic, alcoholic);
        System.out.println("You get discount:" + aDiscount);

        int nonFiction = 3;
        int fiction = 2;
        boolean myDiscount;
        myDiscount = anotherDiscount(nonFiction,fiction);
        System.out.println("you get discount: " + myDiscount);
    }
        public static double ifDiscount (double ticketPrice, boolean isDog, boolean isSenior, boolean isStudent){
            double busDiscount;


            if (isDog){
                busDiscount = ticketPrice * 0.2;
            }
            if (isSenior) {
                busDiscount = ticketPrice * 0.15;
            }
            else if (isStudent) {
                busDiscount = ticketPrice * 0.5;
            }
            else {
                busDiscount = 0;
            }
            return busDiscount;

        }

    public static boolean getDiscount (int nonAlcoholic, int alcoholic){
           boolean aDiscount;
        if (nonAlcoholic >= 1 && alcoholic == 0) {
            aDiscount = true;}



        else
        {aDiscount = false;}

        return aDiscount;

    }

    public static boolean anotherDiscount (int nonFiction, int fiction){
         boolean myDiscount;
        if (nonFiction >=2 && fiction >=1)
            myDiscount = true;
        else
            myDiscount = false;
        return myDiscount;
    }
}
