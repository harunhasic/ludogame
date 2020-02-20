package com.kodecta.spring.test;

public class Elephant{

    private String color;
    private int age;

    public Elephant(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
