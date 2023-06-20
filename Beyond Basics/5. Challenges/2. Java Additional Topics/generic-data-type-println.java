// Program to print value of any data type.

import java.util.Scanner;

//create a generics class
class PrintData<T> {

    // create a constructor with parameter T data
    public PrintData(T data) {
    
      // print the value of data
      System.out.println(data);
    }
}

class Main {
    public static void main(String[] args) {

      // take an integer input
      Scanner input = new Scanner(System.in);
      int input1 = input.nextInt();
    
      // create an object of PrintData object with Integer data
      PrintData<Integer> pd1 = new PrintData<>(input1);

    }
}

