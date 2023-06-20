// Program to assign a student's grade based on the exam score.

import java.util.Scanner;

class Student {
    
    int score;
    char grade;
    
    // assign value to score
    Student(int score) {
        this.score = score;
        this.grade = grade;
    }
    
    void assignGrade() {
        
        // assign grade based on the value
        if (this.score >= 90) {
            this.grade = 'A';
        }
        else if (this.score >= 80) {
            this.grade = 'B';
        }
        else {
            this.grade = 'C';
        }
    }
}

class Main {
    public static void main(String[] args) {
        
        // take the score input
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        
        // create object
        Student student = new Student(score);
        
        // call the assignGrade() method
        student.assignGrade();
        
        // print the grade
        System.out.println(student.grade);
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


// Use the this keyword to refer to the current object

