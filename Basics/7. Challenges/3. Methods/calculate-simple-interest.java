// Program to calculate simple interest using a method.

import java.util.Scanner;

class Main {

    // simpleInterest() method with double parameters: principal, time, rate
    // calculate the simple interest and return it
    double simpleInterest(double principal, double time, double rate) {
        double simple_interest = (principal * time * rate) / 100;
        return simple_interest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for principal, time, and rate
        double principal = input.nextDouble();
        double time = input.nextDouble();
        double rate = input.nextDouble();

        Main obj = new Main();

        // call simpleInterest() with arguments principal, time, and rate
        double simple_interest = obj.simpleInterest(principal, time, rate);

        // print the returned value
        System.out.println(simple_interest);
        
        input.close();
    }
}