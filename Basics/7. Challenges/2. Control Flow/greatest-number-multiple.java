// Program to find the greatest multiple of a number below 101.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        // run a for loop from i = 100 to 1
        for (int i = 100; i >= 1; i--) {

            // check if i is divisible by number
            // if true, print i and exit the loop
            if (i % number == 0) {
                System.out.println(i);
                break;
            }
        }

        input.close();
    }
}