// Program to find the power of a number.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number and power
        int number = input.nextInt();
        int power = input.nextInt();
        
        // variable to store the power of number
        int result = 1;

        // run a loop from 1 to power
        for (int i = 1; i <= power; i++) {
            // inside the loop multiply number with result
            result = number * result;
        } 

        // print the result
        System.out.println(result);

        input.close();
    }
}