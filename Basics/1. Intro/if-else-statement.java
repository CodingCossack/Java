// Program to find the smaller number among two numbers.



import java.util.Scanner;

class Main {
    public static void main(String[] args) {
     
        // get two inputs
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
     
        // if number1 is smaller than number2, print number1
        // if not, print number2
        if (number1 < number2) {
            System.out.println(number1);
        }
        else {
            System.out.println(number2);
        }

        input.close();
    }
}
