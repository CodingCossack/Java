// Program to check if two arguments passed to a method are equal or not.

import java.util.Scanner;

class Main {

    // create method with two arguments
    void myMethod(int num1, int num2) {

        // compare two arguments
        // if they are equal, print Arguments are Equal.
        // Otherwise, print Arguments are not Equal
        if(num1 == num2) {
            System.out.println("Arguments are Equal");
        }
        else {
            System.out.println("Arguments are not Equal");
        }
    }

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        // get input values for two numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // create an object of Main
        Main obj = new Main();

        // use obj to call the method with number1 and number2 arguments
        obj.myMethod(number1, number2);

        input.close();
    }
}