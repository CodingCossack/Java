// Program to implement data hiding in Java.

import java.util.Scanner;

class Person {

    // create an private field 
    private int age;

    // public method to set age
    public void setAge(int age) {

        this.age = age;
    }

    // public method to get age
    public int getAge() {
        return this.age;
    }
}

class Main {

    public static void main(String[] args) {
        
        // create Scanner object
        Scanner input = new Scanner(System.in);
        
        // take user input
        int age = input.nextInt();
        
        // create object of Person class
        Person person = new Person();
        
        // set age using setAge()
        person.setAge(age);
        
        // print age using getAge()
        System.out.println(person.getAge());
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


// Interfaces provide specifications that a class must follow and help us achieve abstraction in Java.
// Abstraction allows us to manage the complexity of the program by hiding unnecessary details and only showing the needed information.
// By default, all methods inside the interface are public.

// Overloaded methods/method overloading process is where same method has different amount of parameters/data types
// Method overloading is only associated with parameters, not return types and overloaded methods may have the same or different return types.


// Encapsulation means bundling fields and methods together inside a class.

// Data hiding

