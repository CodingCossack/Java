// Program to convert distance in kilometers to miles.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // take input for km
        double km = input.nextDouble();
        
        // convert km to miles
        double miles = km / 1.6;

        // display value in miles
        System.out.println(miles);

        input.close();
    }
}
