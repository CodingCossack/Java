// Program to to print odd numbers between 1 to n (entered by the user).


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
     
        // take input value for n
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // iterate from i = 1 to n (n should be inclusive)
        for (int i = 1; i <= n; i++) {
         
            // check if i is odd
            // if true, print i
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}


// for (intitalization; boolean; update expression)