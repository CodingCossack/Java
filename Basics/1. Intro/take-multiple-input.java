// Program to convert temperature in celsius to fahrenheit.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create object class of Scanner class 
        Scanner input = new Scanner(System.in);


        // take temperature in degree celsius from the user
        double celsius = input.nextDouble();
 
        // convert degree to fahrenheit
        double faren = (celsius * 1.8) + 32;
 
        // print degree in fahrenheit
        System.out.println(faren);
        input.close();
    }
}


