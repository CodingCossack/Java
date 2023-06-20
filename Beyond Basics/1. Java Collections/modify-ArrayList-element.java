// Program to modify elements of an ArrayList.

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create an ArrayList of String called names
        ArrayList<String> names = new ArrayList<>();

        // add Jeremy, Jules & Howard to names
        names.add("Jeremy");
        names.add("Jules");
        names.add("Howard");

        // take String input from the user
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();

        //  replace the value in index 1 with name1
        names.set(1, name1);

        // print names again
        System.out.println(names);

        input.close();
    }
}