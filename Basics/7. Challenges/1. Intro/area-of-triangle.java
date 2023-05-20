// Program to find the area of a rectangle.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // take input for length and breadth
        int length = input.nextInt();
        int breadth = input.nextInt();
     
        // calculate area of rectangle   
        int area = breadth * length;
        System.out.println(area);

        input.close();
    }
}
