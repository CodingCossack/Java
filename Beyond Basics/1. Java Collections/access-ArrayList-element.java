// Program to access an element from an ArrayList.

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create an ArrayList of String type
        ArrayList<String> names = new ArrayList<>();

        // add John to Arraylist
        names.add("John");

        // add Harry to Arraylist
        names.add("Harry");
        
        // add Niall to Arraylist
        names.add("Niall");

        // take input from the user
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();

        // access the element at index
        String element = names.get(index);

        // print the element
        System.out.println(element);

        input.close();
    }
}