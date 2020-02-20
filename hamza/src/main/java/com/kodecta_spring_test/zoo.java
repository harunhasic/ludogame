package com.kodecta_spring_test;

public class zoo {
    private String animal;

    public zoo(String animal) {
        super();
        this.animal = animal;
    }

    public String getAnimal() {
       return animal;
    }
    public void setAnimal(String animal){
        this.animal = animal;

    }
    @Override
    public String toString(){
        return "zoo[name = " + animal + "]";
    }
}
