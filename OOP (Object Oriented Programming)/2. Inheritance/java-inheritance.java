// Program to derive a Car class from the Vehicle class.

class Vehicle {
    void getFeature() {
        System.out.println("Initializing vehicle features");
    }
}

// derive Car from Vehicle
class Car extends Vehicle {
    
}

// Main class
class Main {
    public static void main(String[] args) {
        
        // create an object of Car
        Car car1 = new Car();

        // access the getFeature method
        car1.getFeature();
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

