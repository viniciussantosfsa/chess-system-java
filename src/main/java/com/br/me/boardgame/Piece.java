package com.br.me.boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        position = null;
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMoves(Position position) {
        return possibleMoves()[position.getRow()][position.getColumm()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int x = 0; x < mat.length; x++) {
                if (mat[i][x]) {
                    return true;
                }
            }
        }
        return false;
    }
}
