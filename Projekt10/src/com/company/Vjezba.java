package com.company;

import java.util.Scanner;

public class Vjezba {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 0; i < 10; i++) {
//
//            sum = sum + i;
//        }
//        System.out.println(sum);

        Scanner factorian = new Scanner(System.in);
        int fact = 1;
        int num;

        System.out.println("Enter any number: ");
        num = factorian.nextInt();
        for (int i = 1; i <= num; i++)
        {

            fact = fact * i;

        }
        System.out.println("Factorial value of " + fact);


    }
}
