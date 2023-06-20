// Program to add elements to ArrayList at specific index.

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        // create an Arraylist of String type
        ArrayList<String> movies = new ArrayList<>();

        // add Avatar to Arraylist
        movies.add("Avatar");

        // add Catch me if you can to Arraylist
        movies.add("Catch me if you can");

        // print the Arraylist
       System.out.println(movies);

        // add Batman at index 1
        movies.add(1, "Batman");

        // print the Arraylist
        System.out.println(movies);
    }
}