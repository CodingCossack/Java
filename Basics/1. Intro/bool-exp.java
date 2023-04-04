// Program to check if a number is divisible by 5.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        // get integer input from the user
        int number = input.nextInt();

        // print true if number is divisible by 5, otherwise print false
        // Hint: You may have to use the % operator
        System.out.println(number % 5 == 0);
        input.close();

    }
}


