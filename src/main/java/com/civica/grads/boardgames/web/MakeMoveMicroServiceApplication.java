package com.civica.grads.boardgames.web;

import com.civica.grads.boardgames.display.StringBufferBoardRenderer;
import com.civica.grads.boardgames.exceptions.GameSetupException;
import com.civica.grads.boardgames.interfaces.Renderer;
import com.civica.grads.boardgames.model.Board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration
public class MakeMoveMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MakeMoveMicroServiceApplication.class, args);
    }
    
    
    @Bean
    Board board()
    {
        return new Board(10);
    }
    
    
}
