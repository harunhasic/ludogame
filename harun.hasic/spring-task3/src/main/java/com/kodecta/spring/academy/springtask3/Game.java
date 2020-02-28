package com.kodecta.spring.academy.springtask3;

public interface Game {
    boolean isFinished();
    int returnPlayerOnTurn();
    void setGoal(int goal);
    void setPlayerOnTurn(int player);
    void check(int pScore);
    int getGoal();
    void init();
    void play();
    void moreGames(int numberOfGames);
    void setPlayersNames(String player1Name, String player2Name);
}
