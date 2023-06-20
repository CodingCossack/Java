// Program to copy a collection to another.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create an ArrayList of Integers
        ArrayList<Integer> src = new ArrayList<>();

        // take input from the user
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // add elements to src
        src.add(num1);
        src.add(num2);
        
        // create an ArrayList of Integers
        ArrayList<Integer> dest = new ArrayList<>();

        // add elements to dest
        dest.add(22);
        dest.add(33);

        // copy src to dest 
        Collections.copy(dest, src);
        System.out.println(dest);

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

