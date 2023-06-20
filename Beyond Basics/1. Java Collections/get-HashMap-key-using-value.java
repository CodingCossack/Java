// Program to get key from hashmap using the value.

import java.util.HashMap;
import java.util.Map.Entry;

class Main {
    public static void main(String[] args) {

        // create a hashmap
        HashMap<Integer, String> names = new HashMap<>();
        
        // put elements in the hashmap
        names.put(1, "Ryan");
        names.put(2, "Jeff");
        names.put(3, "Tim");

        // value whose key is to be searched
        String value = "Tim";

        // loop through each entry of hashmap
        for (Entry<Integer, String> entry : names.entrySet()) {

            // check if give value is equal to value from entry
            if (entry.getValue() == value) {
                // print the corresponding key
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}



// A hashmap stores multiple elements together.

// keys - unique identifiers that are associated with each value on a map
// values - actual data that can be accessed using keys