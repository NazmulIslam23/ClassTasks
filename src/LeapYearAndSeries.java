import java.util.Scanner;

public class LeapYearAndSeries {

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leap year check
        System.out.print("Enter a year to check if it is a leap year: ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Series using for-loop
        System.out.println("Even numbers from 2 to 20 (for-loop):");
        int sumEvenFor = 0;
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
            sumEvenFor += i;
        }
        System.out.println("\nSum: " + sumEvenFor);

        System.out.println("Odd numbers from 1 to 19 (for-loop):");
        int sumOddFor = 0;
        for (int i = 1; i < 20; i += 2) {
            System.out.print(i + " ");
            sumOddFor += i;
        }
        System.out.println("\nSum: " + sumOddFor);

        // Series using while-loop
        System.out.println("Even numbers from 2 to 20 (while-loop):");
        int i = 2, sumEvenWhile = 0;
        while (i <= 20) {
            System.out.print(i + " ");
            sumEvenWhile += i;
            i += 2;
        }
        System.out.println("\nSum: " + sumEvenWhile);

        System.out.println("Odd numbers from 1 to 19 (while-loop):");
        i = 1;
        int sumOddWhile = 0;
        while (i < 20) {
            System.out.print(i + " ");
            sumOddWhile += i;
            i += 2;
        }
        System.out.println("\nSum: " + sumOddWhile);

        // Series using do-while loop
        System.out.println("Even numbers from 2 to 20 (do-while loop):");
        i = 2;
        int sumEvenDoWhile = 0;
        do {
            System.out.print(i + " ");
            sumEvenDoWhile += i;
            i += 2;
        } while (i <= 20);
        System.out.println("\nSum: " + sumEvenDoWhile);

        System.out.println("Odd numbers from 1 to 19 (do-while loop):");
        i = 1;
        int sumOddDoWhile = 0;
        do {
            System.out.print(i + " ");
            sumOddDoWhile += i;
            i += 2;
        } while (i < 20);
        System.out.println("\nSum: " + sumOddDoWhile);

        scanner.close();
    }
}
