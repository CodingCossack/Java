// Program to sort an ArrayList.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();
        
        // take 3 string input from the user
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        String name3 = input.nextLine();
        
        // add elements to names
        names.add(name1);
        names.add(name2);
        names.add(name3);
        // sort elements of names
        Collections.sort(names);

        // print sorted names
        System.out.println(names);

        input.close();
    }
}



// A hashmap stores multiple elements together.

// keys - unique identifiers that are associated with each value on a map
// values - actual data that can be accessed using keys