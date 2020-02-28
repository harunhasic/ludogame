package com.example.kodecta.academy.springbootdb.service;

import com.example.kodecta.academy.springbootdb.model.Game;
import com.example.kodecta.academy.springbootdb.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class GameServiceImpl implements GameService {

            private final GameRepository gameRepository;

            public GameServiceImpl(GameRepository gameRepository) {
                this.gameRepository = gameRepository;
            }
    @Override
    public Game startGame(String name,String create,String update) {
                Game game = gameRepository.save(new Game(name,create,update));
                return game;
            }

    @Override
    public Game guess(String gameId, int guessNumber) {
                var findResult = gameRepository.findById(gameId);
                if (findResult.isPresent()) {
                        var game = findResult.get();
                        game.guess(guessNumber);
                        gameRepository.save(game);
                        return game;
                    }
                return null;
            }


            @Override
    public List<Game> allGames() {
                return gameRepository.findAll();
            }

            @Override
            public List<Game> findByName(String name) {
                        List<Game> findResult = gameRepository.findByName(name);
                        if (findResult.size() > 0) {
                                return findResult;
                            }
                    return null;

            }
    @Override
    public List<Game> findBySmallest() {
                List<Game> findResult = gameRepository.findAll();
                if (findResult.size() > 0) {
                            Collections.sort(findResult, (d1, d2) -> {
                                return d1.getSmallest() - d2.getSmallest();
                                });
                            return findResult;
                        }
                return null;
            }
    }
