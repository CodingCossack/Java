// Program to check whether a number is even or odd.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
     
        // check if a number is divisible by 2
        // if true, print even
        // else, print odd
        if (number % 2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
     
        input.close();
    }
}