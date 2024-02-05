package stringbuilder;

import java.util.Scanner;

public class StringBuilderOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for a string of at least 10 characters
        System.out.print("Enter a string of at least 10 characters: ");
        String userInput = scanner.nextLine();

        if (userInput.length() < 10) {
            System.out.println("Please enter a string with at least 10 characters.");
            return;
        }

        // Create a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder(userInput);

        // Perform operations
        System.out.println("Length of the string: " + stringBuilder.length());
        System.out.println("First character: " + stringBuilder.charAt(0));
        System.out.println("Last character: " + stringBuilder.charAt(stringBuilder.length() - 1));
        System.out.println("Index of 'a': " + stringBuilder.indexOf("a"));
        System.out.println("Substring from index 3 to index 6: " + stringBuilder.substring(3, 7));

        stringBuilder.append("123");  // Append "123" to the end
        System.out.println("After appending '123': " + stringBuilder);

        stringBuilder.insert(4, "xyz");  // Insert "xyz" at index 4
        System.out.println("After inserting 'xyz' at index 4: " + stringBuilder);

        stringBuilder.delete(2, 5);  // Delete substring from index 2 to index 4
        System.out.println("After deleting substring from index 2 to index 4: " + stringBuilder);

        stringBuilder.deleteCharAt(8);  // Delete character at index 8
        System.out.println("After deleting character at index 8: " + stringBuilder);

        stringBuilder.reverse();  // Reverse the string
        System.out.println("After reversing: " + stringBuilder);

        // Close the scanner
        scanner.close();
    }
}