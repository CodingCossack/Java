// Program to fill elements with specified values.

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create a LinkedList
        LinkedList<String> languages = new LinkedList<>();

        // take input from user
        Scanner input = new Scanner(System.in);
        String text1 = input.nextLine();
        String text2 = input.nextLine();
        String text3 = input.nextLine();
        
        // add text1, text2, text3 to the linkedlist
        languages.add(text1);
        languages.add(text2);
        languages.add(text3);
        
        // fill every element with random
        Collections.fill(languages, "random");
        
        // print the list
        System.out.println(languages);

        input.close();
    }
}



// The binarySearch() method returns the position of an element in integer form.

// Shuffling algorithms allow us to present the sequential element in a random order.

// Collections	When to use?
// ArrayList	when we need the functionality of resizable-arrays
// LinkedList	when we need to store actual data and the address of its previous and next element.
// HashSet		when we don't want to store duplicate elements
// HashMap		when we need to store data in pair of keys and values

