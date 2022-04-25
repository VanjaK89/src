package com.company;

public class Osterhase {
    private static int haeschenZaehler = 1;
    private int anzahlVersteckteEier;
    private String name;  //wenn ich name nicht verändern möchte dann nur getter
    private HasenReligion persoenlicherGlaube;
    private int haeschenNummer;



    public Osterhase(String name, int anzahlVersteckteEier, HasenReligion glaube){
        this.name = name;
        this.anzahlVersteckteEier = anzahlVersteckteEier;
        haeschenNummer = haeschenZaehler ++; //jedes mahl wenn ich der konstruktor ausrufe, wird nummer und erhoht //jeder Osterhase soll eigene eindeutige nummer haben
       persoenlicherGlaube = glaube;
        //wegen der steuer
        //Osterhase.haeschenZaehler

    }
    public int getHaeschenNummer() {
        return haeschenNummer;
    }


    public Osterhase(String name){
        this.name = name;
        this.anzahlVersteckteEier = 0;
        haeschenNummer = haeschenZaehler ++;
        persoenlicherGlaube = HasenReligion.LANGE_OHREN_ZEUGEN;
    }

    @Override
    public String toString() {
        return name + " versteckte " + anzahlVersteckteEier + " Eier und glaubt an: " + persoenlicherGlaube;

    }



    //    public void aendereAnzahlEier(int anzahlVersteckteEier) {
//
//        //anzahlVersteckteEier //locale variable oder Parameter werden vervendet
//        //anzahlVersteckteEier --> parameter
//        //this element zeigt aud die aktuelle Instanz
//
//        if (anzahlVersteckteEier >= 0){
//
//        }
//        this.anzahlVersteckteEier = anzahlVersteckteEier; // so weiss comp.das ich atribut und parameter gleich sind
//    }


    public int getAnzahlVersteckteEier() {
        return anzahlVersteckteEier;
    }

    public void setAnzahlVersteckteEier(int anzahlVersteckteEier) {
        if (anzahlVersteckteEier >= 0) {

            this.anzahlVersteckteEier = anzahlVersteckteEier;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//    public void andereAnzahlEier(){
//            anzahlVersteckteEier = 12;
//    }
//    public int gibMirAnzahlDerVersteckteEier(){
//        return anzahlVersteckteEier;
//    }
}
