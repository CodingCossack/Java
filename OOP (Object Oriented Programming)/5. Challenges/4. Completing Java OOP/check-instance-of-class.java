// Program to check an instance of a class

class Tiger {

}

class Main {

    // main method
    public static void main(String[] args) {

        // create an object of Tiger class
        Tiger tig1 = new Tiger();

        // check if the object is the instance of Tiger class
        boolean result = tig1 instanceof Tiger;
        
        // check if result is true
        if(result) {
            
            // print t1 is an instance of Tiger
            System.out.println("t1 is an instance of Tiger");
        }
        
        else {
            
            // print t1 is not an instance of Tiger
            System.out.println("t1 is not an instance of Tiger");
        }
    }
}



