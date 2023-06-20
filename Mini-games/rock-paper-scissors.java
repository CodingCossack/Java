
import java.util.Scanner;


class Main {

	

	String getCompChoice() {

		String compChoice;

		
		int randNum = (int) (Math.random() * 3 + 1);

		if (randNum == 1) {
			compChoice = "rock";
			}
		else if (randNum == 2) {
			compChoice = "paper";
			}
		else {
			compChoice = "scissors";
			}
		
	return compChoice;
	}

	

	String getUserInput() {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter rock, paper or scissors: ");

		String userInput = input.nextLine();
		userInput = userInput.toLowerCase();

	return userInput;
	}



	String getResult(String userInput, String computerChoice) {

    // condition for user to draw
    if (userInput.equals(computerChoice)) {
        return "draw";
    	}

    // condition for user to win
    else if (userInput.equals("paper") && computerChoice.equals("rock")) {
        return "win";
    	}
    else if (userInput.equals("rock") && computerChoice.equals("scissors")) {
        return "win";
    	}
    else if (userInput.equals("scissors") && computerChoice.equals("paper")) {
      return "win";
    	}
    
    // all other conditions result in the user losing
    else {
        return "lose";
    	}
	}


	public static void main(String[] args) {

		Main obj = new Main();

		String userInput = obj.getUserInput();
		String compInput = obj.getCompChoice();
		String result = obj.getResult(userInput, compInput);

		System.out.println("User choice: " + userInput);
		System.out.println("Computer choice: " + compInput);
		System.out.println("You: " + result);

	}

}