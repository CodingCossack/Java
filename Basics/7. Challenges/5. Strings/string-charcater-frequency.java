// Program to find the total occurrence of the character 'a' in a string.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char ch = 'a';

        Scanner input = new Scanner(System.in);

        // get input value for string
        String text = input.nextLine();

        // variable to store the occurrence of 'a'
        int count = 0;

        // run a for loop to access each character of a string
        for (int i = 0; i < text.length(); ++i) {
            
            // compare each string character with the specified character
            // use the charAt() method to access the character from string
            // if match found, increase the value of count by 1
            if(text.charAt(i) == ch) {
                count += 1;
            }
        }

        System.out.println(count);

        input.close();
    }
}