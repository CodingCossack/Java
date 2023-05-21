// Program to find the sum of all the digits of a number.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int num = number;
        int digit;
        int sum = 0;

        // run while loop to access each digit of number
        while (num != 0) {

            // use num % 10 to find each digit of number
            digit = num % 10;

            // add each digit to sum
            sum = sum + digit;

            // remove last digit from number
            num = num / 10;
        }

        // print the sum
        System.out.println(sum);
        
        input.close();
    }
}