// Program to overload a method with different types of parameters.

import java.util.Scanner;

class Addition {

    // add() method with integer parameters
    // add parameters and print the result
    public void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    // add() method with string parameters
    // join parameters and print the result
    public void add(String s1, String s2) {
        System.out.println(s1.concat(s2));
    }
}

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // get integer input for number1 and number2
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // get string input for first and second
        String first = input.next();
        String second = input.next();

        // create an object of Addition
        Addition obj = new Addition();

        // call add() with integer parameters
        obj.add(number1, number2);

        // call add() with string parameters
        obj.add(first, second);
        
        input.close();
    }
}