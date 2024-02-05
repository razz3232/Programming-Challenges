package count_number_in_an_input;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a sentence or phrase: ");
        String input = scanner.nextLine();

        // Count the number of words
        int wordCount = countWords(input);

        // Print the result
        System.out.println("Number of words: " + wordCount);

        // Close the scanner
        scanner.close();
    }

    // Function to count the number of words in a string
    private static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        // Split the input string into words using whitespace as the delimiter
        String[] words = input.split("\\s+");

        // Return the count of words
        return words.length;
    }
}