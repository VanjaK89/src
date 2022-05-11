package com.company;

public class Floete extends Instrument{

    public Floete(int l, String n) {
        super(l, n);
    }

    @Override
    public int play() {
        System.out.println("Flöte " + name + " quietscht fast immer richtig.");
        return lautstaerke;
    }
}
