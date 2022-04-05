package com.company;

import java.util.LinkedHashMap;

public class Metropolis {
    public static void main(String[] args) {
        System.out.println(isMetropolis(true, 80000, 500000));

    }

    public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {
        if ((isCapital && inhabitants > 100000 ) || (inhabitants > 200000) && ((inhabitants * taxPerPersonAndMonth * 12) > 720000000)){
            return true;
        }
        return false;
    }
}
