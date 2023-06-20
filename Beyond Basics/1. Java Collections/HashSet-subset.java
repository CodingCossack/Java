// Program to using HashSets to determine if the Grand Tour presenter set is a subset of the Top Gear presenter set.

import java.util.HashSet;

class Main {
    public static void main(String[] args) {

        // create a HashSet
        HashSet<String> presenters = new HashSet<>();

        presenters.add("Jeremy Clarkson");
        presenters.add("Richard Hammond");
        presenters.add("James May");

        System.out.println("Top Gear Presenters: " + presenters);

        // create another HashSet
        HashSet<String> grandTourPresenters = new HashSet<>();

        grandTourPresenters.add("Jeremy Clarkson");
        grandTourPresenters.add("Richard Hammond");
        System.out.println("The Grand Tour Presenters: " + grandTourPresenters);
        

        // check if grandTourPresenters is a subset of presenters
        boolean result = presenters.containsAll(grandTourPresenters);

        if (result) {
            System.out.println("The Grand Tour Presenters are a subset of Top Gear Presenters");
        }
        else {
            System.out.println("The Grand Tour Presenters are not a subset of Top Gear Presenters");
        }
    }
}



// We use the HashSet class to implement the set in Java and it provides the functionalities of a hash table data structure.

// Note: The order of elements in a HashSet may change over time. There is no guarantee that the elements will be in the order we added them.

// The containsAll() method returns true if primeNumbers is a subset of numbers.