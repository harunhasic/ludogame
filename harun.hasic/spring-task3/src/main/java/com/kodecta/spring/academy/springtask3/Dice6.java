package com.kodecta.spring.academy.springtask3;

import java.util.Random;

public class Dice6 implements Dice{
    private final Random r = new Random();
    private int diceDots = 6;

            @Override
    public int roll()
        {
                return r.nextInt(6) + 1;

            }

    @Override
    public int getNumOfDots() {
        return diceDots;
    }


}