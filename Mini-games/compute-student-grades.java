// Program to compute students grades


class Main {

    // find the average score and return it
    double getAverageScore(int scores[]) {

        // compute sum of scores
        double total = 0.0;

        // get the number of subjects
        int count = scores.length;

        for (int i = 0; i < count; i++) {
            total = total + scores[i];
        }
        // compute average score
        double averageScore = total / count;

        return averageScore;
    }

    // compute grade and return it
    char computeGrade(double averageScore) {
        char grade;
        if (averageScore >= 80.0) {
            grade = 'A';
        }

        else if (averageScore >= 60) {
            grade = 'B';
        }

        else if (averageScore >= 50) {
            grade = 'C';
        }

        else {
            grade = 'F';
        }

        return grade;
    }

    public static void main(String[] args) {

        // create object of Main class
        Main obj = new Main();

        int[] studentScore = { 55, 64, 75, 80, 65 };

        // get average score
        double averageScore = obj.getAverageScore(studentScore);

        // get grade
        char grade = obj.computeGrade(averageScore);

        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);
    }
}
