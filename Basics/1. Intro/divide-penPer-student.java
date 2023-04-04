// Program to divide N number of pens to M number of students.

class Main {
    public static void main(String[] args) {

        // variables to store numbers of pen and student
        int penNumber = 14;
        int studentNumber = 3;

        // compute and print the number of pens each student will get
        int penPerStudent = penNumber / studentNumber;
        System.out.println(penPerStudent);

        // compute and print the number of pens that will be left
        int remainingPen = penNumber % studentNumber;
        System.out.println(remainingPen);
    }
}