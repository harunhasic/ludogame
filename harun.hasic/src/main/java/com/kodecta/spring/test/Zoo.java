package com.kodecta.spring.test;

import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class Zoo {

    Tiger tiger;
    Elephant elephant;

    public Zoo(Tiger tiger, Elephant elephant){
        this.tiger=tiger;
        this.elephant=elephant;
    }
    public Tiger getTiger() {
        return tiger;
    }

    public void setTiger(Tiger tiger) {
        this.tiger = tiger;
    }

    public Elephant getElephant() {
        return elephant;
    }

    public void setElephant(Elephant elephant) {
        this.elephant = elephant;
    }



    public String getTiger(Tiger tiger){

        return tiger.toString();

    }
    public String getElephant(Elephant elephant){

        return elephant.toString();
    }


    public String printAnimals(Tiger tiger, Elephant elephant){

        System.out.println("The animals are: "+tiger.toString()+"and "+elephant.toString());

    return "foo";
    }




}
