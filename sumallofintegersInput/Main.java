package sumallofintegersInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

   
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int sum = calculateSum(numbers);
        System.out.println("The sum of the integers is: " + sum);
        scanner.close();
    }

    private static int calculateSum(int[] array) {
        int sum = 0;

        for (int number : array) {
            sum += number;
        }

        return sum;
    }
}