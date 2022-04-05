package com.company;

public class Temperature {
    public static void main(String[] args) {
        double temperatureInCelsius = 25.4;
        double temperatureToFahrenheit = celsiusToFahrenheit(temperatureInCelsius);
        System.out.println("C is " + temperatureToFahrenheit + "F");
    }
    public static double celsiusToFahrenheit(double temperatureInCelsius){
        return temperatureInCelsius * 9/5 + 32;

    }
}
