// Program to find the total income of a person.


import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        // create object of Scanner
        Scanner input = new Scanner(System.in);

        // get salary input
        double salary = input.nextDouble();

        // get bonus input
        double bonus = input.nextDouble();

        // find total income
        double income = bonus + salary;

        System.out.println(income);

        // close the Scanner object
        input.close();
    }
}


