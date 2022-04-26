package com.company;

public class Weinachthase extends Hase{


    public Weinachthase(String name) {
        super(name);
    }

    public void verteileGeschenke(){
        System.out.println(name + "  verteilt Geschenke!");
    }


    @Override
    public void hoppeln(){
        System.out.println(name + " sings from the bottom of his heart!! ");
    }

}
