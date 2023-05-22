// Program to find the GCD of two numbers using a method.

import java.util.Scanner;

class Main {

    // create the findGCD() method with parameters: num1 and num2
    // compute gcd of two numbers and return it
    int findGCD(int num1, int num2) {
        int gcd = 1;
        
        for(int i = 1; i <= num1 && i <= num2; i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            
        }
        return gcd;
    }
    
    public static void main(String[] args) {

        // get input values for two numbers
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        Main obj = new Main();

        // call the findGCD() method
        int gcd = obj.findGCD(number1, number2);
        System.out.println(gcd);

        input.close();
    }
}