// Program to swap position of two elements in an arraylist.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create an ArrayList of Integers
        ArrayList<Integer> numberList = new ArrayList<>();

        // take input from the user
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // add elements to numberList
        numberList.add(num1);
        numberList.add(num2);
        numberList.add(num3);

        // swap num1 and num3
        Collections.swap(numberList, 0, 2);
        
        // print the arraylist
        System.out.println(numberList);

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

