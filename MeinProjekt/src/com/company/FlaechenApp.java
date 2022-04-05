package com.company;

public class FlaechenApp {
    public static void main(String[] args) {
        Punkt a = new Punkt();
        Punkt b = new Punkt();
        Punkt c = a;
        System.out.println(a.x + " " + a.y);
       // System.out.println(b);
        a.aenderePosition(1, 2);
        // das object wirkt auf die methode das ich aufrufe
        System.out.println(a.x + " " + a.y);
        System.out.println(c.x + " " + c.y);
        if (a == c){
            System.out.println("a und c zeigen auf gleich Punkt instanz");
        }
    }
}
