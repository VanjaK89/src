package com.company;

import java.util.ArrayList;

public class CustomerKlasse extends PersonKlasse {

    public int CustomerNumber;
    ArrayList<AddressKlasse> Address = new ArrayList<>();
    //private ArrayList<Address>

    public CustomerKlasse(int customerNumber, String firstName, String lastName) {
        super(firstName, lastName);
        this.CustomerNumber = customerNumber;
        this.Address = new ArrayList<>();
    }
      public void add(AddressKlasse a){
        Address.add(a);
 }

//     @Override
//    public void doSomething(){
//        super.doSomething();
//
//     }

    @Override
    public String toString() {
        return "CustomerKlasse{" +
                "CustomerNumber=" + CustomerNumber +
                ", Address=" + Address + "person: " + lastName + " " + firstName +
                '}';
    }
}
