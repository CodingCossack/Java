// Program to add and remove elements from a LinkedList.

import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create a LinkedList
        LinkedList<String> names = new LinkedList<>();

        // take String input from the user
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        String name3 = input.nextLine();
        
        // add elements
        names.add(name1);
        names.add(name2);
        
        // add name3 at index 0
        names.add(0, name3);

        // remove name2 from linkedlist
        names.remove(2);
        
        // print linkedlist
        System.out.println(names);
        
        input.close();
    }
}