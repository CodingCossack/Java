// Program to access elements of a hashmap.

import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        // create HashMap of String key & Integer value
        HashMap<String, Integer> name = new HashMap<>();

        // add elements to name
        name.put("Jimmy", 1);
        name.put("Chandler", 2);

        // print name
        System.out.println(name);

        // change 1 to 100
        name.replace("Jimmy", 100);

        // print name again
        System.out.println(name);
    }
}



