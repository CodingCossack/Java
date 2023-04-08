// Program to print numbers between 1 and 100.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            int n = input.nextInt();
     
            // check if n is in between 1 and 100
            // if not, break the loop
            if (n < 1 || n > 100) {
                break;
            }

            // print the value of n
            System.out.println(n);
    }
        input.close();
  }
}