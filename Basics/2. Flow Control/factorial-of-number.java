// Program to find the factorial of an integer entered by the user.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // take integer input
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // create a variable total with value 1
        int total = 1;

        // create a variable i with value 1
        int i = 1;

        // run while loop from 1 to n
        while (i <= n) {
            // multiply total and i in each iteration
            total = total * i;
            // increase the value of i 
            i = i + 1;
        }

        System.out.println(total);
        input.close();
    }
}