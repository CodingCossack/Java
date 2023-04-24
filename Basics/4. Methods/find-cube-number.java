// Program to find the cube of a number using a method.


class Main {
    
    // create a method named findCube()
    void findCube() {
        int number = 5;
        
        // find the cube of number
        int result = number * number * number;
        System.out.println(result);
    }

    public static void main(String[] args) {

        // creating object of Main class
        Main obj = new Main();
    
        // call findCube using the object
        obj.findCube();
  }
}