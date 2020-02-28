package com.kodecta.spring.academy.springtask3;

import java.util.Random;

public class Dice12 implements Dice {
    private final Random random = new Random();
    private int diceDots = 12;

    @Override
    public int getNumOfDots() {
        return diceDots;
    }

       @Override
    public int roll(){
        return random.nextInt(diceDots) + 1;
    }

}
