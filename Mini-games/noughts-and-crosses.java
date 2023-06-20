// Program to play tic tac toe.

import java.util.Scanner;

class Board {

    // count variable
    int count = 0;
    String board[] = { " ", " ", " ", " ", " ", " ", " ", " ", " " };

    void printBoard() {

        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("-----------");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("-----------");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);

    }

    boolean updateBoard(int position, String type) {

        // if a player selects position n, n-1 index should be updated
        // if the position is not already filled, update the board
        if (board[position - 1] == " ") {
            board[position - 1] = type;

            // increase the value of count by 1
            count++;
            return true;
        }

        // if the position is already filled, ask user to select another position
        else {
            System.out.println("Position already selected. Select another position.");
            return false;

        }
    }

    // If all fields are selected and there is no winner, it's draw
    // Returning true if it's draw
    boolean checkDraw() {

        // check if count == 9
        if (count == 9) {
            return true;
        } 
        else {
            return false;
        }
    }

    // if three symbols appears in a row, returning True
    boolean checkWinner(String type) {
        if ((board[0] == type && board[1] == type && board[2] == type)
                || (board[3] == type && board[4] == type && board[5] == type)
                || (board[6] == type && board[7] == type && board[8] == type)
                || (board[0] == type && board[3] == type && board[6] == type)
                || (board[1] == type && board[4] == type && board[7] == type)
                || (board[2] == type && board[5] == type && board[8] == type)
                || (board[0] == type && board[4] == type && board[8] == type)
                || (board[2] == type && board[4] == type && board[6] == type)) {
            return true;
        }

        else {
            return false;
        }

    }
}

class Player {

    String name;

    String type;

    Player(String type) {
        this.type = type;
        Scanner input = new Scanner(System.in);
        if (type == "X") {
            System.out.println("Player selecting X, enter your name: ");
            name = input.nextLine();
        } 
        else {
            System.out.println("Player selecting O, enter your name: ");
            name = input.nextLine();
        }
    }

}

class Game {

    Board board = new Board();
    Player player1 = new Player("X");
    Player player2 = new Player("O");

    Player currentPlayer = player1;

    void play() {
        // using an infinite loop to run the game
        // we will later add conditions to terminate the loop
        String message = "enter the position (1 - 9):";
        while (true) {

            System.out.println(currentPlayer.name + " " + message);
            Scanner input = new Scanner(System.in);
            int position = input.nextInt();

            // the updateBoard() method return true if
            // the user selected position is not already filled
            if (board.updateBoard(position, currentPlayer.type)) {

                board.printBoard();

                // checking winner each time after updating the board
                if (board.checkWinner(currentPlayer.type)) {
                    System.out.println(currentPlayer.name + " wins!");
                    break;
                }

                // checking draw each time after updating the board
                else if (board.checkDraw()) {
                    System.out.println("Game is a draw!");
                    break;
                }

                // changing current player when board is updated
                else {
                    if (currentPlayer == player1) {
                        currentPlayer = player2;
                    }

                    else {
                        currentPlayer = player1;
                    }

                }
            }

        }

    }

}

class Main {

    public static void main(String[] args) {

        Game game = new Game();
        game.play();

    }
}


