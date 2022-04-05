package com.company;

public class TamagochiApp {
    public static void main(String[] args) {
        Tamagochi mickey = new Tamagochi();

        mickey.x = 6;
        mickey.y = 4;
        mickey.futterstand = 5;
        mickey.bewegen("links",6);
        mickey.fuettern(5);
        mickey.bewegen("links", 1);
        mickey.bewegen("unten", 4);
        System.out.println(mickey.x + " " + mickey.y);
    }
}
