package com.company;

public class Wiederholung {
    public static void main(String[] args) {
        int a = 1, b = 0;
        System.out.println(a);
        System.out.println(b);
        String s = "Hansi";

        int position = s.indexOf('a');
        System.out.println(position);
        double d = 100.0;
        double d2 = 0.1;
        double d3 = 0.00000001;
        double d4 = 10000000.0;

        System.out.println(d + d2);
        System.out.println(d +d3);
        System.out.println(d3 + d4);

        a = 1;
        int c;

        ++a;

        System.out.println(a);
        c = ++a;
        System.out.println("a:" + a + " " + "c:" + c);

        c = a++;
        System.out.println("a:" + a + " " + "c: " + c);

        myLittleHelper("Santa Clause");
        myLittleHelper(s);
        String helper = "Batman";
        myLittleHelper(helper);
    }

    public static void myLittleHelper (String helper){

        System.out.println("I am the little helper " + helper);

    }
}
