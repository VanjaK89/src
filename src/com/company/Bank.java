package com.company;

import java.util.HashMap;

public class Bank {
    public static void main(String[] args) {
        Account name = new Account("Dagobert", "AT537373", "BIZ");
        Account name1= new Account("Daisy", "AT563737", "BIZ");
        Account name2 = new Account("Donald", "AT56373", "BIZ");


         name.add(1000);
         name1.add(400);
         name2.add(300);

        Account[]accounts = {name, name1, name2};

        for(Account names : accounts){
            System.out.println(name.getBalance());
        }
        System.out.println(name2.deposit(1000));

        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].getBalance());

        }

        System.out.println(Account.getUniqueID());
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i]);
        }


        HashMap<String,Account> bank = new HashMap<>();
        bank.put("Dagobert", name);
        bank.put("Daisy", name1);
        bank.put("Donald", name2);

        System.out.println(bank.containsKey("Dagobert"));
        //werte auslesehn tuen wir mit get, möchten der wert des schlüssels Daisy erhalten
        System.out.println(bank.get("Daisy"));
        for(String owner: bank.keySet()){
            System.out.println(owner);
            System.out.println(bank.get(owner));
        }
    }
}
