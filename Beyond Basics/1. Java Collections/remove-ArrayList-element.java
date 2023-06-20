// Program to remove elements from arraylist

// import java.util.ArrayList
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create an ArrayList of String called names
        ArrayList<String> names = new ArrayList<>();

        // add Jeremy, Jules & Howard
        names.add("Jeremy");
        names.add("Jules");
        names.add("Howard");

        // take input from user
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        
        // remove element at index
        names.remove(index);

        // print names 
        System.out.println(names);

        input.close();
    }
}