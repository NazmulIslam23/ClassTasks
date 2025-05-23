import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first integer (a): ");
        int a = scan.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = scan.nextInt();

        System.out.print("Enter operation (+, -, *, /): ");
        char ch = scan.next().charAt(0);

        int result;

        if (ch == '+') {
            result = a + b;
            System.out.println("Result: " + result);
        } else if (ch == '-') {
            result = a - b;
            System.out.println("Result: " + result);
        } else if (ch == '*') {
            result = a * b;
            System.out.println("Result: " + result);
        } else if (ch == '/') {
            if (b != 0) {
                result = a / b;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator. Please use +, -, *, or /.");
        }

        scan.close();
    }
}
