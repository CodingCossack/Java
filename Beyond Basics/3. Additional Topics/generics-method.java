// Program to create a generics method and use it.

import java.util.Scanner;
class Main {

    // create a generics method and pass T data to it
    public <T> void display(T data) {

        // print data
        System.out.println(data);
    }

    public static void main(String[] args) {

        // create object of Main class
        Main obj = new Main();

        Scanner input = new Scanner(System.in);

        // take String input from the user
        String text = input.nextLine();

        // take double input from the user
        double number = input.nextDouble();

        // call display method and pass text
        obj.<String>display(text);

        // call display method and pass number
        obj.<Double>display(number);
        
        input.close();
    }
}



