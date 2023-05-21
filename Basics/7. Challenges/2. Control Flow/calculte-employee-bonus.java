// Program to find the bonus of employees based on their year of service.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for salary and year of service
        double salary = input.nextDouble();
        double serviceYear = input.nextDouble();

        // check if serviceYear is greater than 5
        if (serviceYear > 5) {

            // compute the bonus and print it 
            double bonus = (salary * 5) / 100;
            System.out.println(bonus);
        }
         
        input.close();
    }
}