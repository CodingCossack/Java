// Program to join two strings using the concat() method.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        // take two string inputs
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        String lastName = input.nextLine();
        
        // join strings using concat
        // add a space between two strings
        // join the resulting string with second string
        String joinedString = firstName.concat(" ");
        joinedString = joinedString.concat(lastName);
        
        System.out.println(joinedString);
        
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
