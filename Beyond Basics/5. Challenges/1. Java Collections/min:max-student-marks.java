// Program to find minimum and maximum elements of arraylist.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create an ArrayList of Integers
        ArrayList<Integer> score = new ArrayList<>();

        // take three int input from user to store score
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int input3 = input.nextInt();

        // add elements to score
        score.add(input1);
        score.add(input2);
        score.add(input3);

        // find minimum element in score
        int minimum = Collections.min(score);
        System.out.println(minimum);

        // find maximum element in score
        int maximum = Collections.max(score);
        System.out.println(maximum);

        input.close();
    }
}



