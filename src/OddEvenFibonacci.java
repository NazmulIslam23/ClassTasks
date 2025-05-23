import java.util.Scanner;

public class OddEvenFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part 1: Count odd and even numbers in stored values
        System.out.print("Enter the number of values: ");
        int n = input.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Number of even values: " + evenCount);
        System.out.println("Number of odd values: " + oddCount);

        System.out.println("\n--------------------------------\n");

        // Part 2: Print Fibonacci series up to 12 numbers
        int fibCount = 12;
        int[] fib = new int[fibCount];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < fibCount; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.print("Fibonacci series: ");
        for (int i = 0; i < fibCount; i++) {
            System.out.print(fib[i]);
            if (i != fibCount - 1) System.out.print(", ");
        }
        System.out.println();

        input.close();
    }
}
