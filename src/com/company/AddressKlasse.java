package com.company;

public class AddressKlasse {
    private String street;
    private  String zip;
    private String city;
    private String country;



    public AddressKlasse(String street, String zip, String city, String country) {
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "DemoKlasseAddress{" +
                "street='" + street + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
