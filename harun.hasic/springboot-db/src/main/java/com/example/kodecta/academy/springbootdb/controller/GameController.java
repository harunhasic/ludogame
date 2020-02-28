package com.example.kodecta.academy.springbootdb.controller;


import com.example.kodecta.academy.springbootdb.model.Game;
import com.example.kodecta.academy.springbootdb.service.GameService;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/game")
public class GameController {
    private final GameService gameService;

            public GameController(GameService gameService) {
                this.gameService = gameService;
            }

    @PostMapping
    ResponseEntity<Game> create(@RequestBody String requestBody) {
               JSONParser parser = new JSONParser();
               JSONObject jsonObject = null;
               String name="";
               try {
                        jsonObject = (JSONObject) parser.parse(requestBody);
                        name = (String) jsonObject.get("name");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                String created = "" + new Date();
                Game game = gameService.startGame(name,created,"");
                return new ResponseEntity<>(game, HttpStatus.CREATED);
           }

            @GetMapping()
    ResponseEntity<List<Game>> getAll() {
                return ResponseEntity.ok(gameService.allGames());
            }

            @GetMapping(path = "/name/{name}")
            ResponseEntity<List<Game>> getByName(@PathVariable("name") String name) {
                {
                    List<Game> game = gameService.findByName(name);
                    if (game != null) {
                        return ResponseEntity.ok(game);
                    }
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
            }
                @GetMapping(path = "/smallest")
                ResponseEntity<List<Game>> getOrderedBySmallestAsc () {
                    List<Game> game = gameService.findBySmallest();
                    if (game != null) {
                        return ResponseEntity.ok(game);
                    }
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }


            @PutMapping(path = "/{id}/{guess}")
    ResponseEntity<Game> guess(@PathVariable("id") String gameId, @PathVariable("guess") int guess) {
                Game game = gameService.guess(gameId, guess);
                if (game != null) {
                        return ResponseEntity.ok(game);
                    }
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

        }