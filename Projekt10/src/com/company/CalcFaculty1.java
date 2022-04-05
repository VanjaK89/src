package com.company;

public class CalcFaculty1 {
    public static void main(String[] args) {
            int i, fact=1;

            int number=4;
            // unsere Zahl zur Durchführung der notwendigen Berechnungen in der Klasse Factorial
            for(i=1;i<=number;i++){
                fact=fact*i;
            }
            System.out.println("Die Fakultät von "+number+" ist: "+fact);
        }
    }