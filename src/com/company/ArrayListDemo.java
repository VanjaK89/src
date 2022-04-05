package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Osterhase> mauritius = new ArrayList<>(); //meine erste collection
        Osterhase karl = new Osterhase("Karl von Karligen",1000, HasenReligion.EXTRA_BUNTE_OSTEREIER );
        Osterhase karla = new Osterhase("Karla Kolumna", 111, HasenReligion.ZUR_HEILIGEN_KAROTTE);
        Osterhase uschi = new Osterhase("Uschi mit den langen Ohren", 7777, HasenReligion.LANGE_OHREN_ZEUGEN);
        //fuegen hinten elemente hinzu
        mauritius.add(karl);
        mauritius.add(karla);
        mauritius.add(uschi);

        //alle durchlaufen
        for (int h = 0; h < mauritius.size(); h++) {

            System.out.println(mauritius.get(h));

        }

       //an welche stelle ist die Karla gespeichert
        System.out.println(mauritius.indexOf(karla));
        //verwenden wir doch mal einen Iterator
        Iterator<Osterhase> iter = mauritius.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("****");



       //karl redet ganzen tag nur von der jagd, wird von den insel gejagdt
        // entfernen index von collection
        mauritius.remove(karl);
        //for each loop rechts collection die über wir laufen möchten, links eine neue hilfs variable auf die das jeweils nächste element gelegt wird

        for (Osterhase oh: mauritius) {
            System.out.println(oh);

        }
    }
}
