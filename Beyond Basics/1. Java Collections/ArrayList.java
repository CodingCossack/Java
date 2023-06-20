// Program to create and add elements to an arraylist.

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create an ArrayList of String called names
        ArrayList<String> names = new ArrayList<>();
        
        // take two input from the user
        Scanner input = new Scanner(System.in);
        String name1 = input.next();
        String name2 = input.next();

        // add name1 to names
        names.add(name1);

        // add name2 to names
        names.add(name2);

        // print ArrayList
        System.out.println(names);

        input.close();
    }
}