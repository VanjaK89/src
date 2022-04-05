package com.company;

import java.util.Scanner;

public class PowerDemo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int base;
        int power;
        int result = 1;

        System.out.println("The base number ");
        base = console.nextInt();

        System.out.println("The power number");
        power = console.nextInt();

        for (int i = 1; i <= power ; i++) {
            result = result * base;

        }
        System.out.println("Result is " + result);


    }
}
