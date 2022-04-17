package Game.GameLogic;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private ChessPiece [][] board = new ChessPiece[8][8];
    private List<Position> takenPositions=new ArrayList<>();

    public ChessPiece[][] InitialiseNewBoard(){
        board[0][6]=new ChessPiece(
                ChessPiece.PieceColor.BLACK,
                ChessPiece.PieceType.KNIGHT,
                new Position(0,6)
                ); //G8

        board[7][1]=new ChessPiece(
                ChessPiece.PieceColor.WHITE,
                ChessPiece.PieceType.KNIGHT,
                new Position(7,1)
        ); //B1
        takenPositions.add(new Position(0,6));
        takenPositions.add(new Position(7,1));
        return board;
    }

    public void takePosition(Position position){
        if(!takenPositions.contains(position)){
            takenPositions.add(position);
        }
    }

    public List<Position> getTakenPositions(){
        return this.takenPositions;
    }


}
