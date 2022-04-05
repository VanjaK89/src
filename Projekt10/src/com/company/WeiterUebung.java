package com.company;

public class WeiterUebung<fact> {
    public static void main(String[] args) {
     method("cold");
     String condition = "sunny";
     method(condition);
        System.out.println(buildWeatherText("sunny", ":)" ));
        System.out.println(getFactorial(4));





    }
    public static void method(String weather){
        System.out.println("The weather is " + weather + ".");
    }

    public static String buildWeatherText(String weather, String emotion){
         return "It is " + weather + " " + emotion;}




    public static int getFactorial(int f) {
        int result = 1;

        for (int i = 1; i <= f; i++) {

            result = result * i; // Ermitteln der Fakultät mit Schleifen
        }
        return result;
    }



}
