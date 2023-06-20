// Program to represent enum constants in string.

// create enum of type OS
enum OS {
    // add constant values to enum
    WINDOWS, MACOS, LINUX;
}

class Main {
    public static void main(String[] args) {

        // create a variable osType
        String osType;

        // convert MACOS to string 
        osType = OS.MACOS.toString();

        // print osType
        System.out.println(osType);
    }
}

