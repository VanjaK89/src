package com.company;

public class Haeschen {
    String name;
    String farbe;
    static String spezies = "Leporidae";


    public void hoppel(String wohin){
        System.out.println(name + " hoppelt " + wohin); //nur aufrufen wenn wir ein objekt und ein instanz

    }
    public static void ausgabeSpezies(){
        System.out.println(spezies);
        //kann ich nicht in eigenschaften eingreifen nur kann ich static = "leporidae"
      spezies = "Lateinischer Name " + spezies;
        System.out.println(spezies);


    }
}
