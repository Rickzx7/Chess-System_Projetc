package Pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
import boardgame.Piece;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
