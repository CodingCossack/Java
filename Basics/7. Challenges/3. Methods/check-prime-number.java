// Program to check whether a number is prime or not using a method.

import java.util.Scanner;

class Main {

    // method to check prime number
    void checkPrime(int number) {
        int flag = 0;

        // run loop from 2 to number - 1
        // check if number is divisible by any value between 2 to number - 1
        // if number is divisible, change flag to 1 and break the loop
        for(int i = 2; i < number - 1; i++) {
            if(number % i == 0) {
                flag = 1;
                break;
            }
        } 

        // check the value of flag
        // if it's 1, print Not a Prime Number, else print Prime Number
        if(flag == 1) {
            System.out.println("Not a Prime Number");
        }
        else {
            System.out.println("Prime Number");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number
        int number = input.nextInt();

        Main obj = new Main();

        // call checkPrime with number as argument
        obj.checkPrime(number);
        
        input.close();
    }
}