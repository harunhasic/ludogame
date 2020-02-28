package com.kodecta.spring.academy.springtask3;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GameImpl implements Game {
    int playerOnTurn;
    int goal;
    boolean isFinished = false;
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    private boolean firstPlayerOnMove;
    private Player player1, player2;

    private int opponentScore;

    private int diceDots;



    public GameImpl(int goal, Player player1, Player player2) {
        this.goal = goal;
        this.player1 = player1;
        this.player2 = player2;
        this.diceDots = player1.getDice().getNumOfDots();
        this.player1.setName("Player1");
        this.player2.setName("Player2");

    }
    @Override
   public void setPlayersNames(String player1Name, String player2Name){
               this.player1.setName(player1Name);
               this.player2.setName(player2Name);
            }

    public void init() {
        player1.setScore(0);
        player2.setScore(0);
        isFinished = false;
        opponentScore = 0;
    }

    public void check(int pScore){
        if (pScore == goal)
            isFinished = true;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public int getGoal() {
        return goal;
    }

    public void play() {
         int currentRoll;
         int newScore;
         while (!isFinished) {
             if (firstPlayerOnMove) {
                movePlayer(player1);
                 if (isFinished) {
                    log.info(player1.getName() + "has won!!");
                    player1.numOfWonGames();

                }

            }
                        else{
                movePlayer(player2);
                 if (isFinished) {
                    log.info(player2.getName() + "has won!!");
                    player2.numOfWonGames();

                }

            }

        }
    }

    @Override


         public void moreGames(int numberOfGames){
             for (int i = 0; i < numberOfGames; i++) {
                init();
                play();

            }
            log.info(player1.getName() + "has won " + player1.getNumberOfWins() + " times.");
            log.info(player2.getName() + "has won " + player2.getNumberOfWins() + " times.");

        }


            private void movePlayer (Player player1){
            int currentRoll;
            int newScore;
             if (opponentScore == player1.getScore())
                {
                        player1.setScore(0);
                    }
            currentRoll = player1.rollDice();
             if (player1.getScore() != goal - 1)
                currentRoll += player1.rollDice();
            newScore = currentRoll + player1.getScore();
             if (newScore <= goal) {
                player1.setScore(newScore);

            }
             if (currentRoll != 2 * diceDots) {
                firstPlayerOnMove = !firstPlayerOnMove;
                opponentScore = player1.getScore();

            }
            check(player1.getScore());
            log.info(player1.getName() + ": " + player1.getScore());
        }
    }
