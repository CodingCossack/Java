// Program to check whether a person can vote or not depending on his/her age.



import java.util.Scanner;

class Main {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
     
        // if age is 18 or above, print: The person can vote
        // if not, print: The person cannot vote
        if (age >= 18) {
            System.out.println("The person can vote");
        }
        else {
            System.out.println("The person cannot vote");
        }
 
        input.close();
     
    }
}
