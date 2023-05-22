// Program to find LCM of two numbers using a method.

import java.util.Scanner;

class Main {
    // create the findLCM() method with parameters: num1 and num2
    // compute lcm of two values and return it
    int findLCM(int num1, int num2) {
        int lcm;
        if(num1 > num1) {
            lcm = num1;
        }
        else {
            lcm = num2;
        }
        while(true) {
            lcm = lcm + 1;
            if(lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
        }
        return lcm;
        
    }

    public static void main(String[] args) {

        // get input values for x and y
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        Main obj = new Main();
        
        // call findLCM() with arguments number1 and number2
        int lcm = obj.findLCM(number1, number2);
                
        System.out.println(lcm);

        input.close();
    }
}