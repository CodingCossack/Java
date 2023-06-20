// Program to print value of any data type.

import java.util.Scanner;

class Main {

    // create a generics method
    // pass T data as a parameter
    public void display<T data> {

        // print data
        System.out.println(data);
    }

    public static void main(String[] args) {

        // create object of Main class
        Main obj = new Main();

        // take string input from the user
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();

        // call generics method and pass input1
        obj.<String>display(input1);
    
    }
}
