package Game.GameLogic;

public class Board {
    private ChessPiece [][] board = new ChessPiece[8][8];

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
        return board;
    }
}
