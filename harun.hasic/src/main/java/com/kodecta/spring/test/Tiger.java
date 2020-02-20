package com.kodecta.spring.test;

public class Tiger{
    private String colour;
    private int age;

    public Tiger(String colour, int age) {
        this.colour = colour;
        this.age = age;
    }

    public Tiger() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}
