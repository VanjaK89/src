package com.company;

public class HaseDemo {
    public static void main(String[] args) {

        Hase h = new Hase("Hansi");
        System.out.println(h);
        h.hoppeln();
        h.fressen();
        h.schlafen();
        Weinachthase h1 = new Weinachthase("Maxi");
        System.out.println(h1);
        h1.hoppeln();
        OsterhaseZwei h2 = new OsterhaseZwei("Susi");
        System.out.println(h2);
        h2.versteckteOstereier();
        Hase hase1 = h2;
        hase1.hoppeln();
        Hasenstall hs = new Hasenstall();
        hs.addHase(h);
        hs.addHase(h1);
        hs.addHase(h2);

        hs.hoppelAll();

        //up and downcasting

        OsterhaseZwei o1 = new OsterhaseZwei("Ms.Egg");
        OsterhaseZwei o2 = o1;
        Hase h3 = new Hase("Common rabbit but cute");
        Weinachthase w2 = new Weinachthase("Mr.Snow");

        Weinachthase wh ;
        OsterhaseZwei oh;
        Hase ha;
        // vererbungshierarchy
        //         |--->  Osterhase
        // Object -->   Hase--
        //         |---> Weinachsthase

        //up casting: assigning a child to a reference of its parentsclass

        ha = o1;
        // we only see atributes and methods from Hase
        // polimorphismus using this method we execute the children klass

        ha.hoppeln();
        //down casting
        //assigning a general type to a more specialized type
        // this only works if this general reference already refers to a specialized object instance

        //wh = (Weinachthase) h3; // this gives us a ClassCastException

        //there are special cases where down casting works( I will have to up cast before)
        ha = w2;
        wh = (Weinachthase) ha;
        System.out.println(wh);
        wh.verteileGeschenke();





    }
}
