package com.kodecta.spring.test;

public class Elephant {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("I am elephant " + name);
    }
}
