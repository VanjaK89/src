package com.company;

import java.util.HashSet;

public class HashProblems {
    public static void main(String[] args) {
        String s1 = "VII";
        String s2 = "UGH";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Account name1 = new Account("Konto1", "AT537373", "BIZ");
        Account name2 = new Account("Konto2", "AT537373", "BIZ");

        //erzeugen eine Menge in matematische Sinne, weil diese hat die Eingenschaft das jedes object nur ein mal da sein darf
        //ich entscheide ob es drinnen ist oder nicht mit der metode hashcode
        HashSet<Account> bank = new HashSet<>();
        Account a3;
        System.out.println(bank.add(name1));
        System.out.println(bank.add(name2));



    }
}
