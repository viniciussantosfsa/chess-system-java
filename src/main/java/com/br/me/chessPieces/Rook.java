package com.br.me.chessPieces;

import com.br.me.boardgame.Board;
import com.br.me.chess.ChessPiece;
import com.br.me.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumms()];
        return mat;
    }
}
