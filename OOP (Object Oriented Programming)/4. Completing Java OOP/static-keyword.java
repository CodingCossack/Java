// Program to access the static variable and method.

import java.util.Scanner;

class Company {
    
    // create a static field 
    static String name;
    
    // create a static method
    static void printName() {
        System.out.println(name);
    }
}

class Main {
    
    // main method
    public static void main(String[] args) {
        
        // take an String input for name
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        
        // set the value of static variable
        Company.name = name;
        
        // call the static method
        Company.printName();
        
        // close the Scanner object
        input.close();
    }
}


// In Java, a constructor is similar to a method, but it doesn't have a return type and it has the same name as the class.
// When we create an object, the constructor is called automatically
// If we didn't define any constructor inside a class, Java automatically creates a default constructor and assigns a default value to the fields of the class


// 1. Default Constructor
// If we haven't defined a constructor inside the class, Java automatically creates one while creating the object of the class.

// 2. No-Arg Constructor
// A no-arg constructor doesn't take any arguments. Remember this example from earlier.

// 3. Parameterized Constructor
// As the name suggests a parameterized constructor takes arguments (just like methods).


// Use the this keyword to refer to the current object which will create ambiguity in variable names. To avoid it, we use this keyword to denote object variables


// Access modifiers are used to set the visibility of fields, methods, and even classes.


// Setter Method - allows us to set the value of fields
// Getter Method - allows us to get the value of fields


// While working in large projects, if two types of objects in a project have is-a relationship, we can use inheritance. For example,

// Dog is a Animal
// Triangle is a Polygon
// Quadrilateral is a Polygon
// Student is a Person


// The super keyword allows us to access the method of the parent class from the child class.
// super() must be the first statement inside the constructor of a child class while calling the constructor of the parent class
// We can also use the super keyword to access the fields of the superclass from the subclass. (doesnt have to be first statement to access fields)


// Interfaces provide specifications that a class must follow and help us achieve abstraction in Java.
// Abstraction allows us to manage the complexity of the program by hiding unnecessary details and only showing the needed information.
// By default, all methods inside the interface are public.

// Overloaded methods/method overloading process is where same method has different amount of parameters/data types
// Method overloading is only associated with parameters, not return types and overloaded methods may have the same or different return types.


// Encapsulation means bundling fields and methods together inside a class.

// Data hiding 

// - - - Scanner Class - - - 

// Scanner is a class that has various methods defined inside it and we are using the object to call those methods.
// System.in parameter is used to take input from the standard input (keyboard).
// The code import java.util.Scanner; is used to import the Scanner class in our program.
// java.util is a package where Scanner is defined and the import keyword includes the package in our code.

// - - - instanceof - - -

// Use instanceof operator to check whether an object is the instance (object) of a particular class or not. e.g. boolean result = obj instanceof Main;

// - - - Static - - -

// static keyword allows to bypass need for object creation to access method/fields in a class
// static fields and methods are associated with classes, not with objects. Hence, if we are accessing them from different classes, we can use the class name.

