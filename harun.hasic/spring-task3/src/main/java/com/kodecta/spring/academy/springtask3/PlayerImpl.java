package com.kodecta.spring.academy.springtask3;

public class PlayerImpl implements Player {
    String name;
    int score = 0;
    Dice dice;
    int numberOfWins;

    public String getName() {
        return name;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public void numOfWonGames() {
        this.numberOfWins++;
    }

    public int rollDice() {
        return dice.roll();
    }
}