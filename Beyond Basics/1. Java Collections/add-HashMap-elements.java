// Program to create and add elements to a HashMap.

import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        // create HashMap of Integer key & String value
        HashMap<Integer, String> numMap = new HashMap<>();

        // add element 
        numMap.put(1, "one");

        // add element 
        numMap.put(2, "two");

        // print numMap
        System.out.println(numMap);
    }
}



// A hashmap stores multiple elements together.

// keys - unique identifiers that are associated with each value on a map
// values - actual data that can be accessed using keys