public class CGPACalculator {
    public static void main(String[] args) {
        double[][] grades = {
                {3.5, 3.7, 4.0, 3.0, 3.8},
                {2.5, 3.0, 3.5, 2.8, 3.2},
                {4.0, 4.0, 4.0, 4.0, 4.0},
                {3.2, 3.4, 3.6, 3.8, 4.0},
                {2.0, 2.5, 3.0, 2.8, 3.1}
        };

        int[] credits = {3, 4, 3, 2, 3}; // total = 15

        for (int i = 0; i < grades.length; i++) {
            double weightedSum = 0;
            int totalCredits = 0;

            for (int j = 0; j < grades[i].length; j++) {
                weightedSum += grades[i][j] * credits[j];
                totalCredits += credits[j];
            }

            double cgpa = weightedSum / totalCredits;
            System.out.printf("Student %d CGPA: %.2f%n", (i + 1), cgpa);
        }
    }
}
