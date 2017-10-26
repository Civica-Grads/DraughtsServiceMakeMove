package com.civica.grads.boardgames.web;

import com.civica.grads.boardgames.exceptions.GameException;
import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.MoveRecord;
import com.civica.grads.boardgames.web.model.GameDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MakeMoveController {

    @Autowired
    private GameDataService gameDataService;

    @RequestMapping("/json/board")
    Board getBoard() throws GameException {
    	
    	return gameDataService.getCurrentBoard();
    }
    
    @RequestMapping("/json/moverecord")
    MoveRecord getMoveRecord() throws GameException {
    	
    	return gameDataService.getCurrentMoveRecord();
    }
    
}