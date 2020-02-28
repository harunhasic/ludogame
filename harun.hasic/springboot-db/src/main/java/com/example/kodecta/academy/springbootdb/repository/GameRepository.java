package com.example.kodecta.academy.springbootdb.repository;

import com.example.kodecta.academy.springbootdb.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, String> {
    List<Game> findByName(String name);
}
