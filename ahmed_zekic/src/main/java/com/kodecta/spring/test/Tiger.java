package com.kodecta.spring.test;

public class Tiger {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("I am tiger " + name );
    }

}
