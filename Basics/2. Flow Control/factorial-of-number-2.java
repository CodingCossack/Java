// Program to find the factorial of an integer entered by the user.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // take integer input
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int total = 1;

        // run for loop from i = 1 to i = n
        for (int i = 1; i <= n; i++) {
        // multiply value of i to total and assign to total
        total = total * i;
        }

        System.out.println(total);
        input.close();
    }
}


// for (intitalization; boolean; update expression)