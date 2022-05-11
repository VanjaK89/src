package com.company;

public abstract class Instrument {

    protected int lautstaerke;
    protected String name;

    public Instrument(int l, String n) {
        this.lautstaerke = l;
        this.name = n;
    }

    public int play(){
        System.out.println(name + "ist" + lautstaerke + "laut.");


        return lautstaerke;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
