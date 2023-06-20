// Program to access elements of a HashMap

import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create Map of Integer key & String value
        HashMap<Integer, String> numMap = new HashMap<>();

        // add elements to numMap
        numMap.put(1, "one");
        numMap.put(2, "two");

        // take int input from the user
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();

        // access value of numMap with key index 
        String value = numMap.get(index);

        // print value
        System.out.println(value);
    }
}



// A hashmap stores multiple elements together.

// keys - unique identifiers that are associated with each value on a map
// values - actual data that can be accessed using keys