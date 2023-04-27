// Program to calculate the number of vowels in a string.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        // get string input
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        
        // convert to lowercase
        text = text.toLowerCase();
        
        // variable to count vowels
        int count = 0;
        
        // run a for loop across the text string
        for (int i = 0; i < text.length(); ++i) {
            
            // check if each character is a vowel
            // Separate each comparison with the || operator (comparison1 || comparison2 || ...)
            boolean result = text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u';
            
            if (result) {
                
                // increase the value of count by 1.
                count++;
            }
        }
        
        System.out.println(count);

        input.close();
    }
}


/*

STRING METHODS

length() - finds the length of the string
charAt() - returns a character from the string
concat() - joins two strings together
equals() - compares two strings
replace() - replaces the characters/substring of the strings.
toLowerCase() -  convert a string to lowercase
toUpperCase() -  convert a string to uppercase

*/
