// Program to find the cube root of a number.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // get number input
        int number = input.nextInt();
        
        // use the cbrt() method to find the cube root
        double cubeRoot = Math.cbrt(number);
        System.out.println(cubeRoot);
        
        input.close();
    }
}

// System.out.println(), nextInt(), nextDouble(), etc are called standard library methods.