package com.company;

public class HaeschenApp {
    public static void main(String[] args) {
        //statisches Atributt bzw. methode kann auch ohne Objekt oder Instanz verwendet werden
        //mit der namen der klasse
        System.out.println(Haeschen.spezies);
        Haeschen rogger = new Haeschen();
        //atribute zugreifen
        rogger.name = "Rogger Rabbit";
        rogger.farbe = "weiß";
        System.out.println(rogger.name + " " + rogger.farbe);
        Haeschen bugs = null;
        //irgendwann später
        bugs = new Haeschen();
        bugs.name = "Bugs Bunny";
        bugs.farbe = "grau";

        //wir testen unsere testet methode
        //Haschen.....geht nicht
        bugs.hoppel("nach hinten");
        rogger.hoppel("in the woods");

        //aufruf statische Methode
        Haeschen.ausgabeSpezies();
        //in eine statische methode die nicht zu eine klasse
        

            }

    }
