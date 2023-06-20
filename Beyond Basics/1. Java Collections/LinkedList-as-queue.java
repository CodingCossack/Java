// Program to use LinkedList as a Queue

import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create a LinkedList of Integer type
        LinkedList<Integer> numbersList = new LinkedList<>();

        // add elements to numberList
        numbersList.add(5);
        numbersList.add(10);
        numbersList.add(15);

        // remove element from the front 
        numbersList.poll();

        // take an integer input from the user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // add the user input to the end of numberList
        numbersList.offer(number);

        // print numbersList
        System.out.println(numbersList);
        
        input.close();
    }
}