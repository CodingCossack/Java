// Program to print * using a nested loop.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // iterate the outer loop n times
        for (int i = 0; i < n; ++i) {

            // iterate the inner loop 2 times
            for (int j = 0; j < 2; ++j) {
                System.out.println("*");
            }
        }

        input.close();
    }
}
