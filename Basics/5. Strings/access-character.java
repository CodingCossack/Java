// Program to access a character from the string.


import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // get String input
        String text = input.nextLine();
        
        // find the last character of the string
        char last = text.charAt(text.length() - 1);
        System.out.println(last);

        input.close();
    }
}


/*

STRING METHODS

length() - finds the length of the string
charAt() - returns a character from the string
concat() - joins two strings together
equals() - compares two strings

*/
