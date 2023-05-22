// Program to compute the area of a circle using a method.

import java.util.Scanner;

class Main {

    // computeArea() method with double parameters: radius and pi
    // calculate the area of circle and return it
    double computeArea(double radius, double pi) {
        double area = 3.14 * radius * radius;
        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for radius
        double radius = input.nextDouble();

        // variable to store the value of pi
        double pi = 3.14;

        Main obj = new Main();

        // call computeArea() with parameters: radius and pi
        double result = obj.computeArea(radius, pi);
        System.out.println(result);

        input.close();
    }
}