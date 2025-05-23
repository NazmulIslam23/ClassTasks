import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Average Calculation using Array and Loop
        System.out.println("Enter number of values to calculate average:");
        int n = input.nextInt();
        double[] values = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value #" + (i + 1) + ": ");
            values[i] = input.nextDouble();
            sum += values[i];
        }

        double average = sum / n;
        System.out.println("Average of values = " + average);

        System.out.println("\n--------------------------------\n");

        // 2. Medal awarding using nested if
        System.out.print("Enter letter grade (e.g. 4.0, 3.6, etc): ");
        double grade = input.nextDouble();
        System.out.print("Has the student completed the semester? (true/false): ");
        boolean completedSemester = input.nextBoolean();

        if (completedSemester) {
            if (grade >= 3.5) {
                System.out.println("The student gets a medal 🏅");
            } else {
                System.out.println("The student completed the semester but didn't qualify for a medal.");
            }
        } else {
            System.out.println("The student did not complete the semester.");
        }

        System.out.println("\n--------------------------------\n");

        // 3. Bonus calculation based on sales and attendance
        System.out.print("Enter % of target sales achieved (e.g. 95 for 95%): ");
        double sales = input.nextDouble();
        System.out.print("Enter attendance percentage (e.g. 100 for 100%): ");
        double attendance = input.nextDouble();

        double bonus = 0;

        if (sales >= 95 && attendance == 100) {
            bonus = 60;
        } else if (sales >= 95 && attendance == 90) {
            bonus = 40;
        } else if (sales >= 80 && attendance == 100) {
            bonus = 40;
        } else if (sales >= 80 && attendance == 90) {
            bonus = 20;
        } else {
            bonus = 5;
        }

        System.out.println("The employee receives a bonus of " + bonus + "%.");

        input.close();
    }
}
