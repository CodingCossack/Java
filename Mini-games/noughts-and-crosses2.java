// Program to play noughts and crosses.

import java.util.Scanner;

class Board {
    // Define constant for the board size
    static final int SIZE = 9;
    String[] board = new String[SIZE];
    int count = 0;

    // Initialize the board with spaces
    Board() {
        for (int i = 0; i < SIZE; i++) {
            board[i] = " ";
        }
    }

    // Method to print the current state of the board
    void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            // If we're at a new row, print a line
            if (i % 3 == 0 && i != 0) {
                System.out.println("-----------");
            }
            // Print the board cell, and either a divider or a newline
            System.out.print(" " + board[i]);
            if (i % 3 < 2) {
                System.out.print(" |");
            } else {
                System.out.println();
            }
        }
    }

    // Method to update the board with the player's move
    boolean updateBoard(int position, String type) {
        // If the selected position is empty
        if (board[position - 1].equals(" ")) {
            // Update the position and increment the counter
            board[position - 1] = type;
            count++;
            return true;
        } else {
            // If the position is already filled, display an error message
            System.out.println("Position already selected. Select another position.");
            return false;
        }
    }

    // Check if the game is a draw (all positions filled, no winner)
    boolean checkDraw() {
        return count == SIZE;
    }

    // Check if a player has won the game
    boolean checkWinner(String type) {
        return (board[0].equals(type) && board[1].equals(type) && board[2].equals(type)) ||
                (board[3].equals(type) && board[4].equals(type) && board[5].equals(type)) ||
                (board[6].equals(type) && board[7].equals(type) && board[8].equals(type)) ||
                (board[0].equals(type) && board[3].equals(type) && board[6].equals(type)) ||
                (board[1].equals(type) && board[4].equals(type) && board[7].equals(type)) ||
                (board[2].equals(type) && board[5].equals(type) && board[8].equals(type)) ||
                (board[0].equals(type) && board[4].equals(type) && board[8].equals(type)) ||
                (board[2].equals(type) && board[4].equals(type) && board[6].equals(type));
    }
}

class Player {
    String name;
    String type;

    // Constructor for the player, asking for their name
    Player(String type, Scanner input) {
        this.type = type;
        System.out.println("Player selecting " + type + ", enter your name: ");
        name = input.nextLine();
    }
}

class Game {
    Board board = new Board();
    Scanner input = new Scanner(System.in);
    Player player1 = new Player("X", input);
    Player player2 = new Player("O", input);
    Player currentPlayer = player1;

    // Main game loop
    void play() {
        while (true) {
            // Ask the current player for their move
            System.out.println(currentPlayer.name + ", enter the position (1 - 9):");
            int position = input.nextInt();

            // Update the board with the move, if valid
            if (board.updateBoard(position, currentPlayer.type)) {
                // Display the updated board
                board.printBoard();

                // Check for a winner
                if (board.checkWinner(currentPlayer.type)) {
                    System.out.println(currentPlayer.name + " wins!");
                    break;
                }

                // Check for a draw
                else if (board.checkDraw()) {
                    System.out.println("Game is a draw!");
                    break;
                }

                // Switch to the other player for the next turn
                else {
                    currentPlayer = (currentPlayer == player1) ? player2 : player1;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Start the game
        Game game = new Game();
        game.play();
    }
}

