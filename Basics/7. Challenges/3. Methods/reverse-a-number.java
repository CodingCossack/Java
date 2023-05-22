// Program to reverse a number using a method.

import java.util.Scanner;

class Main {

    // method to reverse a number
    int findReverse(int number) {
        int reversed = 0;
        int remainder;

        // run a while loop until number is equal to 0
        // inside the loop, find the reverse of number
        while(number != 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }
        
        return reversed;
    }

    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        Main obj = new Main();

        // call findReverse() with argument, number
        int result = obj.findReverse(number);
        System.out.println(result);
        
        input.close();
    }
}