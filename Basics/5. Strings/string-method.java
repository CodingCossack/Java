// Program to find the shorter string among two.


import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        
        // get string inputs
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();
        
        // get length of both strings
        int firstLength = first.length();
        int secondLength = second.length();
        
        // compare the length of strings
        if (firstLength < secondLength) {
            System.out.println(first);
        }
        else {
            System.out.println(second);
        }
        
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
