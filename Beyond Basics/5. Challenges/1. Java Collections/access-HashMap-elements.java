// Program to access elements of a hashmap.

import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        // create Map of Integer key & String value
        HashMap<Integer, String> song = new HashMap<>();

        // add elements to song
        song.put(1, "yesterday");
        song.put(2, "21 guns");

        // access value of song with key 2
        String value = song.get(2);

        // print value
        System.out.println(value);
    }
}



