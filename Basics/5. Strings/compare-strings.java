// Program to compare two input strings.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        // take two string inputs
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();
        
        // compare two strings
        boolean result = first.equals(second);
        
        // print the result
        System.out.println(result);
    
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
