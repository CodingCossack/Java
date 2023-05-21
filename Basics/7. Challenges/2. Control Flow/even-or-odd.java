// Program to check if a number is even or odd.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number
        int number = input.nextInt();

        // check if number is even or not
        // if result is 0, print Even. Otherwise, print Odd
        if (number % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        input.close();
    }
}