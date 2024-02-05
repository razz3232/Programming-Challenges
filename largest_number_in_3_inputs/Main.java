package largest_number_in_3_inputs;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store three inputs
        double[] numbers = new double[3];

        // Get user input for three numbers
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Find the largest number
        double largestNumber = findLargestNumber(numbers);

        // Print the result
        System.out.println("The largest number is: " + largestNumber);

        // Close the scanner
        scanner.close();
    }

    // Function to find the largest number in an array
    private static double findLargestNumber(double[] array) {
        double largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        return largest;
    }
}