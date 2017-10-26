package com.civica.grads.boardgames.web.model;

import com.civica.grads.boardgames.model.Board;

import com.civica.grads.boardgames.model.MoveRecord;


public interface GameDataService {

    Board getCurrentBoard();

    MoveRecord getCurrentMoveRecord();

}