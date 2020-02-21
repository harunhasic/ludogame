package com.kodectaacademy.numberguess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        log.info("Guess The Number Game");

        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        NumberGenerator numberGenerator =
                context.getBean("numberGenerator", NumberGenerator.class);

        NumberGuessMachine numberGuessMachine =
                context.getBean("numberGuessMachine", NumberGuessMachine.class);

//        int number = numberGenerator.next();
//        log.info("number = {}", number);

        Game game = context.getBean(Game.class);

        int wonCounter = 0, lostCounter = 0;
        for (int j = 0; j < 100; j++) {

            game.reset();
            log.info("range = [{}, {}]", game.getSmallest(), game.getBiggest());

            for(int i = 0; i < 10; i++) {

                int guess = numberGuessMachine.guess(game.getSmallest(), game.getBiggest());
                log.info("trying {}...", guess);
                game.setGuess(guess);
                game.check();

                if(game.isGameWon()) {
                    wonCounter++;
                    log.info("great job!!");
                    break;
                }
                else  {
                    log.info("almost there... new range = [{}, {}]", game.getSmallest(), game.getBiggest());
                }
                context.close();

            }
            if(!game.isGameWon()) {
                log.info("game lost!!");
                lostCounter++;
            }

        }
        log.info("Number of games won: {}, number of games lost: {}", wonCounter, lostCounter);


    }
}
