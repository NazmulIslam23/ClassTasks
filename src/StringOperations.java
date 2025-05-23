import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String original = input.nextLine();

        // Reverse the string
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);

        // Check palindrome
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        // Count occurrences of a character
        System.out.print("Enter a character to count: ");
        char ch = input.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Occurrences of '" + ch + "': " + count);

        input.close();
    }
}
