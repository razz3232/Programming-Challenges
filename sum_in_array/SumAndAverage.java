package sum_in_array;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare an array to store the numbers
        int[] numbers = new int[size];

        // Get user input for the array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum and average
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / size;

        // Print the sum and average
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        // Close the scanner
        scanner.close();
    }
}