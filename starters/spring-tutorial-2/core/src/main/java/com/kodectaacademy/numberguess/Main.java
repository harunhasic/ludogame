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

//        int number = numberGenerator.next();
//        log.info("number = {}", number);

        Game game = context.getBean(Game.class);
        game.reset();
        log.info("range = [{}, {}]", game.getSmallest(), game.getBiggest());

        int guess = 23;
        log.info("trying {}}...", guess);
        game.setGuess(guess);
        game.check();
        if(game.isGameWon()) {
            log.info("great job!!");
        }
        else  {
            log.info("almost there... new range = [{}, {}]", game.getSmallest(), game.getBiggest());
        }
        context.close();

    }
}
