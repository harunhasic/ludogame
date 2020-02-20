package com.kodecta.spring.test;

public class Elephant {

    private ElephantBuilder elephantBuilder;

    public Elephant(ElephantBuilder elephantBuilder){
        this.elephantBuilder = elephantBuilder;
    }

    public String getName(){
        return elephantBuilder.getName();
    }

    public String getSound(){
        return elephantBuilder.getSound();
    }
}
