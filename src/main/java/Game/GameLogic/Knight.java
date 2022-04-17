package Game.GameLogic;

import static java.lang.Math.*;

public class Knight extends ChessPiece{

    public Knight(PieceColor color, Position position) {
        super(color,PieceType.KNIGHT, position);
    }

    public boolean isPossibleMove(Position from, Position to) {
        return abs(from.getRow() - to.getRow()) == 2 && abs(from.getColumn() - to.getColumn()) == 1
                || abs(from.getRow() - to.getRow()) == 1 && abs(from.getColumn() - to.getColumn()) == 2;
    }
}
