// Program to access the superclass constructor from the subclass.

// create a class named Animal
class Animal {

    // constructor of the animal class.
    Animal() {
        System.out.println("I am an animal.");
    }
}

// create a class Dog that inherits Animal class
class Dog extends Animal {

    // create a constructor of class Dog
        // call constructor of the superclass
    Dog() {
        super();

        // print I am a dog.
        System.out.println("I am a dog.");
    }
}

// create a class named Main
class Main {

    // main method
    public static void main(String[] args) {

        // create an object of the Dog class
        Dog dog1 = new Dog();
    }
}