package Game.GameLogic;

public class ChessPiece {

    public enum PieceColor{
        BLACK,
        WHITE
    }

    public enum PieceType{
        KNIGHT
    }

    PieceColor pieceColor;
    PieceType pieceType;
    Position position;

    public ChessPiece(PieceColor color, PieceType type,Position position){
        this.pieceColor=color;
        this.pieceType=type;
        this.position=position;
    }

    public PieceColor getPieceColor() {
        return pieceColor;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public Position getPosition() {
        return position;
    }
}
