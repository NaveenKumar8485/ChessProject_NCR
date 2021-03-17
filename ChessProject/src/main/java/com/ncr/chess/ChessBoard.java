package com.ncr.chess;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void addPiece(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (pieces[xCoordinate][yCoordinate] instanceof Pawn == false && pieceColor.equals(PieceColor.BLACK)
                && (xCoordinate == MAX_BOARD_HEIGHT-1 || xCoordinate == MAX_BOARD_HEIGHT) && (yCoordinate >= 0 && yCoordinate <= MAX_BOARD_WIDTH)) {
            pieces[xCoordinate][yCoordinate] = pawn;
            pieces[xCoordinate][yCoordinate].setXCoordinate(xCoordinate);
            pieces[xCoordinate][yCoordinate].setYCoordinate(yCoordinate);
        } else if (pieces[xCoordinate][yCoordinate] instanceof Pawn == true && pieceColor.equals(PieceColor.BLACK)
                && (xCoordinate == MAX_BOARD_HEIGHT-1 || xCoordinate == MAX_BOARD_HEIGHT) && (yCoordinate >= 0 && yCoordinate <= MAX_BOARD_WIDTH)){
            pieces[xCoordinate][yCoordinate] = pawn;
            pieces[xCoordinate][yCoordinate].setXCoordinate(-1);
            pieces[xCoordinate][yCoordinate].setYCoordinate(-1);
        }
        //throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
    }

    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if ((xCoordinate <= MAX_BOARD_WIDTH && xCoordinate >= 0) && (yCoordinate <= MAX_BOARD_HEIGHT && yCoordinate >= 0)) {
            return true;
        }
        return false;
    }
}
