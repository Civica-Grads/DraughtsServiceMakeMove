package com.civica.grads.boardgames.web;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.enums.CounterType;
import com.civica.grads.boardgames.exceptions.GameException;
import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.Counter;
import com.civica.grads.boardgames.model.MoveRecord;
import com.civica.grads.boardgames.model.Position;
import com.civica.grads.boardgames.model.draughts.DraughtsGame;

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
    MoveRecord largeMove() {
    	
    	return new MoveRecord(new Position(0, 0), new Position(2, 2), Colour.WHITE, CounterType.KING, true) ; 
    	
    }
    
    @Bean
    MoveRecord smallMove() {
    	
    	return new MoveRecord(new Position(0, 0), new Position(1, 1), Colour.BLACK, CounterType.NORMAL, false) ; 
    	
    }
    
    @Bean
    Board board() throws GameException {
    	
    	Board draughtsBoard = new Board(DraughtsGame.BoardType.BRAZILIAN.getBoardSize());
    	
    	draughtsBoard.placePiece(new Counter(Colour.WHITE, CounterType.NORMAL, 0), new Position(0, 1));
    	
    	return draughtsBoard;
    
    }
    
}
