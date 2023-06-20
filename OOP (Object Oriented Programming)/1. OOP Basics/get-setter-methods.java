// Program to access a private field using getter and setter methods.

import java.util.Scanner;

class Person {
    // create private field name
    private String name;

    // create a setter method to set value of name
    public void setName(String name) {
        this.name = name;
    }
    
    // create a getter method to return name
    public String getName() {
        return this.name;
    }
}

class Main {

    public static void main(String[] args) {

        // create person1 object of Person class
        Person person1 = new Person();
        
        // get input name
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        
        // set the value of the name variable
        person1.setName(name);
        
        // get the value of name
        System.out.println(person1.getName());
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

