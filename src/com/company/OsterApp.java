package com.company;

public class OsterApp {
    public static void main(String[] args) {
        Osterhase dieter = new Osterhase("Dieter", 77,HasenReligion.ZUR_HEILIGEN_KAROTTE);
        Osterhase marla = new Osterhase("Marla");


        System.out.println(marla.getHaeschenNummer());
        System.out.println(marla.getName());
        System.out.println(marla.getAnzahlVersteckteEier());



        System.out.println(dieter.getName());
        System.out.println(dieter.getHaeschenNummer());
        System.out.println(dieter.getAnzahlVersteckteEier());


       // dieter.setName("Dieter (formerly known as Hansi)");
        //dieter.setAnzahlVersteckteEier(5);

       // System.out.println(dieter.anzahlVersteckteEier);
        System.out.println(dieter.getName());
        System.out.println(dieter.getAnzahlVersteckteEier());

        //möchte ein ei zu der bisherigen summe
        dieter.setAnzahlVersteckteEier(dieter.getAnzahlVersteckteEier() + 1);
        System.out.println(dieter.getAnzahlVersteckteEier());
        System.out.println(dieter);
        System.out.println(marla);

       // System.out.println(dieter.gibMirAnzahlDerVersteckteEier());
        //dieter.andereAnzahlEier();
        //System.out.println(dieter.anzahlVersteckteEier);
        //dieter.anzahlVersteckteEier = -2;
        //System.out.println(dieter.anzahlVersteckteEier);


    }
       //methode überladen unterscheidet sich durch typ/anzahl der parameter
       //hier haben wir eine ohne Parameter -> dann soll Osterhase ein Dutzen Eier verstecken




}
