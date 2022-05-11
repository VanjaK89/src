package com.company;

public class Orgel extends Instrument{

    public Orgel(int l, String n) {
        super(l, n);
    }

    @Override
    public int play() {
        System.out.println("Die Orgel " + name + " pfeift durch die leeren Hallen. ");
        return lautstaerke;
    }
}
