package com.kodecta.spring.academy.springtask3;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    private static final String CONFIG_LOCATION = "beans.xml";
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        Player player1 = context.getBean("player", Player.class);

        Player player2 = context.getBean("player", Player.class);

        player1.setName("Elbake");
        player2.setName("Dodo");

        Game game = context.getBean(Game.class);

        /*int score=0;
        int totalScore;
        int opponentScore=0;
                while(true){
                        if(game.returnPlayerOnTurn() == 1){
                                if (opponentScore == player1.getScore())
                                        player1.setScore(0);
                                score = player1.rollDice();
                                if (player1.getScore() != game.getGoal() - 1)
                                        score+= player1.rollDice();
                                totalScore = score + player1.getScore();
                                if (totalScore <= game.getGoal()) {
                                        player1.setScore(totalScore);
                                    }
                               if(score != 12) {
                                        game.setPlayerOnTurn(2);
                                        opponentScore = player1.getScore();
                                    }
                                game.check(player1.getScore());
                                log.info(player1.getName() + ": " + player1.getScore());
                                if(game.isFinished()){
                                        log.info(player1.getName() + "has won");
                                        break;
                                    }
                            }
                        else{
                                if (opponentScore == player2.getScore())
                                        player2.setScore(0);
                                score = player2.rollDice();
                                if (player2.getScore() != game.getGoal() - 1)
                                        score+= player2.rollDice();
                                totalScore = score + player2.getScore();
                                if (totalScore <= game.getGoal()) {
                                        player2.setScore(totalScore);
                                    }
                                if(score != 12) {
                                        game.setPlayerOnTurn(1);
                                        opponentScore = player2.getScore();
                                    }
                                game.check(player2.getScore());
                                log.info(player2.getName() + ": " + player2.getScore());
                                if(game.isFinished()){
                                        log.info(player2.getName() + " has won");
                                        break;
                                    }
                            }
                    }

                        context.close();*/

            game.moreGames(30);
    }
}
