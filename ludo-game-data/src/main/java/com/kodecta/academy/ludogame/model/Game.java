package com.kodecta.academy.ludogame.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table
@Entity
public class Game {

    @Id
    @GeneratedValue
    Long id;
    int finish;
    boolean isFinished;




}
