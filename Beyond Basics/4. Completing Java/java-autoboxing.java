// Program to convert the primitive type into their corresponding Wrapper class object.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // take input from the user
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();

        // convert number to Double
        Double xObj = number;

        // print xObj
        System.out.println(xObj);

        input.close();
    }
}



