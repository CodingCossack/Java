// Program to find the multiplication table of an integer (entered by the user) from 6 to 9.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // get integer input from the user
        int n = input.nextInt();

        // create multiplication table form 6 to 9
        for (int i = 6; i < 10; i++) {
            int product = i * n;
            System.out.println(n + " times " + i + " is " + product);
        }
        input.close();
    }
}