package application;

import Chess.ChessExeception;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;
import boardgame.Board;
import boardgame.BoardExeception;
import boardgame.Position;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BoardExeception {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.println("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.println("target: ");
                ChessPosition target = UI.readChessPosition(sc);
                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch (ChessExeception | InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }



    }
}