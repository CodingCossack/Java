// Program to check if two strings are equal.

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
     
        // take input values for both string
        String str1 = input.next();
        String str2 = input.next();

        // compare two strings using equals()
        if (str1.equals(str2)) {
            System.out.println("Equal");
        }

        else {
            System.out.println("Not Equal");
        }

        input.close();
    }
}