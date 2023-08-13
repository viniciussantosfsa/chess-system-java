package com.br.me;

import java.util.Scanner;

import com.br.me.chess.ChessMatch;
import com.br.me.chess.ChessPiece;
import com.br.me.chess.ChessPosition;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println(); // skip 1 line :D
            
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println(); // skip 1 line
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
    }
}
