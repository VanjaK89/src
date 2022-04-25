package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SerialKillers {


    public static void main(String[] args) {

        HashSet<String> serialKillerNames = new HashSet<>();

        serialKillerNames.add("Ted Bundy");
        serialKillerNames.add("Hannibal Lecter");
        serialKillerNames.add("Zodiac Killer");

        for (String s: serialKillerNames) {
            System.out.println(s);

        }

        System.out.println(serialKillerNames.add("Ted Bundy"));
        System.out.println(serialKillerNames.add("Edmund Kemper"));
        System.out.println(serialKillerNames.add("Jack the Ripper"));
        for (String s: serialKillerNames) {
            System.out.println(s);

        }

        HashSet<String> americanSerialKiller = new HashSet<>();
        americanSerialKiller.add("Ted Bundy");
        americanSerialKiller.add("Hannibal Lecter");
        americanSerialKiller.add("Edmund Kemper");

        //I want to take the elements from both sets
        serialKillerNames.retainAll(americanSerialKiller);
        System.out.println("------");
        for (String s: serialKillerNames) {
            System.out.println(s);

        }

        HashMap<String, ArrayList<String>> opfer = new HashMap<>();
        for(String crazyAmerican: americanSerialKiller){
            ArrayList<String> o = new ArrayList<>();
            o.add("Opfer 1");
            o.add("Opfer 2");    //svaki killer ima svoju listu po 3komada
            o.add("Opfer 3");

            opfer.put(crazyAmerican,o);
        }
      //wie kann ich jetzt ein Opfer hinzufügen
        ArrayList<String> opfi = opfer.get("Ted Buny");

        opfi.add("Opfer 4");

    }


}
