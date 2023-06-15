// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        int i = 1;

        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();

            if (StdRandom.bernoulli(1.0 / i)) {
                champion = word;
            }

            i++;
        }

        StdOut.println(champion);
    }
}