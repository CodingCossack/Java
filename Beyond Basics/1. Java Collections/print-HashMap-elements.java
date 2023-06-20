// Program to print elements of HashMap.

import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        // create a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // add elements
        students.put(1, "Jack");
        students.put(5, "Emily");
        students.put(3, "Zayn");

        // loop through key elements
        for (Integer key : students.keySet()) {

            // get the value of key using get()
            System.out.println(students.get(key));
        }

    }
}



// A hashmap stores multiple elements together.

// keys - unique identifiers that are associated with each value on a map
// values - actual data that can be accessed using keys