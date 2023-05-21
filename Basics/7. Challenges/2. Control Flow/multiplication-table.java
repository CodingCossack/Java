// Program to print a multiplication table of a number.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take input value for number
        int number = input.nextInt();

        int count = 1;
        
        // use while loop to run up to count <= 10
        // inside the loop multiply number with count and print the multiplication table
        // increase count by 1 in each iteration
        while(count <= 10) {
            int result = number * count;
            System.out.println(number + " * " + count + " = " + result);
            count = count + 1;
        }

        input.close();
    }
}