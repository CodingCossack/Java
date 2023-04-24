// Program that adds two floating-point numbers using a method.


import java.util.Scanner;

class Main {
    
    // method that adds two double number
    void addNumbers(double n1, double n2) {
        // add two numbers and print the result
        double result = n1 + n2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        
        // take input value
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        
        // creating object of Main class
        Main obj = new Main();
    
        // call the method with arguments number1 and number2
        obj.addNumbers(number1, number2);

        input.close();
    }
}