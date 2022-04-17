package Game.GameLogic;

/**
 * Represents a 2D position.
 */

public class Position {

    private int row;
    private int column;
    private final int tableSize=8; //This is the classic size of a chessboard

    /**
     * Creates a {@code GameLogic.Position} object.
     *
     * @param row the row coordinate of the position
     * @param column the column coordinate of the position
     */

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    /**
     * {@return the row coordinate of the position}
     */

    public int getRow() {
        return row;
    }

    /**
     * {@return the column coordinate of the position}
     */

    public int getColumn() {
        return column;
    }

    /**
     * Changes the position row and column to the coordinate of the
     * {@param newPosition} if it contains a possible row and column pair
     *
     * @param newPosition is a row, column pair
     */

    public void setTo(Position newPosition) {
        if(0<newPosition.getRow() && newPosition.getRow()<tableSize) { this.row = newPosition.getRow(); }
        if(0< newPosition.getColumn() && newPosition.getColumn()<tableSize) {this.column = newPosition.getColumn();}
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        return (o instanceof Position p) && p.row == row && p.column == column;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", row, column);
    }

}