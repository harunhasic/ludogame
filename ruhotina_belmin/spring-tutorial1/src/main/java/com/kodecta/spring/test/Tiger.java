package com.kodecta.spring.test;

public class Tiger {
    String name;
    String color;
    Tiger(){

    }
    Tiger(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

}
