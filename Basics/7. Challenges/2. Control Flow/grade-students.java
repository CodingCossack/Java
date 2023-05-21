// Program to find the grade of a student based on the marks.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // get input value for marks
        Scanner input = new Scanner(System.in);
        double marks = input.nextDouble();

        // check the value of marks and assign grade based on the value
        if(marks >= 90) {
            System.out.println('A');
        }
        else if(marks >= 80) {
            System.out.println('B');
        }
        else if(marks >= 70) {
            System.out.println('C');
        }
        else {
            System.out.println('D');
        }

        input.close();
    }
}