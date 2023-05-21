// Program to check if a student passed, failed, or entered invalid marks.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for marks
        int marks = input.nextInt();

        // check if user has entered valid marks or not
        // also check if the student passed or failed
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        }
        else if (marks > 40) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        
        input.close();
    }
}