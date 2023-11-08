package main;

import main.Board;

import java.util.Scanner;


public class XandO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Board board = new Board();
            board.printBoard();
            int moves = 0;

            while(true){

                while (true) {
                    System.out.print("Player 1: Enter your move: ");
                    int cell = scanner.nextInt();
                    if (board.isCellAvailable(cell)) {
                        board.place(cell, 'X');
                        board.printBoard();
                        moves += 1;
                        break;
                    } else {
                        System.out.println("Cell not available.");
                    }
                }
                if (board.isWinner()) {
                    System.out.println("Player 1 wins.");
                    break;
                }
                if (moves == 9 && !board.isWinner() && board.isDraw()) {
                    System.out.println("Draw. Game ended.");
                    break;
                }

                while (true) {
                    System.out.print("Player 2: Enter your move: ");
                    int cell = scanner.nextInt();
                    if (board.isCellAvailable(cell)) {
                        board.place(cell, 'O');
                        board.printBoard();
                        moves += 1;
                        break;
                    } else {
                        System.out.println("Cell not available.");
                    }
                }
                if (board.isWinner()) {
                    System.out.println("Player 2 wins.");
                    break;
                }
            }
            board.resetBoard();

            System.out.println("Do you want to play again? Press 1, otherwise press 0");
            int option = scanner.nextInt();
            if(option == 0) break;
        }
    }
}