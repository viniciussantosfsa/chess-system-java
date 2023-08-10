package com.br.me.chessPieces;

import com.br.me.boardgame.Board;
import com.br.me.chess.ChessPiece;
import com.br.me.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
    
}
