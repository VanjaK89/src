package com.company;

public class Gitarre extends Instrument{
    public Gitarre(String n, int l){
        super(l, n);
    }

    @Override
    public int play() {
        System.out.println("Gitarre" + name + "lässt ihre Saiten klingen. ");
        return lautstaerke;
    }
}
