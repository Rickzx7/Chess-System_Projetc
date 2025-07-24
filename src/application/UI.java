package application;

import Chess.ChessMatch;
import Chess.ChessPiece;
import boardgame.Piece;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class UI {

    public static void printBoard(ChessPiece[][] pieces){
        for(int i = 0; i < pieces.length; i++){
            System.out.print((8 - i) + " ");
            for(int j = 0; j < pieces.length; j++){
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");


    }


    private static void printPiece(ChessPiece piece){
        if(piece == null){
            System.out.print("-");
        } else{
            System.out.print(piece);
        }
        System.out.print(" ");
    }



   /* public static void printBoard(List<List<ChessPiece>> pieces){

        pieces.stream().forEach(piece->{
            piece.forEach(piece1->{
                System.out.println(piece1);
            });
        });
        System.out.println("a b c d e f g h");
    }*/
}
