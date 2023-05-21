// Program to find the youngest brother among 3 based on their ages.

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        // get input values for jack, roman and johnny
        Scanner input = new Scanner(System.in);
        int jack = input.nextInt();
        int roman = input.nextInt();
        int johnny = input.nextInt();

        // use if else to find the youngest brother
        if(jack < roman && jack < johnny) {
            System.out.println("Jack");
        }
        else if(roman < jack && roman < johnny) {
            System.out.println("Roman");
        }
        else {
            System.out.println("Johnny");
        }

        input.close();
    }
}