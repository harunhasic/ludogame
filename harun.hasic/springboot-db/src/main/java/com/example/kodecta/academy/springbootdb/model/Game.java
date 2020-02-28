package com.example.kodecta.academy.springbootdb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.Random;

@Data
@Entity
@Table(name ="games")
public class Game {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",
    strategy = "uuid")
    String id;
    @JsonIgnore
    @Setter(AccessLevel.PROTECTED)
    int number;
    String name;
    int guessCount;
    int maxGuessCount;
    int smallest;
    int biggest;
    int guess;
    boolean won;
    boolean lost;
    Date date = new Date();
    public Game(){

    }
    public Game(String name, String create, String update){
        if(name.equals("")){
            this.name="Game -"+ date.getTime();
        }else {
            this.name=name;
        }
        this.smallest=0;
        this.biggest=100;
        this.won=false;
        this.lost=false;
        this.guessCount=0;
        this.maxGuessCount=10;
        this.number = new Random().nextInt(this.biggest);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void guess(int number){
        if (isGameActive()) {
            this.guess = number;
            guessCount++;
            if (isValidGuess()) {
                if (this.guess == this.number) {
                    gameWon();
                    return;
                }else if (this.guess < this.number){
                    this.smallest=this.guess+1;
                }else if(this.guess>this.number){
                    this.biggest=this.guess-1;
                }
            }
            if(guessCount >= maxGuessCount){
                gameLost();
            }
        }
    }

    private boolean isValidGuess() {
                return guess >= smallest && guess <= biggest;
            }

            private boolean isGameActive() {
                return !lost && !won;
            }

            private void gameWon() {
                this.won = true;
                this.lost = false;
            }

            private void gameLost() {
                this.won = false;
                this.lost = true;
            }
}