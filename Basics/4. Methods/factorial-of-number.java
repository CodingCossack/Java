// Program to compute the factorial of a number.


import java.util.Scanner;

class Main {
    
    // create the computeFactorial() method with a parameter
    int computeFactorial(int number) {

        int factorial = 1;

        // run a for loop from 1 to the method parameter
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        // return factorial
        return factorial;
    }

    public static void main(String[] args) {
        Main obj = new Main();

        // get user input
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // call the method with input value as parameter
        int total = obj.computeFactorial(n);
        System.out.println(total);

        input.close();
    }
}

// System.out.println(), nextInt(), nextDouble(), etc are called standard library methods.