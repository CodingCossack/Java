// Program to find the smallest number.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
 
        // take three int input 
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        // print true if n3 is the smallest number
        // print false if n3 is not the smallest number
        System.out.println(n3 < n1 && n3 < n2);
        input.close();
    }
}

