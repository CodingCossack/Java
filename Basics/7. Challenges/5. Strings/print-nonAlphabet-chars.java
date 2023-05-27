// Program to print the non-alphabet characters from a string.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // get input value for string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // run a for loop to access each character of a string
        for (int i = 0; i < text.length(); i++) {

            // access each character using charAt()
            char x = text.charAt(i);

            // check if the string falls in the range from 'a' to 'z' or 'A' to 'Z'
            // hint: use >= 'a' and <= 'z' for both cases
            if (x >= 'a' && x <= 'z' || x >= 'A' && x <= 'Z') {

                // if true, skip the current iteration of loop
                continue;
            }

            // print x if it doesn't fall in the range
            System.out.println(x);
        }

        input.close();
    }
}