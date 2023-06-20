// Program to play noughts and crosses.

import java.util.ArrayList;
import java.util.Scanner;

class Board {

    // count variable
    int count = 0;

    ArrayList<String> board = new ArrayList<>();
    // board.add("");

    void addElements() {
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
        board.add(" ");
    }

    void printBoard() {

        System.out.println(" " + board.get(0) + " | " + board.get(1) + " | " + board.get(2));
        System.out.println("-----------");
        System.out.println(" " + board.get(3) + " | " + board.get(4) + " | " + board.get(5));
        System.out.println("-----------");
        System.out.println(" " + board.get(6) + " | " + board.get(7) + " | " + board.get(8));

    }

    boolean updateBoard(int position, String type) {

        boolean returnValue = false;
        try {
            // if a player selects position n, n-1 index should be updated
            // if the position is not already filled, update the board
            if (board.get(position - 1) == (" ")) {
                board.set(position - 1, type);
                // increase the value of count by 1
                count = count + 1;

                returnValue = true;
            }

            // if the position is already filled, ask user to select another position
            else {
                System.out.println("Position already selected. Select another position.");
                returnValue = false;

            }

        } catch (Exception e) {
            System.out.println("Invalid position! Select another position.");
        }
        return returnValue;
    }

    // if all fields are selected and there is no winner, it's draw
    // returning true if it's draw
    boolean checkDraw() {

        // check if count == 9
        if (count == 9) {
            return true;
        } else {
            return false;
        }
    }

    // if three symbols appears in a row, returning true
    boolean checkWinner(String type) {
        if ((board.get(0).equals(type) && board.get(1).equals(type) && board.get(2).equals(type))
                || (board.get(3).equals(type) && board.get(4).equals(type) && board.get(5).equals(type))
                || (board.get(6).equals(type) && board.get(7).equals(type) && board.get(8).equals(type))
                || (board.get(0).equals(type) && board.get(3).equals(type) && board.get(6).equals(type))
                || (board.get(1).equals(type) && board.get(4).equals(type) && board.get(7).equals(type))
                || (board.get(2).equals(type) && board.get(5).equals(type) && board.get(8).equals(type))
                || (board.get(0).equals(type) && board.get(4).equals(type) && board.get(8).equals(type))
                || (board.get(2).equals(type) && board.get(4).equals(type) && board.get(6).equals(type))) {
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
        } else {
            System.out.println("Player selecting O, enter your name: ");
            name = input.nextLine();
        }
    }
}

class Game {

    Board b1 = new Board();

    Player player1 = new Player("X");
    Player player2 = new Player("O");
    Player currentPlayer = player1;

    // this method will be later used to play the game
    void play() {

        b1.addElements();
        // using an infinite loop to run the game
        // we will later add conditions to terminate the loop
        String message = "enter the position (1 - 9):";

        while (true) {
            try {
                message = "enter the position (1 - 9):";
                System.out.println(currentPlayer.name + " " + message);
                Scanner input = new Scanner(System.in);
                int position = input.nextInt();

                // the updateBoard() method return true if
                // the user selected position is not already filled
                if (b1.updateBoard(position, currentPlayer.type)) {

                    b1.printBoard();

                    // checking winner each time after updating the board
                    if (b1.checkWinner(currentPlayer.type)) {
                        System.out.println(currentPlayer.name + " wins!");
                        break;
                    }

                    // checking draw each time after updating the board
                    else if (b1.checkDraw()) {
                        System.out.println("Game is a draw!");
                        break;
                    }

                    // changing current player when board is updated
                    else {
                        if (currentPlayer == (player1)) {
                            currentPlayer = player2;
                        }

                        else {
                            currentPlayer = player1;

                        }
                    }

                }

            } catch (Exception e) {
                System.out.println("Invalid input! Enter a number between 1 and 9.");
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

