package com.br.me.chess;

import com.br.me.boardgame.Board;
import com.br.me.boardgame.Position;
import com.br.me.chessPieces.King;
import com.br.me.chessPieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumms()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int y = 0; y < board.getColumms(); y++) {
                mat[i][y] = (ChessPiece) board.piece(i, y);
            }
        }
        return mat;
    }

    private void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.WHITE), new Position(3, 1));
    }
}
