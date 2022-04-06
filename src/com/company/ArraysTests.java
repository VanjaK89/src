package com.company;

public class ArraysTests {
    public static void main(String[] args) {
        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8};

        System.out.println("arr.length = " + arr.length);
        System.out.println("The smallest number is " + findSmallestNumber(arr));
        System.out.println("The biggest number is  " + findBiggestNumber(arr));
        System.out.println("The summ is " + theSummOfTheElements(arr));
    }

    //MINIMUM
    public static int findSmallestNumber(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }

            }

        return min;
    }
    //MAXIMUM
    public static int findBiggestNumber(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }

        }
        return max;
    }
    //SUMME

    public static int theSummOfTheElements(int[]arr){
        int summe = 0;

        for (int i = 0; i < arr.length; i++) {
            summe += arr[i];
        }

        return summe;
    }

}
