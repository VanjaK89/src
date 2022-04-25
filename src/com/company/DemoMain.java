package com.company;

public class DemoMain {
    public static void main(String[] args) {
        AddressKlasse a1 = new AddressKlasse("Neue Welt 7", "8010", "Graz", "AT");
        AddressKlasse a2 = new AddressKlasse("Himmerstrasse 12", "8043", "Graz", "AT");

        CustomerKlasse c1 = new CustomerKlasse(1, "Max", "Maxi");
        CustomerKlasse c2 = new CustomerKlasse(2, "Susi", "Mayer");



        c1.add(a1);
        c2.add(a2);
        System.out.println(c1);
        System.out.println(c2);
        c1.doSomething();
        c2.doSomething();
    }
}
