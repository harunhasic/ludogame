package com.kodecta.spring.academy.springtask3;

public interface Player {
   String getName();
   void numOfWonGames();
   int getNumberOfWins();
   int rollDice();
   int getScore();
   void setName(String Name);
   void setScore(int score);
    Dice getDice();
}
