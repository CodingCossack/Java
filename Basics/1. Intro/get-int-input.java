// Program to get an integer input from the user.


import java.util.Scanner;

class Main {

    public static void main(String[] args) {
     
        // create object of Scanner
        Scanner input = new Scanner(System.in);
     
        // take input value for number
        int number = input.nextInt();
     
        System.out.println(number);
     
        // close the Scanner object
        input.close();
    }
}


