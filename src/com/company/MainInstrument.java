package com.company;

public class MainInstrument {
    public static void main(String[] args) {

        Gitarre g = new Gitarre(" Roberto ", 10);
        Floete f = new Floete(8, " Hansi ");
        Orgel o = new Orgel(14, " Orgelito ");


        Instrument i = o;


        Orchester or = new Orchester();
        or.addInstrument(g);
        or.addInstrument(o);
        or.addInstrument(f);
        or.playAll();
        System.out.println(or.playAll());


    }
}
