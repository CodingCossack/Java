// Program to find the longer string among two strings.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for text1 and text2
        String text1 = input.next();
        String text2 = input.next();

        // get length of both strings
        int length1 = text1.length();
        int length2 = text2.length();

        // compare lengths of both strings and print the longer sting
        if(length1 > length2) {
            System.out.println(text1);
        }
        else {
            System.out.println(text2);
        }
        
        input.close();
    }
}