import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Find the greatest number in a series
        System.out.print("Enter the number of elements in the series: ");
        int n = input.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements of the series:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element #" + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Greatest number in the series: " + max);

        System.out.println("\n--------------------------------\n");

        // 2. Check if a number is prime
        System.out.print("Enter a number to check if it is prime: ");
        int numberToCheck = input.nextInt();
        boolean isPrime = true;

        if (numberToCheck <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= numberToCheck / 2; i++) {
                if (numberToCheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(numberToCheck + " is a Prime number.");
        } else {
            System.out.println(numberToCheck + " is NOT a Prime number.");
        }

        System.out.println("\n--------------------------------\n");

        // 3. Reverse a given series
        System.out.println("Reversed series:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}
