// Program to print odd numbers between 1 and n.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // take integer input from user
        int n = input.nextInt();
        
        for (int i = 1; i <= n; ++i) {
            
            // if i is even, skip the printing of i
            if (i % 2 == 0) {
                continue;
            }
            
            // print the value of i
            System.out.println(i);
        }
        input.close();
    }
}


// for (intitalization; boolean; update expression)