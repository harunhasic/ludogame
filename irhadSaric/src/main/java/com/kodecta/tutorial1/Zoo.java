package com.kodecta.tutorial1;

public class Zoo {
    private String zooName;
    private Tiger tiger;
    private Elephant elephant;

    public Zoo() {
        this.zooName = "Pionirska dolina";
    }

    public Zoo(String zooName) {
        this.zooName = zooName;
    }

    public Zoo(Elephant elephant) {
        this.zooName = "Pionirska dolina";
        this.elephant = elephant;
    }

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
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
}
