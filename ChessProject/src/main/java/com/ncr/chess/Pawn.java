package com.ncr.chess;

public class Pawn extends PieceAbstract {

    public Pawn(PieceColor pieceColor) {
        super(pieceColor);
    }

    @Override
    public void move(MovementType movementType, int newX, int newY) {
        if(movementType.equals(MovementType.MOVE)) {
            if (this.getPieceColor().equals(PieceColor.BLACK) && newX == this.getXCoordinate()-1 && newY == this.getYCoordinate()) {
                this.setXCoordinate(newX);
                this.setYCoordinate(newY);
            }  else if (getPieceColor().equals(PieceColor.WHITE) && newX == getXCoordinate()+1 && newY == getYCoordinate()) {
                this.setXCoordinate(newX);
                this.setYCoordinate(newY);
            }
        }
    }

}
