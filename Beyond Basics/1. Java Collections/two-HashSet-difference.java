// Program to find Differences between Two HashSets.

import java.util.HashSet;

class Main {

    public static void main(String[] args) {

        // create a HashSet
        HashSet<Integer> numSetOne = new HashSet<>();

        // add elements to numSetOne
        numSetOne.add(2);
        numSetOne.add(3);
        numSetOne.add(4);

        // create a HashSet
        HashSet<Integer> numSetTwo = new hashSet<>():

        // add elements to numSetTwo
        numSetTwo.add(3);
        numSetTwo.add(4);
        numSetTwo.add(5);

        // find difference of sets
        numSetOne.removeAll(numSetTwo);

        // print numSetOne
        System.out.println(numSetOne);
    }
}


// We use the HashSet class to implement the set in Java and it provides the functionalities of a hash table data structure.

// Note: The order of elements in a HashSet may change over time. There is no guarantee that the elements will be in the order we added them.