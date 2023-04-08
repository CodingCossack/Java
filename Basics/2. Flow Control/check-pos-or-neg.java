// Program to check whether a number is positive or negative or zero.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
     
        // get integer input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
     
        // check if number is positive
        if (number > 0) {
            System.out.println("positive");
        }
        // check if number is negative
        else if (number < 0) {
            System.out.println("negative");
        }
        // otherwise print zero
        else {
            System.out.println("zero");
        }
     
        input.close();
     
    }
}