package Game.GameLogic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {

    Position from=new Position(4,4);
    Knight knight=new Knight(ChessPiece.PieceColor.BLACK, from);

    @Test
    void test_isPossibleMoveValid() {
        assertTrue(knight.isPossibleMove(from,new Position(2,5))); //2 Up   1 Right
        assertTrue(knight.isPossibleMove(from,new Position(2,3))); //2 Up   1 Left
        assertTrue(knight.isPossibleMove(from,new Position(6,5))); //2 Down 1 Right
        assertTrue(knight.isPossibleMove(from,new Position(6,3))); //2 Down 1 Left
        assertTrue(knight.isPossibleMove(from,new Position(3,6))); //1 Up   2 Right
        assertTrue(knight.isPossibleMove(from,new Position(3,2))); //1 Up   2 Left
        assertTrue(knight.isPossibleMove(from,new Position(5,6))); //1 Down 2 Right
        assertTrue(knight.isPossibleMove(from,new Position(5,2))); //1 Down 2 Left
    }

    @Test
    void test_isPossibleMoveInValid(){
        assertFalse(knight.isPossibleMove(from,new Position(1,5))); //3 Up   1 Right
        assertFalse(knight.isPossibleMove(from,new Position(2,2))); //2 Up   2 Left
        assertFalse(knight.isPossibleMove(from,new Position(7,5))); //3 Down 1 Right
        assertFalse(knight.isPossibleMove(from,new Position(6,1))); //2 Down 3 Left
        assertFalse(knight.isPossibleMove(from,new Position(0,6))); //4 Up   2 Right
        assertFalse(knight.isPossibleMove(from,new Position(0,0))); //4 Up   4 Left
        assertFalse(knight.isPossibleMove(from,new Position(7,7))); //4 Down 4 Right
        assertFalse(knight.isPossibleMove(from,new Position(5,5))); //1 Down 1 Right
    }

}