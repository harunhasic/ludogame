package com.kodecta.spring.test;

public class ElephantBuilder {

    private String name;
    private String sound;

    private ElephantBuilder() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
