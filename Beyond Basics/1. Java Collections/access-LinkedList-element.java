// Program to access an element from a LinkedList.

import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create a LinkedList
        LinkedList<String> languages = new LinkedList<>();

        // add elements
        languages.add("Java");
        languages.add("Python");
        
        
        // take an int input from the user
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        
        // access the element at index using get() method
        String element = languages.get(index);
        
        // print element
        System.out.println(element);
        
        input.close();
    }
}