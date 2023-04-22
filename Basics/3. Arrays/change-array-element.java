// Program to change an element of an array.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        // create integer array
        int[] primeNumber = {2, 3, 5, 7};
        
        // get integer input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // assign number to the fourth element of primeNumber
        primeNumber[3] = number;

        // print array elements
        for (int i = 0; i < 4; i++) {
            System.out.println(primeNumber[i]);
        }

        input.close();
    }
}