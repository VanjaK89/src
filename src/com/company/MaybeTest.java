package com.company;

public class MaybeTest {
    public static void main(String[] args) {

        Maybe<Double> gehalt = new Maybe<>(2030.36, 2);
        gehalt.print();
        Maybe<Account> meinKonto = new Maybe<>(new Account("Laura", "AT367632", "HI64387H"), 1);
        meinKonto.print();

    }
}
