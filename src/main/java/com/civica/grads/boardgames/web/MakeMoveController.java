package com.civica.grads.boardgames.web;

import com.civica.grads.boardgames.exceptions.GameException;
import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.MoveRecord;
import com.civica.grads.boardgames.model.Position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MakeMoveController {

    
    @Autowired
    private MoveRecord largeMove ;
    
    @Autowired
    private MoveRecord smallMove ; 
    
    @Autowired
    private Board board;
    
    
    @RequestMapping("/large")
    @ResponseBody
    String renderLargeBoard() throws GameException {
        
        //StringBufferBoardRenderer boardRender = new StringBufferBoardRenderer();
        //boardRender.render(board);
        
        String pageHtml = String.format("<html><body><pre>%s</pre></body></html>", largeMove.toString());
        
        return pageHtml ;
    }
    
    @RequestMapping("/small")
    @ResponseBody
    String renderSmallBoard() throws GameException {
        
        String pageHtml = String.format("<html><body><pre>%s</pre></body></html>", smallMove.toString());
        
        return pageHtml ;
    }
    
    @RequestMapping("/board")
    @ResponseBody
    String renderBoard() throws GameException {
        
        String pageHtml = String.format("<html><body><pre>%s%s</pre></body></html>", board.isOccupied(new Position(0, 0)), board.isOccupied(new Position(0, 1)));
        
        return pageHtml ;
    }
    
}