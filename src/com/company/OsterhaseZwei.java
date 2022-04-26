package com.company;

public class OsterhaseZwei extends Hase {


    public OsterhaseZwei(String name) {
        super(name);
    }

    public void versteckteOstereier(){
        System.out.println(name + " tut Eier verstecken!");
    }

    @Override
    public void hoppeln(){
        System.out.println(name + " dances like she never danced before!! ");
    }


}
