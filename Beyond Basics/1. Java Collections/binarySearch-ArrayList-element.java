// Program to search an element in an ArrayList

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create an ArrayList of integers called numberList
        ArrayList<Integer> numberList = new ArrayList<>();

        // add elements
        numberList.add(12);
        numberList.add(34);
        numberList.add(67);
        numberList.add(100);
        
        // take an int input from the user
        Scanner input = new Scanner(System.in);
        int element = input.nextInt();

        // search element in arraylist
        int pos = Collections.binarySearch(numberList, element);
                
        // print pos
        System.out.println(pos);

        input.close();
    }
}



// The binarySearch() method returns the position of an element in integer form.

// Shuffling algorithms allow us to present the sequential element in a random order.

