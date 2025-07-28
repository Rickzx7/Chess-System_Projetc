package application;

import Chess.ChessExeception;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;
import boardgame.Board;
import boardgame.BoardExeception;
import boardgame.Position;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BoardExeception {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();


        while (!chessMatch.getCheckMate()) {
            try {
                UI.clearScreen();
                UI.printMatch(chessMatch, captured);
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.println("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.println("target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

                if(capturedPiece != null){
                    captured.add(capturedPiece);
                }
            }
            catch (ChessExeception | InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        UI.clearScreen();
        UI.printMatch(chessMatch, captured);



    }
}