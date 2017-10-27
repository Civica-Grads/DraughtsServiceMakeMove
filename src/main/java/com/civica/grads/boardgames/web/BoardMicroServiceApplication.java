package com.civica.grads.boardgames.web;

import com.civica.grads.boardgames.display.StringBufferBoardRenderer;
import com.civica.grads.boardgames.exceptions.GameSetupException;
import com.civica.grads.boardgames.interfaces.Board;
import com.civica.grads.boardgames.interfaces.Renderer;
import com.civica.grads.boardgames.model.GameBoard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration
public class BoardMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardMicroServiceApplication.class, args);
    }
    
    
    @Bean
    Board board()
    {
        return new GameBoard(10);
    }
    
    
}
