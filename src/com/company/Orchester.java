package com.company;

import java.util.ArrayList;

public class Orchester {
    private ArrayList<Instrument> or;

    public Orchester(){
        or = new ArrayList<>();

    }
    public void addInstrument(Instrument i){
        or.add(i);
    }

    public  int playAll(){
        int summe = 0;
        for (Instrument i: or) {
            i.play();
            summe += i.lautstaerke; //i.getLautsterke

        }
        return summe;
    }
}
