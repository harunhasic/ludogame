package com.kodectaacademy.numberguess;

import java.util.Random;

public class NumberGuessMachineImpl implements NumberGuessMachine {

    @Override
    public int guess(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
