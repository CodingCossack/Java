// Program to access static fields and methods from other classes.

import java.util.Scanner;

// create a class name College
class College {

    // create a static field name
    static String name;

    // create a static method display() and print the value of name
    static void display() {
        System.out.println(name);
    }
}

class Main {

    // create main() method
    public static void main(String[] args) {

        // take input for college name
        Scanner input = new Scanner(System.in);
        String inputName = input.nextLine();

        // set the value of static field as user input
        College.name = inputName;

        // call the static method using its class name
        College.display();
        input.close();
    }
}



