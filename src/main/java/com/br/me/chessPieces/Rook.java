package com.br.me.chessPieces;

import com.br.me.boardgame.Board;
import com.br.me.boardgame.Position;
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

        Position p = new Position(0, 0);

        // above
        p.setValues(position.getRow() - 1, position.getColumm());
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumm()] = true;
            p.setRow(p.getRow() - 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumm()] = true;
        }

        // left
        p.setValues(position.getRow(), position.getColumm() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumm()] = true;
            p.setColumm(p.getColumm() - 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumm()] = true;
        }

        // right
        p.setValues(position.getRow(), position.getColumm() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumm()] = true;
            p.setColumm(p.getColumm() + 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumm()] = true;
        }

        // below
        p.setValues(position.getRow() + 1, position.getColumm());
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumm()] = true;
            p.setRow(p.getRow() + 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumm()] = true;
        }

        return mat;
    }
}
