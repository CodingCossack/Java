// Program to add elements to linkedlist at specific index.

import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create a LinkedList
        LinkedList<String> languages = new LinkedList<>();

        // add elements to languages
        languages.add("Java");
        languages.add("Python");

        // take input from user
        Scanner input = new Scanner(System.in);
        String language1 = input.nextLine();

        // insert the user input to language LinkedList
        languages.add(1, language1);

        // print languages
        System.out.println(languages);
        
        input.close();
    }
}