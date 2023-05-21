// Program to  check the voting eligibility.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for age
        int age = input.nextInt();

        // check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("Can Vote");
        }
        else {
            System.out.println("Cannot Vote");
        }
         
        input.close();
    }
}