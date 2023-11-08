package main;

public class Board {
 GUI_XandO XandO = new GUI_XandO();
//    private char[][] board;
//
//
//    public Board() {
//
//        char[][] temp = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
//        board = temp;
//
//    }
//
//    public void printBoard() {
//
//        for (char[] row : board) {
//            for (char cell : row) {
//                System.out.printf("| %c ", cell);
//            }
//            System.out.println();
//        }
//    }
//
//    public boolean isCellAvailable(int number) {
//
//        if (1 <= number && number <= 9) {
//            int row = (number - 1) / 3;
//            int col = (number - 1) % 3;
//            if (board[row][col] == 'X' || board[row][col] == 'O') return false;
//            else return true;
//        }
//        return false;
//
//    }
//
//    public void place(int number, char marker) {
//        int row = (number - 1) / 3;
//        int col = (number - 1) % 3;
//        board[row][col] = marker;
//    }
//
//    public boolean isWinner() {
//
//        if (board[0][0] == board[0][1] && board[0][1] == board[0][2]) return true;
//        else if (board[1][0] == board[1][1] && board[1][1] == board[1][2]) return true;
//        else if (board[2][0] == board[2][1] && board[2][1] == board[2][2]) return true;
//
//        else if (board[0][0] == board[1][0] && board[1][0] == board[2][0]) return true;
//        else if (board[0][1] == board[1][1] && board[1][1] == board[2][1]) return true;
//        else if (board[0][2] == board[1][2] && board[1][2] == board[2][2]) return true;
//
//        else if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) return true;
//        else if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) return true;
//
//        return false;
//
//    }
//    public void setBoard(char[][] newBoard) {
//        board = newBoard;
//    }
//    public char[][] getBoard() {
//        return board;
//    }
//
//    public void resetBoard() {
//        char[][] initialBoard = {
//                {'1', '2', '3'},
//                {'4', '5', '6'},
//                {'7', '8', '9'}
//        };
//        board = initialBoard;
//    }
//
//    public boolean isDraw() {
//        for (int row = 0; row < 3; row++) {
//            for (int col = 0; col < 3; col++) {
//                if (board[row][col] != 'X' && board[row][col] != 'O') {
//                    return false;
//                }
//            }
//        }
//        return !isWinner();
//    }

}