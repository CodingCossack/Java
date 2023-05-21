// Program to count the number of digits in an integer.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int count = 0;

        // loop until the number becomes 0.
        // in each iteration remove last digit of number by dividing with 10
        // increase the value of count 
        for(int i = number; number != 0; i--) {
            number = number / 10;
            count += 1;
        }

        // print the count outside the loop
        System.out.println(count);

        input.close();

    }
}