package com.kodecta.tutorial1;

public class Elephant {
    private String voice;

    public void speak(){
        System.out.println("Elephant says: " + this.voice);
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
