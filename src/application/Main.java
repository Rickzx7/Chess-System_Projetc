package application;

import Chess.ChessMatch;
import boardgame.Board;
import boardgame.Position;

public class Main {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());


    }
}