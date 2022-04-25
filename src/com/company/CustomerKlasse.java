package com.company;

import java.util.ArrayList;

public class CustomerKlasse {

    private int CustomerNumber;
    ArrayList<AddressKlasse> Address = new ArrayList<>();
    //private ArrayList<Address>

    public CustomerKlasse(int customerNumber) {
        CustomerNumber = customerNumber;
    }
 public void add(AddressKlasse a){
        Address.add(a);
 }


    @Override
    public String toString() {
        return "CustomerKlasse{" +
                "CustomerNumber=" + CustomerNumber +
                ", Address=" + Address +
                '}';
    }
}
