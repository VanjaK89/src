package com.company;

public class Tuer {

    private int breite;
    private int hoehe;
    private HimelsRichtung richtung;


    public Tuer(int breite, int hoehe, HimelsRichtung nrichtung){
        this.breite = breite;
        this.hoehe = hoehe;
        richtung = nrichtung;
    }

    @Override
    public String toString() {
        return "Tuer{" +
                "breite=" + breite +
                ", hoehe=" + hoehe +
                ", richtung=" + richtung +
                '}';
    }

    public HimelsRichtung getRichtung() {
        return richtung;
    }

    public void setRichtung(HimelsRichtung richtung) {
        this.richtung = richtung;
    }
    public int getHoehe() {
        return hoehe;
    }
    public int getBreite() {
        return breite;
    }
}
