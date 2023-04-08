// Program to calculate the sum of integers entered by the user until the user enters 0 or negative integer.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // the initial value of total will be 0
        int total = 0;
        int num;
        
        while (true) {
            // get an integer input
            num = input.nextInt();
            
            // check if the input is less than or equal to 0
            // break the loop if true
            // else add the value to total
            if(num <= 0 ) {
                break;
            }
            else {
                total = total + num;
            }
            
        }
        
        // print the total
        System.out.println(total);
        input.close();
    }
}


// for (intitalization; boolean; update expression)