// Program to join two strings.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for text1 and text2
        String text1 = input.next();
        String text2 = input.next();
        
        // join two strings with a space in between
        // join the new string with the second string
        String joinSpace = text1.concat(" ");
        String joinedString = joinSpace.concat(text2);
        
        System.out.println(joinedString);

        input.close();
    }
}