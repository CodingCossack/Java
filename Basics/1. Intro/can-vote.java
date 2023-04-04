// Program to check whether a person can vote or not depending on his/her age.



import java.util.Scanner;

class Main {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
     
        // check if age is greater than or equal to 18
        if (age >= 18) {
            // print The person can vote if true
            System.out.println("The person can vote.");
        }
        input.close();
    }
}

