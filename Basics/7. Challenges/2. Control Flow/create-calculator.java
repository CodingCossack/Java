// Program to check if a number is an Abundant Number.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for operator
        String op = input.next();

        // get input value for first and second
        double first = input.nextDouble();
        double second = input.nextDouble();

        switch (op) {
        // perform operations based on the value of op
        case "+":
            System.out.println(first + second);
            break;
            
        case "-":
            System.out.println(first - second);
            break;
        
        case "*":
            System.out.println(first * second);
            break;
        
        case "/":
            System.out.println(first / second);
            break;
        

        // if op doesn't match with any cases
        default:
            System.out.println("Invalid Operator");
        }

        input.close();
    }
}