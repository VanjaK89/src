package com.company;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int number;
        int reverse = 0;

        System.out.println("Enter the number");
        number = console.nextInt();

        int temp = number;
        int remainder = 0;

        while (temp > 0)
        {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        System.out.println("Reverse of" + number + " is " + reverse);
        for (int i = 0; i < ; i++) {
            
        }
    }
}
