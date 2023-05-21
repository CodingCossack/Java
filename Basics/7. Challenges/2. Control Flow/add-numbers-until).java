// Program to to check if 3 values are internal angles of a triangle.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;

        // run a while loop that breaks only if input value is 0
        // take input value for number inside the loop
        // if input value is other than 0, add the value to sum
        while(true) {
            number = input.nextInt();
            if(number != 0) {
                sum = sum + number;
            }
            else {
                break;
            }
        }
        
        // print the sum
        System.out.println(sum);
        
        input.close();
    }
}