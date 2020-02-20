package com.kodecta.spring.test;

public class Zoo {

    Tiger tiger;
    Elephant elephant;

    public Zoo(Tiger tiger, Elephant elephant) {
        this.tiger = tiger;
        this.elephant = elephant;
    }

    public Tiger getTiger() {
        System.out.println(tiger);
        return tiger;
    }

    public Elephant getElephant() {
        System.out.println(elephant);
        return elephant;
    }

}
