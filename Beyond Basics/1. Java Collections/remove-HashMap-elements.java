// Program to remove the element of a HashMap.

import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        // create HashMap of String key & Integer value
        HashMap<String, Integer> name = new HashMap<>();

        // add elements to name
        name.put("Patrick", 1);
        name.put("SpongeBob", 2);

        // print name
        System.out.println(name);

        // remove element with key Patrick
        name.remove("Patrick");

        // print name again
        System.out.println(name);
    }
}



// A hashmap stores multiple elements together.

// keys - unique identifiers that are associated with each value on a map
// values - actual data that can be accessed using keys