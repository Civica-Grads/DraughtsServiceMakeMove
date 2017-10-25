package com.civica.grads.boardgames.web;

import com.civica.grads.boardgames.exceptions.GameException;
import com.civica.grads.boardgames.model.MoveRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MakeMoveController {

    
    @Autowired
    private MoveRecord largeMove ;
    
    @Autowired
    private MoveRecord smallMove ; 
    
    
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

}