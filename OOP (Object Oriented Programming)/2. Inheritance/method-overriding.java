// Program to derive a Quadrilateral class from the Polygon class in our previous example.

import java.util.Scanner;

class Polygon {
    void displayInfo() {
        System.out.println("A polygon is a two dimensional shape with straight lines.");
    }

    int getPerimeter(int[] sides) {
        int perimeter = 0;
        // find sum of all sides
        for (int side : sides) {
            perimeter = perimeter + side;
        }

        return perimeter;
    }
}

// inherit the Quadrilateral class withs displayInfo() method
class Quadrilateral extends Polygon {
    void displayInfo() {
        System.out.println("A quadrilateral is a polygon with 4 sides.");
    }
}

class Main {
    public static void main(String[] args) {
        
        // create an object of Quadrilateral
        Quadrilateral q1 = new Quadrilateral();

        // sides of triangle
        int[] quadrilateralSides = new int[4];
        
        // get sides input
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < quadrilateralSides.length; ++i) {
            quadrilateralSides[i] = input.nextInt();
        }

        // call getPerimeter using q1
        int perimeter = q1.getPerimeter(quadrilateralSides);
        System.out.println(perimeter);

        // call displayInfo() method
        q1.displayInfo();

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

