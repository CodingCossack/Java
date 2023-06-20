// Program to find minimum and maximum elements of ArrayList.

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

        // find minimum element in numberList
        int minimum = Collections.min(numberList);
        System.out.println(minimum);

        // find maximum element in numberList
        int maximum = Collections.max(numberList);
        System.out.println(maximum);

        input.close();
    }
}



// The binarySearch() method returns the position of an element in integer form.

// Shuffling algorithms allow us to present the sequential element in a random order.

