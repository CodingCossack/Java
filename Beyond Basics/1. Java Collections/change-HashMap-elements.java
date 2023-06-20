// Program to change elements of a HashMap.

import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        // create HashMap of String key & Integer value
        HashMap<String, Integer> numMap = new HashMap<>();

        // add elements to numMap
        numMap.put("one", 1);
        numMap.put("two", 2);

        // print numMap
        System.out.println(numMap);

        // change 1 to 100
        numMap.replace("one", 100);

        // print numMap again
        System.out.println(numMap);
    }
}



// A hashmap stores multiple elements together.

// keys - unique identifiers that are associated with each value on a map
// values - actual data that can be accessed using keys