package application;

import Chess.ChessMatch;
import boardgame.Board;
import boardgame.BoardExeception;
import boardgame.Position;

public class Main {
    public static void main(String[] args) throws BoardExeception {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());


    }
}