// Program to check whether a number is prime or not using a method.

import java.util.Scanner;

class Main {

    // method to check prime number
    // return true if the number is prime, else return false
    boolean checkPrime(int number) {
        int flag = 0;
        
        for(int i = 2; i < number - 1; i++) {
            if(number % i == 0) {
                flag = 1;
                break;
            }
        }
        if(flag == 1) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for two intervals
        int x = input.nextInt();
        int y = input.nextInt();

        Main obj = new Main();

        // run a loop to access each value in interval x and y
        for (int i = x; i <= y; ++i) {

            // call checkPrime for every value between x and y
            boolean result = obj.checkPrime(i);

            // if returned value is true, print the number
            if(result == true) {
                System.out.println(i);
            }
        }

        input.close();
    }
}