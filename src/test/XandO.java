package test;
import main.Board;


import org.junit.*;

//import static org.junit.Assert.assertFalse;
import static org.junit.Assert.*;

public class XandO {
//    private Board board;

//    winners test
    @Test
    public void testNoWinner() {
        Board board = new Board();
        char[][] emptyBoard = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };
        board.setBoard(emptyBoard);
        assertFalse(board.isWinner());
    }

    @Test
    public void testHorizontalXWin() {
        Board board = new Board();
        char[][] horizontalXWin = {
                {'X', 'X', 'X'},
                {'O', 'O', ' '},
                {' ', ' ', ' '}
        };
        board.setBoard(horizontalXWin);
        assertTrue(board.isWinner());
    }

    @Test
    public void testVerticalOWin() {
        Board board = new Board();
        char[][] verticalOWin = {
                {'O', 'X', ' '},
                {'O', 'X', ' '},
                {'O', ' ', ' '}
        };
        board.setBoard(verticalOWin);
        assertTrue(board.isWinner());
    }

    @Test
    public void testResetBoard() {
        Board board = new Board();

        char[][] customState = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'O', 'X', 'O'}
        };
        board.setBoard(customState);

        board.resetBoard();

        char[][] initialBoard = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };
        assertArrayEquals(initialBoard, board.getBoard());
    }

//    test draw
    @Test
    public void testDraw() {
        Board board = new Board();
        char[][] drawBoard = {
                {'X', 'O', 'X'},
                {'O', 'X', 'X'},
                {'X', 'X', 'O'}
        };
        board.setBoard(drawBoard);

        assertTrue(board.isDraw());
    }

}
