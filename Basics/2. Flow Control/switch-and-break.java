// Program to identify even and odd numbers between 1 to 10.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // take number input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // corresponding case is executed depending on the value of number
        switch (number) {
            
            // cases to find odd number
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Odd Number");
                break;
                
            // cases to find even numbers
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Even Number");
                break;
                
            default:
                System.out.println("Invalid Number");
        }
        input.close();
    }
}