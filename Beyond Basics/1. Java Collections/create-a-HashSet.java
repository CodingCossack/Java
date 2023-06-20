// Program to create and add elements to a HashSet.

import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        
        // create a HashSet of Integer type
        HashSet<Integer> numSet = new HashSet<>();

        // add elements 2 and 3 to numSet
        numSet.add(2);
        numSet.add(3);

        // again add 2 to numSet again
       numSet.add(2);

        // print numSet
        System.out.println(numSet);
    }
}


// We use the HashSet class to implement the set in Java and it provides the functionalities of a hash table data structure.

// Note: The order of elements in a HashSet may change over time. There is no guarantee that the elements will be in the order we added them.