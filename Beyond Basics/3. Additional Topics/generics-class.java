// Program to create a Generics class.

import java.util.Scanner;
// create a generics class
class MyClass<T> {

    // create a constructor with parameter T data
    public MyClass(T data) {

        // print data
        System.out.println(data);
    }
}

class Main {
    public static void main(String[] args) {

        // take input from the user
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();

        // create object of MyClass object and pass number to it
        MyClass<Double> doubleObj = new MyClass<>(number);

        input.close();
    }
}



