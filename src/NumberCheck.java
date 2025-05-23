import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check if number is a positive integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is a positive integer.");
        } else {
            System.out.println(number + " is not a positive integer.");
        }

        // Check if number is odd or even
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close();
    }
}
