// Program to print an element of an array based on user input (index). If the index doesn't exist in an array, print a custom message.

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        // try block
        try {
            // create an array
            int numbers[] = {10, 20, 30};

            // take index input from the user
            int index = input.nextInt();

            // print the element at that given index
            System.out.println(numbers[index]);

        }

        // catch block
        catch (Exception e) {
            // print custom message
            System.out.println("Index is wrong");
        }
        
        input.close();
        
    }
}



