// Program to print each character of the string using a loop.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // get input value for string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // run a for loop to access each character of a string
        for (int i = 0; i < text.length(); i++) {

            // print each character of the string
            System.out.println(text.charAt(i));
        }
        
        input.close();
    }
}