// Program to print only the even numbers from an array.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // array to store numbers
        int[] numbers = new int[10];

        // get input values for array
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = input.nextInt();
        }

        // run a loop to access each element of the array
        for (int i = 0; i < numbers.length; ++i) {

            // check if the array element is even
            if (numbers[i] % 2 == 0) {
                // print the array element
                System.out.println(numbers[i]);
            }
        }

        input.close();
    }
}