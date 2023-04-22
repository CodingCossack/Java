// Program to multiply each element of an array by 10.


class Main {
    public static void main(String[] args) {

        // an array of scores
        int[] numbers = {43, 78, 23, 45};

        // declare new array of the same size
        int[] newNumbers = new int[numbers.length];

        // loop through each element of numbers
        // multiply them by 10
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i] * 10;
        }
    
        // print the new array
        for (int num : newNumbers) {
            System.out.println(num);
        }
    }
}