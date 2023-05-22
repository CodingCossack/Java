// Program to check whether a number is palindrome using a method.

import java.util.Scanner;

class Main {

    // method to reverse a number
    int findReverse(int number) {
        int reversed = 0;
        int remainder;
        
        while(number != 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }
        return reversed;
    }

    // create checkPalindrome() method with two parameters: number and reversedNumber
    // check if two numbers are equal or not
    // print Palindrome Number, if they are equal.
    // otherwise, print Not a Palindrome Number
    void checkPalindrome(int number, int reversedNumber) {
        if(number == reversedNumber) {
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not a Palindrome Number");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number
        int number = input.nextInt();

        Main obj = new Main();

        // call findReverse() to find reverse of number
        int reversedNumber = obj.findReverse(number);

        // call checkPalindrome with arguments: number and reversedNumber
        // to check if number is palindrome
        obj.checkPalindrome(number, reversedNumber);

        input.close();
    }
}