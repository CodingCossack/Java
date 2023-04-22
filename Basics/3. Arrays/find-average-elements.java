// Program to cfind the average of array elements.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        // create object of Scanner
        Scanner input = new Scanner(System.in);
        
        // create double array of size 5
        double[] numbers = new double[5];
        
        // get input value for the array
        for (int index = 0; index < numbers.length; ++index) {
            numbers[index] = input.nextDouble();
        }
        
        double sum = 0.0;
        
        // add all array elements
        for (int index = 0; index < numbers.length; ++index) {
            // find the sum
            sum = sum + numbers[index];
        }
        
        // find the average
        double average = sum / numbers.length;
        System.out.println(average);
        
        input.close();
    }
}