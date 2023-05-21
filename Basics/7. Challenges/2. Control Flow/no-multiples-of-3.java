// Program to print all numbers from 0 to 10 except the multiples of 3.

class Main {
    public static void main(String[] args) {

        // loop from i = 1 to 10
        // inside the loop, check whether i is divisible by 3
        // if true, skip the current iteration of the loop. Otherwise, print i
        for(int i = 0; i <= 10; i++) {
            if(i % 3 == 0) {
                continue;
            }
            else {
                System.out.println(i);
            }
        }
        
    }
}