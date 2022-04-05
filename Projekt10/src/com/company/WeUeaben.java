package com.company;

import java.util.Arrays;

public class WeUeaben {
    public static void main(String[] args) {
         int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum = sum + i;

        }
        System.out.println("sum is: " + sum);

        String array[] = {"Ron", "Harry", "Hermione"};
        System.out.println(array[1]);
        String one = array[0];

        System.out.println(one);

        for (String x: array){
            System.out.println(x);}


            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);



            }

        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            System.out.print(",");
        }




    }
}
