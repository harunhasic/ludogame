package com.kodecta.spring.test;

public class Zoo {
    private Tiger tiger;
    private Elephant elephant;

    Zoo(){
        this.tiger = null;
        this.elephant = null;
    }

    Zoo (Tiger tiger, Elephant elephant){
        this.tiger = tiger;
        this.elephant = elephant;
    }

    public Tiger getTiger(){
        return tiger;
    }


    public Elephant getElephant(){
        return elephant;
    }

    public void setTiger(Tiger tiger){
        this.tiger = tiger;
    }

    public void setElephant(Elephant elephant){
        this.elephant = elephant;
    }

    public void info(){
        System.out.println("We have elephant " + elephant.getName() + " and tiger " + tiger.getName());
    }
}
