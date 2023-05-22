// Program to use the same method multiple times.

class Main {

    // create a method to print two numbers 5 and 100
    void printNumbers() {
        System.out.println(5);
        System.out.println(100);
    }
    

    public static void main(String[] args) {

        // object of Main class
        Main obj = new Main();

        // call the method two times using obj
        obj.printNumbers();
        obj.printNumbers();
    }
}