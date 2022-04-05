package com.company;

public class Tamagochi {
    String name;
    int x;
    int y;
    int futterstand = 5;

    //public void schritten(String wohin){
      //  System.out.println(name + " geht nach vorne " + wohin);
        public void fuettern(int f){
            futterstand = futterstand + f;
    }
    public void bewegen(String richtung, int schritte){
            while(futterstand > 0 && schritte > 0){
                if (richtung.equals("oben")){
                    ++y;
                }
                else if (richtung.equals("unten"))
                {
                    --y;
                }
                else if (richtung.equals("links"))
                {
                    --x;
                }
                else if (richtung.equals("rechts"))
                {
                    ++x;
                }
                --schritte;
                --futterstand;
            }
    }



    }




