package com.example.kodecta.academy.springbootdb.service;

import com.example.kodecta.academy.springbootdb.model.Game;

import java.util.List;

public interface GameService {
    Game startGame(String name,String create,String update);
    Game guess(String gameId, int guessNumber);
    List<Game> allGames();
    List <Game>findByName(String name);
    List<Game> findBySmallest();
}
