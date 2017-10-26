package com.civica.grads.boardgames.web.model;

import com.civica.grads.boardgames.model.Board;

import com.civica.grads.boardgames.model.Game;
import com.civica.grads.boardgames.model.MoveRecord;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

/**

 * @author Bruce.Mundin

 *

 */

@Service

public class FetchDataGameDataService implements GameDataService {

    private final RestTemplate restTemplate = new RestTemplate();    

    @Value("${url.storageService}")

    private String storageServiceURL ;    

    /* (non-Javadoc)

     * @see com.civica.grads.boardgames.web.model.GameDataService#getCurrentBoard()

     */

    @Override

    public Board getCurrentBoard() {

        Board board = restTemplate.getForObject(storageServiceURL, Board.class);

        return board;
    }
    
    /* (non-Javadoc)

     * @see com.civica.grads.boardgames.web.model.GameDataService#getCurrentMoveRecord()

     */

    @Override

    public MoveRecord getCurrentMoveRecord() {

        MoveRecord moveRecord = restTemplate.getForObject(storageServiceURL, MoveRecord.class);

        return moveRecord;
    }
}