// Program to play rock paper scissors between user and computer.

import java.util.Scanner;

class Game {

    String getComputerPick() {

        // get an integer from 1 to 3
        int randomNumber = (int) (Math.random() * 3) + 1;

        if (randomNumber == 1) {
            return "rock";
        }

        else if (randomNumber == 2) {
            return "paper";
        }

        else {
            return "scissors";
        }
    }

    String getUserPick(Scanner input) {

        String userPick;

        // get input until user enters "rock", "paper" or "scissors"
        while (true) {
            System.out.println("Enter rock, paper or scissors:");
            userPick = input.nextLine();
            if (userPick.equals("rock") || userPick.equals("paper") || userPick.equals("scissors")) {
                break;
            }
        }

        return userPick;
    }

    // return either "win", "lose" or "draw"
    String getResult(String userPick, String computerPick) {

        // condition for user to draw
        if (userPick.equals(computerPick)) {
            return "draw";
        }

        // condition for user to win
        else if (userPick.equals("paper") && computerPick.equals("rock")) {
            return "win";
        }

        else if (userPick.equals("rock") && computerPick.equals("scissors")) {
            return "win";
        }

        else if (userPick.equals("scissors") && computerPick.equals("paper")) {
            return "win";
        }

        // all conditions results to loss
        else {
            return "lose";
        }
    }
}

class Main {

    static void playGame(int gamesPick, Game game, Scanner input) {
        for (int i = 1; i <= gamesPick; i++) {
            String userPick = game.getUserPick(input);
            String computerPick = game.getComputerPick();
            String result = game.getResult(userPick, computerPick);

            System.out.println("Game " + i);
            System.out.println("User Pick: " + userPick);
            System.out.println("Computer Pick: " + computerPick);
            System.out.println("You " + result);
            System.out.println("-----------------");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        Scanner input = new Scanner(System.in);
        int gamesPick;

        while(true) {
            System.out.println("How many games does user want to play? ");
            gamesPick = input.nextInt();

            // consume the newline left-over
            input.nextLine();

            if (gamesPick % 2 == 0 && gamesPick >= 0) {
                System.out.println("You must enter an odd number greater than 0");
            }
            else {
                break;
            }
        }

        playGame(gamesPick, game, input);
        input.close();
    }
}




