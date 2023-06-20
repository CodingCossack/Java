// Program to implement hierarchical inheritance.

// Parent Class
class Person {
    public void displayInfo() {
        System.out.println("I am a person.");
    }
}

// extend Student from Person and override displayInfo()
class Student extends Person {
    public void displayInfo() {
        System.out.println("I am a student.");
    }
}

// extend Employee from Person and override displayInfo()
class Employee extends Person {
    public void displayInfo() {
        System.out.println("I am an employee.");
    }
}

class Main {
    public static void main(String[] args) {

        // create objects of Student and Employee class
        Student student1 = new Student();
        Employee employee1 = new Employee();

        // call displayInfo() using student1
        student1.displayInfo();


        // call displayInfo() using employee1
        employee1.displayInfo();

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

