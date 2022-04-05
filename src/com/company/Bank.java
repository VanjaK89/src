package com.company;

public class Bank {
    public static void main(String[] args) {
        Account name = new Account("Konto1", "AT537373", "BIZ");
        Account name1= new Account("Konto2", "AT563737", "BIZ");
        Account name2 = new Account("Konto3", "AT56373", "BIZ");


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










    }
}
