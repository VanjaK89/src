package com.company;

import java.util.Locale;

public class NullTest {
    public static void main(String[] args) {

        String hansisLieblinsPizza = null; //zeigt niergendwo hin- können nichts damit tun
        //hansisLieblinsPizza.indexOf("a");
        //sobald wir ein Object zuweisen ist es kein Problem mehr und geht genz normal
        hansisLieblinsPizza = "Margherita (mit zwei kleinen Ananas unter dem Käse versteckt";
        System.out.println(hansisLieblinsPizza);
        System.out.println(hansisLieblinsPizza.toUpperCase());
     String donau = "donaudampfschifffahrt";
        System.out.println(donau.indexOf("dampf"));

    }
}
