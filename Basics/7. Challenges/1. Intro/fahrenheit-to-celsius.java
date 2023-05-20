// Program to convert temperature in fahrenheit to celsius.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // take fahrenheit temperature input
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();

        // convert fahrenheit temperature to celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // print temperature in celsius
        System.out.println(celsius);

        input.close();        
    }
}

/* In Java, input.close() is used to close an input stream that has been opened in a program.
 This is important because it ensures that system resources are released and prevents memory leaks
      or other issues that may arise if input streams are not closed properly.
 When a file is opened for reading using an input stream,
      the operating system allocates certain resources for that file,
     such as memory and file handles. If the input stream is not closed properly,
      these resources may remain allocated, even after the program has finished executing.
      This can lead to issues such as a lack of system resources or the inability to open or read other files.

Additionally, some input streams may buffer data in memory in order to improve performance.
If the input stream is not closed properly, any data that has been buffered may not be written to the file or output stream,
which can result in incomplete or corrupted data.

To avoid these issues, it is important to always close input streams when they are no longer needed.
This can be done using the input.close() method,
which releases any resources associated with the input stream and ensures that any buffered data is written to the file or output stream.
*/